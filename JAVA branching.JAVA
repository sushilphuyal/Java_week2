package week2;

public class Branching
{
    public static void main(String[] args){

        int option; //varriable declaration
        int suboption; //nested varriable declared

        option = 1;                 //varriale defination
        suboption=1;               //varriable given to nested for mobile OS to switch between Andriod and IOS
        if(option == 1) {            //declaration of choices

            System.out.println("windows");      //option 1 will print windows
        }
        else if(option == 2){          //declaration of choices

            System.out.println("MacOS"); //option 1 will print MacOS

        }
        else if(option == 3){                //declaration of choices

            System.out.println("Mobile OS"); //option 1 will print Mobile OS
            
            if(suboption == 1){     //nested started
            
                System.out.println("Andriod");  //first option of nested  
            }
            
            else if (suboption == 2){  //second option of suboption
            
                System.out.println("IOS"); //IOS assigened as suboption
            
            }
            else{
            
                    System.out.println("Invalid suboption"); //execption declaration for suboption
            }
        }
            else if(option == 4){          //declaration of choices

            System.out.println("Linux/Unix"); //option 1 will print Linux/Unix

        } 
        else{
            System.out.println("Invalid Option");    //when no conditions matches 

        }
        }
}
