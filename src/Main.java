public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

                                               // variables

        int num = 10;
        System.out.println(num);

        double fraction = 342.5643;
        System.out.println(fraction);

        byte number = 127;
        System.out.println(number);

        char letter = 'A';
        System.out.println(letter);

        boolean statement = true;
        System.out.println(statement);

        short shortNumber = 1234;
        System.out.println(shortNumber);

        long longNumber = 1234567634567l;
        System.out.println(longNumber);

        float point = 123.54f;
        System.out.println(point);

//        // reference

        String name = "Ali Ahmed";
        System.out.println(name);

        // math in java

        System.out.println(Math.max(5,10)); // output 10   // the Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.min(5,10)); // output 5  // the Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.sqrt(64)); // output 8.0  // method returns the square root of x
        System.out.println(Math.abs(-4.7)); // output 4.7 // method returns the absolute (positive) value of x
        System.out.println(Math.random());   // returns a random number b/w 0.0 (inclusive), and 1.0 (exclusive)
        int randomNumber = (int) (Math.random()*101);  // if you want only a random number b/w 0 and 100, you can use this method <<--
        System.out.println(randomNumber);

                                      // boolean expression

                             // comparison operator  use the greater than (>) and less than (<)

        int x = 10;
        int y = 9;
        System.out.println(x>y); // returns true, because 10 is higher than 9

        int z = 10;
        System.out.println(z==11); //  equal to (==)
//          // returns false because z is not equal to 11

        // real life examples

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);  // true because myAge is greater than votingAge

                                             //  conditions    ( else statement )

                                            /* SYNTAX:
                                                  if(condition) {
                                              // bolck of code to be excuted if the condition is true
                                                  } else {
                                                // block of code to be executed if the condition is false} */

        // output "old enough to vote!" if myAge is greater than or equal to 18. otherwise output "Not old enough to vote"

        int myage = 25;
        int votingage = 18;

        if (myage>=votingage){
            System.out.println("old enough to vote!");
        }else {
            System.out.println("Not old enough to vote");
        }

         int time = 20;

        if (time < 18){
            System.out.println("Good day");   // 20 is greater than 18, so the condition is false. because of this we move to the else condition
        }else {
            System.out.println("Good evening");
        }   // print to the screen "Good evening"


                                                 // the if statement
                                                 /* Syntax of if statement

                                          if(condition){
                                      // block of code to excute if the condition is true}
//                                                */
        if (20>18){
            System.out.println("20 is greater than 18");
        }
        int j = 20;
        int i = 18;
        if (j > i){
            System.out.println("this statement is true");
        }
                              // else if statement is used to specify a new condition if the first condition is false
                                        /*  Syntax of else if

                    if (condition1){
                     // block of code to be executed if the condition1  is true
                     } else if ( condition2 ){
                      // block of code to be executed if the condition1 is false and condition2 is true
                      } else{
                       // block of code to be executed if the condition1 and condition2 are false}
                     */

        int month = 22;

        if (month < 10){
            System.out.println("Good morning");
        } else if (month <18) {
            System.out.println("Good day");
        }else {
            System.out.println("Good evening");
        }

             /* Short Hand if else  is known as ternary operator b/c it consist of three operands, it can be used to replace multiple line code with one line code,
        and is most often used to replace simple if else statement */

        // syntax :   variable = (condition) ? expression true : expression false;


        int money = 20;
        String result = (money < 18)? "Good day" : "Good evening";
        System.out.println(result);

    }
}