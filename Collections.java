import java.util.*;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
//      List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 5);
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


//       Iterate with help of Iterator
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // Iterate with help of enhanced For Loop
        for (Integer x : list) {
            System.out.println("X : " + x);
        }

        System.out.println(list);


        List<Integer> a = new LinkedList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(2, 40);
        System.out.println(a);


        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(20);
        s.push(56);
        s.push(40);
        System.out.println(s);
        System.out.println("peek = " + s.peek());
        s.pop();
        System.out.println(s);


        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(60);
        q.offer(80);
        q.offer(90);
        q.add(45);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());


        Map<Integer, String> student = new HashMap<>();

        student.put(1, "kushal");
        student.put(2, "aman");
        student.put(3, "vardhan");
        student.put(4, "kvvvv");

        student.putIfAbsent(4, "kv");


        System.out.println(student);
    }
}
