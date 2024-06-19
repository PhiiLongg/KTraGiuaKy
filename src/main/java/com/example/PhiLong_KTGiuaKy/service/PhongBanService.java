package com.example.PhiLong_KTGiuaKy.service;

import com.example.PhiLong_KTGiuaKy.entity.PhongBan;
import com.example.PhiLong_KTGiuaKy.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongBanService {

    private final PhongBanRepository phongBanRepository;

    @Autowired
    public PhongBanService(PhongBanRepository phongBanRepository) {
        this.phongBanRepository = phongBanRepository;
    }

    public List<PhongBan> getAllPhongBan() {
        return phongBanRepository.findAll();
    }

    public Optional<PhongBan> getPhongBanById(Long id) {
        return phongBanRepository.findById(id);
    }

    public PhongBan addPhongBan(PhongBan phongBan) {
        return phongBanRepository.save(phongBan);
    }

    public void deletePhongBan(Long id) {
        phongBanRepository.deleteById(id);
    }

    public PhongBan getPhongBanByMaPhong(String maPhong) {
        return phongBanRepository.findByMaPhong(maPhong);
    }

    public PhongBan updatePhongBan(PhongBan phongBan) {
        return phongBanRepository.save(phongBan);
    }
}
