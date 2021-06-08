
package javaapplication15;


class Fraction {
   
    
    private int numerator;
    private int denominator;
    
    public void setnumerator(int numerator){
    this.numerator = numerator;
    }
    public int getnumerator(){
     return numerator;
    }
    
    public void setdenominator(int denominator){
    this.denominator = denominator;
    }
    public int getdenominator(){
     return denominator;
    }
    
    public void Fraction(int numerator, int denominator){
    }
    public void Fraction(){    
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
    public void add( Fraction fraction){
    System.out.println(((this.numerator*fraction.denominator)+ (this.denominator*fraction.numerator))+"/"+(this.denominator*fraction.denominator));    
    }
    public void sub( Fraction fraction){
    System.out.println(((this.numerator*fraction.denominator)-(this.denominator*fraction.numerator))+"/"+(this.denominator*fraction.denominator));    
    }
    public void multi( Fraction fraction){
    System.out.println((this.numerator*fraction.numerator)+"/"+(this.denominator*fraction.denominator));    
    }
    public void div( Fraction fraction){
    System.out.println((this.numerator*fraction.denominator)+"/"+(this.denominator*fraction.numerator));    
    }
}

