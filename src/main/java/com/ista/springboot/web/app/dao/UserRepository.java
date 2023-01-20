package com.ista.springboot.web.app.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.springboot.web.app.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

}
