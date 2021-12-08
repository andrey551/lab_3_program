package Object;

import Ability.Engine;

public class RocketEngine implements Engine{
    @Override
    public void isWorking() {
        System.out.println("Rocket engine is working");
    }

    @Override
    public void makeNoise() {
        System.out.println("Viu Viu....");
    }
}
