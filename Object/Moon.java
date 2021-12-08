package Object;

import Ability.Planet;
import List.Planet.*;

public class Moon extends Planet{

    public Moon(){
        this.setColor(Color.YELLOW);
        this.setSize(Size.SMALL);
        this.setType(PlanetType.MOON);
    }

    @Override
    public void Roll() {
        System.out.println("Moon is Rolling itself");
        
        System.out.println("Moon is rolling around " + PlanetType.EARTH);
    }
}
