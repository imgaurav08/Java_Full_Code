package StackAndQueues;

public class MainStack  {

    public  void main(String[] args) throws CustomException {
      //  DynamicStack stack = new DynamicStack(7);
      ImplementQueueUsingStack stack = new ImplementQueueUsingStack();
        stack.push(23);
        stack.push(13);
        stack.push(13);
        stack.push(53);stack.push(93);stack.push(43);

       System.out.println(stack.pop());
       // System.out.println(stack.peek());

    }
}
