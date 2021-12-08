package Ability;

import java.util.ArrayList;
import List.MoveType;

public abstract class Vehicle implements Machine{
    private ArrayList<Human> contain = new ArrayList<Human>();
    private MoveType move;
    private String name;

    public void setMoveType(MoveType movetype) {
        this.move = movetype;
    }

    public MoveType getMoveType() {
        return this.move;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Human> getContain() {
        return this.contain;
    }

    public void addHuman(Human human) {
        this.contain.add(human);
    }

    public boolean isOnTheVehicle(Human human) {
        for(Human i : contain) {
            if(i.equals(human)) {
                return true;
            }
        }

        return false;
    }

    abstract public void Passenger();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Vehicle others = (Vehicle) obj;
        return this.getName() == others.getName();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
