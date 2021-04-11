package et.ethiopia_info.administrative_divisions.controllers;

import et.ethiopia_info.administrative_divisions.models.Region;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdministrativeDivisionsControllers {
    //Expose "/" that return "Hello World

    @GetMapping(path = "/")
    public ArrayList<String> ListOfRestAPI (){
        ArrayList<String> listRestApis = new ArrayList<>();
        listRestApis.add("Lists of API ");
        listRestApis.add("1 : /administrative-divisions");
        listRestApis.add("2 : administrative-divisions/{name}");
        return listRestApis;
    }

    @GetMapping(path = "/administrative-divisions")
    public ArrayList<Region> administrative_divisions_lists() {
        ArrayList<Region> adminDivisionsList = new ArrayList<Region>();
        adminDivisionsList.add(new Region(
                "Addis Ababa", "Addis Ababa", 526.99));

        adminDivisionsList.add(new Region("Afar", "Semera", 72052.78));
        adminDivisionsList.add(new Region("Benishangul-Gumuz", "Asosa", 50698.68));
        adminDivisionsList.add(new Region("Dire Dawa", "Dire Dawa", 1558.61));
        adminDivisionsList.add(new Region("Gambela", "Gambela", 29782.82));
        return adminDivisionsList;
    }

    @GetMapping(path = "/administrative-divisions/{name}")
    public String administrative_divisions_lists(@PathVariable String name) {

        return ("Hello " + name);
    }
}
