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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import becta.viewer.accessibility.ThemeManager;

/**
 * This class implements the volume control panel for viewer
 */
public class VolumePanel extends javax.swing.JPanel implements ItemListener,ChangeListener,PopupMenuListener {
	
	private    int       orientation              = SwingConstants.HORIZONTAL;
	
	/**
	 * Checkbox for muting the player
	 */
	JCheckBox mute;
	/**
	 * Slider for changing the volume level
	 */
	JSlider slider;
	
	VolumeHandler handler;
	
	MouseAdapter mouseadpater;	
	/**
	 * Constructor for this class
	 */
	public VolumePanel(VolumeHandler handler)
	{
		
		setLayout(null);
		mute = new JCheckBox("Mute");
		slider = new JSlider(JSlider.VERTICAL);		
		slider.setUI(new SliderUI(slider));
		
		//set action for up arrow keystroke
		slider.getInputMap().put( KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, false),"UP_ARROW" );
		slider.getActionMap().put( "UP_ARROW", new UpAction());
		
		//set action for down arrow keystroke
		slider.getInputMap().put( KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, false),"DOWN_ARROW" );
		slider.getActionMap().put( "DOWN_ARROW", new DownAction());
		
		add(slider);
		add(mute);
		
		this.handler = handler;
		
		mute.addItemListener(this);
		slider.addChangeListener(this);
		
		
	}
	
	/**
	 * Set focus to slider
	 */
	public void setFocus() {
		slider.requestFocus();		
	}
	
	private void checkOrientation( int orientation )
    {
        switch ( orientation )
	{
            case SwingConstants.VERTICAL:
            case SwingConstants.HORIZONTAL:
                break;
            default:
                throw new IllegalArgumentException( "orientation must be one of: VERTICAL, HORIZONTAL" );
        }
    }
	
	/**
     * Sets the orientation of the volume panel.  The orientation must have
     * either the value <code>HORIZONTAL</code> or <code>VERTICAL</code>.
     * If <code>orientation</code> is
     * an invalid value, an exception will be thrown.
     *
     * @param o  the new orientation -- either <code>HORIZONTAL</code> or
     *			</code>VERTICAL</code>
     * @exception IllegalArgumentException if orientation is neither
     *		<code>HORIZONTAL</code> nor <code>VERTICAL</code>     
     */
    public void setOrientation( int o )
    {     
    	checkOrientation( o );
    	int old = orientation;
	    orientation = o;

	    firePropertyChange("orientation", old, o);
	    revalidate();
	    repaint();
	    
	    slider.setOrientation(orientation);
	    
	    mute.setFont(ThemeManager.getTheme().getFont("CheckBox.font"));

	    //calculates size of text in checkbox label
		FontMetrics metrics = mute.getFontMetrics(mute.getFont());
		Dimension checkBoxTextSize = new Dimension(metrics.stringWidth(mute.getText()), metrics.getHeight());
		
		//holds size of "box" of checkbox
		final int checkBoxSize = 25;
		
		if(orientation == SwingConstants.VERTICAL){
			
			//calculates size of checkbox based on text size
			int cbWidth = checkBoxTextSize.width+checkBoxSize > 61 ? checkBoxTextSize.width+checkBoxSize:61;
			int cbHeight = checkBoxTextSize.height > 25 ? checkBoxTextSize.height:25;
	
			//calculates width of popup based on size of checkbox
			int width = cbWidth + 3;
			
            slider.setBounds((width - 40)/2, 6, 40, 131);
            mute.setLocation(0, slider.getHeight() + 8);
            mute.setSize(cbWidth, cbHeight);
            setPreferredSize(new Dimension(width, slider.getHeight() + mute.getHeight() + 10));
        }
		else{
			
			//calculates size of checkbox based on text size
			int cbWidth = checkBoxTextSize.width+checkBoxSize > 54 ? checkBoxTextSize.width+checkBoxSize:54;
			int cbHeight = checkBoxTextSize.height > 25 ? checkBoxTextSize.height:25;

			//calculates height of popup based on the text size of checkbox
			int height = cbHeight + 14;
			
		    slider.setBounds(0, (height - 25)/2, 140, 25);
		    mute.setLocation(slider.getWidth() + 3, (height - cbHeight)/2);
		    mute.setSize(cbWidth, cbHeight);
		    setPreferredSize(new Dimension(slider.getWidth() + mute.getWidth(),height));
		}
    }	
	
    @Override
    public void setForeground(Color arg0) {
    	// TODO Auto-generated method stub
    	super.setForeground(arg0);
    	if(mute!=null)
    		mute.setForeground(arg0);
    }
    
    @Override
    public void setBackground(Color arg0) {
    	// TODO Auto-generated method stub
    	super.setBackground(arg0);
    	if(mute!=null){
    		mute.setBackground(arg0);
    		slider.setBackground(arg0);
    	}
    }

	public void itemStateChanged(ItemEvent e) {
		handler.muteChanged(e.getStateChange() == ItemEvent.SELECTED);		
	}

	public void stateChanged(ChangeEvent arg0) {
		
		handler.volumeChanged(slider.getValue());
	}
    
    public boolean isMute(){
    	
    	return mute.isSelected();
    }
    
    public int getVolume() {
		return slider.getValue();
	}
    
    /**
     * Handles action to be performed on Up Arrow keystroke for slider
     */
    class UpAction extends  AbstractAction
    {
        public void actionPerformed(ActionEvent e)
        {
        	//increments by 10%
            int newValue = slider.getValue() + 10;
            slider.setValue(newValue>slider.getMaximum()?slider.getMaximum():newValue);
        }
    }
    
    /**
     * Handles action to be performed on Down Arrow keystroke for slider
     */
    class DownAction extends  AbstractAction
    {
        public void actionPerformed(ActionEvent e)
        {
        	//decrement by 10%
        	int newValue = slider.getValue() - 10;
            slider.setValue(newValue<slider.getMinimum()?slider.getMinimum():newValue);
        }
    }

	public void popupMenuCanceled(PopupMenuEvent e) {
		
	}
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
		
	}

	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		
		final VolumePanel panel = this;
		
		Thread thread = new Thread(){
			
		public void run() {
				try
				{
					
					//Wait till the control is created
					while(! (getPeer() != null && isShowing()) ){
						Thread.currentThread().sleep(2);
					}
					
					//Create a mouse adapter to monitor mouse click
					mouseadpater = new MouseAdapter(){
						
						@Override
						public void mousePressed(MouseEvent e) {

							super.mousePressed(e);
							slider.requestFocusInWindow();	
							panel.removeMouseListener(mouseadpater);
							
						}
					};
					
					panel.addMouseListener(mouseadpater);
					
					//Sent mouse click to ppopup window
					Point pos = MouseInfo.getPointerInfo().getLocation();
					Robot robot = new Robot();
					robot.mouseMove(slider.getLocationOnScreen().x-3, slider.getLocationOnScreen().y);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.mouseMove(pos.x,pos.y);
									
				}
				catch (Exception ex) {
					
				}
			}
		};
		
		thread.start();
		
	}

}
