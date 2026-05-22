package chain.sistemAprobare;

public class DirectorHandler implements AprobareHandler{
    protected AprobareHandler next;
    @Override
    public void setNext(AprobareHandler next) {
        this.next=next;
    }

    @Override
    public void aprobaCerere(double suma) {
        if(suma<=10000){
            System.out.println("Cererea a fost aprobată de Director.");
        } else {
            System.out.println("Cererea a fost respinsă.");
        }
    }
}
