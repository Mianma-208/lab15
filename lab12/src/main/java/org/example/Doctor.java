package org.example;

import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private int rating;
    private List<Integer> patientRatings;

    public Doctor(int id, String name, String specialization, int rating, List<Integer> patientRatings) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
        this.patientRatings = patientRatings;
    }

    public double getAverageRating() {
        if (patientRatings == null || patientRatings.isEmpty()) return 0;
        int sum = 0;
        for (int r : patientRatings) sum += r;
        return (double) sum / patientRatings.size();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public List<Integer> getPatientRatings() { return patientRatings; }

    @Override
    public String toString() {
        return "Doctor{id=" + id + ", name='" + name + "', specialization='" + specialization + "', rating=" + rating + ", avg=" + getAverageRating() + "}";
    }
}