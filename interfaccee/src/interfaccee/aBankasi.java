package interfaccee;

public class aBankasi {
	private String bankaAdi;
	private String terminalId;
	private String password;
	
	public aBankasi(String banbkaAdi,String termianlId,String password) {
		this.bankaAdi=bankaAdi;
		this.terminalId=terminalId;
		this.password=password;
	}
	
	public void connect() {
		System.out.println(this.bankaAdi+" bağlanıldı");
	}
	 public String getBankaAdi() {
		 return  bankaAdi;
	 }
	 
	 public void payment(double price,String cardNumber,String date, String cvc) {
		 System.out.println("bankadan cevap bekleniyor");
		 System.out.println("işlem başarılı oldu");
	 }
	 public void setBankaAdi(String bankaAdi) {
		 this.bankaAdi=bankaAdi;
	 }
	 
	 public String getTermina_Id() {
		 return terminalId;
	 }
	 
	 public void setTerminal_Id(String termina_Id) {
		 this.terminalId=terminalId;
	 }
	 
	 public String getPassword() {
		 return password;
	 }
	 
	 public void setPassword(String password) {
		 this.password=password;
	 }
}
