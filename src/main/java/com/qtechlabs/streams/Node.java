package com.qtechlabs.streams;

public class Node {

	public int data;
	public Node next;
	
	public Node() {
	}

	public Node(Node next) {
		super();
		this.next = next;
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
