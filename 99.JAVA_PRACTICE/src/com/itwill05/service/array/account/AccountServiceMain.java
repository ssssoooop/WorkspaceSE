package com.itwill05.service.array.account;

public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService account=new AccountService();
System.out.println(" 1.은행계좌들 총계좌수출력메쏘드정의");
account.totAccountNumberPrint();
System.out.println("2.은행계좌들 전체출력메쏘드 정의");
account.print();
System.out.println("3.은행계좌들 총잔고 출력메쏘드 정의");
account.totBalancePrint();
System.out.println("4.계좌번호 인자로받아서 계좌한개출력");
account.findByNoPrint(9999);
System.out.println("5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력");
account.findByBalancePrint(0);
System.out.println("6.계좌이율 인자로 받아서 이율이상인 계좌들출력");
account.findByIyulPrint(0.0);
System.out.println("7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력");
account.findByNamePrint("KIM");
System.out.println("8.계좌번호,입금할돈 인자로 받아서 입금");
account.ipGum(1111,2000);
System.out.println("9.계좌번호,출금할돈 인자로 받아서 출금");
account.ChoolGum(2222,100);
System.out.println("10.계좌를 잔고순으로 오름차순정렬");
account.sortByBalanceAscending();
System.out.println("11.계좌를 잔고순으로 내림차순정렬");
account.sortByBalanceDescending();
System.out.println("12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)");
account.updateAccount();
System.out.println("13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)");
account.updateAccount(3333,"LEE",100,0.5);
	}

}
