public class Switch {
    public static void main(String[] args) {
                                                      /* syntax of switch statement
                                                          switch(expression){
                                                              case x:
                                                            // code of block
                                                               break;
                                                                case y:
                                                             // code of block
                                                               break;
                                                             default
                                                         // code of block
                                                             }
                                                           */

        int day = 3;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:  // specifies some code to run if there is no case match
                System.out.println("there is no day");
        }

                                                           // loops

                                                // Syntax of while loop

                                            /* while (condition) {
                                                      // code block to be executed
                                                              }*/

        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

                                                      // do while loop
                                                         /* syntax of do while loop
                                                                   do {
                                                                          // code of block to be executed
                                                                    } while (condition);*/

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <8);
//
                      // Exercise

        // print y as long as y is less than 6
        System.out.println(" exercise1");
        int y = 1;
        while (y < 6) {
            System.out.println(y);
         y++;}

            System.out.println(" exercise2");
            // use the do while loop to print r as long as r is less than 6
            int r = 1;
            do {
                System.out.println(r);
                r++;
            }while (r < 6);

                                                               // for loop

                                                           /* syntax of for loop
                                                   for (initialization; condition; increment or decrement){
                                                         // code of block to be executed } */

        for (int number = 0; number < 5; number++){
            System.out.println(number);
        }

        for (int num = 0; num <= 10; num= num+2){
            System.out.println(num);
        }

                               //  nested loop : is a loop placed inside another loop

        // outer loop
        for (int integer =1; integer <=2; integer++ ){
            System.out.println("outer: " +integer);
            for (int in =1; in <=3; in++ ){
                System.out.println(" inner: " +in);
            }
        }

           // exercise
        // use for loop to print "yes" 5 times
        for (int prac = 0; prac <5; prac++){
            System.out.println("yes");
        }

                                   // for each loop: which is used exclusively to loop through element in an array
                        /* syntax of for each loop:
                        for (type variableName : arrayName){
                          // code of to be executed}
                         */
        String[]  cars = {"volve", "BMW", "Ford", "Mazda"};
        for (String yes: cars){
            System.out.println(yes);
        }

        String[]  names = { "Ali ", " Ahmed ", "  Mohamed "};
        for (String name : names){
            System.out.println(name);
        }

        String[] schools = {"M.harbi ", " I.shafie ", "H.hamar"};
        for (String school : schools){
            System.out.println("they`re my favorite school " +school);
        }







        }
    }

