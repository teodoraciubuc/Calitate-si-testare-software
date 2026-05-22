package chain.sistemAprobare;

public class TeamLeaderHandler implements AprobareHandler{
    private AprobareHandler next;
    @Override
    public void setNext(AprobareHandler next) {
        this.next=next;
    }

    @Override
    public void aprobaCerere(double suma) {
        if(suma<=500){
            System.out.println("Cererea a fost aprobată de TeamLeader.");
        } else if (next != null) {
            next.aprobaCerere(suma);
        }else{
            System.out.println("Cererea a fost respinsă.");
        }

    }
}
