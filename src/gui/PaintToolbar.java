/**
 * PowerPaint
 * Assignment 5
 * Spring 2017 TCSS 305
 */
package gui;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;


/**
 * 
 * Toolbar - draggable to different borders.
 * @author Jacob Reed
 * @version Apr 30, 2017
 *
 */
public class PaintToolbar extends JToolBar {

    /** Generated SUID. */
    private static final long serialVersionUID = -7702756995526760228L;
    /** Holds buttons only allows one enable. */
    private final ButtonGroup myButtons;
    /** Counter. */
    private int myCount;
    /**
     * Constructor.
     */
    public PaintToolbar() {
        super();
        myButtons = new ButtonGroup();
        myCount = 0;
    }
    
    /**
     * Creates a button with the action for tool bar.
     * @param theAction Action of button
     */
    public void createButton(final Action theAction) {
        myCount++;
        final JToggleButton result = new JToggleButton(theAction);
        //adds to group
        myButtons.add(result);
        //adds to tool bar
        add(result);
        //Counter is being used to see if the second element
        //Which is also happens to be the line tool
        //Is default selected, might change this method later.
        if (myCount == 2) {
            result.setSelected(true);
        }
        
    }
 
}
