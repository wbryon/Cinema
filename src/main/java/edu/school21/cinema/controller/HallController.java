package edu.school21.cinema.controller;

import edu.school21.cinema.models.Hall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/admin/panel")
public class HallController {

    @GetMapping("/halls")
    public String homeInit(Locale locale, Model model) {
        return "halls";
    }

    @PostMapping("/halls")
    public String homere(@ModelAttribute("hall") Hall hall) {

        // не читает по-русски и не очищает атрибуты после первой отправки
        System.out.println(hall.toString());
        return "halls";
    }
}
