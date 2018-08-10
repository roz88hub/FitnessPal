// Creating a new Class called FitnessClass
public class Fitness {

	public static void main(String[] args) {

		// Creating an Object from Person
		// FName: Tom,LNameInitial: H, Weight 152.5, Feet: 5, Inches: 6)
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);

		// FName: Leslie, LName:Knope, LNameInitial: K, Age: 32, Weight 122.9,
		// Feet: 4, Inches: 11)
		Person leslie = new Person("Leslie", "Knope", 'k', 32, 122.9,
				4, 11);

		// FName: Ron, LName:Swanson, Weight 222.2, Feet: 6, Inches: 0
		Person man = new Person("Swanson", "Knope", 222.2, 6, 0);

		// FName: April, LName:Ludgate, Weight 110.5, Feet: 5, Inches: 5
		Person woman = new Person("April", "Ludgate", 110.5, 5, 5);

		// Here we are printing out the Result
		System.out.println(person1.getFirstName() + ": "
				+ person1.calculateBMI());
		System.out
				.println(leslie.getFirstName() + ": " + leslie.calculateBMI());
		System.out.println(man.getFirstName() + ": " + man.calculateBMI());
		System.out.println(woman.getFirstName() + ": " + woman.calculateBMI());

	}
}
