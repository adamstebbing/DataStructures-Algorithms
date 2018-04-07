/**
 * Stack implementation.
 *
 * @author Adam Stebbing
 *
 */
public class Stack<T> implements StackInterface<T> {

	private LinkedListInterface<T> stack = new LinkedList<T>();

	@Override
	public void push(T t) {
		// TODO Auto-generated method stub
		stack.addToFront(t);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return stack.removeFromFront();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}



}
