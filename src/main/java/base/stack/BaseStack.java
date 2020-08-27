package base.stack;


// push 할 때는 top 위치에 data를 넣고 top++
// pop 할 때는 top 위치에서 한칸 내려서 data 가져오고 top--

public class BaseStack {
    private int[] arr;
    private int top = -1;

    public BaseStack(int stackSize) {
        this.arr = new int[stackSize];
    }

    public void push(int i) {
        if(top < arr.length -1) {
            arr[++top] = i;
        }  else {
            System.out.println("stack is full");
        }
    }

    public int pop() {
        if(top > -1) {
            return arr[top--];
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

    public int peek() { //스택 가장 위에있는 데이터
        return arr[top];
    }


}
