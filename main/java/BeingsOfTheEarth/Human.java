package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing{

  public Human(String being, String name){
    super(being, name);
  }

   public void born(){
    System.out.println("Hello world... I'm born");
  }
  public void grow(){
    System.out.println("I'm growing");
  }

  @Override
  public void communicate() {

  }

  public void reproduce(){
    System.out.println(" doing the ñaka ñaka");
  }
  public void die(){
    System.out.println("Goodbye world");
  }
  @Override
  public void fly(){
    System.out.println("Flying");
  }

  @Override
  public void changeDimension() {

  }

  @Override
  public void changeForm() {

  }

  @Override
  public void respawn(){
    System.out.println("Respawning...");
  }
}