package promotion;

public class AnimalExample {

	public static void main(String[] args) {

//		Animal animal = new Animal();
//		animal.breathe();
		
		//#1
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog.kind);
		
		Cat cat = new Cat();
		cat.sound();
		System.out.println(cat.kind);
		
		System.out.println("--------------------");
		
		//#2
		//자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		System.out.println(animal.kind);
		
		animal = new Cat();
		animal.sound();
		System.out.println(animal.kind);
		
		//#3
		//추상클래스는 인스턴스화가 안된다
//		Animal animal2 = new Animal();
		
	}

}
