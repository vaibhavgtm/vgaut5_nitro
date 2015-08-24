package assignment;

import java.util.logging.Logger;
/**
 * 
 * @author vgaut5
 *
 */
public class Light {
	/**
	 * 
	 * @param args
	 */
  public static void main(String[] args) {
    final Logger log = Logger.getLogger(Light.class.getName());
    int lightspeed;
    // approximate speed of light in miles per second
    lightspeed = 186000;
    long days;
    days = 1000; // specify number of days here
    long seconds;
    seconds = days * 24 * 60 * 60; 
    // convert to seconds
    long distance;
    distance = lightspeed * seconds; // compute distance
    log.fine("In " + days + "  days light will travel about " + distance + " miles.");
    
    
  }
}
