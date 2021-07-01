package treeofspecies.v2.Meta.Fish;

import properties.PlaceOfHabitation;
import properties.Swimming;
import treeofspecies.v2.Metazoa.Fish;

public class Sturgeon extends Fish implements Swimming{

    PlaceOfHabitation place1 = PlaceOfHabitation.OCEAN;
    PlaceOfHabitation place2 = PlaceOfHabitation.RIVER;
    PlaceOfHabitation place3 = PlaceOfHabitation.LAKE;

    @Override
    public void living() {
        System.out.print("This is living creature");
    }

    @Override
    public void canMove() {
        System.out.print("This creature can move");
    }

    @Override
    public void canSwim() {
        System.out.print("This creature can swim");
    }
    
    
}
