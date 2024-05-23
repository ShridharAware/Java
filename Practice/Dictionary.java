import java.util.HashMap;

class Dictionary{
    public static void main(String[] args){
        HashMap <Integer, String> temp = new HashMap<>();
        temp.put(1 , "Anish");
        temp.put(2, "Ashish");
        temp.put(3, "Akash");

        for(int i : temp.keySet()){
            System.out.println(i + " " +temp.get(i));
        }
    }
}