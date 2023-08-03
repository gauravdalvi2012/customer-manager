package trial.gaurav.collection;

/**
 * A simple implementation of a singly linked list.
 *
 * @param <T> The type of elements stored in the linked list.
 */
public class LinkedList<T> {
	
	/**
     * Inner class representing a node in the linked list.
     *
     * @param <T> The type of data held by the node.
     */
	public class Node<T> {
		private T data;
		private Node<T> next;
		
		/**
         * Constructs a new node with the given value.
         *
         * @param value The data value to be stored in the node.
         */
		Node(T value) {
			data = value;
			next = null;
		}
		
		/**
         * Retrieves the data value stored in the node.
         *
         * @return The data value.
         */
		public T getData() {
			return data;
		}
	}
	
	private Node<T> head, first, last, current;
	private int size;

	/**
     * Constructs an empty linked list.
     */
	public LinkedList() {
		head = null;
		first = null;
		last = null;
		current = null;
		
		size = 0;
	}
	
	/**
     * Gets the first element of the linked list.
     *
     * @return The first element or null if the list is empty.
     */
	public T getFirst() {
		if (head == null) {
			return null;
		}
		
		return head.data;
	}
	
	/**
     * Gets the last element of the linked list.
     *
     * @return The last element or null if the list is empty.
     */
	public T getLast() {
		if (head == null) {
			return null;
		}
		
		Node<T> curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		
		return curr.data;
	}
	
	/**
     * Sets the current node to the first node in the list.
     */
	public void first() {
		current = first;
	}
	
	/**
     * Sets the current node to the last node in the list.
     */
	public void last() {
		current = last;
	}
	
	/**
     * Retrieves the data from the current node.
     *
     * @return The data value stored in the current node.
     */
	public T current() {
		return current.data;
	}
	
	/**
     * Inserts a new element at the end of the linked list.
     *
     * @param value The value to be inserted.
     */
	public void insert(T value) {
		Node<T> newNode = new Node<T>(value);
		
		// If List is empty
		if (head == null) {
			head = newNode;
			first = head;
			last = head;
			current = head;
			size++;
			return;
		}
		
		Node<T> curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		last = newNode;
		size++;
	}
	
	/**
     * Gets the size of the linked list.
     *
     * @return The number of elements in the linked list.
     */
	public int size() {
		return size;
	}
	
	/**
     * Checks if the linked list is empty.
     *
     * @return True if the linked list is empty, otherwise false.
     */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
     * Sets the current node to the next node in the list.
     */
	public void next() {
		if (current.next == null) {
			return;
		}
		current = current.next;
	}
	
	/**
     * Checks if there is a next node in the list.
     *
     * @return True if there is a next node, otherwise false.
     */
	public boolean hasNext() {
		if (!isEmpty() && current.next != null) {
			return true;
		}
		
		return false;
	}
	
	/**
     * Removes the first occurrence of the specified item from the linked list.
     *
     * @param item The item to be removed.
     */
	public void remove(T item) {
		// If List is empty
		if (head == null) {
			return;
		}
		
		// If item to be removed is the head
		if (head.data == item) {
			first = first.next;
			current = current.next;
			head = head.next;
			size--;
			return;
		}
		
		Node<T> prev= head;
		Node<T> curr = head.next;
		
		while (curr != null) {
			if (curr.data == item) {
				prev.next = curr.next;
				if (curr == last) {
					last = prev;
				}
				size--;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
	
	/**
     * Checks if the linked list contains an element that satisfies the given comparator.
     *
     * @param comparator The comparator to use for the check.
     * @return True if the comparator's condition is met, otherwise false.
     */
	public boolean contains(Comparator comparator) {
		if (head == null) {
			return false;
		}
		
		if (comparator.find()) {
			return true;
		}
		
		return false;
	}
}
