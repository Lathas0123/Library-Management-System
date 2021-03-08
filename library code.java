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