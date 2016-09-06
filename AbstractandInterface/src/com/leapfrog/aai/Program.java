/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.aai;

import com.leapfrog.aai.factory.Camera;
import com.leapfrog.aai.factory.Gun;
import com.leapfrog.aai.factory.MachineGun;
import com.leapfrog.aai.factory.Musket;
import com.leapfrog.aai.factory.Pistol;
import com.leapfrog.aai.factory.Police;
import com.leapfrog.aai.factory.Shootable;
import com.leapfrog.aai.factory.Shotgun;


public class Program {

    
    public static void main(String[] args) {
          Police p= new Police(new Musket());
          p.shooting();
          
 
     
       
    }
    
}
