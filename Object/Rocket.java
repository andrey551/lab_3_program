package Object;

import Ability.Vehicle;
import List.Planet.PlanetType;
import Ability.Engine;
import Ability.Human;

public class Rocket extends Vehicle {
    private boolean isWorking;
    private PlanetType destination;
    private Engine engine;

    public void setDestination(PlanetType des) {
        this.destination = des;
        System.out.println("Rocket is on way to " + this.getDestination());
    }

    public PlanetType getDestination() {
        return this.destination;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void makeSound() {
        this.engine.isWorking();
        this.engine.makeNoise();
    }

    public Rocket(String name) {
        this.setName(name);
    }

    public void setMood(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public boolean checkWorking() {
        return this.isWorking;
    }

    @Override
    public void isWorking() {
        if(this.isWorking) {
            System.out.println(this.getName() + "is flying");
        }
        else {
            System.out.println(this.getName() + "isn't flying");
        }
    }

    @Override
    public void Passenger (){
        for( Human i : this.getContain()) {
            System.out.println(i.getName() +"is on rocket");
        }
    }

    public void isOnRocket(Human human) {
        if(this.isOnTheVehicle(human)) {
            System.out.println(human.getName() + " is on " + this.getName());
        }
        else {
            System.out.println(human.getName() + " isn't on " + this.getName());
        }
    }

}
