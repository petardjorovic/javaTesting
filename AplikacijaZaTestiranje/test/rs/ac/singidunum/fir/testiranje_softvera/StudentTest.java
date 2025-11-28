package rs.ac.singidunum.fir.testiranje_softvera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        Assertions.assertEquals("ime studenta", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        Assertions.assertEquals("prezime studenta", s.getPrezime());
    }

    @Test
    void getBrojIndeksa() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        Assertions.assertEquals("2008100200", s.getBrojIndeksa());
    }

    @Test
    void getBrojPoenaZaPredmet() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","15-05-2024",30,15);
        s.evidentirajRadjeniTest(t);
        double ocekivaniBrojPoena = 15.;
        double dobijenBrojPoena = s.getBrojPoenaZaPredmet("ime predmeta");
        Assertions.assertEquals(ocekivaniBrojPoena, dobijenBrojPoena);
    }

    @Test
    void getBrojPoenaZaPredmetZaViseUnetihTestova() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        rs.ac.singidunum.fir.testiranje_softvera.Test t1 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2024-02-04",30,20);

        rs.ac.singidunum.fir.testiranje_softvera.Test t2 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2025-02-05",30,15);

        rs.ac.singidunum.fir.testiranje_softvera.Test t3 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2025-06-26",30,25);

        s.evidentirajRadjeniTest(t1);
        s.evidentirajRadjeniTest(t2);
        s.evidentirajRadjeniTest(t3);
        double ocekivaniBrojPoena = 25.;
        double dobijenBrojPoena = s.getBrojPoenaZaPredmet("ime predmeta");
        Assertions.assertEquals(ocekivaniBrojPoena, dobijenBrojPoena, 0.01);
    }

    @Test
    void getBrojPoenaZaPredmetZaNepostojeciPredmet() {
        Student s = new Student("ime studenta", "prezime studenta", "2008100200");
        rs.ac.singidunum.fir.testiranje_softvera.Test t1 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2024-02-04",30,20);

        rs.ac.singidunum.fir.testiranje_softvera.Test t2 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2025-02-05",30,15);

        rs.ac.singidunum.fir.testiranje_softvera.Test t3 = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta","2025-06-26",30,25);

        s.evidentirajRadjeniTest(t1);
        s.evidentirajRadjeniTest(t2);
        s.evidentirajRadjeniTest(t3);

        double ocekivaniBrojPoena = 0.;
        double dobijenBrojPoena = s.getBrojPoenaZaPredmet("Ne postoji predmet sa ovim imenom");
        Assertions.assertEquals(ocekivaniBrojPoena, dobijenBrojPoena);
    }
}