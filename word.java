import java.util.*;

class word    
{
    public static void main ()
    { 
        List<Character> prob = new ArrayList<Character>();
        int i;
        Scanner sc = new Scanner (System.in);
        Random r = new Random();
        System.out.print("Enter a Word : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        char ans[] = new char[l];

        int d= 0;
        for(i = 1; i<l+1;i++)
        {   char c = s.charAt(i-1);
            prob.add(c);
            d++;
        }


        int a = 9 - d;

        while(a>0)
        {
            int q = r.nextInt(26)+65;
            char c = (char) q;

            if ( prob.contains(c))
                continue ;
            if (a>0)
                prob.add(c);
            a--;
        }
        Collections.shuffle(prob);

        for(i = 0; i<9;i++)
        {
            System.out.println("option " + (i+1) + " = " +prob.get(i));
        }
        int p = 0;
     
        while(p<l)
        {
            int v = sc.nextInt(); 
            if(prob.get(v-1) != s.charAt(p))
            { System.out.println("try Again!");}
            else{
                System.out.println("good job");  
                p++;
            }          
            
        }
        System.out.println("Well done");

    }

}
