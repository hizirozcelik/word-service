package com.ozcelik.springboot.wordservice.controller;

import com.ozcelik.springboot.wordservice.model.Word;
import com.ozcelik.springboot.wordservice.repository.MySqlRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class WordController {

    private final MySqlRepository db;


    public WordController(MySqlRepository db) {
        this.db = db;
    }

    @GetMapping("/words")
    public List<Word> getWords() {
        return db.findAll();
    }

    @GetMapping("/words/{id}")
    public Word getWord(@PathVariable Integer id) {
        return db.findById(id).get();
    }

    @GetMapping("/words/{grade}")
    public List<Word> getWordsByGrade(@PathVariable String grade) {
        var words = db.findAll();
        words.removeIf(word -> !word.getGrade().equals(grade));
        return words;
    }

    // return requested number of word from selected grade wordlist
    @GetMapping("/words/{grade}/{numberOfWords}")
    public List<Word> getWordsByGrade(@PathVariable String grade, @PathVariable Integer numberOfWords) {
        var words = db.findAll();
        var selectedWords = new ArrayList<Word>();
        words.removeIf(word -> !word.getGrade().equals(grade));

        for (int i = 0; i < numberOfWords; i++) {
            int num = (int) (Math.random() * (words.size() + 1));
            if (!selectedWords.contains(words.get(num))) {
                selectedWords.add(words.get(num));
            } else i--;
        }
        return selectedWords;
    }

}
