package com.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class QuestionDto {
    
    private String id;

    private String category;
    private String question;
    private String type;
    private String referenceId;
    private String parentQuestionId;
    private String surveyId;
    private int status;
    private List<Map<String,Object>> options;

}
