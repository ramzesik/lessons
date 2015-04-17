package com.hillel.java.improveArray;

/**
 * Created by Ramzes on 17.04.2015.
 */
public class Cell {
	private String value;

	private Cell next;


	public Cell(String value) {
		this.value = value;
	}

	public void setNext(Cell next) {
		this.next = next;
	}

	public Cell getNext() {
		return next;
	}

	public String getValue() {
		return value;
	}
}
