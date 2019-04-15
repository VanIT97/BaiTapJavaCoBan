package o7planning.vd14;

public class Person {
    private String name;
    private Integer bornYear;
    private String placeOfBirth;

    public Person(String name, Integer bornYear, String placeOfBirth) {
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }

    public Person(String name, Integer bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public String getName() {
        return name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
