package generic;

import java.util.HashSet;

import nogeneric.Account;

public class HashSetGenericMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111,"BING",320000,0.5);
		Account acc2=new Account(2222,"MING",12000,0.1);
		Account acc3=new Account(3333,"KING",89000,0.3);
		Account acc4=new Account(4444,"YUNG",45000,0.2);
		Account acc5=new Account(5555,"SANG",99000,0.6);
		
		HashSet<Account> accountSet=new HashSet<Account>();
		System.out.println("# set size:"+accountSet.size());
		System.out.println("------------------1.add-------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		boolean isAdd = accountSet.add(acc5);
		System.out.println("추가여부:"+isAdd);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		System.out.println("------------------2.remove---------------");
		accountSet.remove(acc5);
		System.out.println("삭제여부:"+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("%%%%%%%%%%%% 전체출력 %%%%%%%%%%%%%%");
		for(Account account:accountSet) {
			account.print();
		}
		
	}

}
