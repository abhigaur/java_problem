package methodReturnExample;

public class Company {
    private String name;

//    @Override
//    public String toString() {
//        return "Company{" +
//                "name='" + name + '\'' +
//                ", owner=" + owner +
//                '}';
//    }

    private Person owner;

    public Company(String companyName,Person owner)
    {
        this.name=companyName;
        this.owner=owner;
    }
    public String getCompanyName()
    {
        return name;
    }

    public Person   getOwnerName()
    {
        return owner;
    }
}
