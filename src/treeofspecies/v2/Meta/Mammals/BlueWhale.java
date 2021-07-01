package treeofspecies.v2.Meta.Mammals;

import properties.PlaceOfHabitation;
import properties.Swimming;
import treeofspecies.v2.Metazoa.Mammals;

public class BlueWhale extends Mammals implements Swimming{

    PlaceOfHabitation place1 = PlaceOfHabitation.OCEAN;

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
