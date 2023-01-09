package day17_ClassAndObject;

public class Address {

    public String buildingNumber,
    street,
    city,
    state;

    public String zipCode;

    public void setInfo(String buildingNumber, String state, String street, String city, String zipCode){

        this.buildingNumber = buildingNumber;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String toString(){

        return "Address{" + "building number = " + buildingNumber + "street = " + street + "city = " + city + "state = " + state + "zip code = " + zipCode + "}";

    }

}
