


public class Main  {

	public static void main(String[] args) {
		
  
		
		//Erstellung des Objektes "meinTelefon"
		
		Telefon meinTelefon = new Telefon(); 
		
		
		//Erstellen neuer Kontakte, die zum Objekt "mein Telefon" hinzugefügt werden  
		
		meinTelefon.addKontakt(Kontakt.erstelleKontakt("Gabi", "040 12345678", "0152 12345678"));
		meinTelefon.ausgabe();
       
		
		meinTelefon.addKontakt(Kontakt.erstelleKontakt("Sebastian", "040 22345678", "0152 22345678"));
		meinTelefon.ausgabe();

		 
		meinTelefon.addKontakt(Kontakt.erstelleKontakt("Tim", "040 32345678", "0152 32345678"));
		meinTelefon.ausgabe();

		
		meinTelefon.addKontakt(Kontakt.erstelleKontakt("Sarah", "040 42345678", "0152 42345678"));
		meinTelefon.ausgabe();
		
		

		
		//Überprüfung doppelter Kontakte 
		meinTelefon.addKontakt(Kontakt.erstelleKontakt("Gabi", "040 12345678", "0152 12345678"));
		
		
		
		//Suche nach dem Kontakt Sarah, existiert
		meinTelefon.findKontakt("Sarah");
		
	
		//Suche nach dem Kontakt Oliver, existiert nicht
	    meinTelefon.findKontakt("Oliver");
				
		
	
		
	}

}
