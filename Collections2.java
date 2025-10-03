import java.util.*;

class Employee {
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Collections2 {
    public static void main(String[] args) {
        int a = 2, b = 2;
        System.out.println(a == b);

        Integer c=2,d=2;
        System.out.println(c==d);


        Employee e1 = new Employee(1, "aman");
        Employee e2 = new Employee(1, "aman");
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));


        HashSet<Employee> hs = new HashSet<>();
        hs.add(e1);
        hs.add(e2);

        System.out.println(hs);
    }
}
