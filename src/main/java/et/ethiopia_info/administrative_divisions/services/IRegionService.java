package et.ethiopia_info.administrative_divisions.services;

import et.ethiopia_info.administrative_divisions.models.Region;
import java.util.List;

public interface IRegionService {
    List<Region> findAll();
    Region findById(int regionId);
    void save( Region newRegion);
    void deleteById(int regionId);
}
