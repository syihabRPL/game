/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;


public class game {
    public static void main(String[] args) {
        //membuat pbjek player
        player yanto = new player();
        
        //mengisi atribut player
        yanto.name = "kolor";
        yanto.speed = 78;
        yanto.healthPoin =100;
        yanto.attack =90;
        yanto.defense =100;
        
        //menjalankan method
        yanto.run();
        yanto.attack();
        yanto.defense();
        
        if(yanto.isDead()){
            System.out.println("Game over");
        }
    }
    
    
}
