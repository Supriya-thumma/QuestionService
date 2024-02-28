package com.example.QuestionService.repository;

import com.example.QuestionService.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface answerrepo extends JpaRepository<Answers,Integer> {
}
