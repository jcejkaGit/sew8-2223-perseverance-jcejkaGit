package perseverance.instruments;

public class RimfaxReading {
    private final String finding;
    private final double depth;

    public RimfaxReading(String finding, double depth) {
        this.finding = finding;
        this.depth = depth;
    }

    public String getFinding() {
        return finding;
    }

    public double getDepth() {
        return depth;
    }
}
