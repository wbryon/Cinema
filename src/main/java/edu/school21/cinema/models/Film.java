package edu.school21.cinema.models;

/**
 * Страница фильма содержит список всех фильмов, созданных администратором. Администратор может добавить фильм.
 * Для каждого фильма указывается название, год выпуска, возрастные ограничения и описание.
 * Также есть возможность загрузить постер к фильму
 */

import lombok.Data;

import java.time.LocalDate;
@Data
//@Entity
public class Film {
    private int id;
    private final String name;
    private final String description;
    private final LocalDate releaseDate;
    private final Mpa mpa;
    private String poster;
}
