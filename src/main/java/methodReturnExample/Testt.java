package methodReturnExample;

public class Testt {
    public static void main(String[] args) {

        Address address= new Address("ateli","haryana");
        Person p= new Person("abhilash",address);
        Company c= new Company("TSYS",p);

        System.out.println(c.getOwnerName());
        System.out.println(p);

    }
}
