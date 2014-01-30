/*
  GNU LESSER GENERAL PUBLIC LICENSE 


               Version 3, 29 June 2007 

  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/> 
  Everyone is permitted to copy and distribute verbatim copies 
  of this license document, but changing it is not allowed. 
  
  
   This version of the GNU Lesser General Public License incorporates 
 the terms and conditions of version 3 of the GNU General Public 
 License, supplemented by the additional permissions listed below. 
  
   0. Additional Definitions. 
  
   As used herein, "this License" refers to version 3 of the GNU Lesser 
 General Public License, and the "GNU GPL" refers to version 3 of the GNU 
 General Public License. 
  
   "The Library" refers to a covered work governed by this License, 
 other than an Application or a Combined Work as defined below. 
  
   An "Application" is any work that makes use of an interface provided 
 by the Library, but which is not otherwise based on the Library. 
 Defining a subclass of a class defined by the Library is deemed a mode 
 of using an interface provided by the Library. 
  
   A "Combined Work" is a work produced by combining or linking an 
 Application with the Library.  The particular version of the Library 
 with which the Combined Work was made is also called the "Linked 
 Version". 
  
   The "Minimal Corresponding Source" for a Combined Work means the 
 Corresponding Source for the Combined Work, excluding any source code 
 for portions of the Combined Work that, considered in isolation, are 
 based on the Application, and not on the Linked Version. 
  
   The "Corresponding Application Code" for a Combined Work means the 
 object code and/or source code for the Application, including any data 
 and utility programs needed for reproducing the Combined Work from the 
 Application, but excluding the System Libraries of the Combined Work. 
  
   1. Exception to Section 3 of the GNU GPL. 
  
   You may convey a covered work under sections 3 and 4 of this License 
 without being bound by section 3 of the GNU GPL. 
  
   2. Conveying Modified Versions. 
  
   If you modify a copy of the Library, and, in your modifications, a 
 facility refers to a function or data to be supplied by an Application 
 that uses the facility (other than as an argument passed when the 
 facility is invoked), then you may convey a copy of the modified 
 version: 
  
    a) under this License, provided that you make a good faith effort to 
    ensure that, in the event an Application does not supply the 
    function or data, the facility still operates, and performs 
    whatever part of its purpose remains meaningful, or 
  
    b) under the GNU GPL, with none of the additional permissions of 
    this License applicable to that copy. 
  
   3. Object Code Incorporating Material from Library Header Files. 
  
   The object code form of an Application may incorporate material from 
 a header file that is part of the Library.  You may convey such object 
 code under terms of your choice, provided that, if the incorporated 
 material is not limited to numerical parameters, data structure 
 layouts and accessors, or small macros, inline functions and templates 
 (ten or fewer lines in length), you do both of the following: 
  
    a) Give prominent notice with each copy of the object code that the 
    Library is used in it and that the Library and its use are 
    covered by this License. 
  
    b) Accompany the object code with a copy of the GNU GPL and this license 
    document. 
  
   4. Combined Works. 
  
   You may convey a Combined Work under terms of your choice that, 
 taken together, effectively do not restrict modification of the 
 portions of the Library contained in the Combined Work and reverse 
 engineering for debugging such modifications, if you also do each of 
 the following: 
  
    a) Give prominent notice with each copy of the Combined Work that 
    the Library is used in it and that the Library and its use are 
    covered by this License. 
  
    b) Accompany the Combined Work with a copy of the GNU GPL and this license 
    document. 
  
    c) For a Combined Work that displays copyright notices during 
    execution, include the copyright notice for the Library among 
    these notices, as well as a reference directing the user to the 
    copies of the GNU GPL and this license document. 
  
    d) Do one of the following: 
  
        0) Convey the Minimal Corresponding Source under the terms of this 
        License, and the Corresponding Application Code in a form 
        suitable for, and under terms that permit, the user to 
        recombine or relink the Application with a modified version of 
        the Linked Version to produce a modified Combined Work, in the 
        manner specified by section 6 of the GNU GPL for conveying 
        Corresponding Source. 
  
        1) Use a suitable shared library mechanism for linking with the 
        Library.  A suitable mechanism is one that (a) uses at run time 
        a copy of the Library already present on the user's computer 
        system, and (b) will operate properly with a modified version 
        of the Library that is interface-compatible with the Linked 
        Version. 
  
    e) Provide Installation Information, but only if you would otherwise 
    be required to provide such information under section 6 of the 
    GNU GPL, and only to the extent that such information is 
    necessary to install and execute a modified version of the 
    Combined Work produced by recombining or relinking the 
    Application with a modified version of the Linked Version. (If 
    you use option 4d0, the Installation Information must accompany 
    the Minimal Corresponding Source and Corresponding Application 
    Code. If you use option 4d1, you must provide the Installation 
    Information in the manner specified by section 6 of the GNU GPL 
    for conveying Corresponding Source.) 
  
   5. Combined Libraries. 
  
   You may place library facilities that are a work based on the 
 Library side by side in a single library together with other library 
 facilities that are not Applications and are not covered by this 
 License, and convey such a combined library under terms of your 
 choice, if you do both of the following: 
  
    a) Accompany the combined library with a copy of the same work based 
    on the Library, uncombined with any other library facilities, 
    conveyed under the terms of this License. 
  
    b) Give prominent notice with the combined library that part of it 
    is a work based on the Library, and explaining where to find the 
    accompanying uncombined form of the same work. 
  
   6. Revised Versions of the GNU Lesser General Public License. 
  
   The Free Software Foundation may publish revised and/or new versions 
 of the GNU Lesser General Public License from time to time. Such new 
 versions will be similar in spirit to the present version, but may 
 differ in detail to address new problems or concerns. 
  
   Each version is given a distinguishing version number. If the 
 Library as you received it specifies that a certain numbered version 
 of the GNU Lesser General Public License "or any later version" 
 applies to it, you have the option of following the terms and 
 conditions either of that published version or of any later version 
 published by the Free Software Foundation. If the Library as you 
 received it does not specify a version number of the GNU Lesser 
 General Public License, you may choose any version of the GNU Lesser 
 General Public License ever published by the Free Software Foundation. 
  
   If the Library as you received it specifies that a proxy can decide 
 whether future versions of the GNU Lesser General Public License shall 
 apply, that proxy's public statement of acceptance of any version is 
 permanent authorization for you to choose that version for the 
 Library. 
 */

package becta.viewer.controls;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.*;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.ThemeManager;


/**
 * This class implements title pane control for AnnotationChooserDialog
 */
public class TitlePane  extends JComponent {
	
	/**
	 * instance of empty border
	 */
    private static final Border handyEmptyBorder = new EmptyBorder(0,0,0,0);
    /**
     * constant that holds image height
     */
    private static final int IMAGE_HEIGHT = 16;
    

    /**
     * PropertyChangeListener added to the JRootPane.
     */
    private PropertyChangeListener propertyChangeListener;
    
    /**
     * Action used to close the Window.
     */
    private Action closeAction;

    /**
     * Button used to close the Frame.
     */
    private JButton closeButton;

    /**
     * Listens for changes in the state of the Window listener to update
     * the state of the widgets.
     */
    private WindowListener windowListener;

    /**
     * Window we're currently in.
     */
    private Window window;

    /**
     * JRootPane rendering for.
     */
    private JRootPane rootPane;

    /**
     * Buffered Frame.state property. As state isn't bound, this is kept
     * to determine when to avoid updating widgets.
     */
    private int state;

    /**
     * Constructor for this class
     * @param root
     * @param ui
     */
    public TitlePane(JRootPane root, BasicRootPaneUI ui) {
    	
        this.rootPane = root;

        state = -1;

        installSubcomponents();
        installDefaults();
        setLayout(createLayout());
    }    

    /**
     * Installs the necessary listeners.
     */
    private void installListeners() {
        if (window != null) {
            windowListener = createWindowListener();
            window.addWindowListener(windowListener);
            propertyChangeListener = createWindowPropertyChangeListener();
            window.addPropertyChangeListener(propertyChangeListener);
        }
    }

    /**
     * Uninstalls the necessary listeners.
     */
    private void uninstallListeners() {
        if (window != null) {
            window.removeWindowListener(windowListener);
            window.removePropertyChangeListener(propertyChangeListener);
        }
    }

    /**
     * Returns the <code>WindowListener</code> to add to the
     * <code>Window</code>.
     */
    private WindowListener createWindowListener() {
        return new WindowHandler();
    }

    /**
     * Returns the <code>PropertyChangeListener</code> to install on
     * the <code>Window</code>.
     */
    private PropertyChangeListener createWindowPropertyChangeListener() {
        return new PropertyChangeHandler();
    }

    /**
     * Returns the <code>JRootPane</code> this was created for.
     */
    public JRootPane getRootPane() {
        return rootPane;
    }

    /**
     * Returns the decoration style of the <code>JRootPane</code>.
     */
    private int getWindowDecorationStyle() {
        return getRootPane().getWindowDecorationStyle();
    }

    /**
     * Overrides addNotify method
     */
    public void addNotify() {
        super.addNotify();

        uninstallListeners();

        window = SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            if (window instanceof Frame) {
                setState(((Frame)window).getExtendedState());
            }
            else {
                setState(0);
            }
            setActive(window.isActive());
            installListeners();
        }
    }

    /**
     * Overrides removeNotify method
     */
    public void removeNotify() {
        super.removeNotify();

        uninstallListeners();
        window = null;
    }

    /**
     * Adds any sub-Components contained in the <code>MetalTitlePane</code>.
     */
    private void installSubcomponents() {
        int decorationStyle = getWindowDecorationStyle();
        if (decorationStyle == JRootPane.FRAME) {
            createActions();            
            createButtons();
            add(closeButton);
        } else if (decorationStyle == JRootPane.PLAIN_DIALOG ||
                decorationStyle == JRootPane.INFORMATION_DIALOG ||
                decorationStyle == JRootPane.ERROR_DIALOG ||
                decorationStyle == JRootPane.COLOR_CHOOSER_DIALOG ||
                decorationStyle == JRootPane.FILE_CHOOSER_DIALOG ||
                decorationStyle == JRootPane.QUESTION_DIALOG ||
                decorationStyle == JRootPane.WARNING_DIALOG) {
            createActions();
            createButtons();
            add(closeButton);
        }
    }

   

    /**
     * Installs the fonts and necessary properties on the MetalTitlePane.
     */
    private void installDefaults() {
        setFont(UIManager.getFont("InternalFrame.titleFont", getLocale()));
    }

    /**
     * Closes the Window.
     */
    private void close() {
        Window window = getWindow();

        if (window != null) {
            window.dispatchEvent(new WindowEvent(
                                 window, WindowEvent.WINDOW_CLOSING));
        }
    }

    /**
     * Create the <code>Action</code>s that get associated with the
     * buttons and menu items.
     */
    private void createActions() {
        closeAction = new CloseAction();
    }

    /**
     * Returns a <code>JButton</code> appropriate for placement on the
     * TitlePane.
     */
    private JButton createTitleButton() {
    	
    	//creates button and set its properties
        JButton button = new JButton();
        button.setFocusPainted(false);
        button.setFocusable(false);
        button.setOpaque(true);
        return button;
    }

    /**
     * Creates the Buttons that will be placed on the TitlePane.
     */
    private void createButtons() {
    	
    	//set properties for close button
        closeButton = createTitleButton();
        closeButton.setAction(closeAction);
        closeButton.setText(null);
        closeButton.putClientProperty("paintActive", Boolean.TRUE);
        closeButton.setBorder(handyEmptyBorder);
        closeButton.getAccessibleContext().setAccessibleName("Close");
        closeButton.setIcon(new ImageIcon(TitlePane.class.getResource("resources/close.png")));
    }

    /**
     * Returns the <code>LayoutManager</code> that should be installed on
     * the <code>MetalTitlePane</code>.
     */
    private LayoutManager createLayout() {
        return new TitlePaneLayout();
    }

    /**
     * Updates state dependant upon the Window's active state.
     */
    private void setActive(boolean isActive) {
        Boolean activeB = isActive ? Boolean.TRUE : Boolean.FALSE;

        closeButton.putClientProperty("paintActive", activeB);
        
        // Repaint the whole thing as the Borders that are used have
        // different colors for active vs inactive
        getRootPane().repaint();
    }

    /**
     * Sets the state of the Window.
     */
    private void setState(int state) {
        setState(state, false);
    }

    /**
     * Sets the state of the window. If <code>updateRegardless</code> is
     * true and the state has not changed, this will update anyway.
     */
    private void setState(int state, boolean updateRegardless) {
        Window w = getWindow();

        if (w != null && getWindowDecorationStyle() == JRootPane.FRAME) {
        
        	if (this.state == state && !updateRegardless) {
                return;
            }
        
            Frame frame = getFrame();

            if (frame != null) {
                JRootPane rootPane = getRootPane();

                if (((state & Frame.MAXIMIZED_BOTH) != 0) &&
                        (rootPane.getBorder() == null ||
                        (rootPane.getBorder() instanceof UIResource)) &&
                            frame.isShowing()) {
                    rootPane.setBorder(null);
                }                
                if (frame.isResizable()) {
                   revalidate();
                   repaint();
                 }
            }                
        }           
        else {
            revalidate();
            repaint();
        }
        closeAction.setEnabled(true);
        this.state = state;
        
    }
    
    /**
     * Returns the Frame rendering in. This will return null if the
     * <code>JRootPane</code> is not contained in a <code>Frame</code>.
     */
    private Frame getFrame() {
        Window window = getWindow();

        if (window instanceof Frame) {
            return (Frame)window;
        }
        return null;
    }

    /**
     * Returns the <code>Window</code> the <code>JRootPane</code> is
     * contained in. This will return null if there is no parent ancestor
     * of the <code>JRootPane</code>.
     */
    private Window getWindow() {
        return window;
    }

    /**
     * Returns the String to display as the title.
     */
    private String getTitle() {
        Window w = getWindow();

        if (w instanceof Frame) {
            return ((Frame)w).getTitle();
        }
        else if (w instanceof Dialog) {
            return ((Dialog)w).getTitle();
        }
        return null;
    }

    /**
     * Renders the TitlePane.
     */
    public void paintComponent(Graphics g)  {
    	
    	
        // As state isn't bound, we need a convenience place to check
        // if it has changed. Changing the state typically changes the
        if (getFrame() != null) {
            setState(getFrame().getExtendedState());
        }
                
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2d = (Graphics2D)g;
        
        if(ThemeManager.isDefaultTheme()){
        	
	        //fills gradient background for title pane
		    GradientPaint gradient = new GradientPaint(0, 0, new Color(255,255,255) , 0,height,new Color(243,243,243), false);   
		    g2d.setPaint(gradient);
		    g2d.fillRect(0, 0, width, height);
        }
        else{
        	
        	g2d.setColor(AccessibilityColor.control);
        	g2d.fillRect(0, 0, width, height);
        }
	    
	    //draws title
	    if(getTitle()!=null){
	    	g2d.setColor(AccessibilityColor.controlText);
	    	g2d.drawString(getTitle(), 25, 15);
	    }
	    
	    //draws bottom border
	    g2d.setColor(AccessibilityColor.controlShadow);
	    g.drawLine(0, height-1, width, height-1);
	    
	    //draws left border for close button
	    g.drawLine(width-20, 0, width-20, height-1);
	    
	    g2d.setColor(AccessibilityColor.controlShadow);
	    int y = 6;
	    for(int i =0 ; i< 3;++i ){
	    	int x = 6;
	    	for(int j =0 ; j< 4;++j ){
	    		g2d.fillRect(x, y, 2, 2);
	    		x+=4;
	    	}
	    	y+=4;
	    }	        
    }

    /**
     * Actions used to <code>close</code> the <code>Window</code>.
     */
    private class CloseAction extends AbstractAction {
        public CloseAction() {
            super(UIManager.getString("MetalTitlePane.closeTitle",
                                      getLocale()));
        }

        /**
         * Handles action
         */
        public void actionPerformed(ActionEvent e) {
            close();
        }      
    }

    /**
     * This class implements the layout for TitlePane
     */
    private class TitlePaneLayout implements LayoutManager {  
        
    	/**
    	 * if the layout manager uses a per-component string,
    	 * adds the component <code>comp</code> to the layout,
    	 * associating it 
    	 * with the string specified by <code>name</code>.
    	 */
    	public void addLayoutComponent(String name, Component c) {}
    	
    	/**
    	 * Removes the specified component from the layout.
    	 */
        public void removeLayoutComponent(Component c) {}
        
        /**
         * Calculates the preferred size dimensions for the specified 
         * container, given the components it contains.
         */
        public Dimension preferredLayoutSize(Container c)  {
            int height = computeHeight();
            return new Dimension(height, height);
        }
        
        /**
         * Calculates the minimum size dimensions for the specified 
         * container, given the components it contains.
         */
        public Dimension minimumLayoutSize(Container c) {
            return preferredLayoutSize(c);
        } 
    
        /**
         * Computes the height of title pane
         * @return height
         */
        private int computeHeight() {      
            FontMetrics fm = rootPane.getFontMetrics(getFont());
            int fontHeight = fm.getHeight();
            fontHeight += 7;
            int iconHeight = 0;
            if (getWindowDecorationStyle() == JRootPane.FRAME) {
                iconHeight = IMAGE_HEIGHT;
            }

            int finalHeight = Math.max( fontHeight, iconHeight );
            return finalHeight;
        }    
                   
        /**
         * Performs layout for the component
         */
        public void layoutContainer(Container c) {
            
        	int y = 5;
            int spacing = 3;
            
            //set the size of close button
            int buttonHeight = closeButton.getIcon().getIconHeight(); 
            int buttonWidth = closeButton.getIcon().getIconWidth();
            int x = getWidth() - (buttonWidth+spacing);
            closeButton.setBounds( x, y, buttonWidth, buttonHeight);

        }
    }



    /**
     * PropertyChangeListener installed on the Window. Updates the necessary
     * state as the state of the Window changes.
     */
    private class PropertyChangeHandler implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent pce) {
            String name = pce.getPropertyName();

            // Frame.state isn't currently bound.
            if ("state".equals(name)) {
                Frame frame = getFrame();

                if (frame != null) {
                    setState(frame.getExtendedState(), true);
                }
            }
        }
    }


    /**
     * WindowListener installed on the Window, updates the state as necessary.
     */
    private class WindowHandler extends WindowAdapter {
        public void windowActivated(WindowEvent ev) {
            setActive(true);
        }

        public void windowDeactivated(WindowEvent ev) {
            setActive(false);
        }
    }
}  
