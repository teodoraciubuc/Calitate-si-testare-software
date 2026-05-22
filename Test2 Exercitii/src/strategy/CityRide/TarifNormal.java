package strategy.CityRide;

public class TarifNormal implements FareStrategy{
    @Override
    public double calculateFare(double distance) {
        distance= distance*3;
        return distance;
    }
}
