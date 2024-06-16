/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Harry (CodeWithHarry)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class practice
{
// stores the value for light
// true if light is on
// false if light is off
     boolean isOn;

// method to turn on the light
void turnOn() {
  isOn = true;
  System.out.println("Light on? " + isOn);
  }
  
    public static void main(String[] args) {
      
      // create an object of Lamp
      practice led = new practice();
  
      // access method using object
      led.turnOn();
    }
  }


