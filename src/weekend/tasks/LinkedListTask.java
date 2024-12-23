package weekend.tasks;

import java.util.LinkedList;

public class LinkedListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> programlanguage = new LinkedList <>();
		programlanguage.add("python");
		programlanguage.add("java");
		programlanguage.add("sql");
		programlanguage.add("javascript");
		System.out.println("Top language: " + programlanguage.get(0));
		programlanguage.set(2,"jquery");
		System.out.println("sql replaced with jquery: " + programlanguage);
		programlanguage.remove(3);
		System.out.println("javascript removed: " + programlanguage);

	}

}

