// Implement Queue using Stacks

class MyQueue {
	Stack pushStack = new Stack();  // Stack used for push operation 
	Stack popStack = new Stack();   // Stack used for pop and peek operations

	// Push element x to the back of queue.
	public void push(int x) {
		reverse(popStack, pushStack);
		pushStack.push(x);
	}

	// Removes the element from in front of queue.
	public int pop() {
		reverse(pushStack, popStack); 
		return (int) popStack.pop();
	}

	// Get the front element.
	public int peek() {
		reverse(pushStack, popStack);
		return (int) popStack.peek();
	}

    // Return whether the queue is empty.
	public boolean empty() {
		return pushStack.empty() && popStack.empty();
	}

	// Reverse the order of items stored from one stack into the other.
	private void reverse(Stack from, Stack into) {
		while (!from.empty()) {
			into.push(from.pop());
		}
	}
}