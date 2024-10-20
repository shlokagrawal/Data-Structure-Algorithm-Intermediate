package intermediate.linkedlist_basics_9;

public class InsertANode_3 {

	public static void main(String[] args) {
		// (Q3) Given A head node of Linked List. Insert a new node at K'th position.
		Node head = CreateLinkedList_1.createLinkedList(5);
		CreateLinkedList_1.printLinkedList(head);
		CreateLinkedList_1.printLinkedList(insert(head, 0, 0));
		CreateLinkedList_1.printLinkedList(insert(head, 20, 4));
	}

	public static Node insert(Node head, int n, int k) {

		if (k > SizeofLinkedList_2.sizeOfLinkedList(head) || k < 0) {
			return head;
		}

		Node node = new Node(n);

		if (k == 0) {
			node.next = head;
			head = node;
			return head;
		}

		Node head1 = head;

		for (int i = 0; i < k - 1; i++) {
			head1 = head1.next;
		}

		node.next = head1.next;
		head1.next = node;

		return head;
	}

}
