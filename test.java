import java.util.*; 


class test{
     Random rand = new Random(); 
  Scanner sc = new Scanner(System.in);
void main(){
    outer:
while (true){
List<Integer> l = new ArrayList<Integer>();
int no1= (int) rand.nextInt(25) + 1;
int no2= (int) rand.nextInt(25) + 1;
int ans = no1 + no2;
System.out.println(no1 +"+"+ no2);
l.add (ans * 7/10);
l.add(ans) ;
l.add(ans * 15/10);
l.add(Math.round(ans * 117/100));
Collections.shuffle(l);
Integer[] options = new Integer[l.size()];
        options = l.toArray(options);

for (int i = 0; i< 4 ; i++)
System.out.println( " option " + (i+1) + " " + options[i]);
 System.out.println( "choose correct option" );
while (true ){
 int choice = sc.nextInt();
 if (choice < options.length){
    if (options[choice -1 ] == ans)
 continue outer ;
 else 
 System.out.println("try again ");
}
else 
System.out.println("try again");
}
}

}


}

//}