package com.example.PhiLong_KTGiuaKy.repository;


import com.example.PhiLong_KTGiuaKy.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}