package com.example.PhiLong_KTGiuaKy.repository;



import com.example.PhiLong_KTGiuaKy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}