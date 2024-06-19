package com.example.PhiLong_KTGiuaKy.controller;

import com.example.PhiLong_KTGiuaKy.entity.NhanVien;
import com.example.PhiLong_KTGiuaKy.entity.PhongBan;
import com.example.PhiLong_KTGiuaKy.service.NhanVienService;
import com.example.PhiLong_KTGiuaKy.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String getAllNhanVien(Model model) {
        List<NhanVien> nhanViens = nhanVienService.getAllNhanVien();
        model.addAttribute("nhanViens", nhanViens);
        return "nhanvien";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("phongBans", phongBanService.getAllPhongBan());
        return "add-nhanvien";
    }

    @PostMapping("/add")
    public String addNhanVien(@ModelAttribute NhanVien nhanVien) {
        nhanVienService.addNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        NhanVien nhanVien = nhanVienService.getNhanVienById(id);
        model.addAttribute("nhanVien", nhanVien);
        model.addAttribute("phongBans", phongBanService.getAllPhongBan());
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateNhanVien(@PathVariable Long id, @ModelAttribute NhanVien nhanVien) {
        // Fetch PhongBan from database based on maPhong
        PhongBan phongBan = phongBanService.getPhongBanByMaPhong(nhanVien.getPhongBan().getMaPhong());
        nhanVien.setPhongBan(phongBan);

        // Set id of NhanVien to update
        nhanVien.setId(id);

        // Update NhanVien in database
        nhanVienService.updateNhanVien(nhanVien);

        return "redirect:/nhanvien";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable Long id) {
        // Delete NhanVien from database
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien";
    }
}
