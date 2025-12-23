/*
package StackAndQueues;

public class DynamicStack {

    protected  int [] data;
    int ptr=-1;

    public DynamicStack() {
    }

    public DynamicStack(int size) {
        this.data=new int[size];
    }

    public boolean push(int item){

        if (isFull()){
            int [] temp = new int[data.length *2];
            for (int i=0 ; i <data.length;i++){
                temp[i]= data[i];
            }
            data=temp;
        }

         ptr++;
        data[ptr]= item;
        return true;
    }

    public  int pop() throws  CustomException{
        if (isEmpty()){
       throw  new CustomException("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws  CustomException {
        if (isEmpty()){
            throw  new CustomException("Cannot peek because Stack is Empty");
        }

        return data[ptr];
    }

    public boolean isFull(){
        throw new DemoException("Stack is ");
        return  ptr== data.length-1;
    }

    public boolean isEmpty(){
        return  ptr==-1;
    }

}
*/
