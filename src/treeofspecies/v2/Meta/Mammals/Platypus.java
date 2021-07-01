package treeofspecies.v2.Meta.Mammals;

import properties.PlaceOfHabitation;
import properties.Swimming;
import properties.Walking;
import treeofspecies.v2.Metazoa.Mammals;

public class Platypus extends Mammals implements Walking, Swimming{

    PlaceOfHabitation place1 = PlaceOfHabitation.RIVER;
    PlaceOfHabitation place2 = PlaceOfHabitation.LAKE;

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

    @Override
    public void canWalk() {
        System.out.print("This creature can walk");
    }
}
