package Lucru_Grup.Spring_Boot_Project;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GetRandom implements RandomClass {

    Random rand = new Random();
    int randomNum = rand.nextInt(100);

    @Override
    public int getRandomNum() {
        return randomNum;
    }
}
