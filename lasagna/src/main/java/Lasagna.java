public class Lasagna {

    public int expectedMinutesInOven() {
        int expectedMinutes = 40;
        return expectedMinutes;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutes;
        return remainingMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        int preparationMinutes = numberOfLayers * 2;
        return preparationMinutes;
    }

    public int totalTimeInMinutes(int numberOfLayersAdded, int numberOfMinutesInOven) {
        int totalMinutes = preparationTimeInMinutes(numberOfLayersAdded) + numberOfMinutesInOven;
        return totalMinutes;
    }
}
