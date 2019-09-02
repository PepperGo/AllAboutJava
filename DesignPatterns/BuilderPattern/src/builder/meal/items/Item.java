package builder.meal.items;

import builder.meal.pack.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
