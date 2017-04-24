package primer04;

import java.util.ArrayList;

public class ArticleRepostiroty {
	static ArrayList<Artikal> artikli;
	
	public void dodajArtikal(Artikal artikal){
		artikli.add(artikal);
	}
	
	public static void deleteArtikal(String id){
		for(Artikal i : artikli){
			if(i.getNaziv().equals(id)){
				artikli.remove(i);
			}
		}
	}
	
	
	public ArticleRepostiroty() {
		super();
		this.artikli = new ArrayList<Artikal>();
	}

	public ArrayList<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(ArrayList<Artikal> artikli) {
		this.artikli = artikli;
	}
	
	public String toHtml(){
		String retVal = "<table style = \" border: 1px solid black;\"><tr><td>Naziv</td><td>kolicina</td><td>opis</td> </tr>";
		
		for(Artikal i : artikli){
			retVal += i.toHtml();
		}
		retVal += "</table>";
		return retVal;
	}
	
	@Override
	public String toString() {
		String retVal = "\nARTIKLI: \n";
		
		for(Artikal i : artikli){
			retVal += i.toString() + "\n";
		}
		
		return retVal;
	}
}
