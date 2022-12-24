package com.example.practicaltestpaperiasf.repository;

import com.example.practicaltestpaperiasf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
