package edu.school21.cinema.models;

public class Hall {
    private final int capacity;
    private final String title;
    private int id;

    public Hall(int capacity, String title) {
        this.capacity = capacity;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "capacity=" + capacity +
                ", title='" + title + '\'' +
                '}';
    }
}
