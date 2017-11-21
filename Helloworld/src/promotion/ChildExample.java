package promotion;

public class ChildExample {

	public static void main(String[] args) {

/*		
		Child child = new Child();
		child.method1();
		child.method2();
		
		Parent parent = child;	//자동 타입 변환
		parent.method1();
		parent.method2();	//override
		
		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();
		
		//강제 타입 변환 (casting)
		Child badchild = null;
		if(parent instanceof Child) {	//Child 타입으로 변환이 가능한지 확인
			badchild = (Child) parent;
			badchild.method1();
			badchild.method1();
			System.out.println("parent");
		}
		
		if(parent2 instanceof Child) {	//Child 타입으로 변환되지 않음
			badchild = (Child) parent2;
			badchild.method1();
			badchild.method1();
			System.out.println("parent2");
		}
 */
		
		Child child = new Child();
		Parent parent = child;
		Parent parent2 = new Parent();
		
		parent2.method1(parent);//Child
		parent2.method1(parent2);//Parent
		parent2.method1(child);
		
		parent2.method2(parent);
		parent2.method2(parent2);
		parent2.method2(child);
	}
		
}
