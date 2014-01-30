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

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.plaf.basic.BasicButtonUI;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.ThemeManager;

public class ToolbarButton extends javax.swing.JButton implements ActionListener{

	public static final int STATE_ON = 0;
	public static final int STATE_OFF = 1;
	public static final int STATE_DISABLED = 2;
	
	//Image resources for rooout, heightlight etc
	private static Icon rolloutIcon;
	private static Icon highlight_stroke;
	private static Icon corner_highlight_stroke;
	private static Icon rolloutIconStroke;
	
	/**
	 * Orientation of buttons 
	 */
	private static String orientation;
	
	/**
	 * variable to keep buttons' on /off state. 
	 */
	private int state = STATE_OFF;
	
	/**
	 * To show popup menu button
	 */
	private boolean showCorner;
	/**
	 * To showcorner edge
	 */
	private boolean showMenuIcon;
	
	/**
	 * Holds tooltip location
	 */
	private Point tooltipLocation = null;
	/**
	 * Holds value indicating whether child component should be drawn on focus or roll over
	 */
	private boolean showChildOnFocus = false;
	/**
	 * Holds value indicating whether parent component should be highlighted on focus or roll over
	 */
	private boolean showHighlightOnParent = false;
	/**
	 * Holds value indicating whether any menu associated to this button is active or not
	 */
	private boolean isMenuActive = false;
	
	//Load all resources
	static{
		
		rolloutIcon = new ImageIcon(Toolbar.class.getResource("resources/rollout_arrow.png"));
		highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/highlight_stroke.png"));
		corner_highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/accesibility_highlight_stroke.png"));
		rolloutIconStroke = new ImageIcon(Toolbar.class.getResource("resources/rollout_tab_stroke.png"));
		
	}
	
	/**
	 * To set the orientation of button
	 * @param orientation
	 */
	public static void setOrientation(String orientation){
		
		//set the orientation
		
		//Reload the resources based on the orientation
		ToolbarButton.orientation = orientation;
		if(orientation == BorderLayout.EAST || orientation == BorderLayout.WEST){
			highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/vertical_highlight_stroke.png"));
			corner_highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/vertical_accesibility_highlight_stroke.png"));
		}
		else{
			highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/highlight_stroke.png"));
			corner_highlight_stroke = new ImageIcon(Toolbar.class.getResource("resources/accesibility_highlight_stroke.png"));
		}
		
		if(orientation== BorderLayout.EAST){
			rolloutIcon = new ImageIcon(Toolbar.class.getResource("resources/rollout_left_arrow.png"));
		}
		else{
			rolloutIcon = new ImageIcon(Toolbar.class.getResource("resources/rollout_arrow.png"));
		}
		
	}
	
	/**
	 * Created the disabled icon
	 * Disabled icons re v=created from the normal icon with 25% transparency
	 * @param icon
	 * @return
	 */
	private Icon createDisabledIcon(Icon icon)
	{
		//Load normal icon and create a new icon with 25% transparency
		BufferedImage disabledImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g = disabledImage.createGraphics();
		AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.25f );
		g.setComposite(alphaComposite);
		icon.paintIcon(this, g, 0, 0);
		g.dispose();
		
		//Convert image to icon
		ImageIcon disabledIcon =  new ImageIcon();
		disabledIcon.setImage(disabledImage);
		
		return disabledIcon;
	}
	
	/**
	 * Overrides getToolTipLocation() for specifying tooltip location
	 * This is done for preventing tooltip from going under windows taskbar
	 */
	@Override
	public Point getToolTipLocation(MouseEvent event) {

		if(tooltipLocation == null){
			
			tooltipLocation = new Point(event.getX(), -25);
		}

		return tooltipLocation;
		
	}
	
	/**
	 * Constructor
	 * @param icon
	 */
	public ToolbarButton(Icon icon){
	
		//call base constructor
		super(icon);
		
		//Set our custom UI
		setUI(new ToolButtonUI());
			
		//Create and set disabled icon 
		setDisabledIcon(createDisabledIcon(icon));
		
		//We don't need any border so set it null
		setBorder(null);
		
		//Add a mouse listener to track mouse movements
		this.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				getModel().setRollover(true);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				tooltipLocation = null;
				getModel().setRollover(false);				
				repaint();
			}
			
		}
		);
		
		//make it transparent
		setOpaque(false);
	}
	
	/**
	 * Constructor
	 * @param icon
	 * @param menuButton
	 */
	public ToolbarButton(ImageIcon icon, boolean menuButton){
		
		this(icon);
		
		this.setLayout(null);
		//Add popup button
		ToolbarRolloutButton button = new ToolbarRolloutButton();
		button.addActionListener(this);		
		this.add(button);
	}	

	@Override
	public void setEnabled(boolean enable) {
		
		//In addition to enable/disable , we need to enable/disable child elements( popup button)
		super.setEnabled(enable);
		
		for(int i = 0 ; i < getComponentCount();++i){
			getComponent(i).setEnabled(enable);
		}
	}
	
	/**
	 * Returns true if the button has got popup meny button
	 * @return
	 */
	public boolean isMenuButton(){
		
		return getComponentCount()>0;
	}
	
	/**
	 * To show popup menu icon
	 * @param enable
	 */
	public void showMenuIcon(boolean enable){
		showMenuIcon  = enable;
	}
	
	/**
	 * Sets the button state
	 * @param on
	 */
	public void setState(int state){
		this.state = state;
		repaint();
	}
	
	public int getState(){
		return this.state;
	}
	/**
	 * Set value for showChildOnFocus
	 * @param on
	 */
	public void setShowChildOnFocus(boolean on) {
		showChildOnFocus = on;
		repaint();
	}
	
	/**
	 * Set value for showHighlightOnParent
	 * @param on
	 */
	public void setShowHighlightOnParent(boolean on) {
		showHighlightOnParent = on;
		repaint();
	}
	
	/**
	 * Set value for isMenuActive
	 * @param on
	 */
	public void setMenuActive(boolean on) {
		isMenuActive = on;
		repaint();
	}
	
	/**
	 * Sets corner style for button
	 * @param enable
	 */
	public void setCorner(boolean enable){
		showCorner  = enable;
	}
	
	/**
	 * Gets corner state of button
	 * @return
	 */
	public boolean hasCorner(){
		return showCorner;
	}
	
	/**
	 * Returns true if the button has menu icon
	 * @return
	 */
	public boolean hasMenuIcon(){
		return showMenuIcon;
	}
	
	/**
	 * Return reference to menu button
	 * @return
	 */
	public JComponent getMenuButton(){
		
		if(getComponentCount()>0)
			return (JComponent)getComponent(0);
		else
			return null;
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
		
		if(getComponentCount()>0)
		{
			getComponent(0).setBounds(getWidth()-17, (getHeight()-32)/2, 13, 32);			
		}
	}
	
	/**
	 * Event handler for menu button
	 */
	public void actionPerformed(ActionEvent g) {
		
		ActionEvent e = new ActionEvent(this,1,this.getActionCommand() +  "_menu");
		this.actionListener.actionPerformed(e);	
	}

	@Override
	protected void paintChildren(Graphics arg0) {
		
	}	
	
	@Override
	public Icon getIcon() {
		return this.state != ToolbarButton.STATE_DISABLED ? super.getIcon() : getDisabledIcon();		
	}
	
	@Override
	public Icon getDisabledIcon() {
		
		return this.state != ToolbarButton.STATE_DISABLED ? super.getDisabledIcon() : createDisabledIcon(super.getIcon());
	}
	
	/**
	 * Class for drawing Toolbarbutton
	 * @author nakram
	 *
	 */
	class ToolButtonUI extends BasicButtonUI{
		
		//@Override
		public void paint(Graphics g, JComponent c){ 
			
			ToolbarButton button = (ToolbarButton)c;
			
			Graphics2D g2d = (Graphics2D)g;
			
		
			JButton child = null;
			if(button.getComponentCount()>0)
				 child = (JButton) button.getComponent(0);
			
			boolean drawParent = child!= null && showHighlightOnParent && ( child.getModel().isRollover() || child.hasFocus());
			if( isEnabled() && (drawParent || button.state == ToolbarButton.STATE_ON  || button.getModel().isRollover() || button.hasFocus() )){
				
		        int width = button.getWidth();
		        int height = button.getHeight();
				
		        Color c1 = button.state == ToolbarButton.STATE_ON ? AccessibilityColor.toolButtonHighlight : new Color(AccessibilityColor.toolButtonHighlight.getRed(),AccessibilityColor.toolButtonHighlight.getGreen(),AccessibilityColor.toolButtonHighlight.getBlue(),63);
				if(button.hasCorner()){
					
					
					int w = width;
					int h = height;				
					Polygon p = new Polygon();
				    p.addPoint(0, 0);
				    p.addPoint(w, 0);
				    p.addPoint(w,h);
				    p.addPoint(10,h);
				    p.addPoint(0,h-10);
				    
				    
					   
				    g2d.setColor(c1);
				    g2d.fillPolygon(p);
				    
				    g2d.setColor(AccessibilityColor.toolButtonHighlightBorder);
				    //g2d.drawPolygon(p);
				    
				    if(ThemeManager.isDefaultTheme()){
					    if(orientation == BorderLayout.WEST || orientation == BorderLayout.EAST)
					    	corner_highlight_stroke.paintIcon(c, g, 0, 1);
					    else
					    	corner_highlight_stroke.paintIcon(c, g, 0, 0);
				    }
				}
				else{				
					
					   
					g2d.setColor(c1);
					g2d.fillRect(1, 1, width-1,height-1);
					
					if(ThemeManager.isDefaultTheme()){
						if(orientation == BorderLayout.WEST || orientation == BorderLayout.EAST)
							highlight_stroke.paintIcon(c, g, 0, 1);
						else
							highlight_stroke.paintIcon(c, g, 0, 0);
					}
				}
			    
				if(child!=null && (( child.getModel().isRollover() || child.hasFocus()) || showChildOnFocus || isMenuActive)){
					
					paintRollButton(g2d,c1,button,child);
				}
				
				if(button.hasMenuIcon())
					ToolbarButton.rolloutIcon.paintIcon(button, g, button.getWidth() - (ToolbarButton.rolloutIcon.getIconWidth() +7), (c.getHeight()-32)/2);
				
			}
			else if(child!=null){
				
				paintRollButton(g2d,AccessibilityColor.window, button,child);
			}
			
			super.paint(g, c);	
		}

		private void paintRollButton(Graphics2D g2d, Color background, ToolbarButton button, JButton child) {
			
			if(ThemeManager.isDefaultTheme()){

				if( child.getModel().isRollover() || child.hasFocus()){
					
					g2d.setColor(isMenuActive ? AccessibilityColor.toolButtonHighlight : new Color(36,81,166));
					g2d.fillRect(child.getX(), child.getY(), child.getWidth(), child.getHeight());					
					ToolbarButton.rolloutIconStroke.paintIcon(button,g2d,child.getX(), child.getY());
				}
				else{
					if(!isMenuActive){	
						g2d.setColor(new Color(25,65,146));
						g2d.fillRect(child.getX(), child.getY(), child.getWidth(), child.getHeight());
					}
					else
						ToolbarButton.rolloutIconStroke.paintIcon(button,g2d,child.getX(), child.getY());
				}
				
			}
			else{
			
			
				Color c;
				
				if(background.getRGB()== Color.BLACK.getRGB())
				   c =Color.WHITE;
				else
				   c =Color.BLACK;
				 
				if( child.getModel().isRollover() || child.hasFocus() || isMenuActive){			
					g2d.setColor(c);
					g2d.fillRect(child.getX(), child.getY(), child.getWidth()-1, child.getHeight()-1);
				}

			}
			ToolbarButton.rolloutIcon.paintIcon(button, g2d, button.getWidth() - (ToolbarButton.rolloutIcon.getIconWidth() +7), child.getY()+1);
			
			
		}	
		
	}
		
}
class ToolbarRolloutButton extends JButton
{
	public ToolbarRolloutButton(){
	
	
		this.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				getModel().setRollover(true);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				
				getModel().setRollover(false);				
				repaint();
				
			}
			
		}
		);
		
		setOpaque(false);
	}
	
	@Override
	public void repaint() {
		
		super.repaint();
		
		if(this.getParent()!=null)
			getParent().repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		
	}		
}



