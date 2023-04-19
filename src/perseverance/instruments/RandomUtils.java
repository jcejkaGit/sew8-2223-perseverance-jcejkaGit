package perseverance.instruments;

import java.util.Random;

public class RandomUtils {
    public final Random random;

    public RandomUtils() {
        this(new Random());
    }

    public RandomUtils(long seed) {
        this(new Random(seed));
    }

    public RandomUtils(Random random) {
        this.random = random;
    }

    /**
     * <p>
     * Returns a random double in the given range with the given resolution.
     * For proper function, {@code min} and {@code max} should be multiples of {@code resolution}.
     * Both bounds are inclusive.
     * </p>
     * <p>
     * For example, the result of {@code getDouble(3, 5, 0.5)} is one of {@code 3.0}, {@code 3.5}, {@code 4.0},
     * {@code 4.5}, or {@code 5.0}, according to a uniform distribution.
     * </p>
     *
     * @param min the lower bound, inclusive
     * @param max the upper bound, inclusive
     * @param resolution the resolution of generated values
     * @return a random double of the given resolution in that interval
     */
    public double getDouble(double min, double max, double resolution) {
        int minInt = (int) (min / resolution);
        int maxInt = (int) (max / resolution);
        return random.nextInt(minInt, maxInt + 1) * resolution;
    }

    /**
     * Returns an element from the given array, chosen according to a uniform distribution.
     *
     * @param elements the array of possible choices
     * @param <T> the type of elements
     * @return a random element of the array
     */
    public <T> T getElement(T[] elements) {
        return elements[random.nextInt(elements.length)];
    }
}
