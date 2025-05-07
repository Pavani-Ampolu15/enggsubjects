
package com.Bank;
public class Bankuser implements Bankinterface
{
    
    long accountnumber;
    String pin;
    //deposit withdraw check admin or not give access to loan
    /*while((accountnumber.length())!= 0)
    {
        System.out.println("he is a valid user .we can give loan based on previous history");

    }
    */
     public Bankuser(long accountnumber,String pin)
    {
        this.accountnumber=accountnumber;
        this.pin=pin;
    }
    public void setAccountdetails(long acc_no,String Pin)
    {
        this.accountnumber=acc_no;
        this.pin=Pin;
    }
    public long getAccountnumber(){
        return accountnumber;
    }
    public String getPin()
    {
        return pin;
    }
    
    public void validateAccountnumber()
    {
        System.out.println("account number is valid");
    }
    public static void main(String args[])
    {
        Bankuser b_user=new Bankuser(129349485,"hjhur");
        System.out.println("ACCOUNT NO: "+ b_user.getAccountnumber());
        System.out.println("PIN : "+b_user.getPin());
    }
    
}