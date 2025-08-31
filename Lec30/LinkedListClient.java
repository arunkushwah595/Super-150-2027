package Lec30;

public class LinkedListClient {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.AddFirst(60);
		ll.AddFirst(50);
		ll.AddFirst(40);
		ll.AddFirst(20);
		ll.AddFirst(10);

		ll.Display();

		ll.AddLast(70);
		ll.AddLast(80);
		ll.AddLast(90);
		ll.AddLast(100);

		ll.Display();

	}
}
