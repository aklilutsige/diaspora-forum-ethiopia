package et.ethiopia_info.administrative_divisions.repositories;

import et.ethiopia_info.administrative_divisions.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RegionDAOJpaImp implements IRegionDAO {
    private EntityManager entityManager;

    @Autowired
    public RegionDAOJpaImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Region> findAll() {
        // Create a query
        Query query = entityManager.createQuery("from Region ");

        // Execute query and get result list
        List<Region> regions = query.getResultList();

        // Return the results
        return regions;
    }

    @Override
    public Region findById(int regionId) {
        // Get Region
        Region region = entityManager.find(Region.class, regionId);
        // Return region
        return region;
    }

    @Override
    public void save(Region newRegion) {
        // Save or update the employee
        Region saveRegion = entityManager.merge(newRegion);

        //Update with id from db . . .
        //So we can get geenerated id for save/
        newRegion.setRegionId(saveRegion.getRegionId());

    }

    @Override
    public void deleteById(int regionId) {
        Query query = entityManager.createQuery(
                "delete from Region where regionId =: regionId");
        query.setParameter("regionId", regionId);
        query.executeUpdate();
    }
}
