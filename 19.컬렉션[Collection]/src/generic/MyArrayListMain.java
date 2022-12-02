package generic;

public class MyArrayListMain {

	public static void main(String[] args) {
		
		MyArrayList<Account> myArrayList=
				new MyArrayList<Account>();
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		
		
		Account account=myArrayList.get(0);
		System.out.println(account);
		
		Account removeAccount=(Account)myArrayList.remove(0);
	}

}
