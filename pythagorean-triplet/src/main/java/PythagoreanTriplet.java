import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {
    int a;
    int b;
    int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {

        int sum;
        int maxFactor;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();

            for (int a = 1; a <= maxFactor; a++) {
                for (int b = a + 1; b <= maxFactor; b++) {
                    int cSquared = a * a + b * b;
                    int c = (int) Math.sqrt(cSquared);
                    if (c * c == cSquared && a + b + c == sum) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }

            return triplets;
        }
    }

}