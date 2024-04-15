class Words{
    public static void example(String str){
        System.out.println(str);
        String [] ss = str.split(".");
        System.out.println(ss.length);
        for(int i = 0; i < ss.length; i++){
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args){
        String str = "i.like.this.game";
        example(str); 
    }
}