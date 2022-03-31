package com.bl.ds.linkedlist;

public class LinkedListDS {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Linked List Implementation Program");
		
		MyNode<Integer> node1 = new MyNode(56);
		MyNode<Integer> node2 = new MyNode(30);
		MyNode<Integer> node3 = new MyNode(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(node1);
		myLinkedList.append(node3);
		myLinkedList.insert(node1, node2);
		//myLinkedList.pop();
		//myLinkedList.popLast();
		myLinkedList.search(30);
		myLinkedList.printMyNodes();
	}	
}
