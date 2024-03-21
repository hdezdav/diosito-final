package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Animal extends LivingBeings implements EarthBeing, SkyBeing {

    public Animal(String beign, String name){
        super(beign, name);
    }

    @Override
    public void born(){
        System.out.println("Animal born...");
    }

    @Override
    public void respawn(){
        System.out.println("Animal respawning...");
    }

    @Override
    public void reproduce(){
        System.out.println("Animal reproducing...");
    }
    @Override
    public void grow(){
        System.out.println("Animal growing...");
    }
    @Override
    public void communicate(){
        System.out.println("Animal communicating...");
    }
    @Override
    public void die(){
        System.out.println("Animal dying...");
    }

    @Override
    public void fly() {

    }

    @Override
    public void changeDimension() {

    }

    @Override
    public void changeForm() {

    }
}