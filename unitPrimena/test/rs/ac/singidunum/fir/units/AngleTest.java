package rs.ac.singidunum.fir.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AngleTest {
    private final static double DELTA = 1e-9;

    @Test
    public void staticFromDegreesTest() {
        Angle a = Angle.fromDegrees(5.0);
        double expected = 5.0;
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void staticFromGradientsTest() {
        Angle a = Angle.fromGradients(5.0);
        double expected = 5.0;
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void staticFromMinutesOfArkTest() {
        Angle a = Angle.fromMinutesOfArk(5.0);
        double expected = 5.0;
        double actual = a.toMinutesOfArk();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void staticFromRadiansTest() {
        Angle a = Angle.fromRadians(5.0);
        double expected = 5.0;
        double actual = a.toRadians();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void staticFromSecondsOfArkTest() {
        Angle a = Angle.fromSecondsOfArk(5.0);
        double expected = 5.0;
        double actual = a.toSecondsOfArk();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDegreesForAnAngleCreatedFromDegreesTest() {
        Angle a = Angle.fromDegrees(5.0);
        double expected = 5.0;
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDegreesForAnAngleCreatedFromGradientsTest() {
        Angle a = Angle.fromGradients(5.0);
        double expected = 4.5;
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDegreesForAnAngleCreatedFromMinutesOfArkTest() {
        Angle a = Angle.fromMinutesOfArk(5.0);
        double expected = 5.0 / 60.;
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDegreesForAnAngleCreatedFromRadians() {
        Angle a = Angle.fromRadians(5.0);
        double expected = Math.toDegrees(5.0);
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toDegreesForAnAngleCreatedFromSecondsOfArk() {
        Angle a = Angle.fromSecondsOfArk(5.0);
        double expected = 5.0 / 3600.;
        double actual = a.toDegrees();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGradientsForAnAngleCreatedTestFromDegrees() {
        Angle a = Angle.fromDegrees(5.0);
        double expected = 5.0 / 0.9;
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGradientsForAnAngleCreatedTestFromGradients() {
        Angle a = Angle.fromGradients(5.0);
        double expected = 5.0;
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGradientsForAnAngleCreatedTestFromMinutesOfArk() {
        Angle a = Angle.fromMinutesOfArk(5.0);
        double expected = 5.0 * (1. / 54.);
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGradientsForAnAngleCreatedTestFromRadians() {
        Angle a = Angle.fromRadians(5.0);
        double expected = 5.0 * (200. / Math.PI);
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGradientsForAnAngleCreatedTestFromSecondsOfArk() {
        Angle a = Angle.fromRadians(5.0);
        double expected = 5.0 * (1 / 4000.);
        double actual = a.toGradients();
        Assertions.assertEquals(expected, actual, DELTA);
    }
}
