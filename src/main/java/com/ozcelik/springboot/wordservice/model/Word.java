package com.ozcelik.springboot.wordservice.model;

import org.springframework.data.annotation.Id;

public class Word {
    @Id
    private Integer id;
    private String word;
    private String grade;
    private boolean isSelected;

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
