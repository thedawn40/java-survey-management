package com.dto;

import java.util.List;

import lombok.Data;

@Data
public class SurveyDto{

    private String id;
    private String title;
    private String description;
    private int year;
    private List<QuestionDto> questions;
}
