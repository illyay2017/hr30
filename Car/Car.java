public class Car {
  int maxSpeed = 100;
  int minSpeed = 0;

  double weight = 4079;

  boolean isTheCarOn = false;
  char condition = 'A';
  String nameOfCar = "Lucy";

  double maxFuel = 16;
  double currentFuel = 8;
  double mpg = 26.4;

  int numberOfPeopleInCar = 1;
  int maxNumberOfPeopleInCar = 6;

  // public Car {

  // };

  public Car() {

  }

  // Getters and Setters

  public int getMaxSpeed() {
    return this.maxSpeed;
  }

  public int getMinSpeed() {
    return this.minSpeed;
  }

  public double getWeight() {
    return this.weight;
  }

  public boolean getIsTheCarOn() {
    return this.isTheCarOn;
  }

  public void setMaxSpeed(int newMaxSpeed) {
    this.maxSpeed = newMaxSpeed;
  }

  public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
    maxSpeed = customMaxSpeed;
    weight = customWeight;
    isTheCarOn = customIsTheCarOn;
  }

  public void PrintVariables() {
    System.out.println("This is the max speed: " + maxSpeed);
    System.out.println(minSpeed);
    System.out.println(weight);
    System.out.println(isTheCarOn);
    System.out.println(condition);
    System.out.println(nameOfCar);
    System.out.println(numberOfPeopleInCar);
  }

  public void upgradeMaxSpeed() {
    setMaxSpeed(getMaxSpeed() + 10);
  }

  public void upgradeMinSpeed() {
    minSpeed = maxSpeed;
    maxSpeed = maxSpeed + 1;
  }

  public void getIn() {
    if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
      numberOfPeopleInCar++;
      System.out.println("Someone got in");
    } else {
      System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
    }
  }

  public void getOut() {
    if (numberOfPeopleInCar > 0) {
      numberOfPeopleInCar--;
      System.out.println("Someone got out");
    } else {
      System.out.println("No one is in the car " + numberOfPeopleInCar);
    }
  }

  public double howManyMilesTillOutOfGas() {
    return currentFuel * mpg;
  }

  public double maxMilesPerFillup() {
    return maxFuel * mpg;
  }

  public void turnTheCarOn() {
    if (!isTheCarOn) {
      isTheCarOn = true;
    } else {
      System.out.println("The car is already on " + isTheCarOn);
    }
  }

  public static void main(String[] args) {
    Car tommyCar = new Car();
    tommyCar.getOut();
    // tommyCar.getOut();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.getIn();
    // tommyCar.turnTheCarOn();
    // tommyCar.turnTheCarOn();

    Car illyaCar = new Car();
    System.out.println(illyaCar.getMaxSpeed());
    illyaCar.setMaxSpeed(200);
    System.out.println(illyaCar.getMaxSpeed());
    illyaCar.upgradeMaxSpeed();
    System.out.println(illyaCar.getMaxSpeed());
  }
}