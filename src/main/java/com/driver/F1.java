package com.driver;

public class F1 extends Car {



    @Override
    public void setWheels(int wheels) {
        super.setWheels(wheels);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setDoors(int doors) {
        super.setDoors(doors);
    }

    @Override
    public void setGears(int gears) {
        super.setGears(gears);
    }

    @Override
    public void setManual(boolean manual) {
        super.setManual(manual);
    }

    @Override
    public void setCurrentGear(int currentGear) {
        super.setCurrentGear(currentGear);
    }

    @Override
    public void setSeats(int seats) {
        super.setSeats(seats);
    }

//    public F1(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
//        super(name, wheels, doors, gears, isManual, type, seats);
//    }

    @Override
    public void changeGear(int newGear) {
        super.changeGear(newGear);
    }

    @Override
    public void changeSpeed(int newSpeed, int newDirection) {
        super.changeSpeed(newSpeed, newDirection);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    @Override
    public void setCurrentSpeed(int currentSpeed) {
        super.setCurrentSpeed(currentSpeed);
    }

    @Override
    public int getCurrentDirection() {
        return super.getCurrentDirection();
    }

    @Override
    public void setCurrentDirection(int currentDirection) {
        super.setCurrentDirection(currentDirection);
    }

    @Override
    public void steer(int direction) {
        super.steer(direction);
    }

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }

    public F1(String name, boolean isManual) {
        super(name,isManual);

        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed =getCurrentSpeed() +rate;
        setCurrentSpeed(newSpeed);
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            this.changeGear(1);
            stop();
            //Stop the car, set gear as 1
        }
        if (newSpeed>=1 && newSpeed<=50){
            this.changeGear(1);
        }
        if (newSpeed>=51 && newSpeed<=100){
            this.changeGear(2);
        }
        if (newSpeed>=101 && newSpeed<=150){
            this.changeGear(3);
        }
        if (newSpeed>=151 && newSpeed<=200){
            this.changeGear(4);
        }
        if (newSpeed>=201 && newSpeed<=250){
            this.changeGear(5);
        }
        if (newSpeed>250){
            this.changeGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
