import java.util.Scanner;

public class Smith_p1 {
public static int []Encrypt(int encryptNum[])
{
int num1=encryptNum.length;
int num2[]=new int[encryptNum.length];
for(int i=0; i<encryptNum.length; i++)
{
num2[i]=encryptNum[i];
}
for(int i=0; i<num1; i++)
{
num2[i]=(num2[i]+7)%10;
}
//reversing 1st with 3rd digit
int temp;
temp=num2[0];
num2[0]=num2[2];
num2[2]=temp;
//reversing 2nd with 4th digit
temp=num2[1];
num2[1]=num2[3];
num2[3]=temp;
return num2;
}
public static int []Decrypt(int num1)
{
	int num1L[]= new int [4];
	
	for(int i=0; i<4; i++)
	{
	num1L[3-i]=num1%10;
	num1=num1/10;
	}
int num2[]=new int[num1L.length];
for(int i=0; i<num1L.length; i++)
{
num2[i]=num1L[i];
}
int num3=num1L.length;
for(int i=0; i<num3; i++)
{
if((num2[i]-7)<=0)
num2[i]=num2[i]+10;
}
for(int i=0; i<4; i++)
{
num2[i]=(num2[i]-7)%10;
}
//swapping the first and third digit
int temp;
temp=num2[0];
num2[0]=num2[2];
num2[2]=temp;
//swapping the second and fourth digit
temp=num2[1];
num2[1]=num2[3];
num2[3]=temp;
return num2;
}
public static String Print(int num1[])
{
for(int i=0; i<4; i++)
{
System.out.print(num1[i]);
}
System.out.println();
return "";
}
  
public static void main(String []args)
{
Scanner scnr= new Scanner (System.in);
int originNum;
int secondNum[]=new int[4];
int encryptedNum;

System.out.print("Enter a number to encrypt: ");
originNum=scnr.nextInt();


for(int i=0; i<4; i++)
{
secondNum[3-i]=originNum%10;
originNum=originNum/10;
}
Print(secondNum);
System.out.print("Encrypted Data is: ");
Print(Encrypt(secondNum));


System.out.print("Please enter an encrytped number: ");
encryptedNum= scnr.nextInt();
System.out.println("The number decrypted is: ");
Print(Decrypt(encryptedNum));
scnr.close();
}
}