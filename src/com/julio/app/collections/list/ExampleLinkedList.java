package com.julio.app.collections.list;

import com.julio.app.pooherence.Person;

import java.util.*;

public class ExampleLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());
        System.out.println("**************insertying 5 elements************");
        linkedList.add((new Person("Pato","Perez", 18,"pato@gmail.com")));
        linkedList.add((new Person("Cata","Perez", 27,"pato@gmail.com")));
        linkedList.add((new Person("Luci","Perez", 15,"to@gmail.com")));
        linkedList.add((new Person("Jano","Perez", 33  ,"sto@gmail.com")));
        linkedList.add((new Person("Andres","Perez", 20,"pato@gmail.com")));

        /**
         * Size
         */
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

        System.out.println(linkedList + " size: " + linkedList.size());
        /**
         * remove
         */

        linkedList.remove((new Person("Jano","Perez", 33  ,"sto@gmail.com")));
        linkedList.remove(2);
        System.out.println(linkedList + " size: " + linkedList.size());
        boolean bb = linkedList.contains((new Person("Pato","Perez", 18,"pato@gmail.com")));
        System.out.println("linkedList.contains() = " + bb);

        /**
         * order list using Collections.sort
         */
        //Collections.sort(linkedList,(a,b) -> a.getName().compareTo(b.getName()));
        //linkedList.sort((a,b) -> a.getName().compareTo(b.getName()));
        /**
         * using java 8
         */
        linkedList.sort(Comparator.comparing((Person::getAge)).reversed());
        System.out.println(linkedList + " size: " + linkedList.size());
        System.out.println("first element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        /**
         * this return null if there are not value on list
         */
        System.out.println("Last element: " + linkedList.peekLast());
        /**
         * remove first
         */
        System.out.println("remove element: " + linkedList.removeFirst());
        System.out.println(linkedList + " size: " + linkedList.size());
        /**
         * remove last element
         */
        System.out.println("remove element: " + linkedList.removeLast());

        /**
         * List iterator
         */

        ListIterator<Person> li = linkedList.listIterator();

        while(li.hasNext()){
            Person p = li.next();
            System.out.println("li.next() = " + p );
        }
        while(li.hasPrevious()){
            Person per = li.previous();
            System.out.println("li.previous() = " + per );
        }




    }
}
