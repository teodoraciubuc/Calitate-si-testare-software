package strategy.s11Bancomat;

public class ToateBacnotele implements IClient{
    @Override
    public int[] getBancnoteAcceptate() {
        System.out.println("s au ales toate bacnotele");
        return new int[]{50,20,10};
    }
}
