

public class Kontakt {

	
	//Eigenschaften
	private String name;
	private String telefonNummer;
	private String mobil;
	
   
	//Konstruktor
	public Kontakt () {
		
	}
	
	public Kontakt (String name, String telefonNummer, String mobil) {
		super();
	    this.name = name;
		this.telefonNummer = telefonNummer;
		this.mobil = mobil;	
	}
	
	
	//Methoden
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefonNummer() {
		return telefonNummer;
	}
	public void setTelefonNummer(String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	

		
	public static Kontakt erstelleKontakt(String name, String telefonNummer, String mobil) {
	
		return new Kontakt(name,telefonNummer, mobil);
	}
	
	
	
	
	

}
