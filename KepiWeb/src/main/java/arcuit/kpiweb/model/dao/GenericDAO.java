package arcuit.kpiweb.model.dao;

import arcuit.kpiweb.model.db.MeasurementSet;
import arcuit.kpiweb.model.db.MeasurementTuple;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class GenericDAO {
    private static SessionFactory sessionFactory;

public GenericDAO(){
        if (sessionFactory == null){
            sessionFactory = bootstrap();
        }
}
public Session getSession(){
    return sessionFactory.openSession();
}
private SessionFactory bootstrap() {

    StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
            .configure("hibernate.cfg.xml")
            .build();

    Metadata metadata = new MetadataSources(standardRegistry)
            .addAnnotatedClass(MeasurementSet.class)
            .addAnnotatedClass(MeasurementTuple.class)
            .getMetadataBuilder()
            .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
            .build();

    return metadata.buildSessionFactory();
}
}
