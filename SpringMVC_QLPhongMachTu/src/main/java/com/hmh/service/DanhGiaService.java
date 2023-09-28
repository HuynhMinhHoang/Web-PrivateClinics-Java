/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hmh.service;

import com.hmh.pojo.DanhGiaBs;
import com.hmh.pojo.TaiKhoan;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface DanhGiaService {

    boolean themDanhGiaBS(DanhGiaBs danhGiaBs, TaiKhoan tk, TaiKhoan bs, int hd);
    
    DanhGiaBs getDanhGiaBSByIdHD(int idHd);
    
    List<TaiKhoan> getDSBacSiByDanhGiaBS();
}
