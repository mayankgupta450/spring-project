package com.example.questionproject.service;

import java.util.List;

import com.example.questionproject.entity.Question;


public interface QuestionService {

	// adding Questions
		Question create(Question question);

		// getting list of Questions
		List<Question> getall();

		// getting quiz details by id
		Question getQuestionsByid(Long id);

		List<Question> getQuestionQuizById(Long id);
}
