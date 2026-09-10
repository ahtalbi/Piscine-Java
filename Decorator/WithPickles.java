public class WithPickles extends RacletteDecorator {
    private Raclette decoratedRaclette;

    public WithPickles(Raclette raclette) {
        super(raclette);
        if (raclette == null) return;
        this.decoratedRaclette = raclette;
    }

    public int getCalories() {
        return 50 + this.decoratedRaclette.getCalories();
    }

    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", cornichons";
    }

    public String toString() {
        return String.format("Patate, fromage à raclette, cornichons pour %d calories", this.getCalories());
    }
}