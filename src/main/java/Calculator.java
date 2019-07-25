import org.springframework.boot.origin.SystemEnvironmentOrigin;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int substractAFromB(){
        return a-b;
    }
    public int addAToB(){
        return a+b;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator (5,6);
        Integer shazam = calculator.addAToB();
        System.out.println(shazam);
    }
}

