package et.ethiopia_info.administrative_divisions.repositories;

import et.ethiopia_info.administrative_divisions.models.Region;

import java.util.List;

public interface IRegionDAO {
    public List<Region> findAll();
}
