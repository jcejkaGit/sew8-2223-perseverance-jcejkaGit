package perseverance.instruments;

public class PixlInstrument {
    private static final String[] elements = {
            "iron",
            "sulfur",
    };

    private final RandomUtils random = new RandomUtils();

    public PixlReading getReading() {
        String element = random.getElement(elements);
        double content = random.getDouble(0.1, 8, 0.1);
        return new PixlReading(element, content);
    }
}
