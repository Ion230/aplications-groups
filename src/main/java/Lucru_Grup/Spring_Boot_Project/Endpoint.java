package Lucru_Grup.Spring_Boot_Project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/salut")
public class Endpoint {
    @GetMapping
    public String salut() {
        return "Salut lume";
    }
}
