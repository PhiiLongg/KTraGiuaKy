package com.example.PhiLong_KTGiuaKy.repository;


import com.example.PhiLong_KTGiuaKy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}