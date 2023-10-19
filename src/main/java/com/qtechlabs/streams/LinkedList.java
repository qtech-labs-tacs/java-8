package com.qtechlabs.streams;

public class LinkedList extends java.util.LinkedList<Integer> {

	public int size;
	public Node head;
	public int index;

	public int getSize() {
		return size;
	}

	public void add(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size++;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--> ");
			temp = temp.next;
		}
		System.out.println(" null");
	}

	public int getElementByIndex(int index) {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
}