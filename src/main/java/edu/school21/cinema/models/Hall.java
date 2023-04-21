package edu.school21.cinema.models;

/**
 * Страница работы с кинозалами содержит список всех кинозалов, созданных администратором.
 * Администратор может создать кинозал с определенной конфигурацией.
 * Каждому кинозалу присваивается порядковый номер и количество мест
 */
public class Hall {
    private int id;
    private final int capacity;
    private final String title;

    public Hall(int capacity, String title, String description) {
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
