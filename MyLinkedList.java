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
