package Lucru_Grup.Spring_Boot_Project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerIon {
    @GetMapping("/author")
    public String afisareAuthor() {
        return "Ion Creangă";
    }
}
