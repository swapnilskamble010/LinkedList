package com.bl.ds.linkedlist;

public class LinkedListDS {
		
	public static void main(String[] args) {
		System.out.println("Welcome to Linked List Implementation Program");
		MyNode<Integer> node1 = new MyNode(56);
		MyNode<Integer> node2 = new MyNode(30);
 		MyNode<Integer> node3 = new MyNode(70);
 		MyNode<Integer> node4 = new MyNode(40);
 		
		MyLinkedList myLinkedList = new MyLinkedList();
		System.out.println("Create a Linked List by adding 30 and 56 to 70");
		myLinkedList.add(node3);
		myLinkedList.add(node2);
		myLinkedList.add(node1);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Create Linked List by appending 30 and 70 to 56");
		myLinkedList.popLast();
		myLinkedList.popLast();
		myLinkedList.append(node2);
		myLinkedList.append(node3);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Insert 30 between 56 and 70");
		myLinkedList.delete(30);
		myLinkedList.insert(node1, node2);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Delete the First Element in the Linked List of Sequence 56->30->70");
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Delete the Last Element in the Linked List of Sequence 56->30->70");
		myLinkedList.add(node1);
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Find Node with value 30 in the Linked List");
		myLinkedList.append(node3);
		myLinkedList.search(30);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Insert 40 after 30 to the Linked List Sequence of 56->30->70");
		myLinkedList.insert(node2,node4);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Delete 40 from Linked List Sequence of 56->30->40->70 and show the size of Linked List is 3");
		myLinkedList.delete(40);
		myLinkedList.size();
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
		System.out.println("Create Ordered LL in ascending order of data enetered in the sequence 56, 30, 40 and 70");
		myLinkedList.popLast();
		myLinkedList.popLast();
		myLinkedList.sortInAdd(node2);
		myLinkedList.sortInAdd(node4);
		myLinkedList.sortInAdd(node3);
		myLinkedList.printMyNodes();
		System.out.println("---------------------------------------------------");
	}	
}
