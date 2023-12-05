/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author xviil
 */
public class Mahasiswa {
    
    private String nama;
    private String nim;
    private String alamat;

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }    
    
    public String getNim(){
        return nim;
    }
    
    public String getAlamat(){
        return alamat;
    }
}
    