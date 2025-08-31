package Lec31;

public class Cycle_removal {

	private class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k) {

		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() {
		tail.next = getNode(2);
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public Node hasCycle() {
		Node slow = head;
		Node Fast = head;
		while (Fast != null && Fast.next != null) {
			slow = slow.next;
			Fast = Fast.next.next;
			if (slow == Fast) {
				return slow;
			}
		}
		return null;
	}

//	O(n2)
	public void CycleRemove1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

//	O(n)
	public void CycleRemove2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// cycle ka length
		Node temp = meet;
		int c = 1;
		while (temp.next != meet) {
			c++;
			temp = temp.next;
		}

		// fast ko m distance ahead move karana hai
		Node fast = head;
		for (int i = 0; i < c; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	
	
	public void Floyed_CycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		Node fast=meet;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_removal cl = new Cycle_removal();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		cl.CreateCycle();
		cl.CycleRemove1();
		cl.Display();

		cl.CreateCycle();
		cl.CycleRemove2();
		cl.Display();

		cl.CreateCycle();
		cl.Floyed_CycleRemoval();
		cl.Display();
	}
}
