/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.aai.factory;


public class Police {
    private Gun gun;
    
    public Police(){
        this.gun=new Pistol();
    }
    public Police(Gun gun){
        this.gun=gun;
    }
    public void shooting(){
        gun.shoot();
    }
    
}
