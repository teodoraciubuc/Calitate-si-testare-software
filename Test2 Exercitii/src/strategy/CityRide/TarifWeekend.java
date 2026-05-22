package strategy.CityRide;

public class TarifWeekend implements FareStrategy{
    @Override
    public double calculateFare(double distance) {
        distance= distance*4;
        return distance;
    }
}
