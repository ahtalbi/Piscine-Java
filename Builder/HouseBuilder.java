public class HouseBuilder implements HousingBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HousingBuilder setSize(int size) {
        house.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        house.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        house.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        house.setName(name);
        return this;
    }

    public Housing build() {
        return house;
    }
}
