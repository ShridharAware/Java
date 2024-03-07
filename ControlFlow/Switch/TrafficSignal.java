// Traffic signal using Switch statement
class TrafficSignal{
    public static void main(String[] args){
        char signal = 'r';
        switch(signal){
            case 'r': System.out.println("Stop");
            break;
            case 'g': System.out.println("Go");
            break;
            case 'b': System.out.println("Watch");
            break;
            default: System.out.println("Wrong signal");
            break;
        }
    }
}