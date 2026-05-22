package chain.concediuPrezentare;

public class DirectorHandler extends AprobareConcediuHandler {

    @Override
    public void aproba(int zile) {
        if (zile <= 10) {
            System.out.println("Cererea a fost aprobată de Director.");
        } else if (next != null) {
            next.aproba(zile);
        }else{
            System.out.println("Cererea a fost respinsă. Prea multe zile.");
        }
    }
}
