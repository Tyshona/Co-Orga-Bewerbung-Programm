
	
import java.util.*;

	public class Telefon {
		
		
		//Die Eigenschaft des Telefons 
		
		private List <Kontakt>meineKontakte;
		
		
		//Der Konstruktor 
		
		public Telefon() {
			
		meineKontakte = new ArrayList<Kontakt>();
			
		}
		
		
		//Die Methoden
		
		public boolean addKontakt (Kontakt neuerKontakt) {
			for (Kontakt kontaktInListe : meineKontakte) {
				if( neuerKontakt.getName().equals(kontaktInListe.getName())) {
				System.out.println("Der Kontakt " + kontaktInListe.getName() + " existiert bereits.");
				return false;
			}	
		}
	    meineKontakte.add(neuerKontakt);
	    System.out.println("Der Kontakt " + neuerKontakt.getName() + " wurde hinzugefügt.");
	           return true; 
	 
		
		
		}
		public boolean findKontakt (String name) {
			for (Kontakt kontaktInListe : meineKontakte) {
				if (name.equals(kontaktInListe.getName())) {
					System.out.println("Der Kontakt " + kontaktInListe.getName() + " wurde gefunden.");	
					return true;
				}
				
			}
			System.out.println("Der Kontakt " + name + " existiert nicht.");
		    return false;
		

	}
		
		public void ausgabe () {
			for (Kontakt kontaktInListe : meineKontakte) {
				System.out.println( "Name: " + kontaktInListe.getName() + "  Tel.:" + kontaktInListe.getTelefonNummer() + "  Mobil.:" + kontaktInListe.getMobil());
				
			}
		}
	}