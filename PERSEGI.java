/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGUN_DATAR;



    public class PERSEGI extends BANGUNDATAR {
        float sisi;
        
        @Override
        float luas(){
            float luas = sisi*sisi;
            System.out.println("Luas Persegi");
            return luas;
        }
        
        @Override
        float keliling(){
            float keliling = 4*sisi;
            System.out.println("Keliling Persegi");
            return keliling;
        }
                
        
    }
    

