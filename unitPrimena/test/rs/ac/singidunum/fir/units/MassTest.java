package rs.ac.singidunum.fir.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MassTest {
    private final static double DELTA = 1e-9;

    @Test
    public void toGramsForMassCreatedFromGrams() {
        Mass m = Mass.fromGrams(1500.);
        double expected = 1500.;
        double actual = m.toGrams();
        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void toGramsForMassCreatedFromImperialTons() {
        Mass m = Mass.fromImperialTons(1.5);
        double expected = 1.5 * 2240.0 * 453.59237;
        double actual = m.toGrams();
        Assertions.assertEquals(expected, actual, DELTA);
    }
}
