package futbol.demo;

public class Referee {
    
    private String name;
    private String country;

    public Referee() {
    }

    public Referee(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Referee name(String name) {
        setName(name);
        return this;
    }

    public Referee country(String country) {
        setCountry(country);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }

}
