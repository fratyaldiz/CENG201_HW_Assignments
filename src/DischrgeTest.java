public class DischrgeTest {
    public static void main(String[] args) {
        DischargeStack stack = new DischargeStack();

        //Add 5 discharge records.
        for(int i =1;i<=5;i++) {
            stack.push(new DischargeRecord(i));

        }

        //Process (pop) 2 of them.
        stack.pop();
        stack.pop();

        //Print the remaining stack.
        stack.printStack();
    }
}
