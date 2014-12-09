package beanlander.mission;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import beanlander.mission.astronaut.Astronaut;
import beanlander.mission.astronaut.DefaultAstronaut;
import beanlander.problem.InvalidSourceParameters;
import beanlander.surface.Surface;

public class Apollo13 extends Mission implements Iterable<Astronaut> {
	private final static int defaultAstronautCount = 3;
	private final static int defaultMissionSeats = 2 * defaultAstronautCount;
	private final static DefaultAstronaut defaultAstronaut = new DefaultAstronaut();
	
	private int astronautCount;
	private ArrayList<Astronaut> missionAstronauts;
	private boolean missionReady;
	private int astronautSeats;	
	private Surface missionSurface;
	
	public Apollo13(Surface missionSurface) {
		this(missionSurface, defaultAstronautCount, null, -1);		
	}

	public Apollo13(Surface missionSurface, int astronautCount, Astronaut[] missionAstronauts, int astronautSeats) throws InvalidSourceParameters {
		if(missionSurface == null || !(missionSurface instanceof Surface)) {
			throw new InvalidSourceParameters("Provided Surface is invalid.");
		}
		
		this.missionSurface = missionSurface;
		this.astronautCount = astronautCount;
		this.missionAstronauts = new ArrayList<Astronaut>(astronautCount);
		this.astronautSeats = (astronautSeats == -1) ? defaultMissionSeats : astronautCount * 2;
		
		if(missionAstronauts == null || missionAstronauts.length == 0) {
			resetAstronauts(true);
		} else {
			//TODO: Figure out if the best practice is to take the passed in missionAstronauts or 
			//to use some sort of copy constructor or clone.
			
			//Keeping provided Astronauts
			resetAstronauts(false);
			if(missionAstronauts.length != astronautCount) {
				throw new InvalidSourceParameters("Provided Astronauts array size did not match provided astronautCount of " + astronautCount + ".");
			}
			
			int astronautSeat = 0;
			for(Astronaut currentAstronaut : missionAstronauts) {
				missionAstronauts[astronautSeat] = currentAstronaut;
				astronautSeat++;
			}
			
			//Copy constructor Astronauts
			/*astronautSeat = 0;
			for(Astronaut currentAstronaut : missionAstronauts) {
				missionAstronauts[astronautSeat] = new DefaultAstronaut(currentAstronaut);
				astronautSeat++;
			}*/
		}
		
		missionReady = true;
		for(Astronaut currentAstronaut : missionAstronauts) {
			if(!currentAstronaut.ready()) {
				missionReady = false;
				break;
			}
		}
	}
	
	public void setupMission(int missionIndex) throws InvalidSourceParameters {
		if(missionIndex > missionAstronauts.size()) {
			throw new InvalidSourceParameters("Provided missionIndex is greater than the number of Astronauts.");
		}
		
		missionAstronauts.get(missionIndex).setupMission();
	}
	
	public void setupAllMissions() {
		for(int i=0; i<missionAstronauts.size(); i++) {
			setupMission(i);
		}
	}
	
	public void resetAstronauts(boolean resetToDefaultAstronaut) {
		missionAstronauts = null;
		missionAstronauts = new ArrayList<Astronaut>(astronautCount);
		
		if(resetToDefaultAstronaut) {
			for(int i=0; i<missionAstronauts.size(); i++ ) {
				missionAstronauts.add(i, defaultAstronaut);
			}
		}
	}
	
	/**
	 * Function to test if the missions are deployed and ready to start 
	 * running.
	 * @return boolean status of all Astronauts
	 */
	public boolean ready() {
		return false;
	}
	
	public void start() {
		if(missionReady == true) {
			
		}
	}
	
	public void startThreadPool() {
		
	}

	@Override
	public Iterator<Astronaut> iterator() {
		return null;
	}
	
}
