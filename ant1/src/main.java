public class main {
    public static void main(String[] args){
        System.out.println(toBinary(171,""));
    }
    public static String toBinary(int number, String answer){
        if(number==0){
            return answer;
        }
        answer=number%2+answer;
        return toBinary(number/2,answer);
    }

}
