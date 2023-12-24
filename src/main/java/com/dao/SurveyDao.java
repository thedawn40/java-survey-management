package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Survey;

public interface SurveyDao extends JpaRepository<Survey, String>{
    
}
