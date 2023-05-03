package eu.foxcom.gnss_compare_core.Corrections;

import android.location.Location;

import com.galfins.gogpsextracts.Coordinates;
import com.galfins.gogpsextracts.NavigationProducer;
import com.galfins.gogpsextracts.SatellitePosition;
import com.galfins.gogpsextracts.Time;

public class DGNSSCorrection extends Correction{
    @Override
    public void calculateCorrection(Time currentTime, Coordinates approximatedPose, SatellitePosition satelliteCoordinates, NavigationProducer navigationProducer, Location initialLocation) {

    }

    @Override
    public double getCorrection() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
