package single;

import java.sql.SQLOutput;

public class LinkedList {

	Node head;

	public LinkedList() {}

	public LinkedList(Node head) {
		this.head = head;
	}

	static class Node {

		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}


	}

	public void append(LinkedList list) {

		if (head == null) {
			head = list.head;
			return;
		}

		if (head.next == null) {
			head.next = list.head;
			return;
		}

		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = list.head;
	}

	public void append(Node node) {
		if (head == null) {
			head = node;
			return;
		}

		if (head.next == null) {
			head.next = node;
			return;
		}

		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
	}

	public void prepend(LinkedList list) {
		if (head == null) {
			this.head = list.head;
			return;
		}

		Node current = list.head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = this.head;
		this.head = list.head;
	}

	public void prepend(Node node) {
		if (head == null) {
			this.head = node;
			return;
		}

		node.next = this.head;
		this.head = node;
	}

	public void reverse() {

		if (head.next == null) return;

		Node prev = null;
		Node current = head;
		Node next = null;


		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current = prev;
		head = current;
	}



	public void print() {

		Node current = head;
		while (current.next != null) {
			System.out.print("(" + current.data + ")-->");
			current = current.next;
		}
		System.out.print("(" + current.data + ")-->null");
		System.out.println("");
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		LinkedList list = new LinkedList(node);

		Node node2 = new Node(-2);
		node2.next = new Node(-1);
		node2.next.next = new Node(0);
		LinkedList list2 = new LinkedList(node2);

		LinkedList list3 = new LinkedList(new Node(4));
		list3.append(new Node(5));
		list3.append(new Node(6));

		list.print();

		System.out.println("");
		list.prepend(list2);

		list.print();

		System.out.println("");
		list.append(list3);

		list.print();

		list.reverse();

		System.out.println("");

		list.print();

		/*System.out.println("");
		System.out.println("");
		System.out.println("Reverse!");
		System.out.println("");
		list.reverse();*/
		//list.print();
	}
}
