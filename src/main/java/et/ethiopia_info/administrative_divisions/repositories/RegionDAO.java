package et.ethiopia_info.administrative_divisions.repositories;

import et.ethiopia_info.administrative_divisions.models.Region;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RegionDAO implements IRegionDAO {

    //Define field for entity manager for
    private EntityManager entityManager;

    //Set up construction injection
    @Autowired
    public RegionDAO(EntityManager theEntityManger) {
        this.entityManager = theEntityManger;
    }

    @Override
    public List<Region> findAll() {
        // Get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        // Create a query
        Query<Region> theQuery =
                currentSession.createQuery("from Region", Region.class);

        // Execute query and get result list
        List<Region> regions = theQuery.getResultList();

        // Return the result
        return regions;
    }

    @Override
    public Region findById(int regionId) {
        Session currentSession = this.entityManager.unwrap(Session.class);
        Region theRegion = currentSession.get(Region.class, regionId);
        return theRegion;
    }

    @Override
    public void save(Region newRegion) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(newRegion);
    }

    @Override
    public void deleteById(int regionId) {
        Session currentSession = this.entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery(
                "delete from Region where regionId =: regionId ");
        theQuery.setParameter("regionId", regionId);
        theQuery.executeUpdate();

    }
}
