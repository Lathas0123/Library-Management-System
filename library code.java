package library;
import static java.lang.System.exit;
import java.util.Scanner;
public class Library
{

    String[] username=new String[20];
    String[] password=new String[20];
    
    String[] books=new String[20];
    
    String X[] =new String[10];
    String x;
    String X1[] =new String[10];
    String x1;
     
     String[] issuebooks=new String[20];
     String[] Idate=new String[20];
     String[] Rdate=new String[20];
    
    int P[] =new int[10];
    int p;
    int no,u=0,u1=0;
    int code[] ={1,2,3,4,5,6,7,8};
     
     int n,g,q=0,k;
      int i=0,w,l;
      String issue,ret;
     String name ,a,b;
    boolean t;
    Scanner d=new Scanner(System.in);
    Library()
    {
         books[0]="1.Times of India";
       books[1]="2.India 2020";
       books[2]="3.Wings of Fire";
       books[3]="4.Designing books";
       books[4]="5.programming Developement books";
       books[5]="6.python";
       books[6]="7.c";
       books[7]="8.c++";
    }
    void names()
    {
        username[0]="latha";
        password[0]="latha123";
        username[1]="suma";
        password[1]="suma123";
        username[2]="appi";
        password[2]="appi123";
        username[4]="rishik";
        password[4]="rishik143";
        System.out.println("******WELCOME TO LOGIN PAGE******");
      System.out.println("Enter your name");
      a=d.nextLine();
      System.out.println("Enter your password");
      b=d.nextLine();
      int j=5;
      j++;
      int flag=0;
      for(int g=0;g<j;g++)
      {
      if(a.equals(username[g])&&b.equals(password[g]))
       {
       System.out.println("welcome");
       flag=1;
        }
      }
        if(flag==0)
          {
              System.out.println("invalid username");
               exit(0);
            }
     }
     void add()
     {
         System.out.println("Enter Sponser Book Details");
         System.out.println("Enter how many books u want to sponser");
         n=d.nextInt();
      while(i<n)
       { 
        System.out.println("Enter Book Name");
         x=d.next();
         d.nextLine();
         System.out.println("Enter code");
         int xy=d.nextInt();
         System.out.println("Enter Author Name");
         x1=d.next();
         System.out.println("Enter Book Prize");
         p=d.nextInt();
       
          X[i]=x;
          code[i]=xy;
       X1[i]=x1;
       P[i]=p;
       i++;
       }
       int w=0;
       while(w<i)
       {
         System.out.println(X[w]+"\t"+code[w]+" "+X1[w]+"\t"+P[w]);
         w++;
     }
     }
     void Show()
     {
         System.out.println("**********Available Books ***************");
        int z=0;
        while(books[z]!=null)
        {
            System.out.println(books[z]);
             z++;
        } 
        for(k=0;k<n;k++)
        {
            System.out.println(X[k]);   
        }   
     }
     void issue()
      {
          
          Scanner d=new Scanner(System.in); 
          System.out.println("Enter how many books you want to take");
          no=d.nextInt();
          while(u<no)
          {
              System.out.println("Enter your Book ");
              issue=d.next();
              System.out.println("Enter issue date:");
              String date=d.next();
              //d.next();
               System.out.println("Enter return date:");
              String date1=d.next();
              issuebooks[u]=issue;
              Idate[u]=date;
              Rdate[u]=date1;
              u++;
                
          }
         int bag=0;
          for(l=0;l<8;l++)
          {
         if(issue.equals(books[l]))
         {
             System.out.println("succesfully recieved");
              bag=1;
              books[l]="null";
              break;
         }
         }
         if(bag==0)
          {
              System.out.println("invalid book searching");
             
            }
         for(w=0;w<u;w++)
         {
             System.out.println(issuebooks[w]+" "+Idate[w]+" "+Rdate[w]);
         }
    
          }
          void returns()
      {
          int num;
          Scanner d1=new Scanner(System.in); 
          System.out.println("Enter how many books you want to return");
          num=d1.nextInt();
           while(u1<num)
          {
              System.out.println("Enter your Book ");
              ret=d.next();
              
              System.out.println("Enter code:");
              int date2=d.nextInt();
              System.out.println("Enter return date");
               String Rd=d.next();
              u1++;
              for(int del=0;del<num;del++)
              {
              if(ret.equals(issuebooks[del])&&Rd.equals(Rdate[del]))
              {
                  System.out.println("Succesfully Received");
                  books[date2]=ret;
                  
              }
              }
          }
     
      }
      int choice,c;
      public static void main(String[] args){
        Library u=new Library();
               u.names();
                int c;
        do{ 
            
             System.out.println("*************WELCOME TO LIBRARY MANAGEMENT SYSTEM************");
             System.out.println("1.ADD BOOKS");
             System.out.println("2.SHOW BOOKS");
             System.out.println("3.ISSUE BOOKS");
             System.out.println("4.RETURN BOOKS");
             System.out.println("5.EXIT");
             Scanner d=new Scanner(System.in);
             System.out.println("Enter your choice");
              int choice =d.nextInt();
             switch(choice)
             {
                 case 1: u.add();
                     break;
                 case 2: u.Show();
                     break;
                 case 3: u.issue();
                     break;
                 case 4:u.returns();
                     break;
                 case 5:
                  break;
            default:System.out.println("Invalid input");        
        }
        System.out.println("Do you want to continue 1 for yes 0 for no (1/0)");
         Scanner s=new Scanner(System.in);
          c=s.nextInt();
        
         }while(c==1);
    }
    }
    