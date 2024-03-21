package BeingsOfTheEarth;

public abstract class LivingBeings{

  private String being;
  private String name;

  public LivingBeings(String being, String name){
    this.being = being;
    this.name = name;
  }
  
  public abstract void born();
  public abstract void grow();
  public abstract void communicate();
  public abstract void reproduce();
  public abstract void respawn();
  public abstract void die();
}