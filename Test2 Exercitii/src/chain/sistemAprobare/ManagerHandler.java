package chain.sistemAprobare;

public class ManagerHandler implements AprobareHandler
{
    private AprobareHandler next;
    @Override
    public void setNext(AprobareHandler next) {
        this.next=next;
    }

    @Override
    public void aprobaCerere(double suma) {
        if(suma<=2000){
            System.out.println("Cererea a fost aprobată de Manager.");
        } else if (next != null) {
                next.aprobaCerere(suma);
        }else{
            System.out.println("Cererea a fost respinsă.");
        }

    }
}
