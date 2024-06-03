package com.example.questionproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.questionproject.entity.Question;
import com.example.questionproject.service.QuestionService;



@RestController 
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@PostMapping("/create")
	public Question create(@RequestBody Question Question) {
		return questionService.create(Question);	
	}
	
	@GetMapping("/getquestion")
	public List<Question> getAllQuiz() {
		return questionService.getall();
		
	}
	
	@GetMapping("/{id}")
	public Question getQuizById(@PathVariable Long id) {
		return questionService.getQuestionsByid(id);
		
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionQuizById(@PathVariable Long quizId) {
		return questionService.getQuestionQuizById(quizId);
		
	}
	
	

}
