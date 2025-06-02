import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        System.out.println("List: " + list);
        System.out.println("list 2nd element is :"+list.get(1));
        list.add(1, 5); // add 5 at index 1
        System.out.println("YOur list is"+list);
        System.out.println("size of the list is "+list.size());
        list.set(2, 122); // set 122 at index 2
        System.out.println("Your list after setting the value is: "+list);
        // // check to contain a number in the list
        // System.out.println("Enter the number you want to check in the list:");
        // int n= sc.nextInt();
        // list.remove(3);
        // System.out.println("Your list after removing the number is: "+list);
        // // check if the number is in the list
        // using contains method of the list

        // String result=list.contains(n)?"found":"not found";
        // System.out.println("The number is "+result+" in the list");


        // remove the number from the list
    //     System.out.println("Enter the number you want to remove from the list:");
    //     int num1 = sc.nextInt();
    //     ArrayList<String> str= new ArrayList<>();
    //     int choice;
    //     do{
    //     System.out.println("enter to continue 1 or exit: 2");
    //      choice = sc.nextInt();
    //     switch(choice){
    //         case 1:
    //             System.out.println("Enter the string you want to add :");
    //             String str1= sc.next();
    //             str.add(str1);
    //             System.out.println("Your string is added to the list: "+str);
    //             break;
    //         case 2:
    //             System.out.println("exit");
    //             break;
    //         default:
    //             System.out.println("Invalid choice");
    //             break;
    //     }
    // }while(choice!=2);
    Iterator<Integer> it = list.iterator();
    System.out.println("Your list is: ");
    while(it.hasNext()){
        System.out.println(it.next());  
    }

    }
}
