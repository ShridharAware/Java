class Brackets{
    int top;
    int size;
    int stack[];
    Brackets(int num){
        stack = new int[num];
        top = -1;
        size = num;
    }

    void push(int num){
        stack[++top] = num;
    }

    int pop(){
        return stack[top--];
    }

    int peek(){
        return stack[top];
    }

    void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.print(stack[i] + " ,");
        }
    }
    public static void main(String[] args){
        Brackets ex = new Brackets(10);

        ex.push(10);
        ex.push(11);
        ex.push(15);
        ex.push(4);

        System.out.println("Peek : " + ex.peek());
        ex.printStack();

        System.out.println();

        System.out.println("Pop : " + ex.pop());
        ex.printStack();

        System.out.println();

        ex.push(40);
        ex.printStack();
    }
}