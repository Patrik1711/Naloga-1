import java.util.Scanner;

public class preveriTelefonskoStevilko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vpišite telefonsko številko:");
		
		Scanner s = new Scanner(System.in);
		
		String stevilka = s.nextLine();
		
		/*mobilnik T2*/
		if(stevilka.matches("38664[0-9]{6}")) {
			System.out.println("Vpisana stevilka je:" +stevilka+ " Mobilna številka operate - T2");
		}/*mobilnik A1*/
		else if(stevilka.matches("386(30||40||68||69){1}[0-9]{6}")) {
			System.out.println("Vpisana stevilka je:" +stevilka+ " Mobilna številka operate - A1");
		}/*Telekom*/
		else if(stevilka.matches("386(31||41||51||71||65){1}[0-9]{6}")){
			System.out.println("Vpisana stevilka je:" +stevilka+ " Mobilna številka operate - Telekom");
		}/*Telemah*/
		else if(stevilka.matches("38670[0-9]{6}")){
			System.out.println("Vpisana stevilka je:" +stevilka+ " Mobilna številka operate - Telemah");
		}/*Stacionarna stevilka*/
		else if(stevilka.matches("386(1||2||3||4||5||7){1}[0-9]{7}")){
			System.out.println("Vpisana stevilka je:" +stevilka+ " Staciona številka");
		}
		else{
			System.out.println("NAPAKA !!!! - Vpisali ste:" + stevilka);
		}
	}

}
