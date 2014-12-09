package beanlander.mission.astronaut;

public class DefaultAstronaut extends Astronaut {
	
	public DefaultAstronaut(Astronaut currentAstronaut, boolean startingReadiness) {
		this.startingReadiness = (currentAstronaut == null) ? startingReadiness : currentAstronaut.startingReadiness;
		this.ready = (currentAstronaut == null) ? startingReadiness : currentAstronaut.startingReadiness;
	}
	
	public DefaultAstronaut(Astronaut currentAstronaut) {
		this(currentAstronaut, false);
	}

	public DefaultAstronaut() {
		this(null, false);
	}

	@Override
	public void run() {	
		if(this.ready()) {
			
		}
	}

	public boolean getStartingReadiness() {
		return startingReadiness;
	}

	@Override
	public boolean setupMission() {
		return false;
	}
}
