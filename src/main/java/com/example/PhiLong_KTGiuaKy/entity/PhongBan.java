package com.example.PhiLong_KTGiuaKy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Set;

@Entity
@Getter
@Setter
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2)
    private String maPhong;

    @Column(nullable = false, length = 30)
    private String tenPhong;

    @OneToMany(mappedBy = "phongBan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<NhanVien> nhanvien;
}
