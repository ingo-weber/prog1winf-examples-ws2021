package de.tuberlin.sbe.prog1winf.datastructures;

public class QueueWrapper {

	private SinglyLinkedList list = new SinglyLinkedList();

	public void enqueue(String s) {
		list.append(s);
	}

	public String dequeue() {
		Object o = list.getValue(0);
		if (o == null) {
			return null;
		}
		list.deleteValue(o);
		return (String) o;
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public static void main(String[] args) {
		QueueWrapper q = new QueueWrapper();
		System.out.println(q);
		q.enqueue("Test 1");
		q.enqueue("Test 2");
		q.enqueue("Test 3");
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
	}

	// Exercise: write a "StackWrapper" class and test it
}
