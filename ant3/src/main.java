public class main {
    public static void main(String[] args){

    }
    public static int sumOfNumbers(int number){
        if(number==1)
            return number;
        return number+sumOfNumbers(number-1);
    }
}
