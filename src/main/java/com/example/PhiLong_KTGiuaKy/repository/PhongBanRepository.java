package com.example.PhiLong_KTGiuaKy.repository;

import com.example.PhiLong_KTGiuaKy.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhongBanRepository extends JpaRepository<PhongBan, Long> {
    PhongBan findByMaPhong(String maPhong);
}
