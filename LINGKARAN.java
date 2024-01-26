/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGUN_DATAR;

    public class LINGKARAN extends BANGUNDATAR {
        // JARI JARI LINGKARAN
        float r;
        
        @Override
        float luas(){
            float luas =(float)(Math.PI*r*r);
            System.out.println("Luas Lingkaran: " + luas);
            return luas;
        }
        @Override
        float keliling(){
            float keliling = (float)(2*Math.PI*r);
            System.out.println("Keliling Lingkaran: " +keliling);
            return keliling;
        }
    }
    

