package com.example.questionproject.implimentation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.questionproject.entity.Question;
import com.example.questionproject.repository.QuestionRepository;
import com.example.questionproject.service.QuestionService;

@Service
public class QuestionImplimentation implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getall() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionsByid(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
	}

	@Override
	public List<Question> getQuestionQuizById(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(id);
	}


	

}
