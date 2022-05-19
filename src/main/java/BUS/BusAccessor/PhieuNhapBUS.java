/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.PhieuNhapDAO;
import DAL.DataModels.PhieuNhap;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author huykh
 */
public class PhieuNhapBUS extends AbstractBUSAccessor<PhieuNhap, Integer, PhieuNhapDAO>{
    public PhieuNhapBUS(){
        setDao(new PhieuNhapDAO());
    }
    
    public List<PhieuNhap> getFilter(String maNV, String maPN, String ngayBD, String ngayKT){
        return dao.selectAndFilter(maNV, maPN, ngayBD, ngayKT);
    }
    
    public List<PhieuNhap> locPhieuNhap(int maNV, int maPhieuNhap, String ngayBD, String ngayKT){
        List<PhieuNhap> list = this.getAll();
        List<PhieuNhap> tempList = new ArrayList<>();
        if (maPhieuNhap > 0){
            for (PhieuNhap ph : list){
                if (ph.getMaPhieu() == maPhieuNhap)
                    tempList.add(ph);
            }
            if (tempList.isEmpty()) return null;
        }
        if (maNV >0){
            if (tempList.isEmpty()) tempList = list;
            List<PhieuNhap> storeTemp = new ArrayList<>();
            for (PhieuNhap ph: tempList){
                if (ph.getMaNV() == maNV)
                    storeTemp.add(ph);
            }
            if (storeTemp.isEmpty()) return null;
            tempList = storeTemp;
        }
        
        if (tempList.isEmpty()){
            tempList = list;
        }
        
        try {
            Date bd = new SimpleDateFormat("dd-MM-yyyy").parse(ngayBD);
            Date kt = new SimpleDateFormat("dd-MM-yyyy").parse(ngayKT);
            List<PhieuNhap> storeTemp = new ArrayList<>();
            for (PhieuNhap ph: tempList){
                if (ph.getNgayLap().compareTo(bd)>=0 && ph.getNgayLap().compareTo(kt) <=0){
                    storeTemp.add(ph);
                }
            }
            return storeTemp;
        } catch (ParseException ex) {
        }
        return null;
    }
}