import java.util.Scanner;
 class Date_Validity
{
 public static void main()
{
 int i,l,Day,Month,Year;
 String date;
 int m_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a date in DD/MM/YYYY format:");
 date=sc.nextLine();
 date=date.trim();
 l=date.length();
 Day=Integer.parseInt(date.substring(0,2));
 Month=Integer.parseInt(date.substring(3,5));
 if(Month>12)
 System.out.println("It is an invalid date.");
 Year=Integer.parseInt(date.substring(l-4,l));
 if(Year%100==0&&Year%400==0)
 m_days[1]=29;
 else if(Year%4==0)
 m_days[1]=29;
 for(i=1;i<=12;i++)
{
 if(Month==i)
{
 if(Day<=m_days[Month-1])
 System.out.println("It is a valid date.");
 else
 System.out.println("It is an invalid date.");
}
}
}
}