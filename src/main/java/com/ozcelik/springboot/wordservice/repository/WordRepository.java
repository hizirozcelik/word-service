package com.ozcelik.springboot.wordservice.repository;

import com.ozcelik.springboot.wordservice.model.Word;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Integer> {
}

