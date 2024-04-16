public class SimpleStack {

  private int[] items;
  private int top;

  public SimpleStack(int capacity) {
    items = new int[capacity];
    top = -1;
  }

  public void push(int item) {
    if (isFull()) {
      System.out.println("Stack overflow");
      return;
    }
    items[++top] = item;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack underflow");
      return -1; // or any default value
    }
    return items[top--];
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1; // or any default value
    }
    return items[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == items.length - 1;
  }


 public static void main(String[] args) {
    SimpleStack stack = new SimpleStack(5);

    // Test stack operations
    stack.push(10);
    stack.push(20);
    System.out.println("Top element: " + stack.peek());  
    System.out.println("Popped element: " + stack.pop());  
    System.out.println("Is stack empty? " + stack.isEmpty());  
  }
}
