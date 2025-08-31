package Lec30;

public class LinkedList {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

//	O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		}

		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void AddAt_Index(int item, int k) throws Exception {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
		}
	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Out of Range");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public int getFirst() {
		return head.val;
	}

	public int getLast() {
		return tail.val;
	}

//	O(N)
	public int get_at_index(int k) throws Exception {
		return GetNode(k).val;
	}

//	O(1)
	public int removeFirst() {
		int val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return val;
	}

	public int removeLast() throws Exception {
		int val = tail.val;
		if (size == 1) {
			removeFirst();
		} else {
			Node temp = tail;
			tail = GetNode(size - 2);
			tail.next = null;
			size--;
		}
		return val;
	}

	public int remove_At_index(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = GetNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
}
