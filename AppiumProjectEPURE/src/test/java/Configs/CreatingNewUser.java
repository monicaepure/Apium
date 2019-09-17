package Configs;

import com.github.javafaker.Faker;

public class CreatingNewUser {
    private Faker faker = new Faker();

    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String address = faker.address().streetName() + " " + faker.address().buildingNumber();
    private String city = faker.address().city();
    private String phoneName = faker.phoneNumber().cellPhone();

    public  String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public  String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhoneName() {
        return this.phoneName;
    }
}