package testcookie;
import java.util.HashSet;

import java.util.Iterator;

import java.util.Set;

public class Trial {

	public static void main(String[] args) {

		Set<String> programmingLanguages = new HashSet<>();

		programmingLanguages.add("C");

		programmingLanguages.add("C++");

		programmingLanguages.add("Java");

		programmingLanguages.add("Python");

		programmingLanguages.add("PHP");

		programmingLanguages.add("Ruby");
		
		System.out.println(programmingLanguages);

		System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");

		programmingLanguages.stream()
		.filter(e->e.equals("Java"))
		.map(e->e.toUpperCase())
		.forEach(System.out::print);
		
		

		/*System.out.println("=== Iterate over a HashSet using iterator() ===");

		Iterator<String> programmingLanguageIterator =
				programmingLanguages.iterator();

		while (programmingLanguageIterator.hasNext()) {

			String programmingLanguage =
					programmingLanguageIterator.next();
		}*/
	}
}