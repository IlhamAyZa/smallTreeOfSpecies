package treeofspecies.v2.Meta.Insect;

import properties.PlaceOfHabitation;
import properties.Walking;
import treeofspecies.v2.Metazoa.Insects;

public class Ant extends Insects implements Walking{

    PlaceOfHabitation place1 = PlaceOfHabitation.CITY;
    PlaceOfHabitation place2 = PlaceOfHabitation.PLAIN;
    PlaceOfHabitation place3 = PlaceOfHabitation.HILLS;
    PlaceOfHabitation place4 = PlaceOfHabitation.SWAMP;
    PlaceOfHabitation place5 = PlaceOfHabitation.MOUNTAINS;
    PlaceOfHabitation place6 = PlaceOfHabitation.TUNDRA;
    PlaceOfHabitation place7 = PlaceOfHabitation.FOREST;
    PlaceOfHabitation place8 = PlaceOfHabitation.JUNGLES;
    PlaceOfHabitation place9 = PlaceOfHabitation.DESERT;
    PlaceOfHabitation place10 = PlaceOfHabitation.CAVES;

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
