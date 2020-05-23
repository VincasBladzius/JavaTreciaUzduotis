package players;

import com.github.javafaker.Faker;

import java.util.Random;

public class DataFaker {

    Random rand;
    public DataFaker() {
        this.rand = new Random();
    }


    public String[] GenerateName()
    {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String[] fullName = {firstName, lastName};
        return fullName;
    }//GenerateName

    public int GeneratePoints(){
        int income = rand.nextInt(30);
        return income;
    }//GeneratePoints
}
