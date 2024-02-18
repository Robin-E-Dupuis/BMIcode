//author robin dupuis
public class BMI {
 
    public String name;
    public int age;
    public double weight;
    public double feet;
    public double inches;
    public BMI() {
    }

    @SuppressWarnings("empty-statement")
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        double feetToInches = feet*12+inches;
        double realFeet = Math.pow(feetToInches,2);
        double bmi = (weight/(realFeet))*703;
        System.out.println("Hello "+name+" your bmi is "+bmi + " and you are "+age+" years old!");
        if(bmi<18.5){
            System.out.println("You are underweight");
        }
        else if(bmi<25 && bmi>18.5){
             System.out.println("You are normal");
        }
        else if(bmi>25 && bmi<30){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are Obese");
        }
    }
    

    public static void main(String[] args) {
        BMI myBmi = new BMI("robin",19,165,6,1);
        BMI syllas = new BMI("syllas",21,175,6,0);
        BMI walter = new BMI("walter",230,10,6,2);
        BMI michellin = new BMI("michellin",30,300,6,0);
        BMI michellinKid = new BMI("michellinds kid",14,200,6,0);
        
    }
}
