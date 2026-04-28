public class Variables {
    public static void main(String[] args) {

        // Variable - a reusable container for a value
        //            variable behaves as if it was a value it contains

        // Primitive = simple value stores directly to memory (stack)
        // Reference = memory address (Stack) that points to the (heap)

        //  Primitive  vs  Reference
        //  ---------      ---------
        //  int            String
        //  double         array
        //  char           object
        //  boolean


        // 2 step to create a variable
        //----------------------------
        // 1. declaration
        // 2. assignment

        // let see an example.

           int goal;
           int age = 21;

        // Primitive Data type
        // -------------------

           // A number which contain a whole value

           int quantity = 2;
           int year = 2026;


           // A number that contain a decimal portion

           double percentage = 99.9;
           double price = 23.43;
           double gpa = 7.86;
           double temperature = -12.5;


           // A value that only consider single character from a word

           char grade = 'A';
           char symbol = '@';
           char currency = '$';

           //Purpose to check true or false

           boolean isStudent = true;
           boolean forSale = true;
           boolean isOnline = true;

        // Reference Data type
        // -------------------

           //string - series of char

           String name = "Pragadeeswaran G";
           String food = "dosa";
           String email ="fake123@gmial.com";
           String car = "TATA Punch car";
           String color ="Blue";

           System.out.println("Hello " + name + " your were booked " + color + " colour " + car + " Thank you for purchasing this car from us");

           if (forSale) {
                  System.out.println("There is a " + car + " for sale");
           } else {
                  System.out.print("There is a " + car + " is not for sale");
           }

           }

    }

