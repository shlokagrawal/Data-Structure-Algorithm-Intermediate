package intermediate.linkedlist_basics_9;

public class SizeofLinkedList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = CreateLinkedList_1.createLinkedList(3);
		System.out.println(sizeOfLinkedList(head));
	}

	public static int sizeOfLinkedList(Node head) {
		Node head1 = head;
		int size = 0;
		while (head1 != null) {
			size++;
			head1 = head1.next;
		}
		return size;
	}

}
