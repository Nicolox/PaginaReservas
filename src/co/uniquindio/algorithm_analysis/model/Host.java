package co.uniquindio.algorithm_analysis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Host extends User {

    private List<String> languages;
    private List<Lodging> lodgings;
    public Host(){
        super();
        languages = new ArrayList<>();
        lodgings = new ArrayList<>();
    }

    public Host(String id, String name, String user, String password, String image, String email, String address, String biography, Date birthdate) {
        super(id, name, user, password, image, email, address, biography, birthdate);
        languages = new ArrayList<>();
        lodgings = new ArrayList<>();
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
