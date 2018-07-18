package arcuit.kpiweb.model.dao;

import arcuit.kpiweb.model.dto.BarChartDataPoint;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MeasurementTupleDAOTest {
    @Test
    public void testFetchBarChartDataPoints(){
        MeasurementTupleDAO dao = new MeasurementTupleDAO();
        List<BarChartDataPoint> results = dao.fetchBarChartDataPoints();
        Assert.assertEquals(6,results.size());
    }

    @Test
    public void testCalculateValue3(){
        MeasurementTupleDAO dao = new MeasurementTupleDAO();
        dao.calculateValue3();

    }
}
