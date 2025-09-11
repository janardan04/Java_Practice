import java.util.*;
class seta1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<String>ll=new ArrayList<>();
System.out.print("how many element do you want:");
int n=sc.nextInt();
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++)
{
ll.add(sc.next());
}
System.out.println("Added Element:");
System.out.println(ll);

Iterator<String> itr=ll.iterator();
while(itr.hasNext())
{
String s=(String)itr.next();
itr.remove();
}
System.out.println(ll);
}
}
