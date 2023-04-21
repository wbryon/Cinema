package edu.school21.cinema.models;

import lombok.Data;

import java.time.LocalDate;

/**
 * Страница для работы с кинопоказами.
 * Администратор может создать сеанс для определенного фильма в определенном зале в нужное время.
 * Администратор должен иметь возможность указать стоимость билета.
 * Реализовать загрузку всех данных о кино и кинозалах в виде атрибутов на страницу для последующего выбора администратором
 */

@Data
public class Session {
    private final int cost;
    private final Film film;
    private final Hall hall;
    LocalDate showTime;
}
