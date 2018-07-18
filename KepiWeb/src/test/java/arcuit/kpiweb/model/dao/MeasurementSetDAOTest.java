package arcuit.kpiweb.model.dao;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MeasurementSetDAOTest {

    @Test
    public void testGetNames(){
        MeasurementSetDAO dao = new MeasurementSetDAO();
        List<String> l = dao.getNames();
        Assert.assertEquals(3, l.size());
        Assert.assertTrue(l.contains("SET_TWO"));
    }
}
