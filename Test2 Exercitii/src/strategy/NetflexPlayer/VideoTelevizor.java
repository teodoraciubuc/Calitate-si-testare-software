package strategy.NetflexPlayer;

public class VideoTelevizor implements CompressionStrategy{
    @Override
    public void compress() {
        System.out.println(" S a compresat cu compresia HEVC");
    }
}
