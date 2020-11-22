package co.uniquindio.algorithm_analysis.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lodging {

    private int id;
    private List<String> images;
    private double basePrice;
    private double longitude;
    private double latitude;
    private int rooms;
    private int beds;
    private int restrooms;
    private String accessibility;
    private boolean pets;
    private String description;
    private boolean availability;
    private List<Service> services;
    private City city;
    private LodgingType lodgingType;
    private List<BedType> bedTypes;
    private Host host;
    private List<Booking> bookings;

    public Lodging(){
        images = new ArrayList<>();
        services = new ArrayList<>();
        bedTypes = new ArrayList<>();
        bookings = new ArrayList<>();
    }
    public Lodging(double basePrice, double longitude, double latitude, int rooms, int beds, int restrooms, String accessibility, boolean pets, String description, boolean availability, City city, LodgingType lodgingType, Host host) {
        this.basePrice = basePrice;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rooms = rooms;
        this.beds = beds;
        this.restrooms = restrooms;
        this.accessibility = accessibility;
        this.pets = pets;
        this.description = description;
        this.availability = availability;
        this.city = city;
        this.lodgingType = lodgingType;
        this.host = host;
        images = new ArrayList<>();
        services = new ArrayList<>();
        bedTypes = new ArrayList<>();
        bookings = new ArrayList<>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lodging lodging = (Lodging) o;
        return id == lodging.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public boolean isPets() {
        return pets;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public LodgingType getLodgingType() {
        return lodgingType;
    }

    public void setLodgingType(LodgingType lodgingType) {
        this.lodgingType = lodgingType;
    }

    public List<BedType> getBedTypes() {
        return bedTypes;
    }

    public void setBedTypes(List<BedType> bedTypes) {
        this.bedTypes = bedTypes;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
