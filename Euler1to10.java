
public class Euler1to10 {
	
	public static void main(String [] args)
	{
		Euler1();
		Euler2();
		Euler3();
		Euler4();
		Euler5();
		Euler6();
		Euler7();
		Euler8();
		Euler9();
		Euler10();
	}
	
	//Find the sum of all the multiples of 3 or 5 below 1000
	static void Euler1()
	{
		int sum =0;
		for(int i = 1; i<1000; i++)
		{
			if(i%3 == 0) sum+=i;
			else if(i%5 == 0) sum+=i;
		}
		System.out.println(sum);
		
	}
	
	//find the sum of all even fibonacci numbers 1, 2, 3, 5... until 4million
	static void Euler2()
	{
		int count = 0, count1 = 1, count2 = 2, sum = 2;
		while(count <4000000)
		{
			if(count%2==0)sum+=count;
			count = count1 + count2;
			count1 = count2;
			count2 = count;
		}
		System.out.println(sum);
		
	}
	
	//Find the largest prime factor of 600851475143
	static void Euler3()
	{
		int check =0, big = 1;
		long a = 600851475143L;
		for(int i = 1; i<775146; i++)
		{

			if(a%i==0)
			{
				for (int j = 2; j<Math.sqrt(i); j++)
				{
					if(i%j==0)check++;
					
				}
				if(check ==0) big = i;
				check = 0;
				
			}
		}
		System.out.println(big);
		
		
	}
	//Find the largest Palindrome that is a product of two 3 digit numbers
	static void Euler4()
	{
		int big = 0, prod;
		for(int i = 900; i<1000; i++)
		{
			for(int j = 900; j<1000; j++)
			{
				prod = i*j;
				if(isPal(prod)&&prod>big) big = prod;
			}
		}
		System.out.println(big);
	}
	
	//Check if int c is a palindrome returning true if it is, false otherwise
	static boolean isPal(int c)
	{
		String a = c + "";
		char [] b = a.toCharArray();
		for(int i = 0; i<b.length/2; i++)
		{
			if(b[i] != b[b.length-i-1]) return false;
			
		}
		return true;
	}
	
	//Find the smallest number evenly divisible by all numbers from 1-20
	//Easier - find the product of all numbers from 1-20 that given some combination will give every number from 1-20
	static void Euler5()
	{
		System.out.println(1*2*3*2*5*7*3*11*13*2*2*17*19);
	}
	
	//Find the difference between the sum of sqaures and sums squared from 1-100
	static void Euler6()
	{
		int sum1=0, sum2=0;
		//formula
		sum1 = (int) Math.round(101*100.5*100/3);
		
		//formula
		sum2 = (101*100/2)*(101*100/2);
		
		System.out.println(sum2-sum1);
	}
	
	//Find the 10001th prime
	static void Euler7()
	{
		int big=2;
		int prime=1, check=0;
		
		while(prime<10001)
		{
			big++;
			for(int i = 2; i<=Math.sqrt(big); i++)
			{
				if(big%i==0)check=1;
			}
			if(check==0)prime++;
			check = 0;
		}
		System.out.println(big);
	}
	
	
	//Find the largest product of 13 conecutive numbers
	static void Euler8()
	{
		//type big to avoid overflow
		long big = 0L, temp = 1L;
		//String of numbers to search through
		String a = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		char [] b = a.toCharArray();
		
		for(int i = 0; i<b.length-13; i++)
		{
			for(int j = i; j<i+13; j++)
			{
				//48 to convert ascii to number
				temp *= ((int) b[j])-48;
				if(temp > big) big = temp;
			}
			temp = 1L;
		}
		System.out.println(big);
	}
	
	//Find the pythagorean triplet which adds to 1000
	static void Euler9()
	{
		int c;
		for(int a = 100; a<400; a++)
		{
			for(int b = 100; b<a; b++)
			{
				c = (int)Math.sqrt(a*a+b*b);
				if((Math.sqrt(a*a+b*b)==(int)Math.sqrt(a*a+b*b)))
				{
					if(a+b+c == 1000) System.out.println(a*b*c);
				}
			}
		}
	}
	
	//Find the sum of all the primes below two million
	static void Euler10()
	{
		int i= 3, check = 0;
		long sum = 2L;

		while(i<2000000)
		{
			for (int j = 2; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)check++;
				
			}
			if(check ==0) sum += i;
				
			check = 0;
			i+=2;	
		}
		
		System.out.println(sum);
		
	}
		
	

}
