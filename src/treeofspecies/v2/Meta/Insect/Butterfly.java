package treeofspecies.v2.Meta.Insect;

import properties.Flying;
import properties.PlaceOfHabitation;
import properties.Walking;
import treeofspecies.v2.Metazoa.Insects;

public class Butterfly extends Insects implements Walking, Flying{

    PlaceOfHabitation place1 = PlaceOfHabitation.CITY;
    PlaceOfHabitation place2 = PlaceOfHabitation.PLAIN;
    PlaceOfHabitation place3 = PlaceOfHabitation.HILLS;
    PlaceOfHabitation place4 = PlaceOfHabitation.FOREST;
    PlaceOfHabitation place5 = PlaceOfHabitation.JUNGLES;

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

    @Override
    public void canFly() {
        System.out.print("This creature can fly");
    }
    
}
