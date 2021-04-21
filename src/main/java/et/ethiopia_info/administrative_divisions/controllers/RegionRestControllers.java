package et.ethiopia_info.administrative_divisions.controllers;

import et.ethiopia_info.administrative_divisions.models.Region;
import et.ethiopia_info.administrative_divisions.services.RegionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionRestControllers {
    private RegionServiceImpl regionService;

    @Autowired
    public RegionRestControllers(RegionServiceImpl theRegion) {
        this.regionService = theRegion;
    }

    // Expose "/regions" and return list of regions
    @GetMapping("/regions")
    public List<Region> findAll() {
        return regionService.findAll();
    }

    //Add mapping for GET /region/{regionId}
    @GetMapping("/regions/{regionId}")
    public Region findById(@PathVariable int regionId) {
        Region theRegion = regionService.findById(regionId);
        if (theRegion == null) {
            throw new RuntimeException("Region id nof found - " + regionId);
        }
        return regionService.findById(regionId);
    }

    @PostMapping("/regions")
    public Region addRegion(@RequestBody Region newRegion) {
        // Also just in case they pass an Id in JSON . . . set id to 0
        // this is to force a save of new item . . . . Instead of update
        newRegion.setRegionId(0);
        regionService.save(newRegion);
        return newRegion;
    }

    //Add mapping for Put/ region  - update existing employee
    @PutMapping("/regions")
    public Region updateRegion(@RequestBody Region updateRegion) {
        regionService.save(updateRegion);
        return updateRegion;
    }

    // Add mapping for DELETE /regions/{regionId} delete region
    @DeleteMapping("/regions/{deleteId}")
    public String deleteRegion(@PathVariable int deleteId) {
        System.out.println(" Deleted region ID  - " + deleteId);
        Region tempRegion = regionService.findById(deleteId);
        // Throw exception if null
        if (tempRegion == null) {
            throw new RuntimeException("Region id not found - " + deleteId);
        }
        regionService.deleteById(deleteId);
        return "Deleted region id - " + deleteId;
    }
}
