package beanlander.mission;

import java.io.Serializable;
import java.util.UUID;

public abstract class Mission {
	private double missionWorth;
	private double missionCost;
	private volatile double completedPercent;
	private MissionResults missionResults;
	private UUID missionID;
	
	public Mission(double missionWorth, double missionCost) {
		this.missionWorth = missionWorth;
		this.missionCost = missionCost;
	}
	
	//TODO: What is a ReturnSite?
	public abstract void addMissionResultReturnSite();
	
	public abstract void addMissionResultReturnVessel(Serializable returnVessel);
	
	public MissionResults getMissionResults() {
		if(missionResults.getValidMissionResultsGenerated() && missionResults.updateResultsReciever(this)) {
			return missionResults;
		} else {
			return null;
		}
	}
	
	public void setMissionResults(UUID missionID) {
		//Find mission in list with missionID
		//Set MissionResults for that mission
	}
	
	public double getCompletedPercent() {
		return completedPercent;
	}
	
	public double getMissionCurrentWorth() {
		return completedPercent * missionWorth;
	}
	
	public double getMissionWorth() {
		return missionWorth;
	}
	
	public double getMissionCost() {
		return missionCost;
	}
}
