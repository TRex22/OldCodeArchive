package myBirds;

public class MammalSighting {
	
	private int sightingNo;
	private int LodgeNo;
	private char Species;
	private String SpeciesDescr;
	private String ValidCode;
	
	//parm constructor
	public MammalSighting (int s, int l, char S, String SD, String VC)
	{
		sightingNo = s;
		LodgeNo = l;
		Species = S;
		SpeciesDescr = SD;
		ValidCode = VC;
	}
	
	
	//accessor and getter
	public int getSightingNo() {
		return sightingNo;
	}
	public void setSightingNo(int sightingNo) {
		this.sightingNo = sightingNo;
	}
	public int getLodgeNo() {
		return LodgeNo;
	}
	public void setLodgeNo(int lodgeNo) {
		this.LodgeNo = lodgeNo;
	}
	public char getSpecies() {
		return Species;
	}
	public void setSpecies(char species) {
		Species = species;
	}
	public String getSpeciesDescr() {
		return SpeciesDescr;
	}
	public void setSpeciesDescr(String speciesDescr) {
		SpeciesDescr = speciesDescr;
	}
	public String getValidCode() {
		return ValidCode;
	}
	public void setValidCode(String validCode) {
		ValidCode = validCode;
	}
	
	//other methods
	
	public String toString()
	{
		return ""+sightingNo+"\t"+
		LodgeNo +"\t"+
		Species +"\t"+
		SpeciesDescr +"\t"+
		ValidCode ;
	}
	
	public int calcScore ()
	{
		int out = 10;
		if (SpeciesDescr.toUpperCase().contains("ELEPHANT")||
				SpeciesDescr.toUpperCase().contains("LEOPARD")||
				SpeciesDescr.toUpperCase().contains("LION")||
				SpeciesDescr.toUpperCase().contains("BUFFALO")||
				SpeciesDescr.toUpperCase().contains("RHINO"));
		{
			out +=10;
		}
		
		return out;
	}
	
}
