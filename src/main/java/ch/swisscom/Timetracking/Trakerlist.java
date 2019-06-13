package ch.swisscom.Timetracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Service;

@Service
public class Trakerlist {
	private Traker foundTraker;
	// Creating the list for the trakers
	public ArrayList<Traker> traker = new ArrayList<>(Arrays.asList(
			new Traker(1, "Admin", "für Pausen und für auf dem internet surfen",
					"link to something"),
			new Traker(2, "T", "None", "no link")));

	// Method to take all Traker
	public ArrayList<Traker> getAllTraker() {

		return traker;
	}

	// method for adding the Traker in the list
	public void addTraker(Traker newtraker) {
		traker.add(newtraker);
	}
	
	//get the id from a traker
	public Traker getTrakerById(long id) {
		traker.forEach(r -> {
			if (r.getId() == id) {
				this.foundTraker = r;
			}
		});
		return foundTraker;
	}

	// delete a Traker
	public void removeTraker(long id) {
		traker.remove(getTrakerById(id));
	}
	
	//start the timer
	public void starttimer() {
		/*
		 * zuerst muss es überprüfen, ob ein anderer Timer läuft. Ist dies
			der Fall, wird dieser angehalten, bevor der neue timer startert
		*/
	}
	//clone a traker
	public void clone(long id) throws CloneNotSupportedException {
		
		//man klont einen Traker mit all seinen infos und fügt ihn der Liste hinzu. 
		
	}
	
	//edit a traker
	public  Object editTraker(long id) {
		/*Man drückt einen knopf und wird auf eine neue Seite geleitet, wo man den traker
		bearbeiten kann, der ersetzt dann den alten Traker.
		*/
		
		return traker;
	}
}
