package arcuit.kpiweb.model.dao;

import arcuit.kpiweb.model.db.MeasurementTuple;
import arcuit.kpiweb.model.dto.BarChartDataPoint;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.util.List;

import static org.hibernate.ReplicationMode.OVERWRITE;

public class MeasurementTupleDAO extends GenericDAO {

    public void save(List<MeasurementTuple> records) {
        Session session = getSession();
        Transaction tx = session.getTransaction();
        tx.begin();

        for (MeasurementTuple record : records) {
            session.save(record);
        }
        tx.commit();
        session.close();
    }

    public List<BarChartDataPoint> fetchBarChartDataPoints() {
        Session session = getSession();

        Query<BarChartDataPoint> query = session.getNamedNativeQuery(
                "fetch_bar_chart_data");
        return query.list();
    }

    public void calculateValue3() {
        Session session = getSession();
        session.clear();
        session.setHibernateFlushMode(FlushMode.COMMIT);
        Query<MeasurementTuple> query = session.getNamedNativeQuery("calculate_value3");
        List<MeasurementTuple> results = query.list();

        Transaction tx = session.getTransaction();
        tx.begin();

        for (MeasurementTuple result : results) {
            result.setValue3(result.getValue1()+result.getValue2());
            //session.replicate(result,OVERWRITE);
            session.saveOrUpdate(result);
        }
        tx.commit();
        session.close();
    }

}
