package model;
import java.util.ArrayList;
public class ClinicalHistory{
	private static final String STATE_OPEN = "abierto";
	private static final String STATE_CLOSE = "cerrado";
	private String symptom;
	private String diagnostic;
	private boolean state;
	private ArrayList<Medicament> medicaments;
	private HistorialDate Date;
	private HistorialDate Date2;
	public ClinicalHistory (String symptom, String diagnostic, boolean state, HistorialDate Date, HistorialDate Date2){
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		this.state = state;
		this.Date = Date;
		this.Date2 = Date2;
		medicaments = new ArrayList<>();
	}
	public String getSymptom(){
		return symptom;
	}
	public void setSymptom (String symptom){
		this.symptom = symptom;
	}
	public String getDiagnostic(){
		return diagnostic;
	}
	public void setDiagnostic (String diagnostic){
		this.diagnostic = diagnostic;
	}
	public boolean getState(){
		return state;
	}
	public void setState (boolean state){
		this.state = state;
	}
	public HistorialDate getDate(){
		return Date;
	}
	public void setDate (HistorialDate Date){
		this.Date = Date;
	}
	public HistorialDate getDate2(){
		return Date2;
	}
	public void setDate2 (HistorialDate Date2){
		this.Date2 = Date2;
	}
	public String showSymptom(String symptom){
		String msg = "";
		
		return msg;
	}
}