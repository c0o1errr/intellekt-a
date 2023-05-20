package Shelly;

public class Consumer {
    String fullName;
    String shortName;
    int county; // ISO 3166-1
    String uniqueId;

    public Consumer(String fullName, String shortName, int county, String uniqueId) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.county = county;
        this.uniqueId = uniqueId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty(int county) {
        this.county = county;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}

