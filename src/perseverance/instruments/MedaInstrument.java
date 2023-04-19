package perseverance.instruments;

import perseverance.instruments.MedaReading.Heading;

public class MedaInstrument {
    private static final String[] elements = {
            "iron",
            "sulfur",
            "potassium",
            "phosphorus",
    };

    private final RandomUtils random = new RandomUtils();

    public MedaReading getReading() {
        double temperature = random.getDouble(200, 225, 0.1);
        double pressure = random.getDouble(620, 650, 0.5);
        double windSpeed = random.getDouble(0, 12, 0.5);
        Heading windHeading = random.getElement(Heading.values());
        return new MedaReading(temperature, pressure, windSpeed, windHeading);
    }
}
