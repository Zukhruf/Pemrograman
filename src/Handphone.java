/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zukhruf Mifta
 */
public class Handphone {
    private int bunyi = 1;
    private int dering = 2;
    
    public void tambahNomor(){
        System.out.println("Menambah Nomor Berhasil....");
    }
    public void telepon(){
        System.out.println("Berdering nguuuk nguuuk....");
    }
    public void deringan(int d){
        if(d!=dering){
            bunyi = 0; dering = 1;
        }
    }
    public void profil(){
        System.out.println("Menjadi mode "+bunyi+" dengan dering "+dering);
    }
}
