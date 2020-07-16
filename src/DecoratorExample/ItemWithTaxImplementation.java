package src.src.DecoratorExample;

public class ItemWithTaxImplementation implements ItemWithTax {
    private Item original_item;
    private double tax_rate;

    public ItemWithTaxImplementation(Item item, double rate) {
        original_item = item;
        tax_rate = rate;
    }

    public double getTaxRate() {return tax_rate;}
    public Item getItem() {return original_item;}
}
