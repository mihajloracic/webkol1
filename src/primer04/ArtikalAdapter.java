package primer04;

import java.util.StringTokenizer;

public class ArtikalAdapter {
	
	public Artikal getArtikalFromHttp(String request){
		System.out.println("Rquest u adapteru: " + request);
		StringTokenizer stringTokenizer = new StringTokenizer(request, "?=&");
		String prev = "";
		String current;
		Artikal artikal = new Artikal();
		
		while(stringTokenizer.hasMoreTokens()){
			current = stringTokenizer.nextToken();
			
			if(prev.equals("ime")){
				artikal.setNaziv(current);
			}
			if(prev.equals("kolicina")){
				artikal.setKolicina(current);
			}
			if(prev.equals("opis")){
				artikal.setOpis(current);
			}
			if(prev.equals("obojen")){
				if(current.equals("on")){
					artikal.setObojen(true);
				}else{
					artikal.setObojen(false);
				}
			}
			
			
			prev = current;
		}
		
		return artikal;
	}
	
	public String getIdFromHttp(String request){
		System.out.println("Rquest u adapteru: " + request);
		StringTokenizer stringTokenizer = new StringTokenizer(request, "?=&");
		String prev = "";
		String current;
		String id = "nesto";
		
		while(stringTokenizer.hasMoreTokens()){
			current = stringTokenizer.nextToken();
			
			if(prev.equals("id")){
				id = current;
			}			
			
			prev = current;
		}
		
		return id;
		}
	
}



