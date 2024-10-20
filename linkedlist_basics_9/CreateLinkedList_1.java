package intermediate.linkedlist_basics_9;

public class CreateLinkedList_1 { // refer 23._Jun22_Linked_List_Basics

	public static void main(String[] args) {
		// (Q1) Given N>0, create a linked list which contains data from 1 - N
		printLinkedList(createLinkedList(5));
	}

	public static Node createLinkedList(int n) {
		Node head = new Node(1);
		Node temp = head;
		for (int i = 2; i <= n; i++) {
			Node node = new Node(i);
			head.next = node;
			head = node;
		}
		return temp;
	}

	public static void printLinkedList(Node head) {
		Node head1 = head;
		while (head1.next != null) {
			System.out.print(head1.data + "->");
			head1 = head1.next;
		}
		System.out.println(head1.data);
	}

}
