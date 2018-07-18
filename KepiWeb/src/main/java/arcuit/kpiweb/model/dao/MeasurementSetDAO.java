package arcuit.kpiweb.model.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MeasurementSetDAO extends GenericDAO {

    List<String> getNames() {
        Session session = getSession();
        Query<String> query = session.createNativeQuery("SELECT name FROM MEASUREMENTSET");
        return query.list();


    }
}
