import java.util.Scanner;
import java.util.Random;
/**
 *  EMAIL APPLICATION
 * A email administration application for creating the accounts of new hires
 * 
 *
 * @author (ANAS ANSARI )
 * @version (created on-17/10/2020)
 */
public class email
{
   private String FirstName;
   private String LastName;
   private String password;
   private String department;
   private String email;
   private int mailboxcapacity=500;
   private String alternateEmail;
   private String suffix=".co.in";
    
   //constructor to recieve first and last name
   public email() {
       Scanner input = new Scanner(System.in);
       FirstName= input.nextLine();
       LastName = input.nextLine();
       
     //  this.FirstName = FirstName;
     //  this.LastName= LastName;
       System.out.println("EMAIL CREATED:--" + FirstName + " " + LastName);
       
       //call method to ask for department
       
       this.department = setDepartment();
       System.out.println("Department:--" + this.department);
       
       //call a method for password
       this.password = randomPassword(8);
       System.out.println("Your password " + this.password);
       
       //combine all element to generate email
       email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+ "@" + department + suffix;
       System.out.println("your email:" + email);
       
       
    }
    
       
   //ask for the department
   
   private String setDepartment()
   {
       int choice;
       System.out.println("Department codes\n1.Sales Dept\n2. Devolopment Dept.\n3.Accounting Dept.\n4.NOTA\nEnter the Department code");
       Scanner in = new Scanner(System.in);
       choice = in.nextInt();
       
       if(choice==1)
        {
            return "sales";
        } 
        else if(choice==2) 
        {
            return "devolopment";
        }
        else if(choice==3)
         {
             return "accounting";
           }
           else
             {
                return "";
             }  
     }
   //generate a random password
   
   private String randomPassword(int length)
   {
      String largeC ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String smallC ="abcdefghijklmnopqrstuvwxyz";
      String symbol ="!@#$%^&*";
      String number ="0123456789";
      String pass =largeC+smallC+symbol+number;
      Random rnd = new Random();
      char[] password = new char[length];
      for(int i=0;i<length;i++)
      {
          password[i]=pass.charAt(rnd.nextInt(pass.length()));
       }
        return new String(password);
    }
    //set the mailbox capacity
    public void setmailboxcapacity(int capacity)
    {
         this.mailboxcapacity = capacity;
    }   
    
    //set the alterrnate email
    public void setAlternateEmail(String email)
    {
        this.alternateEmail=email;
    }   
    
   //change password
     public String changePassword(String password)
     {
         return this.password=password;
      }   
      
      public int getmailboxcapacity()
      {
          return mailboxcapacity;
        }
        
        public String getAlternateEmail()
        {
            return alternateEmail;
        }
        
        public String getPassword()
        {
            return password;
        }  
       
        public String displayinfo()
        {
            return "DISPLAY NAME:" + FirstName + " " + LastName +"\n" +
                   "COMPANY EMAIL:" + email +"\n" +
                   "MAILBOX CAPACITY:" + mailboxcapacity +" " + "mail";
                }
}

    
