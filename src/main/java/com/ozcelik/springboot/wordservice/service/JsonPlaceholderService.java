package com.ozcelik.springboot.wordservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ozcelik.springboot.wordservice.model.Word;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonPlaceholderService {

    private final String URL = "src/main/resources/static/jsonData/vocabularies.json";

     private final ObjectMapper objectMapper;

    public JsonPlaceholderService(ObjectMapper objectMapper) {

        this.objectMapper = objectMapper;
    }


    public List<Word> getWords() throws IOException {
        List<Word> words = objectMapper.readValue(
                new File(URL),
                objectMapper
                        .getTypeFactory()
                        .constructCollectionType(List.class, Word.class));
        return words;
    }
}
