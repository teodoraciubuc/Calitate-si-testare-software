package strategy.CityRide;

public class TarifNoapte implements FareStrategy{
    @Override
    public double calculateFare(double distance) {
        distance= distance*5;
        return distance;
    }
}
