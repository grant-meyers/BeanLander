package beanlander.mission;

import java.util.UUID;

public class MissionResults {
	private volatile boolean inUse;
	private volatile boolean validMissionResultsGenerated;
	private UUID missionID;
	
	public MissionResults(UUID missionID) {
		validMissionResultsGenerated = false;
		inUse = false;
		this.missionID = missionID;
	}
	
	protected synchronized void setInUse(boolean useState) {
		inUse = useState;
	}
	
	public synchronized boolean updateResultsReciever(Mission resultsReciever) {
		if(inUse) {
			
		} else {
			
		}
	}
	
	public boolean getValidMissionResultsGenerated() {
		return validMissionResultsGenerated;
	}
}
