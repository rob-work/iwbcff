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

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.util.ResourceBundle;

import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.framework.Viewer;

/**
 * This class implements the revealer
 */
public class Revealer extends JPanel {

	/**
	 * used for showing left drag handle
	 */
	private JButton btnLeft;
	/**
	 * used for showing right drag handle
	 */
	private JButton btnRight;
	/**
	 * used for showing top drag handle
	 */
	private JButton btnTop;
	/**
	 * used for showing bottom drag handle
	 */
	private JButton btnBottom;
	/**
	 * indicates the user is dragging using the left drag handle
	 */
	private boolean dragFromLeft;
	/**
	 * indicates the user is dragging using the right drag handle
	 */
	private boolean dragFromRight;
	/**
	 * indicates the user is dragging using the top drag handle
	 */
	private boolean dragFromTop;
	/**
	 * indicates the user is dragging using the bottom drag handle
	 */
	private boolean dragFromBottom;

	private int diff;
	/**
	 * Holds the width of drag handle
	 */
	private static final int DRAG_BUTTON_WIDTH = 45;
	/**
	 * Holds the height of drag handle
	 */
	private static final int DRAG_BUTTON_HEIGHT = 11;
	/**
	 * Holds the margin for drawing the border rectangle of revealer
	 */
	private static final int MARGIN  = 11;
	/**
	 * Holds the percentage of area to be revealer on a key stroke
	 */
	private static final int KB_REVEAL_PERCENT = 10;
	/**
	 * Holds the current bounds of revealer
	 */
	private Rectangle currentBounds;
	/**
	 * Holds the actual bounds of revealer
	 */
	private Rectangle initialBounds;
	/**
	 * Holds the orientation of revealer
	 */
	private int orientation = SwingConstants.CENTER;
	
	private ResourceBundle resourceBundle;
	
	/**
	 * Constructor for this class  
	 * @param size Size of revealer
	 */
	public Revealer(Dimension size) {

		// set layout and size
		this.setLayout(null);	
		this.setSize(size);

		resourceBundle = ResourceBundle.getBundle("becta.viewer.controls.resources");
		
		setBackground(AccessibilityColor.revealerColour);
		setBorder(BorderFactory.createLineBorder(AccessibilityColor.revealerBorder));
		
		int widthDiff = size.width - DRAG_BUTTON_WIDTH;
		int heightDiff = size.height - DRAG_BUTTON_WIDTH;
		
		//creates left drag handle and set its icon
		btnLeft = createHandleButton(new Rectangle((MARGIN - DRAG_BUTTON_HEIGHT), heightDiff/2, DRAG_BUTTON_HEIGHT, DRAG_BUTTON_WIDTH));
		btnLeft.setIcon(getHandleIcon(SwingConstants.WEST,false));
		btnLeft.setRolloverIcon(getHandleIcon(SwingConstants.WEST,true));
		btnLeft.setCursor( Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
		setAccessibility(btnLeft, "LeftRevealerHandle");
		
		//creates right drag handle and set its icon
		btnRight = createHandleButton(new Rectangle(size.width - MARGIN, heightDiff/2, DRAG_BUTTON_HEIGHT, DRAG_BUTTON_WIDTH));
		btnRight.setIcon(getHandleIcon(SwingConstants.EAST,false));
		btnRight.setRolloverIcon(getHandleIcon(SwingConstants.EAST,true));
		btnRight.setCursor( Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
		setAccessibility(btnRight, "RightRevealerHandle");
		
		//creates top drag handle and set its icon
		btnTop = createHandleButton(new Rectangle(widthDiff/2, (MARGIN - DRAG_BUTTON_HEIGHT), DRAG_BUTTON_WIDTH, DRAG_BUTTON_HEIGHT));
		btnTop.setIcon(getHandleIcon(SwingConstants.NORTH,false));
		btnTop.setRolloverIcon(getHandleIcon(SwingConstants.NORTH,true));
		btnTop.setCursor( Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		setAccessibility(btnTop, "TopRevealerHandle");
		
		//creates bottom drag handle and set its icon
		btnBottom = createHandleButton(new Rectangle(widthDiff/2, size.height-MARGIN, DRAG_BUTTON_WIDTH, DRAG_BUTTON_HEIGHT));
		btnBottom.setIcon(getHandleIcon(SwingConstants.SOUTH,false));
		btnBottom.setRolloverIcon(getHandleIcon(SwingConstants.SOUTH,true));
		btnBottom.setCursor( Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		setAccessibility(btnBottom, "BottomRevealerHandle");
		
		currentBounds = new Rectangle(0,0,0,0);

		//adds drag handles to the revealer
		this.add(btnTop);
		this.add(btnRight);
		this.add(btnBottom);
		this.add(btnLeft);
	}
	
	/**
	 * User this method for setting the location of Revealer
	 * @param p
	 */
	public void setRevealerLocation(Point p){
		
		Point loc = p;
		
		if(orientation == SwingConstants.WEST){
			
			loc = new Point(p.x + (initialBounds.width - getWidth()), p.y);
		}
		else if(orientation == SwingConstants.SOUTH){
			loc = new Point(p.x, p.y + (initialBounds.height - getHeight()));
		}
		
		setLocation(loc);
		currentBounds.setLocation(loc);
		
		if(initialBounds == null)
			initialBounds = new Rectangle();
		initialBounds.setLocation(p);
	}
	
	/**
	 * This method is used for setting the initial bound of revealer
	 * @param orientation Specifies where the revealer starts from
	 * @param value Area to be hidden
	 */
	public void setInitialPosition(int orientation, int value){
		
		this.orientation = orientation;
		
		hideHandles();
		
		switch(orientation){
		
			case SwingConstants.NORTH:
				currentBounds.height = value;
				setSize(initialBounds.width, currentBounds.height+1);
				break;
			case SwingConstants.SOUTH:
				currentBounds.height = value;
				setLocation(initialBounds.x, initialBounds.y + (initialBounds.height - currentBounds.height));
				setSize(initialBounds.width, currentBounds.height);
				currentBounds.y = getY();
				break;
				
			case SwingConstants.WEST:
				currentBounds.width = value;
				setSize(currentBounds.width+1, initialBounds.height);
				break;
				
			case SwingConstants.EAST:
				currentBounds.width = value;
				setSize(currentBounds.width, initialBounds.height);
				setLocation(initialBounds.x + (initialBounds.width - currentBounds.width), initialBounds.y);
				currentBounds.x = getX();
				break;
				
			case SwingConstants.CENTER:
				setSize(initialBounds.width, initialBounds.height);
				setLocation(initialBounds.x, initialBounds.y);
				currentBounds.setLocation(initialBounds.getLocation());
				currentBounds.setSize(initialBounds.getSize());
				break;
		}
		
		updateHandles();
	}
	
	/**
	 * This method is used for updating the size of revealer
	 * @param size new size
	 */
	public void updateRevealerSize(Dimension size) {
		
		if(orientation == SwingConstants.CENTER || currentBounds.width == 0 || currentBounds.height == 0){
			this.setSize(size);
			currentBounds.setSize(size);
		}
		else if(orientation == SwingConstants.WEST || orientation == SwingConstants.EAST){
			
			double xdiff = size.getWidth()/initialBounds.getWidth();
			int newWidth = getWidth() == MARGIN ? MARGIN : (int)(xdiff * currentBounds.width);
			currentBounds.width = newWidth > MARGIN ? newWidth: MARGIN;
			currentBounds.height = size.height;
			setSize(currentBounds.getSize());
		}
		else if(orientation == SwingConstants.NORTH || orientation == SwingConstants.SOUTH){
			
			double ydiff = size.getHeight()/initialBounds.getHeight();
			int newHeight = getHeight() == MARGIN ? MARGIN : (int)(ydiff * currentBounds.height);
			currentBounds.height = newHeight > MARGIN ? newHeight: MARGIN;
			currentBounds.width = size.width;
			setSize(currentBounds.getSize());
		}
		
		initialBounds = new Rectangle(initialBounds.getLocation(), size);
		
		//set location for drag handles
		int heightDiff = size.height - DRAG_BUTTON_WIDTH;
		int widthDiff = size.width - DRAG_BUTTON_WIDTH;
		btnLeft.setBounds((MARGIN - DRAG_BUTTON_HEIGHT), heightDiff/2, DRAG_BUTTON_HEIGHT, DRAG_BUTTON_WIDTH);
		btnRight.setBounds(size.width - MARGIN, heightDiff/2, DRAG_BUTTON_HEIGHT, DRAG_BUTTON_WIDTH);	
		btnTop.setBounds(widthDiff/2, (MARGIN - DRAG_BUTTON_HEIGHT), DRAG_BUTTON_WIDTH, DRAG_BUTTON_HEIGHT);
		btnBottom.setBounds(widthDiff/2, size.height-MARGIN, DRAG_BUTTON_WIDTH, DRAG_BUTTON_HEIGHT);
		
		updateHandles();
	}
	
	/**
	 * Gets the rectangle that is not hidden by revealer
	 * @return
	 */
	public Rectangle getViewBounds() {
		
		return getViewBounds(getX(), getY());
	}
	
	/**
	 * Overrides paint for drawing the handle button icons while dragging
	 */
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//draws right handle button
		if(dragFromRight){
			
			int heightDiff = getHeight() - DRAG_BUTTON_WIDTH;
			Point p = new Point(getWidth() - MARGIN, heightDiff/2);
			
			ImageIcon icon = (ImageIcon)btnRight.getRolloverIcon();
			g.drawImage(icon.getImage(), p.x, p.y, null);
		}
		//draws bottom handle button
		else if(dragFromBottom){
			
			int widthDiff = getWidth() - DRAG_BUTTON_WIDTH;
			Point p = new Point(widthDiff/2, getHeight()-MARGIN);
			
			ImageIcon icon = (ImageIcon)btnBottom.getRolloverIcon();
			g.drawImage(icon.getImage(), p.x, p.y, null);
		}
	}
	
	/**
	 * This method is used for creating the drag handles 
	 * @param bounds
	 * @return drag handles button
	 */
	private JButton createHandleButton(Rectangle bounds){
		
		//creates button and set its properties
		JButton handleButton = new JButton(){
			
			@Override
			public void paint(Graphics g) {
				
				Icon icon;
				if(isEnabled()){
				
					if(hasFocus())
					{
						g.drawRect(0, 0, getWidth()-1, getHeight()-1);
						icon = getRolloverIcon();
					}
					else
						icon = getIcon();
				}
				else
					icon = getDisabledIcon();
				
				if(icon!=null){
			    	icon.paintIcon(this, g, 1, 1);
			    }			
			}
		};
		handleButton.setBorder(null);
		handleButton.setContentAreaFilled(false);
		handleButton.setBounds(bounds);
		
		//adds mouse listener
		handleButton.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mousePressed(MouseEvent e) {

				handleMousePressed(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {

				handleMouseReleased(e);
			}
		});
		
		//adds mouse motion listener
		handleButton.addMouseMotionListener(new MouseMotionAdapter(){
			
			@Override
			public void mouseDragged(MouseEvent e) {

				handleMouseDragged(e);
			}
		});
		
		//adds key listener
		handleButton.addKeyListener(new KeyAdapter(){
		
			@Override
			public void keyPressed(KeyEvent e) {

				//handleKeyPressed(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {

				handleKeyReleased(e);
			}
		});
		
		//return the drag handle created
		return handleButton;
	}
		
	/**
	 * This method handles the mouse pressed event for drag handles
	 * @param e
	 */
	private void handleMousePressed(MouseEvent e){
		
		//when user starts to drag from left, set dragFromLeft true and calculates correction value
		if(e.getSource() == btnLeft){
			
			dragFromLeft = true;
			diff = (int)(btnLeft.getX() + btnLeft.getWidth()) - e.getX();
		}
		
		//when user starts to drag from right, set dragFromRight true and calculates correction value
		if(e.getSource() == btnRight){
			
			dragFromRight = true;
			diff = e.getX() - (int)btnRight.getX();
		}
		
		//when user starts to drag from top, set dragFromTop true and calculates correction value
		if(e.getSource() == btnTop){
		
			dragFromTop = true;
			diff= e.getY();
		}
		
		//when user starts to drag from bottom, set dragFromBottom true and calculates correction value
		if(e.getSource() == btnBottom){
			
			dragFromBottom = true;
			diff = e.getY() ;
		}
	}
	
	/**
	 * This method handles the mouse released event for drag handles
	 * @param e
	 */
	private void handleMouseReleased(MouseEvent e){
		
		//when dragging from left is finished, set dragFromLeft false and redraw border
		if(dragFromLeft){

			dragFromLeft = false;
			diff = 0;
			
			currentBounds.width = getWidth();
			currentBounds.x = getX();
		}
		
		//when dragging from right is finished, set dragFromRight false and redraw border
		if(dragFromRight){
			dragFromRight = false;
			diff = 0;
			
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			currentBounds.width=getWidth();
		}
		
		//when dragging from top is finished, set dragFromTop false and redraw border
		if(dragFromTop){
			
			dragFromTop=false;
			diff=0;
			
			currentBounds.height = getHeight();
			currentBounds.y = getY();
		}
		
		//when dragging from bottom is finished, set dragFromBottom false and redraw border
		if(dragFromBottom){
			dragFromBottom = false;
			diff=0;
			
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			currentBounds.height = getHeight();
			
			
		}
		
		//updates the drag handles
		updateHandles();
	}
	
	/**
	 * This method handles the mouse dragged event for drag handles
	 * @param e
	 */
	private void handleMouseDragged(MouseEvent e){
				
		//hides unused handles while dragging
		hideHandles();

		//if user is dragging using left drag handle
		if(dragFromLeft){

			//calculates new value of X location for revealer
			int newX = getX() + e.getX() + (MARGIN - DRAG_BUTTON_HEIGHT)  - diff;
			
			int newWidth = currentBounds.width - newX + currentBounds.x;
			
			if(newWidth < MARGIN){
				newX = initialBounds.width - MARGIN + initialBounds.x;
				newWidth = MARGIN;
			}
			
			if(newWidth > initialBounds.width){

				newX = initialBounds.x;
				newWidth = initialBounds.width;
			}
			
			setLocation(newX, getY());
			setSize(newWidth, getHeight());
			
			updateLocation();
		}
		
		//if user is dragging using right drag handle
		if(dragFromRight){

			btnRight.setSize(0, 0);
			setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
			
			int newWidth = currentBounds.width + e.getX();
			
			if(newWidth < MARGIN)
				newWidth = MARGIN;
			
			if(newWidth > initialBounds.width)
				newWidth = initialBounds.width;
			
			setSize(newWidth, getHeight());
			
			updateLocation();
		}
		
		//if user is dragging using top drag handle
		if(dragFromTop){
			
			//calculates new value of Y location for revealer
			int newY = getY() + e.getY() -diff;
			
			int newHeight = currentBounds.height - newY + currentBounds.y;
			
			if(newHeight < MARGIN){
				
				newY = initialBounds.height - MARGIN + initialBounds.y;
				newHeight = MARGIN;
			}
			
			if(newHeight > initialBounds.height){
				newY = initialBounds.y;
				newHeight = initialBounds.height;
			}
			
			setLocation(getX(), newY);
			setSize(getWidth(), newHeight);
			
			updateLocation();
		}
		
		//if user is dragging using bottom drag handle
		if(dragFromBottom){
			
			//btnBottom.setVisible(false);
			btnBottom.setSize(0, 0);
			setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
			
			int newHeight = currentBounds.height + e.getY();
			
			if(newHeight < MARGIN)
				newHeight = MARGIN;
			
			if(newHeight > initialBounds.height)
				newHeight = initialBounds.height;
			
			setSize(getWidth(),newHeight);
			
			updateLocation();
		}
		
	}
	
	/**
	 * Set new location for revealer
	 * @param x
	 * @param y
	 */
	private void updateLocation(){

		//checks for any heavy weight component that made visible on revealing
		Viewer.getViewer().getActiveFrame().getCanvas().checkHeavyComponent(getViewBounds());
	}
	
	/**
	 * Gets the rectangle that is not hidden by revealer
	 * @param x
	 * @param y
	 * @return
	 */
	private Rectangle getViewBounds(int x, int y){
		
		Rectangle viewRect = new Rectangle(0,0,0,0);
		
		int xDiff = isDisplayable() ? getLocationOnScreen().x - getX() : 0;
		int yDiff = isDisplayable() ? getLocationOnScreen().y - getY() : 0;
		
		if(getHeight() == initialBounds.height){
			
			if(getX() == initialBounds.x){
				viewRect.setLocation(initialBounds.x + getWidth() + xDiff, getY());
			}
			else{
				viewRect.setLocation(initialBounds.x + xDiff, getY());
			}
			viewRect.setSize(initialBounds.width - getWidth(), getHeight());
		}
		else if(getWidth() == initialBounds.width){
			
			if(getY() == initialBounds.y){
				
				viewRect.setLocation(getX(), initialBounds.y + getHeight() + yDiff);
			}
			else{
			
				viewRect.setLocation(getX(), initialBounds.y + yDiff);
			}
			viewRect.setSize(getWidth(), initialBounds.height - getHeight());
		}

		return viewRect;
	}
	
	/**
	 * Hides drag handles while dragging
	 */
	private void hideHandles(){
		
		if(btnLeft.isVisible() && !dragFromLeft)
			btnLeft.setVisible(false);
		if(btnRight.isVisible() && !dragFromRight)
			btnRight.setVisible(false);
		if(btnTop.isVisible() && !dragFromTop)
			btnTop.setVisible(false);
		if(btnBottom.isVisible() && !dragFromBottom)
			btnBottom.setVisible(false);
	}
	
	/**
	 * Updates the visibility of drag handles according to the state of revealer
	 */
	private void updateHandles(){
		
		if(getWidth() ==initialBounds.width && getHeight() == initialBounds.height){
			
			btnLeft.setVisible(true);
			btnRight.setVisible(true);
			btnTop.setVisible(true);
			btnBottom.setVisible(true);
			orientation = SwingConstants.CENTER;
		}
		
		else if(getHeight() == initialBounds.height){
			
			btnRight.setVisible(getX() == initialBounds.x);
			btnLeft.setVisible(getX() != initialBounds.x);
			
			orientation = btnRight.isVisible() ? SwingConstants.EAST : SwingConstants.WEST;
		}
		else{
			btnBottom.setVisible(getY() == initialBounds.y);
			btnTop.setVisible(getY() != initialBounds.y); 
			
			orientation = btnBottom.isVisible() ? SwingConstants.NORTH : SwingConstants.SOUTH;
		}
		
		int widthDiff = getWidth() - DRAG_BUTTON_WIDTH;
		btnBottom.setLocation(widthDiff/2, getHeight()-MARGIN);
		
		int heightDiff = getHeight() - DRAG_BUTTON_WIDTH;
		btnRight.setLocation(getWidth() - MARGIN, heightDiff/2);
		
		btnRight.setSize(DRAG_BUTTON_HEIGHT , DRAG_BUTTON_WIDTH);
		btnBottom.setSize(DRAG_BUTTON_WIDTH,DRAG_BUTTON_HEIGHT);
	}

	/**
	 * Handles key pressed event for drag handles
	 * @param e
	 */
	private void handleKeyReleased(KeyEvent e) {

		//set drag factor as 10% of actual size
		int horizontalDragFactor = (initialBounds.width * KB_REVEAL_PERCENT) / 100;
		int verticalDragFactor = (initialBounds.height * KB_REVEAL_PERCENT) / 100;
		
		//when left arrow key is pressed
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			
			//left arrow key is used only by left and right drag handles
			if(e.getSource() == btnRight || e.getSource() == btnLeft){
				
				int newX = getX() - horizontalDragFactor;
				
				if(e.getSource() == btnRight){
					dragFromRight = true;
					
					int newWidth = currentBounds.width - horizontalDragFactor;
					
					if(newWidth < MARGIN)
						newWidth = MARGIN;
					
					if(newWidth > initialBounds.width)
						newWidth = initialBounds.width;
					
					setSize(newWidth, getHeight());
				}
				else{
					dragFromLeft = true;

					int newWidth = currentBounds.width - newX + currentBounds.x;
					
					if(newWidth < MARGIN){
						newX = initialBounds.width - MARGIN + initialBounds.x;
						newWidth = MARGIN;
					}
					
					if(newWidth > initialBounds.width){

						newX = initialBounds.x;
						newWidth = initialBounds.width;
					}
					
					setLocation(newX, getY());
					setSize(newWidth, getHeight());
				}
				
				hideHandles();
				updateLocation();
			}
		}
		
		//when right arrow key is pressed
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			
			//right arrow key is used only by left and right drag handles
			if(e.getSource() == btnRight || e.getSource() == btnLeft){

				int newX = currentBounds.x + horizontalDragFactor;

				if(e.getSource() == btnRight){
					dragFromRight = true;
					
					int newWidth = currentBounds.width + horizontalDragFactor;
					
					if(newWidth < MARGIN)
						newWidth = MARGIN;
					
					if(newWidth > initialBounds.width)
						newWidth = initialBounds.width;
					
					setSize(newWidth, getHeight());
				}
				else{
					dragFromLeft = true;

					int newWidth = currentBounds.width - newX + currentBounds.x;
					
					if(newWidth < MARGIN){
						newX = initialBounds.width - MARGIN + initialBounds.x;
						newWidth = MARGIN;
					}
					
					if(newWidth > initialBounds.width){

						newX = initialBounds.x;
						newWidth = initialBounds.width;
					}
					
					setLocation(newX, getY());
					setSize(newWidth, getHeight());
					
				}
				
				hideHandles();
				updateLocation();
			}
		}
		
		//when up arrow key is pressed
		else if(e.getKeyCode() == KeyEvent.VK_UP){
			
			//up arrow key is used only by top and bottom drag handles
			if(e.getSource() == btnTop || e.getSource() == btnBottom){
				
				int newY = currentBounds.y - verticalDragFactor;
				
				if(e.getSource() == btnTop){
					dragFromTop = true;
					
					int newHeight = currentBounds.height - newY + currentBounds.y;
					
					if(newHeight < MARGIN){
						
						newY = initialBounds.height - MARGIN + initialBounds.y;
						newHeight = MARGIN;
					}
					
					if(newHeight > initialBounds.height){
						newY = initialBounds.y;
						newHeight = initialBounds.height;
					}
					
					setLocation(getX(), newY);
					setSize(getWidth(), newHeight);
				}
				else{
					dragFromBottom = true;
					
					int newHeight = currentBounds.height - verticalDragFactor;
					
					if(newHeight < MARGIN)
						newHeight = MARGIN;
					
					if(newHeight > initialBounds.height)
						newHeight = initialBounds.height;
					
					setSize(getWidth(),newHeight);
				}
				
				hideHandles();
				updateLocation();
			}
			
		}
		
		//when down arrow key is pressed
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			
			//down arrow key is used only by top and bottom drag handles
			if(e.getSource() == btnTop || e.getSource() == btnBottom){
				
				int newY = currentBounds.y + verticalDragFactor;
				
				if(e.getSource() == btnTop){
					dragFromTop = true;
					
					int newHeight = currentBounds.height - newY + currentBounds.y;
					
					if(newHeight < MARGIN){
						
						newY = initialBounds.height - MARGIN + initialBounds.y;
						newHeight = MARGIN;
					}
					
					if(newHeight > initialBounds.height){
						newY = initialBounds.y;
						newHeight = initialBounds.height;
					}
					
					setLocation(getX(), newY);
					setSize(getWidth(), newHeight);
				}
				else{
					dragFromBottom = true;

					int newHeight = currentBounds.height + verticalDragFactor;
					
					if(newHeight < MARGIN)
						newHeight = MARGIN;
					
					if(newHeight > initialBounds.height)
						newHeight = initialBounds.height;
					
					setSize(getWidth(),newHeight);
				}
				
				hideHandles();
				updateLocation();
			}
		}

		
		if(e.getSource() == btnTop){
			dragFromTop = false;
			
			currentBounds.height = getHeight();
			currentBounds.y = getY();
		}
		if(e.getSource() == btnBottom){
			dragFromBottom = false;
			
			currentBounds.height = getHeight();
		}
		if(e.getSource() == btnLeft){
			dragFromLeft = false;
			
			currentBounds.width = getWidth();
			currentBounds.x = getX();

		}
		if(e.getSource() == btnRight){
			dragFromRight = false;
			
			currentBounds.width = getWidth();
		}
		
		updateHandles();
	}
	
	/**
	 * Creates icon handles based on the location
	 * @param location
	 * @return
	 */
	private Icon getHandleIcon(int location,boolean selected){
		
		ImageIcon icon = null;
		
		switch (location) {
		
			case SwingConstants.WEST:
				icon = new ImageIcon( selected ? Revealer.class.getResource("resources/left_handle_selected.png") :Revealer.class.getResource("resources/left_handle.png"));
				break;

			case SwingConstants.EAST:
				icon = new ImageIcon(selected ?Revealer.class.getResource("resources/right_handle_selected.png"):Revealer.class.getResource("resources/right_handle.png"));
				break;
				
			case SwingConstants.NORTH:
				icon = new ImageIcon(selected ?Revealer.class.getResource("resources/top_handle_selected.png"):Revealer.class.getResource("resources/top_handle.png"));
				break;
				
			case SwingConstants.SOUTH:
				icon = new ImageIcon(selected ?Revealer.class.getResource("resources/bottom_handle_selected.png"):Revealer.class.getResource("resources/bottom_handle.png"));
				break;
		}
		
		return icon;
	}
	
	/**
	 * Sets the accessibility properties for the component
	 */
	private void setAccessibility(JComponent comp,String key){

		AccessibleContext ac =  comp.getAccessibleContext();
		ac.setAccessibleName(resourceBundle.getString(key+".AccessibleName"));
		ac.setAccessibleDescription(resourceBundle.getString(key+".AccessibleDescription"));
		comp.setToolTipText(resourceBundle.getString(key+".TooltipText"));
	}
}
