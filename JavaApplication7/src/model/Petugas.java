/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Orang;
import model.Anggota;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ac
 */
public class Petugas extends Orang{
//    private Arraylist<Anggota> listAnggota = new Arraylist<Anggota>();
    private Anggota[] peminjam = new Anggota[100];
    private Orang petugas;
    private int jumPeminjam = 0;
    private String passwordPetugas;

    public Petugas(String nama,int id, String passwordPetugas) {
        super(nama, id);
        this.passwordPetugas = passwordPetugas;
    }

    public String getJabatan() {
        return "Petugas";
    }
    
    public void addAnggota(Anggota a){
        peminjam[jumPeminjam] = a;
        jumPeminjam++;
    }

    public Anggota getPeminjam(int i) {
        return peminjam[i];
    }
    
    
}
