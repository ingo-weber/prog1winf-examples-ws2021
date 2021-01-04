package de.tuberlin.sbe.prog1winf.datastructures;

import java.util.List;

public class SinglyLinkedList {

	/** head of the list */
	private ListEntry head;

//	private ListEntry lastEntry;

	/**
	 * inserts a values at the end of the list
	 * 
	 * @param value
	 *            value which shall be added
	 */
	public void append(Object value) {
		if (head == null) {
			// insert at head
			head = new ListEntry();
			head.value = value;
			return;
		}
		// find end
		ListEntry current = head, last = head;
		while (current != null) {
			last = current;
			current = current.next;
		}
		current = new ListEntry();
		current.value = value;
		last.next = current;
		// Why do you need this last statement?
	}

	public void appendNeu(Object value){
		ListEntry neu = new ListEntry();
		neu.value = value;
		if(head==null){
			head = neu;
			return;
		}
		ListEntry temp = head;
		while(temp.next!= null) {
			temp = temp.next;
		}

		temp.next = neu;
	}

	/**
	 * Get value at a specific position
	 *
	 * @param position
	 * @return the value at position "position" or null if the list has less
	 *         entries
	 */
	public Object getValue(int position) {
		int counter = 0;
		ListEntry current = head;
		while (current != null && position != counter++)
			current = current.next;
		if (current == null)
			return null;
		else
			return current.value;
	}

	/**
	 * deletes the specified value if contained in this list. Note: this method
	 * uses reference comparison, not equals()!
	 * 
	 * @param value
	 */
	public void deleteValue(Object value) {
		if (head == null)
			return; // empty list
		
		if (head.value == value) {
			// it's the head element
			head = head.next;
			return;
		}
		
		ListEntry current = head, entryB4DelMe = head;
		while (current.next != null && current.value != value) {
			entryB4DelMe = current;
			current = current.next;
		}
		if (current.value != value) // (current.next == null)
			return; // not in this list
		entryB4DelMe.next = entryB4DelMe.next.next;

	}

	/**
	 * inserts a value at the head of the list
	 *
	 * @param value
	 *            value which shall be added
	 */
	public void insertAtHead(Object value) {
		if (head == null) {
			head = new ListEntry();
			head.value = value;
			return;
		}
		ListEntry newHead = new ListEntry();
		newHead.value = value;
		newHead.next = head;
		head = newHead;
	}

	/**
	 * inserts a value after the entry with the value "after" or at the end of
	 * the list if the value is not contained
	 *
	 * @param value
	 *            value which shall be added
	 * @param after
	 *            desired predecessor for value
	 */
	public void insertAfter(Object value, Object after) {
		if (head == null) {
//			head = new ListEntry();
//			head.value = value;
			System.out.println("Empty list, cannot insert after " + after);
			return;
		}
		ListEntry newone = new ListEntry();
		newone.value = value;
		ListEntry current = head;
		while (current.next != null && current.value != after)
			current = current.next;
		if (current.value != after) {
			System.out.println("Cannot insert after " + after + ", element not found");
			return;
		}
		ListEntry temp = current.next;
		current.next = newone;
		newone.next = temp;
	}

	public void insertAfterPos(int pos, Object value) {
		if (head == null) {
			System.out.println("Empty list, cannot insert after position " + pos);
			return;
		}
		ListEntry current = head;
		ListEntry newOne = new ListEntry();
		newOne.value = value;
		if (pos == 0) {
			newOne.next = head;
			head = newOne;
			return;
		}
		for (int i = 0; i < pos; i++) {
			if (current.next == null) {
				System.out.println("Cannot insert after position " + pos + ", element not found");
				return;
			}
			current = current.next;
		}
		newOne.next = current.next;
		current.next = newOne;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		ListEntry current = head;
		if (current == null)
			return "[]";
		String res = "[";
		while (current != null && current.next != null) {
			res += current.value + ",";
			current = current.next;
		}
		res += current.value + "]";
		return res;
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println(sll);
		sll.append(5);
		System.out.println(sll);
		sll.append(7);
		System.out.println(sll);
		sll.insertAtHead(8);
		System.out.println(sll);
		sll.insertAfter(11, 5);
		System.out.println(sll);
		System.out.println(sll.getValue(1));
		sll.deleteValue(5);
		System.out.println(sll);
		sll.insertAfterPos(7, 29);
		System.out.println(sll);
		sll.insertAfterPos(2, 39);
		System.out.println(sll);
		sll.deleteValue(8);
		System.out.println(sll);
		sll.deleteValue(7);
		System.out.println(sll);
		sll.deleteValue(11);
		System.out.println(sll);
		
		// Questions:
		// 1. What happens if you try to get an object that doesn't exist (analogy: ArrayIndexOutOfBounds)
		// 2. What about "InsertAfter" a non-existing element?
		// 3. What if you have the same value twice, which operations behave differently from what you might expect? How do they behave?
		// --> Think about the "corner cases" in programs

		// Exercise: implement a doubly-linked list and test it
	}

}
