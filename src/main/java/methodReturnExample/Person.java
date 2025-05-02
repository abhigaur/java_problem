package methodReturnExample;

public class Person {

    private String name;

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", address=" + address +
//                '}';
//    }

    private Address address;

    public Person(String name,Address address)
    {
        this.name=name;
        this.address=address;
    }

    public Address getAdress()
    {
        return address;
    }

    public String getName()
    {
        return name;
    }


}
