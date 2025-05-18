package interfaccee;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("tuttar giriniz: ");
		double price=input.nextDouble();
		
		System.out.print("kart no giriniz: ");
		String cardNumber=input.next();
		
		System.out.print("son kullanım tarihini giriniz: ");
		String date=input.next();
		
		System.out.print("güvenlik kodunu giriniz: ");
		String cvc=input.next();

		System.out.println("1. a bankası");
		System.out.println("2. b bankası");
		System.out.println("3. c bankası");
		System.out.print("banka seçiiniz: ");
		int selectBank=input.nextInt();
		
		switch(selectBank) {
			case 1:
				aBankasi aPos= new aBankasi("aBankası","123123","456456");
				aPos.connect();
				aPos.payment(price,cardNumber,date,cvc);
				break;
			
			case 2:
			default:
				System.out.println("geçerli bir banka giriniz");
		}
	}

}
