package Object;

import Ability.Planet;
import List.Planet.*;

public class Earth extends Planet{

    public Earth() {
        this.setColor(Color.BLUE);
        this.setSize(Size.MEDIUM);
        this.setType(PlanetType.EARTH);
    }


    @Override
    public void Roll() {
        System.out.println("Earth is rolling itself");
    }
}
