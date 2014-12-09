package beanlander.groundcontrol;

import java.util.ArrayList;
import java.util.Collection;

import beanlander.groundcontrol.planner.DefaultPlanner;
import beanlander.groundcontrol.planner.Planner;
import beanlander.mission.Mission;
import beanlander.mission.MissionResults;

public class Houston implements GroundControl {
	private long lastUpdateTime;
	private Planner missionPlanner;
	private ArrayList<Mission> availableMissions;
	
	public Houston(Collection<Mission> missions) {
		this(new DefaultPlanner(), missions);
	}
	
	//TODO: This has to be inefficient, replace.
	public Houston(Planner missionPlanner, Collection<Mission> missions) {
		availableMissions = new ArrayList<Mission>(missions);
		this.missionPlanner = missionPlanner;
	}
	
	
	public MissionResults GetLatestMissionResults() {
		
	}
	
	public void launchMission(int missionIndex) {
		
	}

}
