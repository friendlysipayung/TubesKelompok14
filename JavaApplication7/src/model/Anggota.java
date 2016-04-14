/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import java.util.function.Consumer;
/**
 *
 * @author ac
 */
public class Anggota extends Orang{
    private ArrayList<Peminjaman> riwayatPinjaman = new ArrayList();
    //private int jumAnggota = 0;
    private int jumPinjaman =0 ;
    private String passwordAnggota;
    private date tanggal;


    public Anggota(String nama, int id, String password){
        super(nama, id);
        passwordAnggota = password;
    }

    public int getJumPinjaman() {
        return jumPinjaman;
    }

    public void CreatePeminjaman(int idPeminjaman,Date date){
        Peminjaman e = new Peminjaman(idPeminjaman,date);
        e.setStatusPeminjaman(false);
        riwayatPinjaman.add(e);
        jumPinjaman++;
    }

    public Peminjaman GetPeminjamanByIndex (int indeks){
        return riwayatPinjaman.get(indeks);
    }

    public Peminjaman GetPeminjamanByDate(Date tanggal){
        Peminjaman temp = null;
        for (int i = 0; i < jumPinjaman; i++) {      
            }
            if (riwayatPinjaman.get(jumPinjaman).getTanggalPinjam()==tanggal) {
                temp = riwayatPinjaman.get(jumPinjaman); 
            }  
        return temp;
    }

    //belum paham 
    public void KembalikanPinjaman(int idPeminjaman){
        for (int i = 0; i < jumPinjaman; i++) {
            if (riwayatPinjaman.get(i).getIdBarang() == idPeminjaman){
                riwayatPinjaman.get(i).setStatusPeminjaman(true);
            }
        }
    }

    public Anggota(String s){
        super.jabatan = s;
    }
    public String getJabatan(){
        return "Anggota";
    }
//
//        public String getPasswordAnggota() {
//            return passwordAnggota;
//        }
//        
//        public void createPinjaman(date tanggal){
//            p[jumPinjaman]= new Peminjaman(String nama, int tanggal);
//            jumPinjaman++;
//        }
//        
//        public Peminjaman getPeminjamanbyIndex(){
//            return p[i];
//        }
//        
//        public Peminjaman getPeminjamanbyTanggal {
//            return p[tanggal];
//        }
//
//        public void setPasswordAnggota(String passwordAnggota) {
//            this.passwordAnggota = passwordAnggota;
//        }
//	

//	
//	public void addMember(Orang member){
//		this.member[jumAnggota] = member;
//		jumAnggota++;
//	}
//	
////	public int getJumAnggota(){
////		return jumAnggota;
////	}
//	
////	public void getDaftarPinjaman(){
////		return p;		
////	}
//	
////	public void createPinjaman(String nama){
////		this.pinjam[
////	}	
	
}
