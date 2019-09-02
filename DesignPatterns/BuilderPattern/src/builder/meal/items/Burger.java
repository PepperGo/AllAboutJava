package builder.meal.items;

import builder.meal.pack.Packing;
import builder.meal.pack.Wrapper;

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
