class Queue{
    int front, rear;
    int queue[];
    Queue(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int num){
        if(front == -1){
            front = 0;
        }
        queue[++rear] = num;
    }

    int dequeue(){
        int element = queue[front];
        if(front >= rear){
            front = -1;
            rear = -1;
        }else{
            front++;
        }
        return element;
    }

    void printQueue(){
        for(int i = front; i <= rear; i++){
            System.out.print(queue[i]+ ", ");
        }
    }
    public static void main(String[] args){
        Queue ex = new Queue(10);

        ex.enqueue(1);
        ex.enqueue(10);
        ex.enqueue(12);
        ex.enqueue(122);
        ex.enqueue(11);
        ex.enqueue(16);

        ex.printQueue();
        
        System.out.println();

        System.out.println("Pop : "+ex.dequeue());

         ex.printQueue();        

    }
}