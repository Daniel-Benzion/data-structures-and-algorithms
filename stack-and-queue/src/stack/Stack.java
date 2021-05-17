package stack;

public class Stack {

	Node top;

	static class Node {

		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}

	}

	public Stack() {}

	public Stack(Node top) {
		this.top = top;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	public void peek() {
		if (this.top == null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(this.top.data);
	}

	public int pop () {
		if (this.top == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		int tempData = this.top.data;
		if (this.top.next == null) {
			this.top = null;
			return tempData;
		}
		this.top = this.top.next;
		return tempData;
	}

	public int push(Node node) {
		if (this.top == null) {
			this.top = node;
			return node.data;
		}
		node.next = this.top;
		this.top = node;
		return node.data;
	}

}
