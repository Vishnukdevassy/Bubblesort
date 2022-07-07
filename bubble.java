import java.util.Scanner;
class bubble
{
	public static void main( String args[])
	{
		int i,j,n,temp=0;
		int a[]=new int[20];
		System.out.println("enter the limit of an array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("enter the array elements are:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("****Before Swapping****:");
		System.out.println("-------------------------------------:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}


		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("****After Swapping****:");
		System.out.println("-------------------------------------:");
		System.out.println("array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}
}