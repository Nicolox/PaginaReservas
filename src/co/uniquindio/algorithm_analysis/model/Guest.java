package co.uniquindio.algorithm_analysis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Guest extends User{

    private Scholarship scholarship;
    private Socioeconomic socioeconomic;
    private Gender gender;
    private List<CreditCard> creditCards;
    private List<Booking> bookings;

    public Guest() {
       super();
       creditCards = new ArrayList<>();
       bookings = new ArrayList<>();
    }

    public Guest(String id, String name, String user, String password, String image, String email, String address, String biography, Date birthdate, Scholarship scholarship, Socioeconomic socioeconomic, Gender gender) {
        super(id, name, user, password, image, email, address, biography, birthdate);
        this.scholarship = scholarship;
        this.socioeconomic = socioeconomic;
        this.gender = gender;
        creditCards = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public Scholarship getScholarship() {
        return scholarship;
    }

    public void setScholarship(Scholarship scholarship) {
        this.scholarship = scholarship;
    }

    public Socioeconomic getSocioeconomic() {
        return socioeconomic;
    }

    public void setSocioeconomic(Socioeconomic socioeconomic) {
        this.socioeconomic = socioeconomic;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
