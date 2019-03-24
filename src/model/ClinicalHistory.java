package model;
import java.util.ArrayList;
public class ClinicalHistory{
	private static final String STATE_OPEN = "abierto";
	private static final String STATE_CLOSE = "cerrado";
	private String symptom;
	private String diagnostic;
	private boolean state;
	private ArrayList<Medicament> medicaments;
	private HistorialDate date;
	private HistorialDate dateExit;
	public ClinicalHistory (String symptom, String diagnostic, boolean state, HistorialDate date, HistorialDate dateExit){
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		this.state = state;
		this.date = date;
		this.dateExit = dateExit;
		medicaments = new ArrayList<Medicament>();
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
		return date;
	}
	public void setDate (HistorialDate date){
		this.date = date;
	}
	public HistorialDate getDateExit(){
		return dateExit;
	}
	public void setDateExit (HistorialDate dateExit){
		this.dateExit = dateExit;
	}
	public void addMedicine(Medicament medicine){
        medicaments.add(medicine);
    }
	public int frecuencyMedicament(int actualDay, int actualMonth, int actualYear){
		int exactedDays = date.frecuencyOfMedicament(actualDay, actualMonth, actualYear);
		return exactedDays;
	}
	public double doseMedicamentCost(){
		double doseXcost = 0.0;
		for(int j = 0; j <  medicaments.size(); j++){
			doseXcost = medicaments.get(j).calculatedDose();
		}
		return doseXcost;
	}
}