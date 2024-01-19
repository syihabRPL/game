/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;


public class player {
     // definisi atribut
    String name;
    int speed;
    int healthPoin;
    int damage;
    int defense;
    int attack;
    int armour;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    void attack(){
        System.out.println(name +" attacking...");
        System.out.println("Attack: "+attack);
    }
    void defense(){
        System.out.println(name+" is defensed...");
        System.out.println("Defense:"+defense);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}
