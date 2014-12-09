package beanlander.mission.astronaut;

public abstract class Astronaut implements Runnable {
	protected boolean startingReadiness;
	protected boolean ready;	
	
	public abstract boolean setupMission();
	
	public boolean ready() {
		return ready;
	}	
}
