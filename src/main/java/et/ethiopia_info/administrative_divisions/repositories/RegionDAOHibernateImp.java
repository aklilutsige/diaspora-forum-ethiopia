package et.ethiopia_info.administrative_divisions.repositories;

import et.ethiopia_info.administrative_divisions.models.Region;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RegionDAOHibernateImp implements IRegionDAO {

    //Define field for entity manager for

    private EntityManager entityManager;


    //Set up construction injection
    @Autowired
    public RegionDAOHibernateImp(EntityManager theEntityManger){
        entityManager = theEntityManger;
    }

    @Override
    @Transactional
    public List<Region> findAll() {

        // Get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // Create a query
        Query<Region> theQuery = currentSession.createQuery("from Region",Region.class);

        // Execute query and get result list
        List<Region> regions = theQuery.getResultList();

        // Return he result
        return regions;
    }
}
