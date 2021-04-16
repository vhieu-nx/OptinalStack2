import java.util.Arrays;

public class IntStack {
    int[] stack;
    int top;

    public IntStack(int size) {
        top=0;
        stack = new int[size];
    }

    public void print() {
        for(int i=0; i<top; i++){
            System.out.println(stack[(top-1)-i]);
        }
    }

    boolean isEmpty() {
        //top==0 returns true or false
        return top==0;
    }
    void push(int num) {
        //++ happens after (does at the end of the line)
        stack[top++]=num;
    }


    int pop() {
        //--happens before and changes top only if there is something left to pop
        if(isEmpty()==false){
            return stack[--top];
        }
        return -1;
    }

    //Alia
    int depth(){
        //returns the depth, same as top
        int depth = top;
        return depth;
    }



    int peek(){
        return stack[top-1];
    }

    IntStack reverseStack(){
        //make a newStack thats empty
        IntStack newStack = new IntStack(stack.length);
        while (! isEmpty()){  //repeat until isEmpty()
            int p = pop();  //pop the top item and push that onto the newStack
            newStack.push(p);
        }
        return newStack; //return newStack
    }

    IntStack  sort() {
        //create two new empty stacks
        IntStack newStack1 = new IntStack(stack.length);
        IntStack newStack2 = new IntStack(stack.length);
        while (! isEmpty()){ //repeat until isEmpty()
            int p = peek(); 	//peek top number of original stack
            if(p<5){ //if its less than five, pop it and push it onto the first new stack
                newStack1.push(p);
            }
            else {  //if its greater than or equal to five, pop it and push it onto the second new stack
                newStack2.push(p);
            }
        }
        newStack1.push(newStack2.pop()); //pop the top number of the second new stack and push it onto the first new stack
        return newStack1;
    }

    int[] popAll() {
        //make array of size top, fill that with all items in stack, and then return the array
        int[] popAll = new int[top];
        for(int i = 0; !isEmpty(); i++)
        {
            popAll[i]= pop();
            System.out.println(popAll[i]);
        }
        return popAll;
    }

    int[] ascend() {
        int[] ascend = new int[top];
        ascend = popAll();

        Arrays.sort(ascend);
        return ascend;
    }
    int[] descend() {
        int[] descend = new int[top];
        descend = popAll();

        Arrays.sort(descend);
        reverse(descend);
        return descend;
    }

    //peak all the values in the stack
    int[] peekAll() {
        //fill new int array peakAll with length stack.length
        int[] peekAll = new int[stack.length];
        //fill peakAll with values of stack[], stopping before "top" of stack
        for(int i=0; i<top; i++) {
            peekAll[i] = stack[i];
        }
        //return created stack
        return peekAll;
    }

    //peek certain value in stack
    int peekAt(int position) {
        //returns zero if you peek value that is at or above top
        if(position>=top) return 0;
        //return the position
        return stack[position];

    }


    //taken from stackoverflow
    public static void reverse(int[] data) {
        for (int left = 0, right = data.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left]  = data[right];
            data[right] = temp;
        }
    }


}
