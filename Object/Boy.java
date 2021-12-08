package Object;

import Ability.Human;
import List.Objects;

public class Boy extends Human {
    private Boolean feelMood;

    public void setFeelMood(Boolean x) {
        this.feelMood = x;
    }

    public Boolean getFeelMood() {
        return this.feelMood;
    }

    public Boy(String name) {
        this.setName(name);
    }

    @Override
    public void feel(Objects obj) {
        if(this.feelMood) {
            System.out.println(this.getName() + " feeling " + obj.getValue());
        } else {
            System.out.println(this.getName() + " did not even feel that " + obj.getValue());
        }
    }

    @Override
    public void climb(Objects obj, Rocket rocket) {
        System.out.println(this.getName() + " had deliberately climbed " + obj.getValue());
        rocket.addHuman(this);
    }
    
}
