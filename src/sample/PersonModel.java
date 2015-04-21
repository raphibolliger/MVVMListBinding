package sample;

public class PersonModel {

    private String prename;
    private String surname;

    public PersonModel(String prename, String surname)
    {
        this.prename = prename;
        this.surname = surname;
    }

    public String getFullName() {
        return prename + " " + surname;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString()
    {
        return prename + " " + surname;
    }
}
