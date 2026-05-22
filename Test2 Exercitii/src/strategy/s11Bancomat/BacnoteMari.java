package strategy.s11Bancomat;

public class BacnoteMari implements IClient{
    @Override
    public int[] getBancnoteAcceptate() {
        System.out.println("s au ales bacnote mari");
        return new int[]{50,20};

    }
}
