package rs.ac.singidunum.fir.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthTest {
    private final static double DELTA = 1e-9;

    @Test
    public void toCentimetersForLengthCreatedFromCentimeters() {
        Length l = Length.fromCentimeters(150.);
        double expected = 150.;
        double actual = l.toCentimeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toCentimetersForLengthCreatedFromDecimeters() {
        Length l = Length.fromDecimeters(150.);
        double expected = 150. * 10.;
        double actual = l.toCentimeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDecimetersForLengthCreatedFromFeet() {
        Length l = Length.fromFeet(150.);
        double expected = 150. * 3.048;
        double actual = l.toDecimeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDecimetersForLengthCreatedFromInches() {
        Length l = Length.fromInches(150.);
        double expected = 150. * 0.254;
        double actual = l.toDecimeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toFeetForLengthCreatedFromKilometers() {
        Length l = Length.fromKilometers(15.);
        double expected = 15. * 100000 / 30.48;
        double actual = l.toFeet();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toFeetForLengthCreatedFromMeters() {
        Length l = Length.fromMeters(15.);
        double expected = 15. * 100 / 30.48;
        double actual = l.toFeet();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toInchesForLengthCreatedFromMicrometers() {
        Length l = Length.fromMicrometers(1500.);
        double expected = 1500. / 25400.;
        double actual = l.toInches();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toInchesForLengthCreatedFromMiles() {
        Length l = Length.fromMiles(10.);
        double expected = 10. * 5280. * 12.;
        double actual = l.toInches();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toKilometersForLengthCreatedFromMillimeters() {
        Length l = Length.fromMillimeters(5000.);
        double expected = 5000. / 1000000;
        double actual = l.toKilometers();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toKilometersForLengthCreatedFromNanometers() {
        Length l = Length.fromNanometers(90000.);
        double expected = 90000.0 / 1e9;
        double actual = l.toKilometers();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toMetersForLengthCreatedFromNauticalMiles() {
        Length l = Length.fromMillimeters(900.);
        double expected = 900. / 1000;
        double actual = l.toMeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toMetersForLengthCreatedFromYards() {
        Length l = Length.fromYards(900.);
        double expected = 900. * 0.9144;
        double actual = l.toMeters();
        Assertions.assertEquals(expected, actual, DELTA);
    }
}
