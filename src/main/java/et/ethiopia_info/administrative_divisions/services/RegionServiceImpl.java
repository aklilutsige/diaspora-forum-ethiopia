package et.ethiopia_info.administrative_divisions.services;

import et.ethiopia_info.administrative_divisions.models.Region;
import et.ethiopia_info.administrative_divisions.repositories.IRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements IRegionService {

    //private RegionDAOHibernateImp regionDAO;
    private IRegionRepository regionRepository;

    @Autowired
    public RegionServiceImpl(IRegionRepository regionDAO) {
        this.regionRepository = regionDAO;
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region findById(int regionId) {
        Optional<Region> result = regionRepository.findById(regionId);
        Region tempRegion = null;
        if (result.isPresent()){
            tempRegion = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + regionId);
        }
        return tempRegion;
    }

    @Override
    public void save(Region newRegion) {
        regionRepository.save(newRegion);
    }

    @Override
    public void deleteById(int regionId) {
        regionRepository.deleteById(regionId);
    }
}
