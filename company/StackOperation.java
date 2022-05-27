package com.company;

public class StackOperation {
    public static void addElement() {
        StackAndQueue list= new StackAndQueue();
        list.push(35);
        list.push(90);
        list.push(27);
        list.display();
    }

    public static void peek(){
        StackAndQueue list= new StackAndQueue();
        list.push(35);
        list.push(90);
        list.push(27);
        list.peek();
    }

    public static void pop(){
        System.out.println("Before Pop:");
        StackAndQueue list= new StackAndQueue();
        list.push(35);
        list.push(90);
        list.push(27);
        list.display();

        list.pop();
        System.out.println("\nAfter Pop:");
        list.display();
    }

    public static void queueElement() {
        StackAndQueue list =new StackAndQueue();
        list.queue(35);
        list.queue(90);
        list.queue(27);
        list.display();
    }

    public static void dequeueElement(){
        StackAndQueue list =new StackAndQueue();
        list.queue(35);
        list.queue(90);
        list.queue(27);
        System.out.println("Before Pop:");

        list.display();
        list.pop();
        System.out.println("\nAfter Pop:");
        list.display();
    }
}

