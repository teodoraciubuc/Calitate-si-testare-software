package chain.s4Train;

public class RegioHandler implements AbstractTrainRoute
{
    protected AbstractTrainRoute next;
    @Override
    public void setNext(AbstractTrainRoute next) {
        this.next=next;
    }

    @Override
    public void preluare(int km) {
        if (km < 100) {
            System.out.println("Trenul regio a fost preluat de 1 mecanic");
        } else if (next != null) {
            next.preluare(km);
        }
    }
}
