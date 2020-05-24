import java.util.*;
class Main{
static int power(int base,int exponent)
{
int k=1;
for(int i=1;i<=exponent;i++)
k=k*base;
return k;
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int b=s.nextInt();
int e=s.nextInt();
System.out.println(power(b,e));
}
}