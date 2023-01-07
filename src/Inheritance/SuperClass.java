package Inheritance;

public class SuperClass {
    int number1,number2,result;
    SuperClass(int a,int b){
        this.number1 = a;
        this.number2 = b;
    }
    public void sumValue(){
        result = number1+number2;
        System.out.println("sumValue Result:"+result);
    }
    public void subtractionValue(){
        result = number1-number2;
        System.out.println("subtractionValue Result:"+result);
    }
}
