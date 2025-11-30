package rs.ac.singidunum.fir.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeperatureTest {
    private final static double DELTA = 1e-9;

    @Test
    public void toCelsiusForTemperatureCreatedFromCelsius() {
        Temperature t = Temperature.fromCelsius(10.);
        double expected = 10.;
        double actual = t.toCelsius();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toCelsiusForTemperatureCreatedFromFahrenheit() {
        Temperature t = Temperature.fromFahrenheit(10.);
        double expected = (10. - 32.) * 5. / 9.;
        double actual = t.toCelsius();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toCelsiusForTemperatureCreatedFromKelvin() {
        Temperature t = Temperature.fromKelvin(10.);
        double expected = 10. - 273.15;
        double actual = t.toCelsius();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toFahrenheitForTemperatureCreatedFromCelsius() {
        Temperature t = Temperature.fromCelsius(10.);
        double expected = 10. * 9. / 5. + 32.;
        double actual = t.toFahrenheit();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toFahrenheitForTemperatureCreatedFromFahrenheit() {
        Temperature t = Temperature.fromFahrenheit(10.);
        double expected = 10.;
        double actual = t.toFahrenheit();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toFahrenheitForTemperatureCreatedFromKelvin() {
        Temperature t = Temperature.fromKelvin(10.);
        double expected = (10.0 - 273.15) * 9.0 / 5.0 + 32.0;
        double actual = t.toFahrenheit();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toKelvinForTemperatureCreatedFromCelsius() {
        Temperature t = Temperature.fromCelsius(10.);
        double expected = 10 + 273.15;
        double actual = t.toKelvin();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toKelvinForTemperatureCreatedFromFahrenheit() {
        Temperature t = Temperature.fromFahrenheit(10.);
        double expected = (10.0 - 32.0) * 5.0 / 9.0 + 273.15;
        double actual = t.toKelvin();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toKelvinForTemperatureCreatedFromKelvin() {
        Temperature t = Temperature.fromKelvin(10.);
        double expected = 10.;
        double actual = t.toKelvin();
        Assertions.assertEquals(expected, actual, DELTA);
    }
}
