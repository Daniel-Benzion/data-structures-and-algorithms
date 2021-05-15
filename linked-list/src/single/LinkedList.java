package single;

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

	public void append(Node node) {

		if (head.next == null) {
			head.next = node;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
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
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		LinkedList list = new LinkedList(node);
		list.print();
		System.out.println("");
		System.out.println("");
		System.out.println("Reverse!");
		System.out.println("");
		list.reverse();
		list.print();
	}
}
