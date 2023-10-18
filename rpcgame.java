import java.util.Random;
import java.util.Scanner;

public class Main{
    public static String computerChoic(Random random)
    {
        int num;
        num=random.nextInt(3)+1;
        String cc=""; //Computer Choice 

        //After getting the computer choice 
        if(num==1){
            cc="Rock";
        }
        else if(num==2){
            cc="Paper";
        }
        else{
            cc="Scissor";
        }
        System.out.println("The Choice is being made");
        return cc;

    }
    //Displaying the Options Avaliable to the User
    public static void display(){
        System.out.println("Choose from below /n");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissor");
    }
    //Taking the user input
    public static String userInput(Scanner scanner)
    {
        String user="";
        System.out.println("Enter Your Choice");
        user=scanner.nextLine();
        return user;
    }
    //Deciding the Winner Winner Chicken Dinner
    public static String winner(String cc,String user)
    {
        String win="No Winner";
        String msg="TIE";
        String result="";

        String rockwin="Rock Broke the Scissors";
        String Sciwon="Scissors Cut Paper";
        String paperwin="Paper Hold Rock";

        //Using the if else to decide who win

        if(cc.equals("Rock") && user.equals("Scissor"))
        {
            win="Computer";
            msg=rockwin;
        }
        
        else if(cc.equals("Scissor") && user.equals("Rock"))
        {
                win="user";
                msg=rockwin;
        }
        if(cc.equals("Paper") && user.equals("Rock")){
            win="Computer";
            msg=paperwin;

        }
        else if(cc.equals("Rock")&& user.equals("Paper"))
        {
            win="user";
            msg=paperwin;
        }
        if(cc.equals("Paper")&& user.equals("Scissor"))
        {
            win="Computer";
            msg=paperwin;
        }
        else if(cc.equals("Scissor")&& user.equals("Paper"))
        {
            win="User";
            msg=paperwin;
        }
        result=win+"won (" +msg+")";
        return result;


    }
    public static void main(String [] args)
    {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        String cc;
        String user;
        String win;

        display();
        cc=computerChoic(random);
        user=userInput(scanner);
        win=winner(cc,user);
        System.out.println( "\nYou choose : " + user + "\nComputer choose : " +cc );
        System.out.println(win);
    } 
}
