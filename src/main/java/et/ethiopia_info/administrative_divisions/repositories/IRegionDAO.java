package et.ethiopia_info.administrative_divisions.repositories;

import et.ethiopia_info.administrative_divisions.models.Region;

import java.util.List;

public interface IRegionDAO {
    List<Region> findAll();
    Region findById(int regionId);
    void save( Region newRegion);
    void deleteById(int regionId);
}
