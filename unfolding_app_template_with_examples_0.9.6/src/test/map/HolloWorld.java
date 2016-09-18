package test.map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class HolloWorld extends PApplet {
 
    UnfoldingMap map;
 
    public void setup() {
        size(800, 600);
//        map = new UnfoldingMap(this);
        map = new UnfoldingMap(this, new Google.GoogleMapProvider());
        
        // Show map around the location in the given zoom level.
        map.zoomAndPanTo(new Location(52.5f, 13.4f), 10);
    
     // Add mouse and keyboard interactions
        MapUtils.createDefaultEventDispatcher(this, map);
    }
    
    
 
    public void draw() {
        map.draw();
    }
}
