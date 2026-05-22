package chain.concediuPrezentare;

public class TeamLeaderHandler extends AprobareConcediuHandler {

    @Override
    public void aproba(int zile) {
        if (zile <= 2) {
            System.out.println("Cererea a fost aprobată de Team Leader.");
        } else if (next != null) {
            next.aproba(zile);
        } else {
            System.out.println("Cererea a fost respinsă.");
        }
    }
}