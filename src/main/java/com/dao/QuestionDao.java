package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Question;

public interface QuestionDao extends JpaRepository<Question, String> {

    @Query(value = "select q.* from question q where q.parent_question_id is null order by q.reference_id asc", nativeQuery = true)
    List<Question> initiate();
    
    @Query(value = "select q.* from question q where q.parent_question_id like ?1 and type = 'answer'", nativeQuery = true)
    List<Question> getOptions(String parentQuestionId);

}
