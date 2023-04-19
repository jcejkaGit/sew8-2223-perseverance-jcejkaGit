package perseverance.instruments;

public class RimfaxInstrument {
    private static final String[] findings = {
            "lower density",
            "higher density",
            "water ice",
    };

    private final RandomUtils random = new RandomUtils();

    public RimfaxReading getReading() {
        String finding = random.getElement(findings);
        double depth = random.getDouble(1.5, 10, 0.5);
        return new RimfaxReading(finding, depth);
    }
}
