/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zukhruf Mifta
 */
public class TitikTest {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.tampilPosisi();
        t1.setXY(10, 20);
        t1.tampilPosisi();
        System.out.println("Jarak t1 ke nol : "+t1.getJarakKeNol());
        Titik t2 = new Titik();
        System.out.println("Jarak t1 ke t2 : "+t1.getJarakKeTitik(t2));
        t2.setXY(10, 30);
        System.out.println("Jarak t1 ke t2 : "+t1.getJarakKeTitik(t2));
    }
}
