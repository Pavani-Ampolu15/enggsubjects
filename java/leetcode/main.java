package emipay;
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of user to store:");
        int num=sc.nextInt();
        ArrayList<User> users=new ArrayList<>();
        
        System.out.println("enter the user details:");
        for(int i=0;i<num;i++)
        {
        User user=new User();
        user.setUserdetails(sc.nextInt(),sc.next());
        users.add(user);
        }
        
        System.out.println(users.toString());
        
        Admin admin=new Admin(123,"pavani");
        System.out.println(admin.toString());
        ArrayList<Loan> loans=new ArrayList<>();

        System.out.println("Enter the loandetails: (ID : AMOUNT: TIME : ROI:)");
        for(int i=0;i<num;i++)
        {
            Loan loan=new Loan();
            loan.setLoandetails(sc.nextInt(),sc.nextLong(),sc.nextInt(),sc.nextFloat(),"user");
            loans.add(loan);
        }
        System.out.println(loans.toString());
        //Loan loan=new Loan();
       // loan.setLoandetails(+sc.nextInt(),+sc.nextLong(),+sc.nextInt(),sc.nextFloat());
        //System.out.println(users +"\n"+loan);
        //System.out.println(loan.toString());
        /*for(ArrayList<User> use:users)
        System.out.println("if the user is admin:"+users.isAdmin(admin.name));*/

        //System.out.println()
        Loan adminloan=new Loan();
        System.out.print("Admin loan - Enter loan details (ID, Amount, Time, ROI): ");
        adminloan.setLoandetails(sc.nextInt(), sc.nextLong(), sc.nextInt(), sc.nextFloat(), "admin");
        loans.add(adminloan);


        
    }
}