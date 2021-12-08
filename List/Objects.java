package List;

import List.Planet.PlanetType;

public enum Objects {
    
    SLEEP("food compartment"){
        @Override
        public String getValue(){
            return "Hello";
        }
    },
    DIDNTFEEL("the space flight had begun"),
    AWAKE("In the middle of the night"),
    REMEMBER("Gradually"),
    CLIMB("into the rocket"),
    UNDERSTAND("why he was here and not at home in bed"),
    FEEL("weightlessness"),
    NOTICE("to the dimensional noise of the jet engine"),
    REALIZE("the spacecraft was in flight"),
    THINK(" So, while I was sleeping, Znayka and the rest of the little ones boarded the ship and went to the " + PlanetType.MOON),
    WANT("to get out of his shelter"),
    CONFESS("he had climbed into the rocket without asking"),
    DECIDE("to wait for the rocket to fly away from " + PlanetType.EARTH);

        
    private String val;
    
    Objects(String val) {
        this.val = val; 
    }
    
    public String getValue() {
        return this.val;
    }
}
