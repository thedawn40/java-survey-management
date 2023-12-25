package com.service;

import java.util.List;

import com.dto.QuestionDto;
import com.dto.SurveyDto;

/**
 * SurveyService
 */
public interface SurveyService {

    List<QuestionDto> readFile(byte[] bytes);

    SurveyDto createData(SurveyDto dto);

    List<QuestionDto> initiateQuestion();

    List<QuestionDto> getSubQuestion(String referenceId);

}