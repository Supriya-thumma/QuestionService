package com.example.QuestionService.controller;

import com.example.QuestionService.model.Question;
import com.example.QuestionService.service.Questionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class Questioncontroller {
    @Autowired
    private Questionservice qservice;

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return qservice.addQuestion(question);
    }
}
