class BinaryToString{

    static String convertString(String s){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i+=2){
            String sbstr = s.substring(i, i+2);
            switch(sbstr){
                case "00" : 
                    res.append("A");
                    break;
                case "01" :
                    res.append("B");
                    break;
                case "10" :
                    res.append("C");
                    break;
                case "11":
                    res.append("D");
                    break;
                default:
                    break;
            }
        }

        return res.toString();
    }

    public static void main(String[] args){
        String s = "000110111001";
        System.out.println(convertString(s));
    }
}