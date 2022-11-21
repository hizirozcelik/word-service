package com.ozcelik.springboot.wordservice.model;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;
    private String grade;
    private boolean isSelected;

    public Word() {

    }
    public Word(String word, String grade, boolean isSelected) {
        this.word = word;
        this.grade = grade;
        this.isSelected = isSelected;
    }



    public Integer getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

}
