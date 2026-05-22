package strategy.NetflexPlayer;

public class PlayVideoContxt {
    private CompressionStrategy compress;

    public void setCompress(CompressionStrategy compress) {
        this.compress = compress;
    }

    public void playVideo() {
        if (compress == null) {
            System.out.println("Nu a fost aleasă o strategie de compresie.");
            return;
        }

        compress.compress();
        System.out.println("Videoclipul este redat.");
    }
}
