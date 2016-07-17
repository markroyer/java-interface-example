/**
 * 
 */
package edu.umaine.cs.interfaceExample;

/**
 * 
 * Create a window that contains shapes and display the window to the user. The
 * shapes can be dragged around the top panel and can be double clicked on. This
 * is a simple example that is meant to show how an interface (ClickableShape)
 * may be used to create new object types with minimal refactoring.
 * 
 * @author Mark Royer
 * 
 */
public class Main {

	/**
	 * @param args Not used
	 */
	public static void main(String[] args) {

		// Create a new window
		InterfaceFrame frame = new InterfaceFrame();

		// Add the types of objects that we want to create		
		frame.addShape(new ClickableTriangle());

		// Make the window appear
		frame.setVisible(true);

	}

}
