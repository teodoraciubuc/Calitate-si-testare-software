package chain.s4Train;

public class InterCityHandler implements AbstractTrainRoute{
   protected AbstractTrainRoute next;
    @Override
    public void setNext(AbstractTrainRoute next) {
        this.next=next;
    }

    @Override
    public void preluare(int km) {
        if (km >500) {
            System.out.println("Trenul InterCity a fost preluat de al 3 lea");
        } else {
            System.out.println("Ruta nu poate fi preluată.");
        }
    }
}
