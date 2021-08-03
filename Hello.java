import Draw.Circle;
import Garage.Garage;

import java.util.*;

public class Hello {

    public static void main(String[] args){
        //Generics
        Box<Car> b = new Box<Car>();
        Box<Integer> b2 = new Box<Integer>();
        Box<Integer> b3 = new Box<>();

        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(15);
        ArrayList<Circle> arr = new ArrayList<Circle>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);

        String string1 = "Hello";
        String string2 = "World";
        System.out.println(string1.compareTo(string2));

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Car> garage = new ArrayList<Car>();

        HashMap<Integer, String> h1 = new HashMap<Integer, String>();


        // Doubly linked list
        LinkedList<Integer> myInts = new LinkedList<Integer>();
        ArrayList<Integer> myInts2 = new ArrayList<Integer>();

        //Stack
        Stack<Integer> myStack = new Stack<Integer>();
        //Queue
        Queue<Integer> myQueue = new LinkedList<Integer>();


        //Compare
        String s1 = new String("Hello world!");
        String s2 = new String("Hello world!");
        //System.out.println(s1 == s2);
        //System.out.println(s1.equals(s2));
    }
}














/*
int i = 0;
        //当你不知道自己要循环多少次的时候
        while(i < 10){
            System.out.println("Hello World!");
            //i += 1;
        }
        //当你确切知道，这个循环要循环多少次的时候
        for(){

        }
 */
