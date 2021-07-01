package treeofspecies.v2.Meta.Mammals;

import properties.PlaceOfHabitation;
import properties.Walking;
import treeofspecies.v2.Metazoa.Mammals;

public class Deer extends Mammals implements Walking{

    PlaceOfHabitation place1 = PlaceOfHabitation.TUNDRA;
    PlaceOfHabitation place2 = PlaceOfHabitation.FOREST;

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
