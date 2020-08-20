//********************************************************************
// Garrett McCue 	
//
// 8/19/20
//
// CPSC-501-Lab7Ex1
//**********************************************************************
public class Driver {

	public static void main(String[] args) {
		// create an instance of ArrayStack
		ArrayStack stackA = new ArrayStack();

		// push (1,7,3,4,9,2) into the stack
		stackA.push(1);
		stackA.push(7);
		stackA.push(3);
		stackA.push(4);
		stackA.push(9);
		stackA.push(2);

		// create an instance of LinkedStack
		LinkedStack stackL = new LinkedStack();

		// push (1,7,3,4,9,2) into the stack
		stackL.push(1);
		stackL.push(7);
		stackL.push(3);
		stackL.push(4);
		stackL.push(9);
		stackL.push(2);

		// pop off Array stack and display as they are removed
		System.out.println("ArrayStack:");
		while (stackA.size() > 0) {
			System.out.println(stackA.pop());
		}

		// pop off LinkedStack, display as removed
		System.out.println("\nLinkedStack: ");

		while (stackL.size() > 0) {
			System.out.println(stackL.pop());

		}

		// pushes (1,7,3,4,9,2) back into the stack since they were popped off
		stackL.push(1);
		stackL.push(7);
		stackL.push(3);
		stackL.push(4);
		stackL.push(9);
		stackL.push(2);

		// tests the added removeBottomHalf method from the LinkedStack class

		System.out.println("\nRemoving bottom half... ");
		System.out.println("Full stack: " + stackL);
		stackL.removeBottomHalf();
		System.out.println("Top Half: " + stackL);
		

	}
}
