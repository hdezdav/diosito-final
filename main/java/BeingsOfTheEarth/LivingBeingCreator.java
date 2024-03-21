package BeingsOfTheEarth;

import java.util.Scanner;
import SkyBeings.Angel;

public class LivingBeingCreator implements Creator {

  @Override
  public LivingBeings createLivingBeings(String being, String name) {
    if ("Human".equals(being)) {
      Human human = new Human(being, name);
      human.born();
      human.grow();
      human.reproduce();
      human.die();
      return human;
    } else if ("Animal".equals(being)) {
      Animal animal = new Animal(being, name);
      animal.born();
      animal.grow();
      animal.communicate();
      animal.die();
      return animal;
    } else if ("Angel".equals(being)) {
      Angel angel = new Angel(being, name);
      angel.born();
      angel.fly();
      angel.changeDimension();
      angel.changeForm();
      angel.respawn();
      angel.die();
      return angel;
    } else {
      throw new IllegalArgumentException("Type of Living Being don´t recognized " + being);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Creator creator = new LivingBeingCreator();

    System.out.println("Enter the type of Living Being to create (Human/Animal/Angel):");
    String beingType = scanner.nextLine();

    System.out.println("Enter name:");
    String name = scanner.nextLine();

    LivingBeings livingBeing = creator.createLivingBeings(beingType, name);

    System.out.println("Living Being successfully created:");
    System.out.println(livingBeing.getClass().getSimpleName() + ": " + name);
  }
}
