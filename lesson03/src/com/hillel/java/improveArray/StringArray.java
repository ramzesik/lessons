package com.hillel.java.improveArray;


import com.hillel.java.oopBasics.OOP;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Ramzes on 17.04.2015.
 */
public class StringArray {

	private Object[] array = new Object[1];
	private int counter = 0;


	/**
	 * @param value
	 */
	public void add(Object value) {

		if (array.length == counter) {
			resize();
		}
		array[counter] = value;
		counter++;

	}

	public Object get(int index) {
		if (index >= counter) {
			throw new IndexOutOfBoundsException("index:" + index + ", size:" + counter);
		}
		return array[index];
	}

	public int size() {
		return counter;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof StringArray)) {
			return false;
		}
		// приводим obj  типу StringArray
		StringArray other = (StringArray) obj;

		if (this.size() != other.size()) {
			return false;
		}

		for (int i = 0; i < size(); i++) {
			if (!(this.get(i).equals(other.get(i)))) {
				return false;
			}
		}

		return true;
	}

	public String toString() {
		String result = "[";

		for (int i = 0; i < size(); i++) {
			result += get(i);
			if (i + 1 < size()) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}

	private void resize() {
		array = Arrays.copyOf(array, array.length * 2);

	}

}
