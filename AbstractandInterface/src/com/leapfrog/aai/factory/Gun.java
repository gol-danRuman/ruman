
package com.leapfrog.aai.factory;


public  class Gun  implements Shootable{
    private String name;
    public Gun(){
        name="Pistol";
    }

    @Override
    public void shoot() {
        System.out.println(name + " is shooting");
    }
    
    
}
