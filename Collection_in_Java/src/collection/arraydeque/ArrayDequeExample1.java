package collection.arraydeque;
import java.util.ArrayDeque;

public class ArrayDequeExample1 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad); //[10, 20, 30, 40, 50]
		ad.addFirst(99);
		System.out.println(ad); //[99, 10, 20, 30, 40, 50]
		ad.addLast(88);
		System.out.println(ad);//[99, 10, 20, 30, 40, 50, 88]
	}
}