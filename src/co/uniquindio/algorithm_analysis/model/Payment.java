package co.uniquindio.algorithm_analysis.model;

import java.util.Objects;

public class Payment {
    private int id;
    private double nightBasePrice;
    private int nights;
    private double housekeeping;
    private double services;
    private Booking booking;


    public Payment(double nightBasePrice, int nights, double housekeeping, double services, Booking booking) {
        this.nightBasePrice = nightBasePrice;
        this.nights = nights;
        this.housekeeping = housekeeping;
        this.services = services;
        this.booking = booking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNightBasePrice() {
        return nightBasePrice;
    }

    public void setNightBasePrice(double nightBasePrice) {
        this.nightBasePrice = nightBasePrice;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getHousekeeping() {
        return housekeeping;
    }

    public void setHousekeeping(double housekeeping) {
        this.housekeeping = housekeeping;
    }

    public double getServices() {
        return services;
    }

    public void setServices(double services) {
        this.services = services;
    }
}
