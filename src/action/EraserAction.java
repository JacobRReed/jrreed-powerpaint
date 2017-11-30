/**
 * PowerPaint
 * Assignment 5
 * Spring 2017 TCSS 305
 */
package action;

import gui.PaintPanel;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import tools.EraserTool;
import tools.Tool;

/**
 * 
 * Eraser Action.
 * @author Jacob Reed
 * @version May 2, 2017
 *
 */
public class EraserAction extends AbstractAction {
    /**Generated SUID. */
    private static final long serialVersionUID = -4146266313447132438L;
    /** Name. */
    private static final String NAME = "Eraser";
    /**Initial point. */
    private static final Point INIT_POINT = new Point(0, 0);
    /** Paint Panel. */
    private PaintPanel myPanel;
    /** Tool. */
    private final Tool myTool;
    
    /**
     * Constructor.
     * @param thePaintPanel Paint panel to use.
     */
    public EraserAction(final JPanel thePaintPanel) {
        super(NAME, new ImageIcon("images/eraser_bw.gif"));
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
        putValue(Action.SELECTED_KEY, true);
        putValue(Action.SHORT_DESCRIPTION, NAME);
        myPanel = (PaintPanel) thePaintPanel;
        myTool = new EraserTool(INIT_POINT, INIT_POINT);
    }
    
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setTool(myTool);
        myPanel.setBackupColors();
        myPanel.setColors(Color.WHITE, Color.WHITE);
        myPanel.repaint();    
    }

}
