package Inheritance;

public class SuperClass {
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

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
