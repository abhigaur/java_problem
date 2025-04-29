package methodReturnExample;

public class Address {

  //  @Override
//    public String toString() {
//        return "Address{" +
//                "city='" + city + '\'' +
//                ", State='" + State + '\'' +
//                '}';
//    }

    private String city;
    private String State;

    public Address(String city, String state) {
        this.city = city;
        this.State = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

}
