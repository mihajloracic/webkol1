package primer04;

public class Artikal {
	String naziv;
	String opis;
	String kolicina;
	boolean obojen;
	
	
	public Artikal(String naziv, String opis, String kolicina, boolean obojen) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.kolicina = kolicina;
		this.obojen = obojen;
	}
	
	public Artikal() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public String getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(String kolicina) {
		this.kolicina = kolicina;
	}
	
	public boolean isObojen() {
		return obojen;
	}
	
	public void setObojen(boolean obojen) {
		this.obojen = obojen;
	}
	//
	public String toHtml(){
		String retVal = "";
		String color;
		if(obojen == true){
			color = "<tr style = \"background-color: #f1f1c1;\"><form action=\"http://localhost:7070/artikalaction\">";
		}else{
			color = "<tr><form action=\"http://localhost:7070/artikalaction\">";
		}
		String nazivId = "<input readonly=\"true\" name=\"id\" type=\"text\" value=\"" + naziv + "\">";
		retVal = color + "<td>" + nazivId + "</td>" + "<td>" + opis + 
				"</td>" + "<td>" + kolicina + "</td>" +  "<td> <input type=\"submit\" name=\"Delete\" value=\"delete\"></td>"+"</form></tr>";
		return retVal;
	}
	
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + ", obojen=" + obojen + "]";
	}
	
}
