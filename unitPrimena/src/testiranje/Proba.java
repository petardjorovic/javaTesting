package testiranje;

import rs.ac.singidunum.fir.units.Angle;
import rs.ac.singidunum.fir.units.Length;

public class Proba {
    public static void main(String... args) {
        Length duzina1 = Length.fromKilometers(2.75);
        System.out.println(duzina1.toYards());
    }

}
