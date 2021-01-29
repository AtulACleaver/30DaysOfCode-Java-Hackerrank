package car;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    // Day 2 changes
    double maxFuel = 16;
    double currentFuel=8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 7;
    /*f(x) = x +1;
      x = 5;
      f(5) = 5+1 = 6;
     */
    //These are all functions//
    public  Car(){

    }
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){ // These are constructors are used to initialize the code and not the prevent actual values added to it.
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    // getters and setters


    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed (int newMaxSpeed){
//        this.maxSpeed = newMaxSpeed;
        newMaxSpeed = this.maxSpeed + 10;

    }
    public int getMinSpeed(){
        return minSpeed;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getIsTheCarOn(){
        return this.isTheCarOn;
    }


    public void printVariables(){
        System.out.println("This the max speed of the car: "+ maxSpeed + "km/hr.");
        System.out.println("This is the minimum speed of the car: "+ minSpeed + "km/hr.");
        System.out.println("The weight of this car is: " + weight + "kg.");
        System.out.println("Is the car on? --> " + isTheCarOn + ".");
        System.out.println("The condition of the car is: " + condition + ".");
        System.out.println("Name of the car is " + nameOfCar + ".");
        System.out.println("The number of people in car = " + numberOfPeopleInCar);
    }
    public void upgradeMaxSpeed (){
       setMaxSpeed(getMaxSpeed()+10);
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++; // This is same as a = a+1;
            System.out.println("Someone Got In :)");
        }else{
            System.out.println("The car is full as the number of people in car = " + numberOfPeopleInCar);
        }
    }

    public void getOut(){
        // if the number of people in car not equal to zero we can kick them out but if they are zero we can't do that.
        if (this.numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        }else{
            // This will say that the car shall be off.
        System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }

    public double howManyMilesTillOutOffGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp (){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        // if the car isn't on..
        if (isTheCarOn == false){   // This is a conditional statement
            //Set the car on...
            isTheCarOn = true;
            System.out.println("The car now on.");
        }else{
            System.out.println("The car is already on" + isTheCarOn);
        }


    }
    public static void main(String[] args){
        Car tommyCar = new Car();
        tommyCar.getIn();
//        tommyCar.getOut();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.turnTheCarOn();

       /* There is another type datatypes known as referenced types
        Which are as follows:
        Arrays
        Queues
        Linked Lists
        Stacks
        it means for example on atul if the car is blue. But it can be changed for specially for jayant or
        any member of the house.
         */

    }
}
