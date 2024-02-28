package com.example.QuestionService.service;

import com.example.QuestionService.model.Question;
import com.example.QuestionService.repository.questionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Questionservice {
    @Autowired
    private questionrepo qrepo;
    public Question addQuestion(Question question) {
        return qrepo.save(question);
    }
}