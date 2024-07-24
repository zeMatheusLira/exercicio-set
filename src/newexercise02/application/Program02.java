package newexercise02.application;

import newexercise02.entities.Teacher;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Teacher> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();
        for (int i =1;i<=a;i++){
            int students = sc.nextInt();
            set.add(new Teacher(students));
        }

        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        for (int i =1;i<=b;i++){
            int students = sc.nextInt();
            set.add(new Teacher(students));
        }

        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        for (int i =1;i<=c;i++){
            int students = sc.nextInt();
            set.add(new Teacher(students));
        }

        System.out.println("Total students: "+ set.size());

        sc.close();
    }
}
// Resolução do professor
//public class Program {
//
//    public static void main(String[] args) throws ParseException {
//
//        Scanner sc = new Scanner(System.in);
//
//        Set<Integer> a = new HashSet<>();
//        Set<Integer> b = new HashSet<>();
//        Set<Integer> c = new HashSet<>();
//
//        System.out.print("How many students for course A? ");
//        int n = sc.nextInt();
//        for (int i=0; i<n; i++) {
//            int number = sc.nextInt();
//            a.add(number);
//        }
//
//        System.out.print("How many students for course B? ");
//        n = sc.nextInt();
//        for (int i=0; i<n; i++) {
//            int number = sc.nextInt();
//            b.add(number);
//        }
//
//        System.out.print("How many students for course C? ");
//        n = sc.nextInt();
//        for (int i=0; i<n; i++) {
//            int number = sc.nextInt();
//            c.add(number);
//        }
//
//        Set<Integer> total = new HashSet<>(a);
//        total.addAll(b);
//        total.addAll(c);
//
//        System.out.println("Total students: " + total.size());
//
//        sc.close();
//    }
//}