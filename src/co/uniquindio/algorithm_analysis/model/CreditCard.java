package co.uniquindio.algorithm_analysis.model;

import java.util.Objects;

public class CreditCard {

    private int id;
    private double credit;
    private Guest guest;

    public CreditCard(double credit) {
        this.credit = credit;
    }

    public CreditCard(double credit, Guest guest) {
        this.credit = credit;
        this.guest = guest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
