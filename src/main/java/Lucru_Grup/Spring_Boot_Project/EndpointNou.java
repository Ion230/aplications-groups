package Lucru_Grup.Spring_Boot_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EndpointNou {
    @GetMapping("/salut")
    public String salut() {
        return "Salut JuniorDeveloper";
    }
}
