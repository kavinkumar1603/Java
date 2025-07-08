import java.util.*;

class day2 {
    public static void main(String[] args) {
        Scanner kavin = new Scanner(System.in);

        System.out.print("Enter age :");
        int age = kavin.nextInt();

        kavin.nextLine();

        System.out.print("Enter a name :");
        String name = kavin.nextLine();

        System.out.print("Enter percentage :");
        Float add = kavin.nextFloat();

        System.out.print("Enter true / false :");
        boolean val = kavin.nextBoolean();

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My Percentage is " + add);
        System.out.print("The boolean value is :" + val);

        kavin.close(); 
        // Scanner kavin=new Scanner(System.in);
        // int a=kavin.nextInt();
        // int b=kavin.nextInt();
        // int c=kavin.nextInt();
        // int d=a*b*c;
        // int e=a+b+c;
        // System.out.println("The multiplied value : "+d);
        // System.out.print("The added value "+e);
        // System.out.print("\nThe Value divide (d/e)");
        // System.out.print(d/e);

        // Scanner kavin=new Scanner(System.in);
        // System.out.print("Enter Your Name: ");
        // String main=kavin.nextLine();

        // System.out.print("\nEnter the Score :");
        // double score=kavin.nextDouble();
        // kavin.nextLine();

        // System.out.print("\nEnter the Dept name :");
        // String dept=kavin.nextLine();

        // double Cal=(score/100.0)*10;

        // System.out.print("\nThe Converted Score is :");
        // System.out.printf("\nThe Score out of 10 :%.2f\n",Cal);
        // System.out.print("The Score out of 10 is :"+score/10);

    }
}