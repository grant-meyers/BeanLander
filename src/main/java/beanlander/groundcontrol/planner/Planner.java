package beanlander.groundcontrol.planner;

import java.util.Iterator;

import beanlander.mission.Mission;
import beanlander.surface.Surface;

/**
 * Class to handle the mapping of Object instances / missions to Servers / surfaces.
 * 
 * @author Grant
 *
 */

public interface Planner {
	public void assignMissionsToSurface(Iterator<Mission> missions, Iterator<Surface> surfaceOptions) throws UnsupportedOperationException;
	public double getMissionEfficency(Iterator<Mission> missions);
	public double getMissionEfficency(Iterator<Mission> missions, Iterator<Surface> surfaceOptions);
	public double getSurfaceUsage(Iterator<Surface> surfaceOptions);
	public double getSurfaceUsage(Iterator<Mission> missions, Iterator<Surface> surfaceOptions);		
}
