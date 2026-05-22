package chain.concediuPrezentare;

public class ManagerHandler extends AprobareConcediuHandler {

    @Override
    public void aproba(int zile) {
        if (zile <= 5) {
            System.out.println("Cererea a fost aprobată de Manager.");
        } else if (next != null) {
            next.aproba(zile);
        } else {
            System.out.println("Cererea a fost respinsă.");
        }
    }
}