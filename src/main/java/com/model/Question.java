package com.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "question")
@Data
public class Question {

    @Id
    private String id;

    private String category;
    private String question;
    private String type;

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "parent_question_id")
    private String parentQuestionId;

    @Column(name = "survey_id")
    private String surveyId;
    private int status;
    
}
