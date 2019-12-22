package pay;

import java.util.List;

import domain.OrderMenu;
import view.InputView;

public class Pay {
	private static final double CASH_DISCOUNT = 0.95;
	private static final int CHICKEN_DISCOUNT = 10000;
	private static final double CREDIT_CARD = 1;
	private static final double CASH = 2;

	public static void pay(List<OrderMenu> orderMenuList, int tableNumber) {
		printOrderList(orderMenuList);
		printTableNumber(tableNumber);
		int chickenDiscount = getChickenDiscount(orderMenuList);
		int paymentType = InputView.inputPaymentType();
		int payMoney = getTotalMoneyToPay(orderMenuList);
		printPaymentResult(paymentType, payMoney, chickenDiscount);
	}

	private static double getPayment(int paymentType, int payMoney, int chickenDiscount) {
		double payment = 0;

		if (paymentType == CREDIT_CARD) {
			payment = payMoney - chickenDiscount;
		}
		if (paymentType == CASH) {
			payment = (payMoney * CASH_DISCOUNT) - chickenDiscount;
		}
		if (payment < 0) {
			return 0;
		}
		return payment;
	}

	private static int getChickenDiscount(List<OrderMenu> orderMenuList) {
		int chickenNumber = getNumberOfChickenMenu(orderMenuList);
		int discountQuantity = chickenNumber / 10;
		if (discountQuantity > 0) {
			return discountQuantity * CHICKEN_DISCOUNT;
		}
		return 0;
	}

	private static int getNumberOfChickenMenu(List<OrderMenu> orderMenuList) {
		return orderMenuList.stream()
			.map(orderMenu -> orderMenu.getChickenMenuNumber())
			.reduce(Integer::sum)
			.get();
	}

	private static int getTotalMoneyToPay(List<OrderMenu> orderMenuList) {
		return orderMenuList.stream().map(orderMenu -> orderMenu.getTotalPrice()).reduce(Integer::sum).get();
	}

	private static void printOrderList(List<OrderMenu> orderMenuList) {
		System.out.println("## 주문 내역");
		System.out.println("메뉴 수량 금액");
		for (OrderMenu orderMenu : orderMenuList) {
			System.out.println(orderMenu);
		}
	}

	private static void printTableNumber(int tableNumber) {
		System.out.println(tableNumber + "번 테이블의 결제를 진행합니다.");
	}

	private static void printPaymentResult(int paymentType, int payMoney, int chickenDiscount) {
		double payment = getPayment(paymentType, payMoney, chickenDiscount);
		System.out.println("최종 결제한 금액은 " + (int)payment + "원 입니다.");
	}

}
