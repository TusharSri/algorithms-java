package com.algo.linkedlist;

public class Singly {

    Node headNode;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (this.headNode == null) {
            this.headNode = newNode;
        } else {
            Node lastNode = this.headNode;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = newNode;
        }
    }

    public int deleteNode(int data) {
        Node currentNode = this.headNode;

        if (currentNode == null) {
            return 0;
        }
        //for first element
        if (currentNode.data == data) {
            headNode = currentNode.nextNode;
            return data;
        }

        //for rest elements

        Node previousNode = currentNode;
        currentNode = currentNode.nextNode;
        while (currentNode != null) {
            if (currentNode.data == data) {
                previousNode.nextNode = currentNode.nextNode;
                return data;
            }
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        return 0;
    }

    public void printList() {
        Node currentNode = this.headNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
    }


    public static void main(String[] args) {
        Singly list = new Singly();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        list.printList();

        int data = list.deleteNode(6);
        System.out.println("*********");
        System.out.println("*********");

        System.out.println("Deleted data is " + data);
        list.printList();

    }
}
