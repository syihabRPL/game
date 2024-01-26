/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGUN_DATAR;

public class Main {
    public static void main(String[] args) {
        //MEMBUAT OBJEK BANGUN DATAR
        BANGUNDATAR BangunDatar = new BANGUNDATAR();
        
        //MEMBUAT PERSEGI DAN MENGISI NILAI PROPERTI
        PERSEGI Persegi = new PERSEGI();
        Persegi.sisi =2;
        
        //MEMBUAT OBJEK LINGKARAN DENGAN MENGISI PROPERTI
        LINGKARAN Lingkaran = new LINGKARAN();
        Lingkaran.r =22;
        
        //MEMBUAT OBJEK PERSEGI PANJANG DENGAN MENGISI PROPERTI
        PERSEGIPANJANG PersegiPanjang = new PERSEGIPANJANG();
        PersegiPanjang.panjang = 8;
        PersegiPanjang.lebar = 10;
        
        //MEMBUAT OBJEK SEGITIGA DAN MENGISI NILAI PROPERTI
        SEGITIGA Segitiga =new SEGITIGA();
        Segitiga.alas = 12;
        Segitiga.tinggi = 8;
        
        //MENGISI METHOD LUAS DAN KELILING
        BangunDatar.luas();
        BangunDatar.keliling();
        
        Persegi.luas();
        Persegi.keliling();
        
        Lingkaran.luas();
        Lingkaran.keliling();
        
        PersegiPanjang.luas();
        PersegiPanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
        
        
                
    }
    
}
