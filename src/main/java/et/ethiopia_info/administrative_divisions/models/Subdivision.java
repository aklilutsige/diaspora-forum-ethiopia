package et.ethiopia_info.administrative_divisions.models;

public class Subdivision {
    private String subDivisionName;
    private double areaKm2;

    public Subdivision(String subDivisionName, double areaKm2) {
        this.subDivisionName = subDivisionName;
        this.areaKm2 = areaKm2;
    }

    public String getSubDivisionName() {
        return subDivisionName;
    }

    public void setSubDivisionName(String subDivisionName) {
        this.subDivisionName = subDivisionName;
    }

    public double getAreaKm2() {
        return areaKm2;
    }

    public void setAreaKm2(double areaKm2) {
        this.areaKm2 = areaKm2;
    }
}
