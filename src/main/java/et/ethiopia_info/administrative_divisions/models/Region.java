package et.ethiopia_info.administrative_divisions.models;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "regions")
public class Region {
    // Define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regionId")
    private int regionId;

    @Column(name = "regionName")
    private String regionName;

    @Column(name = "capitalCity")
    private String capitalCity;

    @Column(name = "areaKm2")
    private double areaKm2;

    // Define constructors
    public Region() { }

    public Region(String regionName, String capitalCity, double areaKm2) {
        this.regionName = regionName;
        this.capitalCity = capitalCity;
        this.areaKm2 = areaKm2;

    }

    // Define getter and setter
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public double getAreaKm2() {
        return areaKm2;
    }

    public void setAreaKm2(double areaKm2) {
        this.areaKm2 = areaKm2;
    }

    // Define toString
    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", regionName='" + regionName + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", areaKm2=" + areaKm2 +
                '}';
    }
}
