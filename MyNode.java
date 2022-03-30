package com.bl.ds.linkedlist;

public class MyNode<K> {
	K key;
	MyNode next;
	
	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode(K key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "MyNode [key=" + key + ", next=" + next + "]";
	}
	
}
