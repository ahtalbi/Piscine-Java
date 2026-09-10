public class WithColdMeats extends RacletteDecorator {
    private Raclette decoratedRaclette;
    
    public WithColdMeats(Raclette raclette) {
        super(raclette);
        if (raclette == null) return;
        this.decoratedRaclette = raclette;
    }

    public int getCalories() {
        return 350 + this.decoratedRaclette.getCalories();
    }

    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", charcuterie";
    }

    public String toString() {
        return String.format("Patate, fromage à raclette, cornichons, charcuterie pour %d calories", this.getCalories());
    }
}
