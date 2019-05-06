// The simplest Stack implementation by array
// with fixed size at the beginning
class StackA{
    private int maxSize;  // size of the stack
    private double[] stackArray;
    private int top;   // top of the stack

    public StackA(int s){     // constructor
        maxSize = s;   // set the size of the stack
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double j){    // push a object on top of the stack
        if (!isFull()){
            top++;
            stackArray[top] = j;
        }
        else{
            throw new Exception("Sorry, the stack is already full.");
        }
    }

    public double pop(){   // pop the top of the stack
        if (!isEmpty()){
            return stackArray[top--];
        }
        else{
            throw new Exception("Sorry, the stack is already empty.");
        }
    }

    public double peek(){  // peek the top of th stack
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1)
    }
}