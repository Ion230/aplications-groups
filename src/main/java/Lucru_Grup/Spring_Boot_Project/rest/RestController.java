package Lucru_Grup.Spring_Boot_Project.rest;

import Lucru_Grup.Spring_Boot_Project.GetRandom;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {


    GetRandom getRandom = new GetRandom();

    int rsp = getRandom.getRandomNum();

    @GetMapping("/random")
    public int getRandomNumber() {
        return rsp;
    }


}