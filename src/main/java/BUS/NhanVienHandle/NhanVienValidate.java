/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.NhanVienHandle;

import BUS.CustomerHandle.EmailExampleTest;
import DAL.DataModels.NhanVien;

/**
 *
 * @author MY ACER
 */
public class NhanVienValidate {
    private final NhanVien nhanvienValidate;
    private EmailExampleTest emailExampleTest;
    
    public NhanVienValidate(){
        nhanvienValidate = new NhanVien();
        emailExampleTest = new EmailExampleTest();
    }
    
    public boolean validateAll(String tenNhanVien,String soDienThoai, String cmnd, String diachi  ){
        return checkTenNhanVien(tenNhanVien) && checkSoDienThoai(soDienThoai) && checkCmnd(cmnd)  && checkDiaChi(diachi);
    }
    
    private boolean checkTenNhanVien(String tenNhanVien){
        if(tenNhanVien.length() < 2) return false;
        this.nhanvienValidate.setTenNV(tenNhanVien);
        return true;
    }
    
    private boolean checkSoDienThoai(String soDienThoai){
        if(soDienThoai.length() != 10) return false;
        this.nhanvienValidate.setSoDienThoai(soDienThoai);
        return true;
    }
    
    private boolean checkCmnd(String cmnd){
        if(cmnd.length() != 12) return false;
        this.nhanvienValidate.setCmnd(cmnd);
        return true;
    }
    
    private boolean checkEmail(String email){
        return emailExampleTest.checkEmail();
    }
    
    private boolean checkDiaChi(String diachi){
        if(diachi.length() < 10) return false;
        this.nhanvienValidate.setDiaChi(diachi);
        return true;
    }
    
}
