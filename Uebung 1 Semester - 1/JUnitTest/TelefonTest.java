package JUnitTest;

//Import paths
import static org.junit.Assert.*;
import java.lang.reflect.*;

//Imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TelefonTest {
    private Telefon tel;

    @Before
    public void setUp() throws Exception {
        tel = new Telefon("Nokia");
    }

    @After
    public void tearDown() throws Exception {
        //TODO was soll hier rein
    }

    @Test
    public void testAusschalten() {
        tel.ausschalten();
        assertEquals("Telefon sollte eingeschaltet sein!",true,tel.getAusgeschaltet());
    }

    @Test
    public void testEinschalten() {
        tel.einschalten();
        assertEquals("Telefon sollte ausgeschaltet sein!",true,tel.getEingeschaltet());
    }

    @Test
    public void testsetModel() {
        try {
            tel.setModel("XX");
            fail("Fehlende Exception");
        } catch (InvalidLength e) {
            assertNotNull(e.getMessage());
        } catch (Exception e) {
            fail("unerwartet - " + e);
        }
    }

    @Test
    public void testsetModel2() {
        try {
            tel.setModel("XXX");
            fail("Fehlende Exception");
        } catch (Length3 e) {
            assertNotNull(e.getMessage());
        } catch (Exception e) {
            fail("unerwartet - " + e);
        }
    }

    @Test
    public void testeprivaterechner() throws Exception{
        Class<Telefon> t = Telefon.class;
        Method m = t.getDeclaredMethod("rechner", int.class, int.class);
        m.setAccessible(true);
        Object ergebnis = m.invoke(tel,8,4);
        Assert.assertEquals(12, ergebnis);
    }
}