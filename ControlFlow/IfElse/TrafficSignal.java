// Traffic signal mimicry
class TrafficSignal{
    public static void main(String[] args){
        char signal = 'r';
        if(signal == 'r'){
            System.out.println("Stop");
        }else if(signal == 'g'){
            System.out.println("Go");
        }else{
            System.out.println("Watch");
        }
    }
}