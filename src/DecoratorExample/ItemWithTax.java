package src.src.DecoratorExample;

public interface ItemWithTax {
    // These are the new things that we
    // added to the decorated interface
    double getTaxRate();
    Item getItem();

    // These are default implementations of the
    // original interface that simply delegate
    // to the underlying original item.
    default String getName() {return getItem().getName();}
    default String getManufacturer() {return getItem().getManufacturer();}
    default String getUPCCode() {return getItem().getUPCCode();}
    default double getWeight() {return getItem().getWeight();}

    // This is a default implementation
    // that does amends / modifies
    // what original did to incorporate the tax
    default double getPrice() {return getItem().getPrice() * getTaxRate();}
}
