package Ability;

import List.Objects;

public abstract class Human implements Human_Action, Human_Mental, Human_Thinking, Human_Rest {
    private String Name;

    public void setName(String name) {
        this.Name = name;
    } 

    public String getName() {
        return this.Name;
    }

    @Override
    public void sleep(Objects obj) {
        System.out.println(this.getName() + " is sleeping at the " + obj.getValue());
        
    }
    
    @Override
    public void aWake() {
        System.out.println(this.getName() + " woke up ");
        
    }

    @Override
    public void smile() {
        System.out.println(this.getName() + " smile ");
        
    }

    @Override
    public void confess(Objects obj) {
        System.out.println(this.getName() + " confess that " + obj.getValue());
        
    }

    @Override
    public void understand(Objects obj) {
        System.out.println(this.getName() + " could not understand " + obj.getValue());
        
    }

    @Override
    public void remember(Objects obj) {
        System.out.println(obj.getValue() + " " + this.getName() + " remembered that ");
        
    }

    @Override
    public void notice(Objects obj) {
        System.out.println(this.getName() + " pay attention " + obj.getValue());
        
    }

    @Override
    public void realize(Objects obj) {
        System.out.println(this.getName() + " realized " + obj.getValue());
        
    }

    @Override
    public void want(Objects obj) {
        System.out.println(this.getName() + " already wanted " + obj.getValue());
        
    }

    @Override
    public void think(Objects obj) {
        System.out.println(this.getName() + " thought " + obj.getValue());
        
    }

    @Override
    public void decide(Objects obj) {
        System.out.println(this.getName() + " decided " + obj.getValue());
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Human others = (Human) obj;
        return this.Name == others.Name;
    }

    @Override
    public int hashCode() {
        return this.Name.hashCode();
    }

    @Override
    public String toString() {
        return this.Name;
    }

}
