package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {


        

        LinkedList<Integer> linkedList = new LinkedList<>();

        
          linkedList.add(4);
          linkedList.add(5);
          linkedList.add(6);
          linkedList.add(8);
          linkedList.add(2);
          linkedList.add(9);
          linkedList.add(2);

       
        linkedList.add(2,4);
        
        System.out.println(linkedList.element());

        return linkedList;
    }

    public Stack<Integer> useStack() {
       

    
        Stack<Integer> Stack = new Stack<>();

        Stack.push(5);
        Stack.push(6);
        Stack.push(8);
        Stack.push(9);
        
        System.out.print(Stack.firstElement());

        System.out.print(Stack.lastElement());
        
        System.out.print(Stack.pop());

        
        Stack.push(4);
        
        
        return Stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
      

        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>();


        ArrayDeque.add(5);
        ArrayDeque.add(6);
        ArrayDeque.add(8);
        ArrayDeque.add(9);

        System.out.print(ArrayDeque.getFirst());
        System.out.print(ArrayDeque.getLast());
        System.out.print(ArrayDeque.poll());
        System.out.print(ArrayDeque.element());


      return ArrayDeque;

    }

    public HashMap<Integer, String> useHashMap() {
        
        HashMap<Integer, String> HashMap = new HashMap<>();

  
        HashMap.put(1, "TypeScript");
        HashMap.put(2, "Kotlin");
        HashMap.put(3, "Python");
        HashMap.put(4, "Java");
        HashMap.put(5, "JavaScript");
        HashMap.put(6, "Rust");

        
        System.out.print(HashMap.keySet());
        System.out.print(HashMap.values());
        System.out.print(HashMap.containsValue("English"));

        return HashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
