package et.ethiopia_info.administrative_divisions.services;

import et.ethiopia_info.administrative_divisions.models.Region;
import et.ethiopia_info.administrative_divisions.repositories.RegionDAOJpaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionServiceImpl implements IRegionService {

    //private RegionDAOHibernateImp regionDAO;
    private RegionDAOJpaImp regionDAO;

    @Autowired
    /*
    Hibernate implementation
    public RegionServiceImpl(RegionDAOHibernateImp regionDAO){ this.regionDAO = regionDAO; }*/
    public RegionServiceImpl(@Qualifier("regionDAOJpaImp") RegionDAOJpaImp regionDAO) {
        this.regionDAO = regionDAO;
    }


    @Override
    @Transactional
    public List<Region> findAll() {
        return regionDAO.findAll();
    }

    @Override
    @Transactional
    public Region findById(int regionId) {
        return regionDAO.findById(regionId);
    }

    @Override
    @Transactional
    public void save(Region newRegion) {
        regionDAO.save(newRegion);
    }

    @Override
    @Transactional
    public void deleteById(int regionId) {
        regionDAO.deleteById(regionId);
    }
}
