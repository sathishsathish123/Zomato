//SIVARANJINI
// unagry operator

logapriyan
class hari
{
	public static void main(String args[])
	{
		int a=20,b=23;
		System.out.println((a++)+(b--)+(a--)+(++a)+(--b)+(++a)+(a++)+(--a)+(++b)+(a++)+(--b)+(++a)+(++b)+(--a)+(++a));
	}
}

//output okay

//

//arithmatic operator

class arith
{
	public static void main (String args[])
	{
		int a=20,b=30;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);
	}
	
}

//output okay

//

//shift oprator

class shift
{
	public static void main (String args[])
	{
		System.out.println(40>>3);
		System.out.println(50<<3);
		System.out.println(100>>>3);
		
	}
	
}

// output okay

//

//logical oprator

class logic
{
	public static void main(String args[])
	{
		int a=20,b=40;
		System.out.println((a>b)&&(b<a));
		System.out.println((a<b)&&(b>a));
		System.out.println((a<b)&&(b<a));
		System.out.println((a>b)&&(b>a));
		System.out.println((a>b)||(b<a));
		System.out.println((a<b)||(b>a));
		System.out.println((a<b)||(b<a));
		System.out.println((a>b)||(b>a));
	}
}

// && one is false both are. || one is true both are 
//
//output okay

//bitwise oprator


class bit
{
	public static void main(String args[])
	{
		int a=20,b=40;
		System.out.println((a>b)&(b<a));
		System.out.println((a<b)&(b>a));
		System.out.println((a<b)&(b<a));
		System.out.println((a>b)&(b>a));
		System.out.println((a>b)|(b<a));
		System.out.println((a<b)|(b>a));
		System.out.println((a<b)|(b<a));
		System.out.println((a>b)|(b>a));
	}
}
// & one is false both are. | one is true both are 
//
//output okay

//ternary oprator


class tun
{
	public static void main(String args[])
	{
		int a=20,b=40;
		int c=(a>b)?a:b;
		int d=(a<b)?a:b;
		System.out.println(c);
		System.out.println(d);
	}
}

// its false means take b value, its true measns take a value
//
//out put okay
// 

//assignment oprator
class ass
{
	public static void main(String args[])
	{
		int a=20,b=15;
		System.out.println(a+=10);
		System.out.println(b-=7);
		System.out.println(a*=10);
		System.out.println(b/=5);
		System.out.println(a%=15);
		
	}
	
}

// output got it but values wrong

///

// relational oprator


class rel
{
	public static void main(String args[])
	{
		int a=20,b=15;
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		
	}
	
}

// need output explain 
