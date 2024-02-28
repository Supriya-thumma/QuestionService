package com.example.QuestionService.repository;

import com.example.QuestionService.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface questionrepo extends JpaRepository<Question,Integer> {
}
