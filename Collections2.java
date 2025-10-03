import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;

class IdComparision implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
      return o1.id- o2.id;
    }
}
class Employee implements Comparable <Employee> {
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
        return id + name.hashCode();
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

public class Collections2 {
    public static void main(String[] args) {
        int a = 2, b = 2;
        System.out.println(a == b);

        Integer c=2,d=2;
        System.out.println(c==d);


        Employee e1 = new Employee(2, "aman");
        Employee e2 = new Employee(1, "kushal");
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));


        HashSet<Employee> hs = new HashSet<>();
        hs.add(e1);
        hs.add(e2);

        System.out.println(hs);



        int arr []= {23,42,10,5,24};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(25);
        newArr.add(15);
        newArr.add(55);
        newArr.add(10);

        System.out.println(newArr);
        Collections.sort(newArr);
        System.out.println(newArr);

        System.out.println("minimum "+ Collections.min(newArr));

        Collections.sort(newArr,Collections.reverseOrder());
        System.out.println("Reverse"+ newArr);

        Collections.fill(newArr,0);
        System.out.println(newArr);


        ArrayList<Employee> e = new ArrayList<>();
        e.add(e1);
        e.add(e2);
        System.out.println(e);

//        Collections.sort(e);

        // Using Comparator
        Collections.sort(e,new IdComparision());
        System.out.println(e);
    }
}
