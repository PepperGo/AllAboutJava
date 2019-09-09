package builder.meal.items;

import builder.meal.pack.Bottle;
import builder.meal.pack.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
