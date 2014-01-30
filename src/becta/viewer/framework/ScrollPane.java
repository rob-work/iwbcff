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

package becta.viewer.framework;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.controls.Revealer;
import becta.viewer.filemanagement.Document;

/**
 * This class implements the scroll pane for the viewer
 */
public class ScrollPane extends JPanel implements AdjustmentListener  {

	/**
	 * the canvas
	 */
	private Canvas canvas;
	/**
	 * the panel into which the canvas will be placed
	 */
	private JPanel contentPanel;
	/**
	 * the inner scroll pane
	 */
	private JScrollPane innerScrollPane;
	/**
	 * Horizontal scrollbar for the scroll pane
	 */
	private JScrollBar hScrollBar;
	/**
	 * Vertical scrollbar for the scroll pane
	 */
	private JScrollBar vScrollBar;
	/**
	 * Holds the size of scroll bars
	 */
	private static final int SCROLLBAR_SIZE = 15;
	/**
	 * Layered panel for holding revealer and innerScrollPane
	 */
	private JLayeredPane scrollPaneHolder;
	/**
	 * Holds the revealer
	 */
	private Revealer revealer;
	
	private BasicStroke borderStroke = new BasicStroke(2);
	
	/**
	 * the constructor of the class
	 * @param handle    the handle this scroll pane is linked to
	 */
	public ScrollPane(){

		//set layout for ScrollPane
		this.setLayout(null);
		Dimension desktopSize = Viewer.getViewer().getDesktop().getSize();
		setSize(desktopSize);
		
		//creates instance of canvas
		canvas = new Canvas(this);
		
		//creates content panel
		contentPanel = new JPanel();
		contentPanel.setBackground(AccessibilityColor.contentBackColour);
		
		//set layout
		GridBagLayout gridBag=new GridBagLayout();
		contentPanel.setLayout(gridBag);
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.NONE;
		c.anchor=GridBagConstraints.CENTER;
		c.gridwidth=GridBagConstraints.REMAINDER;
		
		//set layout constrains and add canvas to content panel
		gridBag.setConstraints(canvas, c);
		contentPanel.add(canvas);
		
		//Creates inner scroll pane and adds to ScrollPane
		innerScrollPane=new JScrollPane(contentPanel);
		innerScrollPane.setBorder(null);

		//creates vertical scrollbar and set its location
		vScrollBar = new JScrollBar(JScrollBar.VERTICAL);
		vScrollBar.setLocation(getWidth() - SCROLLBAR_SIZE, 0);
		vScrollBar.addAdjustmentListener(this);
		
		//creates horizontal scrollbar and set its location
		hScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
		hScrollBar.setLocation(0, getHeight() - SCROLLBAR_SIZE);
		hScrollBar.addAdjustmentListener(this);
		
		//updates the size of control
		updateSize();
		
		//set the vertical scrollbar of innerScrollPane  as vScrollBar
		innerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		innerScrollPane.setVerticalScrollBar(vScrollBar);
		
		//set the horizontal scrollbar of innerScrollPane  as hScrollBar
		innerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		innerScrollPane.setHorizontalScrollBar(hScrollBar);
		innerScrollPane.setWheelScrollingEnabled(false);
		
		//embeds the innerScrollPane in an layered panel
		scrollPaneHolder = new JLayeredPane();
		scrollPaneHolder.setLayout(null);
		scrollPaneHolder.setSize(innerScrollPane.getSize());
		
		
		//adds revealer and innerScrollPane to layered panel
		scrollPaneHolder.add(innerScrollPane, JLayeredPane.DEFAULT_LAYER);
		
		//creates revealer and adds to panel
		revealer = new Revealer(canvas.getSize());
		revealer.setVisible(false);
		scrollPaneHolder.add(revealer, JLayeredPane.PALETTE_LAYER);
		
		//adds components
		this.add(vScrollBar);
		this.add(hScrollBar);
		this.add(scrollPaneHolder);
	}
	
	/**
	 * This method is used to toggle the revealer
	 * @param show
	 */
	public void showRevealer(boolean show){

		Rectangle rect = calculateRevealerBounds();
		revealer.setRevealerLocation(rect.getLocation());
		revealer.setVisible(show);
		updateHeavyComponent();	
		Viewer.getViewer().toggleRevealerIcon(show);
	}
	
	/**
	 * Gets the revealer
	 * @return
	 */
	public Revealer getRevealer() {
		
		return revealer;
	}

	/**
	 * Gets the canvas instance
	 * @return the canvas
	 */
	public final Canvas getCanvas(){

		return canvas;
	}
	
	/**
	 * Gets the inner scroll pane
	 * @return the inner scrollpane
	 */
	public final JScrollPane getInnerScrollpane(){
		
		return innerScrollPane;
	}
	
	/**
	 * Performs layout.
	 * Called when canvas size is changed
	 */
	public final void doCustomLayout(){
		
		updateSize();
		contentPanel.doLayout();
		innerScrollPane.getViewport().doLayout();

		updateHeavyComponent();
	}

	/**
	 * @return the scroll bar values
	 */
	public final Dimension getScrollValues(){

		return new Dimension(hScrollBar.getValue(), vScrollBar.getValue());
	}

	
	/**
	 * @return the viewport
	 */
	public final Rectangle getViewportBounds(){
		return innerScrollPane.getViewport().getViewRect();
	}

	/**
	 * the method used to scroll the content to center
	 */
	public final void scrollToCenter(){
		
		hScrollBar.setValue((hScrollBar.getModel().getMaximum()-hScrollBar.getModel().getExtent())/2);
		vScrollBar.setValue((vScrollBar.getModel().getMaximum()-vScrollBar.getModel().getExtent())/2);
	}

	/**
	 * Updates the size of control for change in position of toolbar
	 */
	public void updateSize(){
		
		//when both scrollbars are visible
		if(canvas.getPreferredSize().width > getWidth() && canvas.getPreferredSize().height > getHeight()){
			
			innerScrollPane.setSize(getWidth() - SCROLLBAR_SIZE, getHeight() - SCROLLBAR_SIZE);
			vScrollBar.setSize(SCROLLBAR_SIZE, getHeight() - SCROLLBAR_SIZE);
			hScrollBar.setSize(getWidth() - SCROLLBAR_SIZE, SCROLLBAR_SIZE);
			vScrollBar.setVisible(true);
			hScrollBar.setVisible(true);
		}
		//when only horizontal scrollbar is present
		else if(canvas.getPreferredSize().width > getWidth()){
			
			innerScrollPane.setSize(getWidth() , getHeight() - SCROLLBAR_SIZE);
			vScrollBar.setVisible(false);
			hScrollBar.setVisible(true);
			hScrollBar.setSize(getWidth(), SCROLLBAR_SIZE);
		}
		//when only vertical scrollbar is present 
		else if(canvas.getPreferredSize().height > getHeight()){
			
			innerScrollPane.setSize(getWidth() - SCROLLBAR_SIZE , getHeight());
			hScrollBar.setVisible(false);
			vScrollBar.setVisible(true);
			vScrollBar.setSize(SCROLLBAR_SIZE, getHeight());
		}
		//when no scrollbar is present
		else{
			
			innerScrollPane.setSize(getSize());
			vScrollBar.setVisible(false);
			hScrollBar.setVisible(false);
		}
		
		//calls validate() after resize of innerScrollPane
		if(innerScrollPane.getParent() != null)
			innerScrollPane.getParent().validate();
		
		updateRevealer();
		
		repaint();
	}
	
	/**
	 * Handles the float change event of toolbar.
	 * This is used to update the size of control
	 */
	public void floatChanged() {

		Document document = canvas.getDocument();
		
		//if no viewport defined in file, utilise available screen size
		if(document.isDefaultViewport()){
			
			canvas.setCanvasSize(document.calculateDefaultViewportSize());
			
			//layouts scroll pane for the change in canvas size
			doCustomLayout();
			canvas.refreshCanvasContent(true);
		}

		Dimension desktopSize = Viewer.getViewer().getDesktop().getSize();
		setSize(desktopSize);
		updateSize();
		scrollPaneHolder.setSize(innerScrollPane.getSize());
		vScrollBar.setLocation(getWidth() - SCROLLBAR_SIZE, 0);
		hScrollBar.setLocation(0, getHeight() - SCROLLBAR_SIZE);
		
		//updates revealer size
		updateRevealer();
		
		canvas.refreshCanvasContent(true);
		updateHeavyComponent();
	}

	/**
	 * Handles the adjustmentValueChanged event of scrollbars
	 * Used to show heavy weight components in canvas that are visible by scrolling
	 */
	public void adjustmentValueChanged(AdjustmentEvent e) {

		updateHeavyComponent();
		
		canvas.refreshCanvasContent(false);
	}
	
	/**
	 * Calls method in canvas to show heavy weight components that are visible in view
	 */
	public void updateHeavyComponent(){
		
		Rectangle boundRect = scrollPaneHolder.isShowing() ? new Rectangle(scrollPaneHolder.getLocationOnScreen(), innerScrollPane.getSize()): new Rectangle();
		
		//when revealer is present, we have to take in account the position of revealer also
		if(revealer!=null && revealer.isVisible()){
			
			canvas.checkHeavyComponent(boundRect.intersection(revealer.getViewBounds()));
		}
		else{
			
			canvas.checkHeavyComponent(boundRect);
		}
	}
	
	/**
	 * Update revealer location & size
	 */
	private void updateRevealer(){
		
		if(revealer != null){

			Rectangle bounds = calculateRevealerBounds();
			revealer.setRevealerLocation(bounds.getLocation());
			revealer.updateRevealerSize(bounds.getSize());
		}
	}
	
	/**
	 * Calculates the bounds for revealer
	 * @return bounds
	 */
	private Rectangle calculateRevealerBounds(){
		
		Dimension canvasSize = canvas.getPreferredSize();
		Dimension desktopSize = Viewer.getViewer().getDesktop().getSize();
		Dimension contentArea;
		
		Point revealerLocation = new Point(0,0);
		
		if(hScrollBar.isVisible() && vScrollBar.isVisible()){
			
			contentArea = new Dimension(desktopSize.width- SCROLLBAR_SIZE, desktopSize.height - SCROLLBAR_SIZE);
		}
		else if(hScrollBar.isVisible()){
			
			contentArea = new Dimension(desktopSize.width, desktopSize.height - SCROLLBAR_SIZE);
			revealerLocation.setLocation(0, (contentArea.height - canvasSize.height)/2);
		}
		else if(vScrollBar.isVisible()){
			
			contentArea = new Dimension(desktopSize.width- SCROLLBAR_SIZE, desktopSize.height);
			revealerLocation.setLocation((contentArea.width - canvasSize.width)/2, 0);
		}
		else{
			contentArea = desktopSize;
			revealerLocation.setLocation((contentArea.width - canvasSize.width)/2, (contentArea.height - canvasSize.height)/2);
		}
		
		int revealerWidth = canvasSize.width > contentArea.width ? contentArea.width: canvasSize.width;
		int revealerHeight = canvasSize.height > contentArea.height ? contentArea.height: canvasSize.height;
		
		return new Rectangle(revealerLocation.x, revealerLocation.y, revealerWidth, revealerHeight);
		
	}
	
}
