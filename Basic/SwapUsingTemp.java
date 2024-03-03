class SwapUsingTemp{
    public static void main(String[] args){
        int a = 10, b = 20;
        System.out.println("Variable a before swapping : " + a +".");
        System.out.println("Variable b before swapping : " + b +".");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Variable a after swapping : " + a +".");
        System.out.println("Variable b after swapping : " + b +".");
    }
}