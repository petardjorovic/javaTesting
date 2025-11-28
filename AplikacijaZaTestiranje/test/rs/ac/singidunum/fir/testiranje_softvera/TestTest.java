package rs.ac.singidunum.fir.testiranje_softvera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void getImePredmeta() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 20);
        Assertions.assertEquals("ime predmeta", t.getImePredmeta());
    }

    @Test
    void getDatumIso() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 20);
        Assertions.assertEquals("20-10-2024", t.getDatumIso());
    }

    @Test
    void getBrojPitanja() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 20);
        Assertions.assertEquals(30, t.getBrojPitanja());
    }

    @Test
    void getBrojPitanjaAkoJeSetovanaNegativnaVrednost() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", -10, 20);
        Assertions.assertEquals(1, t.getBrojPitanja());
    }

    @Test
    void getBrojPitanjaAkoJeSetovana0() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 0, 20);
        Assertions.assertEquals(1, t.getBrojPitanja());
    }

    @Test
    void getBrojTacnihOdgovora() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 20);
        Assertions.assertEquals(20, t.getBrojTacnihOdgovora());
    }

    @Test
    void getBrojTacnihOdgovoraAkoJeSetovanaNegativnaVrednost() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, -1);
        Assertions.assertEquals(0, t.getBrojTacnihOdgovora());
    }

    @Test
    void getProcenatTacnihOdgovora() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 15);
        Assertions.assertEquals(50., t.getProcenatTacnihOdgovora());
    }

    @Test
    void getBrojPoena() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 15);
        Assertions.assertEquals(20., t.getBrojPoena(40));
    }

    @Test
    void testToString() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t = new rs.ac.singidunum.fir.testiranje_softvera
                .Test("ime predmeta", "20-10-2024", 30, 15);
        String ocekivano = "ime predmeta;20-10-2024;15;30;50.00";
        String dobiliSmo = t.toString();
        Assertions.assertEquals(ocekivano, dobiliSmo);
    }
}