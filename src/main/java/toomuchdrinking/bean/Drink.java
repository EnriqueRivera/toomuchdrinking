package toomuchdrinking.bean;

public class Drink {

    private double abv;
    private DrinkType drinkType;
    private String description;
    private int quantity;
    private int milliliters;

    public double getAbv() {
        return abv;
    }

    public void setAbv(final double abv) {
        this.abv = abv;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(final DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(final int milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "abv=" + abv +
                ", drinkType=" + drinkType +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", milliliters=" + milliliters +
                '}';
    }
}