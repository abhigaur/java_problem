package testproject;

public  class Login {
    int age;
    int salary;
    String name;
    String fName;

    public Login(int age, int salary, String name, String fName) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.fName = fName;
    }

    public Login getName()
    {
        return this;
    }

    public static class Builder{

        int age;
        int salary;
        String name;
        String fName;

        public Builder age(int age)
        {
            this.age=age;
            return this;
        }
        public Builder salary(int salary)
        {
            this.salary=salary;
            Builder x=this;
            return x;
        }

        public Login build( )
        {
            Login lll= new Login(age,  salary,  name,  fName);
            return lll;
        }

    }


    public static void main(String[] args) {

    }

}
