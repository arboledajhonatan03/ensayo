package model;
import java.util.ArrayList;
public class HistorialRecord {
	private String nameThePet;
	private String nameTheClient;
	private ArrayList<ClinicalHistory> History;
	public HistorialRecord (String nameThePet, String nameTheClient){
		this.nameThePet = nameThePet;
		this.nameTheClient = nameTheClient;
		History = new ArrayList<>();
	}
	public String getNameThePet (){
		return nameThePet;
	}
	public void setNameThePet (String nameThePet){
		this.nameThePet = nameThePet;
	}
	public String getNameTheClient (){
		return nameTheClient;
	}
	public void setNameTheClient (String nameTheClient){
		this.nameTheClient = nameTheClient;
	}
	public void setName(String nameThePet){
		//TODO
	}
}