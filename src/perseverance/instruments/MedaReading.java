package perseverance.instruments;

public class MedaReading {
    public enum Heading {
        N, NE, E, SE, S, SW, W, NW;

    }

    private final double temperature;
    private final double pressure;
    private final double windSpeed;
    private final Heading windHeading;

    public MedaReading(double temperature, double pressure, double windSpeed, Heading windHeading) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windHeading = windHeading;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Heading getWindHeading() {
        return windHeading;
    }
}
