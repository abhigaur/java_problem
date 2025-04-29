package toStringExample;

public class Employee {
    int age;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public  Employee(int age, String name)
    {
this.age= age;
this.name=name;
    }

    public static void main(String[] args) {
        // whitout toString method its object prints hascode

        Employee e= new Employee(10,"abhi");
        System.out.println(e);

        //after introdue toString method

    }


}

