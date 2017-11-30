package day1;
class Member {
	private String name;
	private int age;

	public Member() {}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class Test {

	public static void main(String[] args) {
		Member[] arr = new Member[5];
		String[] names = {"aaa","bbb","ccc","ddd","eee"};
		int i;
		
		for(i=0; i<arr.length; i++) {
			arr[i] = new Member();
			arr[i].setName(names[i]);
			arr[i].setAge((i+1)*10);
		}
		
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
