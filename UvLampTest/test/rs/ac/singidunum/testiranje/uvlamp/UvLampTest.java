package rs.ac.singidunum.testiranje.uvlamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UvLampTest {
    @Test
    public void UVLamp_ShouldCreateAnUVLampObjectInTurnedOffState() {
        UVLamp lamp = new UVLamp();

        Assertions.assertAll(
                () -> Assertions.assertEquals("", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToStandBy_IfCurrentStateIsTurnedOff() {
        UVLamp lamp = new UVLamp();

        lamp.switch1();

        Assertions.assertAll(
                () -> Assertions.assertEquals("STBY", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsStandBy() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();

        lamp.switch1();

        Assertions.assertAll(
                () -> Assertions.assertEquals("", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToSelection_IfCurrentStateIsStandBy() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();

        lamp.switch2();

        Assertions.assertAll(
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();

        lamp.switch1();

        Assertions.assertAll(
                () -> Assertions.assertEquals("", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgramme1Selected_IfCurrentStateIsSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();

        lamp.switch2();

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToStandBy_IfCurrentStateIsSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();

        lamp.switch3();

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("STBY", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgramme1Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch1();

        Assertions.assertAll(
                () -> Assertions.assertEquals("", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgramme2Selected_IfCurrentStateIsProgramme1Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch2();

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PR2", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToSelection_IfCurrentStateIsProgramme1Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch3();

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgramme1Running_IfCurrentStateIsProgramme1Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgramme2Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch1();

        Assertions.assertAll(
                () -> Assertions.assertEquals("", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgramme1Selected_IfCurrentStateIsProgramme2Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch2();

        Assertions.assertAll(
                () -> Assertions.assertEquals("PR1", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToSelection_IfCurrentStateIsProgramme2Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch3();

        Assertions.assertAll(
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgramme2Running_IfCurrentStateIsProgramme2Selected() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        Assertions.assertAll(
                () -> Assertions.assertEquals("PR2", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState())
        );
    }

    @Test
    public void internalEvent_ShouldChangeStateToStandby_IfCurrentStateIsProgramme2Running_WhenMoreThan30SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        try {
            Thread.sleep(32000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("STBY", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }
    @Test
    public void internalEvent_ShouldNotChangeStateToStandby_IfCurrentStateIsProgramme2Running_WhenLessThan30SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        try {
            Thread.sleep(29000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("PR2", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToSelection_IfCurrentStateIsProgramme2Running_WhenLessThan30SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch2();
        lamp.switch4();

        try {
            Thread.sleep(5000);
        } catch (Exception e) { }

        lamp.switch3();

        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void internalEvent_ShouldChangeStateToStandby_IfCurrentStateIsProgramme1Running_WhenMoreThan60SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        try {
            Thread.sleep(62000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("STBY", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void internalEvent_ShouldNotChangeStateToStandby_IfCurrentStateIsProgramme1Running_WhenLessThan60SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();

        lamp.switch4();

        try {
            Thread.sleep(59000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("PR1", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToPause_IfCurrentStateIsProgramme1Running_WhenLessThan60SecondsPassed() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch4();

        try {
            Thread.sleep(5000);
        } catch (Exception e) { }

        lamp.switch3();

        try {
            Thread.sleep(2000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("PAUSE", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgramme1Running_IfCurrentStateIsPause() {
        UVLamp lamp = new UVLamp();
        lamp.switch1();
        lamp.switch2();
        lamp.switch2();
        lamp.switch4();

        try {
            Thread.sleep(50000);
        } catch (Exception e) { }

        lamp.switch3();

        try {
            Thread.sleep(20000);
        } catch (Exception e) { }

        lamp.switch4();

        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals("PR1", lamp.getScreenText()),
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState())
        );
    }


}
