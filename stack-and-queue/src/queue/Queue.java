package queue;

import stack.Stack;

public class Queue {

	Node front;

	static class Node {

		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}
	}

	public Queue() {}

	public Queue(Node front) {
		this.front = front;
	}

	public boolean isEmpty() {
		return this.front == null;
	}

	public int append(int data) {
		if (this.front == null) {
			this.front = new Node(data);
			return data;
		}
		Node current = this.front;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		return data;
	}

	public void peek() {
		if (this.isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println(this.front.data);
	}

	public boolean shift() {
		if (this.isEmpty()) return false;

		if (this.front.next == null) {
			this.front = null;
			return true;
		}
		this.front = this.front.next;
		return true;

	}

	public void print() {
		if (this.front == null) {
			System.out.println("Queue is empty.");
			return;
		}
		Node current = this.front;
		while(current != null) {
			System.out.print("(" + current.data + ") ");

			current = current.next;
		}
		System.out.println("");
	}


	public static void main(String[] args) {
		Queue queue = new Queue(new Node(1));
		queue.append(2);
		queue.append(3);
		queue.print();
		queue.append(4);
		queue.print();
		queue.shift();
		queue.print();

	}
}
