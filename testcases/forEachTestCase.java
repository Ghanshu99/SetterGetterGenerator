import com.thinking.machines.util.*;
class forEachTestCase
{
public static void main(String gg[])
{
TMList list1=new TMArrayList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.forEach((p)->{
System.out.println(p);
});
System.out.println("*****************");
TMList list2=new TMLinkedList();
list2.add(500);
list2.add(5005);
list2.add(600);
list2.add(2000);
list2.forEach((j)->{
	System.out.println(j);
})
}
}