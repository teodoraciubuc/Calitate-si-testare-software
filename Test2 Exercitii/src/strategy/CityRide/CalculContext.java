package strategy.CityRide;

public class CalculContext {
    private FareStrategy total;

    public void setTotal(FareStrategy total) {
        this.total = total;
    }

    public void calculeaza(Double distance){
        if(total==null){
            System.out.println("Eroare");
            return;
        }
        System.out.println("s a calculat distanta totala");
        System.out.println(total.calculateFare(distance));
    }

}
