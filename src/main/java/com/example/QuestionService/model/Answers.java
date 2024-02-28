package com.example.QuestionService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="answer")
public class Answers {
    @Id
    public int id;
    @Column(name = "answer")
    @NotNull(message = "Answer cannot be null")
    public String answer;
    public int isCorrect;
    public String points;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    @JsonIgnore
    public Question question;
}