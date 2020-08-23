import java.util.*; 


class test{
     Random rand = new Random(); 
  Scanner sc = new Scanner(System.in);
  DivRes divide(int a , int b){
    
  while( a%b !=0  )
    {if (a%b == 0 )
    return new DivRes(a/b , a);
    else 
    {
        a++;
      continue;
    }
}
    return new DivRes(a/b , a);
}
  DivRes multiply (int a , int b){
    while (a >10 && b > 10)
    {
    if (a>10)
    a--;
    if ( b>10)
    b--;
    }
    return new DivRes(a,b);
    }
void main(){
    outer:
while (true){
List<Integer> l = new ArrayList<Integer>();
int no1= (int) rand.nextInt(25) + 1;
int no2= (int) rand.nextInt(25) + 1;
int type = (int) rand.nextInt(4)+1;
int p = no1;
int ans = 0;
no1 = no1>no2?no1:no2;
no2 = no1>no2?no2:p;
String function = "";
DivRes d = divide(no1,no2);
DivRes m = multiply(no1,no2);
switch (type){
case 1 : ans = no1+ no2; function = "+"; break ;
case 2 : ans = no1- no2; function = "-"; break ;
case 3 : ans = d.getFirst(); no1 = d.getSecond(); function = "/"; break;
case 4 : no1 = d.getFirst(); no2 = d.getSecond();ans = no1*no2; function = "X"; break;
}

System.out.println(no1 + function + no2 + "              " +type);
l.add (ans * 7/10);
l.add(ans);
l.add(ans * 15/10);
l.add(Math.round(ans * 117/100));
//Collections.shuffle(l);
Integer[] options = new Integer[l.size()];
        options = l.toArray(options);

for (int i = 0; i< 4 ; i++)
System.out.println( " option " + (i+1) + " " + options[i]);
 System.out.println( "choose correct option" );
while (true ){
 int choice = sc.nextInt();
 if (choice < options.length+1 ){
    if (options[choice -1 ] == ans)
 continue outer ;
 else 
 System.out.println("try again ");
}
else 
System.out.println("try again within options ");
}
}

}


}

//}

final class DivRes {
    private final int first;
    private final int second;

    public DivRes(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
