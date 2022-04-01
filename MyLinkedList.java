package com.bl.ds.linkedlist;

public class MyLinkedList {
	INode head;
	INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(INode newNode, INode insertNode) {
		INode tempNode = newNode.getNext();
		newNode.setNext(insertNode);
		insertNode.setNext(tempNode);
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode popLast() {
		INode tempNode = this.head;
		while(tempNode.getNext() != this.tail) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		this.tail.setNext(null);
		return tempNode;
	}
	
	public boolean search(int key) {
		INode tempNode = head;
		boolean flag = false;
		while(tempNode != null) {
			if((int)tempNode.getKey() == key) {
				System.out.println(key + " is Found in the Linked List");
				flag = true;
			}
			tempNode = tempNode.getNext();
		}
		if(flag == false) {
			System.out.println(key + " is not Found in the Linked List");
		}
		return flag;
	}
	
	public void delete(int key) {
		INode tempNode = head;
		INode tempNode1 = head;
		if(search(key)) {
			while((int)tempNode.getNext().getKey() != key) {
				tempNode = tempNode.getNext();
			}
			
			while((int)tempNode1.getKey() != key) {
				tempNode1 = tempNode1.getNext();
			}
			
			tempNode1 = tempNode1.getNext();
			
			if((int)tempNode.getNext().getKey() == key) {
				tempNode.setNext(tempNode1);
				System.out.println(key + " is Deleted from the Linked List");
			}
		}
		else {
			System.out.println("Please Enter the Valid Element to Delete it from the Linked List");
		}
	}
	
	public void size() {
		INode tempNode = head;
		int count = 0;
		while(tempNode.getNext() != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		count++;
		System.out.println("The Size of Linked List is: " + count);
	}
	
	public void printMyNodes() {
		INode tempNode = head;
		System.out.print("My Nodes: ");
		while(tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
				tempNode = tempNode.getNext();
		}
		System.out.println(tempNode.getKey());
	}
}
