package beanlander.groundcontrol.planner;

import java.util.Iterator;

import beanlander.mission.Mission;
import beanlander.surface.Surface;

public class RandomPlanner implements Planner {

	@Override
	public void assignMissionsToSurface(Iterator<Mission> missions,
			Iterator<Surface> surfaceOptions)
			throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getMissionEfficency(Iterator<Mission> missions) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMissionEfficency(Iterator<Mission> missions,
			Iterator<Surface> surfaceOptions) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSurfaceUsage(Iterator<Surface> surfaceOptions) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSurfaceUsage(Iterator<Mission> missions,
			Iterator<Surface> surfaceOptions) {
		// TODO Auto-generated method stub
		return 0;
	}

}
