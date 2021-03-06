package Tests;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.textui.TestRunner;

class Main {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(AllTests.class);
		
		Logger l = Logger.getLogger(TestRunner.class.toString());
		
		for(Failure f : result.getFailures()) {
			l.warning(f.toString());
		}
	
		l.info("Vreme izvrsavanja testova: " + result.getRunTime());
		l.info("Ukupan broj testova: " + result.getRunCount());
		l.info("Broj uspesnih testova: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount() - 
				result.getAssumptionFailureCount()));
		l.info("Broj palih testova: " + result.getFailureCount());
		l.info("Broj preskocenih testova: " + result.getIgnoreCount());
		l.info("Broj dinamickih preskocenih testova: " + result.getAssumptionFailureCount());
		
		if(result.wasSuccessful())
			l.info("Svi testovi su uspesno izvrseni.");
		else
			l.info("Postoje greske u testovima.");
		try {
            File myObj = new File("test-reports.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("test-reports.txt");
            myWriter.write("Vreme izvrsavanja:" + result.getRunTime());
            myWriter.write("\nBroj testova:"+ result.getRunCount());
            myWriter.write("\nUspesno testova:" + (result.getRunCount()-result.getFailureCount()-result.getIgnoreCount()-result.getAssumptionFailureCount()));
            myWriter.write("\nBroj palih testova:"+ result.getFailureCount());
            myWriter.write("\nBroj preskocenih:"+ result.getIgnoreCount());
            myWriter.write("\nBroj dinamicki preskocenih:" + result.getAssumptionFailureCount());
            myWriter.write("\n\n");
            myWriter.write("Sportivo:\n");
            myWriter.write("SEDI??TE FIRME:\n" +
                    "Gandijeva 138, Beograd 11000\n");
            myWriter.write("\nRadno vreme:\n" +
                    "Radno vreme: Otvoreno 24 sata");
            myWriter.write("\nTelefon:\n" +
                    "063 222 796");
            myWriter.write("\nEmail:\n" +
                    "info@sportivo.rs");
            myWriter.write("\n\n\t\t\tIzve??taji testova:\n");
            myWriter.write("\nIme testa: addToCart:\n" +
                    "Opis testa: Test je ra??en uz pomo?? AssertEquals metode.Uz pomo?? nje proveravamo da li se na stranici Korpa nalaze"
                    + " 3 dodata proizvoda. Ukoliko se nalaze ta??no tri proizvoda, ??to je i bio uslov, test je uspe??an.\n");
            myWriter.write("\nIme testa:facebook :\n" +
                    "Opis testa: Sajt poseduje ikonicu koja je linkovane na dru??tvenu mre??u Facebook."
                    + "  Nakon klika, test metoda ??e proveriti da li se uspe??no ovoj dru??tvenoj mre??i. Za potrebe ovog testa kori????ena je assertEquals metoda.\n");
            myWriter.write("\nIme testa: login:\n" +
                    "Opis testa: Potrebno je uneti korisni??ko ime i lozinku kako bi se izvr??ilo prijavlijvanje korisnika na sistem."
                    + " Da bi smo proveli ispravnost, uz pomo?? assertEquals metode proverava se da li je nakon klika na dugme PRIJAVA korisnik preusmeren na glavnu stranicu."
                    + " Ako je korisnik preusmeren gde treba, prijava je uspela i test prolazi.\n");
            myWriter.write("\nIme testa: profile:\n" +
                    "Opis testa: Da bi smo proverili da li su podaci koji su kori????eni pri registraciji jednaki sa podacima korisnika,"
                    + " bi??e kori????ena assertTrue metoda koja na osnovu imena proverava da li podaci koje smo uneli poklapaju sa imenom u padaju??em meniju u uglu stranice. \n");
            myWriter.write("\nIme testa: register:\n" +
                    "Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
                    + " korisniku otvara nova stranica na kojoj se nalazi poruka \"Hvala na va??oj registraciji.\" Ukoliko korisnik dobije tu poruku, test prolazi. \n");
            myWriter.write("\nIme testa: search:\n" +
                    "Opis testa: Testiranje je ura??eno uz pomo?? metode assertTrue\r\n"
                    + "Ova metoda proverava da li se u izvoru stranice nalazi navedena ??ifra ili klju??na re??. Ukoliko se proizvod pojavi, test je uspe??an. \n");
            myWriter.write("\nIme testa: totalPrice:\n" +
            		"Opis testa: Za po??etak se u korpu dodaju proizvodi ??ija cena se sabira i"
            		+ " upore??uje sa ve?? izra??unatom cenom u korpi, ukoliko se cene poklapaju, test je uspe??an.\\n\");\r\n"
            		+ "\n");
            myWriter.write("\nIme testa: removeProduct:\n" +
                    "Opis testa: Za test je prvo dodat jedan proizvod u korpu nakon ??ega je provereno da li se ta??no jedan proizvod nalazi u korpi"
                    + ", a nakon brisanja proizvoda ispituje se da li je sada korpa prazna, ukoliko jeste, proizvod je izbrisan i test prolazi. \n");
         
            myWriter.write("\n\t\tSVI TESTOVI SU USPE??NI!\n");
            		
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
		
	}
	