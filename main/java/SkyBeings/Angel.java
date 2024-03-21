package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.LivingBeings;
import SkyBeings.SkyBeing;

public class Angel extends LivingBeings implements SkyBeing, EarthBeing {

  public Angel(String being, String name) {
    super(being, name);
  }

  @Override
  public void born() {
    System.out.println("Angel born...");
  }

  @Override
  public void grow() {
    System.out.println("Angel growing...");
  }

  @Override
  public void communicate() {
    System.out.println("Angel communicating...");
  }

  @Override
  public void reproduce() {
    System.out.println("Angel doing the ñaka ñaka...");
  }

  @Override
  public void respawn() {
    System.out.println("Angel respawning...");
  }

  @Override
  public void die() {
    System.out.println("Angel dying...");
  }

  public void fly() {
    System.out.println("Flying");
  }

  public void changeDimension() {
    System.out.println("Changing dimension");
  }

  public void changeForm() {
    System.out.println("Changing my form");
  }
}
