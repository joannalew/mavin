import java.util.ArrayList;

public class ListExamples {
	public static void main(String[] args) {
		// ArrayList "add" Method
		// arrayList.add(element) - adds element to back of list
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("Creating the list");
		for (int i = 1; i < 14; i++) {
			myList.add(i);
		}
		System.out.println(myList.toString() + "\n");
				
		// ArrayList "set" Method
		// arrayList.set(index, element) - changes arrayList[index] = element
		System.out.println("Changing element values in the list");
		myList.set(5, 100);
		myList.set(0, 5893);
		System.out.println(myList.toString() + "\n");
				
		// ArrayList "remove" Method
		// arrayList.remove(index) - removes the element at the index
		// Note: the array size changes because an element was removed
		System.out.println("Removing elements from the list");
		System.out.println("The size of the list is: " + myList.size());
		myList.remove(0);
		System.out.println(myList.toString());
		System.out.println("The size of the list is: " + myList.size());
				
		// ArrayList "get" Method
		// arrayList.get(index) - returns the element at arrayList[index]
		System.out.println("The element at index 2 is: " + myList.get(2));
		System.out.println("The element at index 5 is: " + myList.get(5));
		System.out.println();
				
		// ArrayList "add" Method (inserting an element in an index)
		// arrayList.add(index, element) - inserts the element into that index
		// Note: all elements after that index are shifted down one index
		System.out.println("Inserting elements into the list");
		myList.add(2, 999);
		myList.add(0, 843);
		System.out.println(myList.toString());
				
		// ArrayList "contains" Method
		// arrayList.contains(element) - returns true if element is in list
		System.out.println("myList has the element 843? " + myList.contains(843));
		System.out.println("myList has the element 834? " + myList.contains(834));
				
		// ArrayList "indexOf" Method
		// arrayList.indexOf(element) - returns the index of the element in list
		System.out.println("The index of element 843: " + myList.indexOf(843));
		System.out.println("The index of element 999: " + myList.indexOf(999));
		System.out.println();
		
		// ArrayList "isEmpty" Method
		// arrayList.isEmpty() - returns true if list is empty; false if not empty
		System.out.println("The list is empty? " + myList.isEmpty());
				
		// ArrayList "clear" Method
		// arrayList.clear() - removes all elements in list
		System.out.println("Clearing the list");
		myList.clear();
		System.out.println("The list is empty? " + myList.isEmpty());
	}
}
