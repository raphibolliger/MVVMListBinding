package sample;

import java.util.ArrayList;

public class PersonController {

    private ArrayList<PersonModel> personModelList = new ArrayList<PersonModel>();

    public PersonController() {

        personModelList.add(new PersonModel("Raphael", "Bolliger"));
        personModelList.add(new PersonModel("Andreas", "Lüscher"));
        personModelList.add(new PersonModel("Florian", "Bruggisser"));
        personModelList.add(new PersonModel("Roman", "Bürki"));
        personModelList.add(new PersonModel("Sulamith", "Schläppi"));
        personModelList.add(new PersonModel("Sandro", "Castronari"));

    }

    public ArrayList<PersonModel> getPersonList() {
        return personModelList;
    }

}
