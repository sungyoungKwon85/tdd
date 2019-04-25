package step1;

import java.util.Comparator;

public class List {

	public static final int INITIAL_STORE_SIZE = 10;
	public static final int STORE_SIZE_ICREMENT = 10;
	private Object[] elements = new Object[INITIAL_STORE_SIZE];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (readOnly) {
			return;
		}

		if (isElementSotreFull()) {
			increaseElementStore();
		}

		addElementAtEnd(element);
	}

	private void increaseElementStore() {
		Object[] newElements = new Object[elements.length + STORE_SIZE_ICREMENT];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}

		elements = newElements;
	}

	private boolean isElementSotreFull() {
		return size + 1 > elements.length;
	}

	private void addElementAtEnd(Object element) {
		elements[size] = element;
		size++;
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return elements[index];
	}
}