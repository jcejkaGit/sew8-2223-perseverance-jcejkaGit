package perseverance.instruments;

public class PixlReading {
    private final String element;
    private final double content;

    public PixlReading(String element, double content) {
        this.element = element;
        this.content = content;
    }

    public String getElement() {
        return element;
    }

    public double getContent() {
        return content;
    }
}
