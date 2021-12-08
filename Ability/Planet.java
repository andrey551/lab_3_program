package Ability;

import List.Planet.*;

public abstract class Planet {
    private Color color;
    private Size size;
    private PlanetType type;

    public Color getColor(){
        return this.color;
    };

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public Size getSize() {
        return this.size;
    }

    public PlanetType getPlanetType() {
        return this.type;
    }
    
    abstract public void Roll();

}
