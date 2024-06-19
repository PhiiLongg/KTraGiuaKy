package com.example.PhiLong_KTGiuaKy.service;

import com.example.PhiLong_KTGiuaKy.entity.NhanVien;
import com.example.PhiLong_KTGiuaKy.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(Long id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    public NhanVien addNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public NhanVien updateNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(Long id) {
        nhanVienRepository.deleteById(id);
    }
}
