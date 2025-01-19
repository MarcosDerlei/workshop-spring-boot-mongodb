package com.marcosderlei.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcosderlei.workshopmongo.domain.User;
import com.marcosderlei.workshopmongo.repository.UserRepository;
import com.marcosderlei.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	 public User findById(String id) {
	        return repo.findById(id)
	                   .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
