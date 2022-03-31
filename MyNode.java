package com.bl.ds.linkedlist;

public class MyNode<K> implements INode<K>{
	public K key;
	public INode next;
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}
}
