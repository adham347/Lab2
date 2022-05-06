public class EvenOdd {

    public String IsEvenOrOdd(int num){
        if(num%2==0)
           return "Even";
        else
            return "Odd";
    }
    public static void main(String[] args){
        EvenOdd test= new EvenOdd();
        System.out.println(test.IsEvenOrOdd(-2));
    }
}
