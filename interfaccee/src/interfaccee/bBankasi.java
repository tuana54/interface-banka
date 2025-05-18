package interfaccee;

public class bBankasi {
	private String bankaAdi;
	private String terminalId;
	private String password;
	
	public bBankasi(String banbkaAdi,String termianlId,String password) {
		this.bankaAdi=bankaAdi;
		this.terminalId=terminalId;
		this.password=password;
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
