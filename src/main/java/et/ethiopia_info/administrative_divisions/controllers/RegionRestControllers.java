package et.ethiopia_info.administrative_divisions.controllers;

import et.ethiopia_info.administrative_divisions.models.Region;
import et.ethiopia_info.administrative_divisions.repositories.IRegionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionRestControllers {

    private IRegionDAO region;

    //quick and dirty: inject Region
    @Autowired
    public RegionRestControllers( IRegionDAO theRegion){
        region = theRegion;
    }

    //Expose "/regions"
    @GetMapping("/regions")
    public List<Region> findAll()
    {
        return region.findAll();
    }
}
