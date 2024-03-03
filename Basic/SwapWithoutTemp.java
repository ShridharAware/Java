class SwapWithoutTemp{
    public static void main(String[] args){
        int a = 10, b = 20;
        System.out.println("Variable a before swapping : " + a +".");
        System.out.println("Variable b before swapping : " + b +".");
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Variable a before swapping : " + a +".");
        System.out.println("Variable b before swapping : " + b +".");
    }
}