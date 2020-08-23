import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main
{
	public static void main(int q ) {
	  int list[] = new int[4];
	  for(int i = 0 ; i<4;i++){
	   list[i] = q;
	   }

		//List<Integer> list = Arrays.asList(1,1,1,1);
		//Collections.sort(list);
		 for(int i = 0 ; i<4;i++)
        {
          for (int j = i+1 ; j <4;j++ )
            {
              if(list[i]==list[j])
                list[j]= list[j]+1;
            }
        }
for(int i = 0 ; i<4;i++){
	 System.out.println(list[i]);
	   }
		
	}
}