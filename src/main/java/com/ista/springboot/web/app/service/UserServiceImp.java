package com.ista.springboot.web.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.springboot.web.app.dao.UserRepository;
import com.ista.springboot.web.app.model.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional(readOnly=true)
	
	public Iterable<User> findAll() {
		return userRepository.findAll();
		
	}

	@Transactional(readOnly=true)
	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
	}

}
