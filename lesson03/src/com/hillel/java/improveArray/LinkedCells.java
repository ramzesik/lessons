package com.hillel.java.improveArray;

/**
 * Created by Ramzes on 17.04.2015.
 * связанный список
 */
public class LinkedCells {
	private Cell head;
	private int counter;
	private Cell tail;


	public void add(String value) {
		//  only first element
		if (head == null) {
			head = new Cell(value);
		}
		// first element is tail
		if (tail == null) {
			tail = head;
		} else {
			tail.setNext(new Cell(value));
		}

		counter++;
	}

	public  String toString() {
		String result = "[";

		Cell current = head;

		while (current!=null) {
			result += current.getValue();
			if (current.getNext()!=null) {
				result +=", ";
			}
			current = current.getNext();
		}
		result +="]";
		return result;

	}
}
