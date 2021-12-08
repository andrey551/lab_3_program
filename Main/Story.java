package Main;

import List.Objects;
import List.Planet.PlanetType;
import List.MoveType;
import Object.Boy;
import Object.Rocket;
import Object.RocketEngine;
import Object.Moon;
import Object.Earth;

public class Story {
    public static void main(String[] args) {
        Boy H = new Boy("Neznayka");
        Boy Z = new Boy("Znaika");
        Rocket X = new Rocket("Starship");
        RocketEngine T = new RocketEngine();
        Moon Y = new Moon();
        Earth S = new Earth();
        X.setEngine(T);
        Y.Roll();
        S.Roll();
        X.setMood(true);
        X.setMoveType(MoveType.FLY);
        X.setDestination(PlanetType.MOON);
        H.climb(Objects.CLIMB, X);
        X.addHuman(Z);
        X.isOnRocket(H);
        //X.Passenger();
        H.sleep(Objects.SLEEP);
        H.setFeelMood(false);
        X.makeSound();
        H.feel(Objects.DIDNTFEEL);
        H.aWake();
        H.understand(Objects.UNDERSTAND);
        H.remember(Objects.REMEMBER);
        H.setFeelMood(true);
        H.feel(Objects.FEEL);
        H.notice(Objects.NOTICE);
        H.realize(Objects.REALIZE);
        H.think(Objects.THINK);
        H.smile();
        H.want(Objects.WANT);
        H.confess(Objects.CONFESS);
        H.decide(Objects.DECIDE);
    }
}
