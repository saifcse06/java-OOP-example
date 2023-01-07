package Inheritance;

public class SubClass extends SuperClass{
    int number1,number2,result;
    SubClass(int a,int b){
        super(a, b);
        this.number1 = a;
        this.number2 = b;
    }

    public void multiplicationValue(){
        result = number1*number2;
        System.out.println("multiplyValue Result:"+result);
    }
    public void divValue(){
        result = number1/number2;
        System.out.println("divValue Result:"+result);
    }
}
