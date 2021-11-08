package proj1;

public class sorting {
	public static void main(String args[]) {
		int i=0,a=0,temp=0;
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; 
		for(i=0;i<15;i++)
		{
			for(int j=i+1;j<15;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	for(i=0;i<15;i++) {
		System.out.println(array[i]);
	}

}
}
