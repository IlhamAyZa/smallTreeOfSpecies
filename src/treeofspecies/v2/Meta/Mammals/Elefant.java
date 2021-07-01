package treeofspecies.v2.Meta.Mammals;

import properties.PlaceOfHabitation;
import properties.Walking;
import treeofspecies.v2.Metazoa.Mammals;

public class Elefant extends Mammals implements Walking{

    PlaceOfHabitation place1 = PlaceOfHabitation.SAVANNA;
    PlaceOfHabitation place2 = PlaceOfHabitation.PLAIN;
    PlaceOfHabitation place3 = PlaceOfHabitation.JUNGLES;

    @Override
    public void living() {
        System.out.print("This is living creature");
    }

    @Override
    public void canMove() {
        System.out.print("This creature can move");
    }

    @Override
    public void canWalk() {
        System.out.print("This creature can walk");
    }
        
}
