package single;

public class Node {

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

	public static Node append(Node head, Node node) {

		if (head.next == null) {
			head.next = node;
			return head;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		return head;
	}

}
