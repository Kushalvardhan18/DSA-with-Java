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


        // DEQUE - Double Ended Queue
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(20);
        dq.addLast(11);
        dq.offer(20);
        dq.poll();
        dq.offer(25);
        System.out.println("Deque" + dq);
        // In deque insertion and deletion can be made from both ends.


        Map<Integer, String> student = new HashMap<>();

        student.put(1, "kushal");
        student.put(4, "kvvvv");
        student.put(2, "aman");
        student.put(3, "vardhan");

        student.putIfAbsent(4, "kv");


        System.out.println(student);

        for (Integer rollno : student.keySet()) {
            System.out.println(rollno);
        }
        for (String name : student.values()) {
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> st : student.entrySet()) {
            System.out.println("key : " + st.getKey() + " , " + "value : " + st.getValue());
        }


        // Tree Map is always Sorted
        Map<Integer, String> student2 = new TreeMap<>();

        student2.put(1, "kushal");
        student2.put(4, "kvvvv");
        student2.put(2, "aman");
        student2.put(3, "vardhan");

        student2.putIfAbsent(4, "kv");


        System.out.println(student2);

        for (Integer rollno : student2.keySet()) {
            System.out.println(rollno);
        }
        for (String name : student2.values()) {
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> st : student2.entrySet()) {
            System.out.println("key : " + st.getKey() + " , " + "value : " + st.getValue());
        }
    }
}
