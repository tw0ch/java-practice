package Practice3;

public class Bus {
    private int countPlaces;
    private int costPlace;
    private int occPlaces;

    /// Конструктор по умолчанию.
    public Bus() {
    }

    public Bus(int countPlaces, int costPlace, int occPlaces) {
        setCountPlaces(countPlaces);
        setCostPlace(costPlace);
        setOccPlaces(occPlaces);
    }

    public Bus(Bus busClone) {
        this.countPlaces = busClone.countPlaces;
        this.costPlace = busClone.costPlace;
        this.occPlaces = busClone.occPlaces;
    }

    public void setCountPlaces(int countPlaces) {
        this.countPlaces = countPlaces;
    }

    public void setCostPlace(int costPlace) {
        this.costPlace = costPlace;
    }

    public void setOccPlaces(int occPlaces) {
        this.occPlaces = occPlaces;
    }

    public int getCountPlaces() {
        return countPlaces;
    }

    public int getCostPlace() {
        return costPlace;
    }

    public int getOccPlaces() {
        return occPlaces;
    }

    public int getFreePlaces() {
        return countPlaces - occPlaces;
    }

    public void getFreeBus() {
        if (occPlaces == 0)
            System.out.println("Автобус пуст!");
    }

    public void getBusyBus() {
        if (occPlaces == countPlaces)
            System.out.println("Автобус заполнен!");
    }

    public int getFareAll() {
        return occPlaces * costPlace;
    }

}
