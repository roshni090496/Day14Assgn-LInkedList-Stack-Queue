package com.company;

public class ListOperations {

    //add data at head
    public static void addData() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(45);
        list.print();
    }

    //add data at tail
    public static void appendData() {
        LinkedList list = new LinkedList();
        list.append(45);
        list.append(30);
        list.append(90);
        list.print();
    }

    //insert element
    public static void insertData() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(45);
        list.insertNode(list.head, 30);
        list.print();
    }

    //delete first element of list
    public static void deleteFirstData() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(45);
        list.pop();
        list.print();
    }

    //delete last element of list
    public static void deleteLastData() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(45);
        list.popLast();
        list.print();
    }

    //find node by value
    public static void findNodeByValue() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(46);
        list.findNode(30);
    }

    //insert data at given node
    public static void insertDataAtGivenNode() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(46);
        list.insertNode(list.head.next, 50);
        list.print();
    }

    //delete the data from the given node
    public static void deleteDataAtGivenNode() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(46);
        list.insertNode(list.head.next, 50);
        System.out.println("Before");
        list.print();
        System.out.println("");
        list.deleteANode(50);
        System.out.println("After");
        list.print();
    }

       // sort operation
    public static void sortList() {
        LinkedList list = new LinkedList();
        list.push(90);
        list.push(30);
        list.push(46);
        list.insertNode(list.head.next, 50);
        System.out.println("Before");
        list.print();
        System.out.println("");
        list.sort();
        System.out.println("After");
        list.print();
    }
}

