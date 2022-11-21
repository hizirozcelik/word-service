package com.ozcelik.springboot.wordservice.repository;

import com.ozcelik.springboot.wordservice.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlRepository extends JpaRepository<Word,Integer> {
}
