package com.bl.ds.linkedlist;

public class LinkedListDS {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Linked List Implementation Program");
		
		MyNode<Integer> node1 = new MyNode(56);
		MyNode<Integer> node2 = new MyNode(30);
 		MyNode<Integer> node3 = new MyNode(70);
 		MyNode<Integer> node4 = new MyNode(40);
 		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(node1);
		myLinkedList.append(node2);
		myLinkedList.append(node3);
		myLinkedList.insert(node2, node4 );
		//myLinkedList.pop();
		//myLinkedList.popLast();
		//myLinkedList.search(40);
		myLinkedList.delete(40);
		myLinkedList.size();
		myLinkedList.printMyNodes();
	}	
}
