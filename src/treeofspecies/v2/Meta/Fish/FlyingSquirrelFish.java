package treeofspecies.v2.Meta.Fish;

import properties.Flying;
import properties.PlaceOfHabitation;
import properties.Swimming;
import treeofspecies.v2.Metazoa.Fish;

public class FlyingSquirrelFish extends Fish implements Swimming, Flying{

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
    public void canFly() {
        System.out.print("This creature can fly");
    }

    @Override
    public void canSwim() {
        System.out.print("This creature can swim");
    }
    
    
}