package treeofspecies.v2.Meta.Mammals;

import properties.Flying;
import properties.PlaceOfHabitation;
import properties.Swimming;
import properties.Walking;
import treeofspecies.v2.Metazoa.Mammals;

public class Bat extends Mammals implements Walking, Flying{

    PlaceOfHabitation place1 = PlaceOfHabitation.CAVES;
    PlaceOfHabitation place2 = PlaceOfHabitation.HILLS;
    PlaceOfHabitation place3 = PlaceOfHabitation.MOUNTAINS;

    @Override
    public void living() {
        System.out.print("This is living creature");
    }

    @Override
    public void canMove() {
        System.out.print("This creature can move");
    }

    @Override
    public void canFly() {
        System.out.print("This creature can fly");
    }

    @Override
    public void canWalk() {
        System.out.print("This creature can walk");
    }
    
}
