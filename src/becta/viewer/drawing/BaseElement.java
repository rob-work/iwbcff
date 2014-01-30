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

package becta.viewer.drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import javax.media.Controller;
import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.Player;
import javax.media.StartEvent;
import javax.media.StopByRequestEvent;
import javax.media.Time;

import becta.viewer.framework.Frame;
import becta.viewer.framework.Viewer;
import becta.viewer.selection.ActionType;

/**
 * This is the base class of all elements and annotations
 */
public class BaseElement implements Cloneable,ControllerListener{

	/**
	 * Element id. will be null if it is not specified in the file
	 */	
	private String id;	
	/**
	 * To hold the shape of the element
	 */
	private Shape shape;
	/**
	 * The group to which the element belongs
	 */
	private Group group;
	/**
	 * Indicates whether an element is locked or not
	 */
	protected boolean isLocked;
	/**
	 * Indicates whether the element is in replicate mode
	 */
	protected boolean replicate;
	/**
	 * Fill colour of element
	 */
	protected Color fillColour;
	/**
	 * Holds the player
	 */
	protected Player player;
	/**
	 * List of transformations associated with this element
	 */
	protected ArrayList<AffineTransform> transformations;
	/**
	 * Holds audio URL
	 */
	private URL audioURL = null;
	/**
	 * Holds ControllerListener for player
	 */
	private ControllerListener listener = null;
	
	private boolean playerPaused =false;
	/**
	 * Handles drawing of element
	 * @param g
	 */
	public void draw(Graphics2D g){
		
	}
	
	/**
	 * Gets the shape of this element
	 * @return shape
	 */
	public Shape getShape(){
		return shape;
	}
	
	/**
	 * Sets the shape of the element
	 * @param shape
	 */
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	/**
	 * Gets the group for this element
	 * @return shape
	 */
	public Group getGroup(){
		return group;
	}
	
	/**
	 * Sets the group for the element
	 * @param group
	 */
	public void setGroup(Group group){
		this.group = group;
	}
	
	/**
	 * Gets the shape of this element or group's shape if it is a member of a group
	 * @return shape
	 */
	public Shape getGroupShape(){
		
		return group!=null? group.getShape() : shape;
	}
	
	/**
	 * Returns true if the point is within element's shape
	 * @param p
	 * @return
	 */
	public boolean contains(Point p){
		
		return getShape().contains(p);
	}
	
	/**
	 * Gets the identifier
	 * @return id
	 */
	public String getIdentifier(){
		return id;
	}
	/**
	 * Sets the identifier
	 * @param id
	 */
	public void setIdentifier(String id){
		this.id = id;
	}
	/**
	 * Set fill colour for element
	 * @param colour
	 */
	public void setFillColour(Color colour) {
		
		fillColour = colour;
	}
	
	/**
	 * Set locked state for element
	 * @param locked
	 */
	public void setLocked(boolean locked){
		
		isLocked = locked;
	}
	
	/**
	 * Returns the locked state
	 * @return
	 */
	public boolean isLocked() {
		return isLocked;
	}
	/**
	 * Set replicate mode for element
	 * @param replicate
	 */
	public void setReplicatable(boolean replicate) {
		this.replicate = replicate;		
	}
	
	/**
	 * Get whether the element is in replicate mode
	 * @return
	 */
	public boolean isReplicable(){
		
		return replicate;
	}
	
	/**
	 * Adds transformation to element
	 * @param transformation
	 */
	public void addTransformation(AffineTransform transformation) {
		
		if(transformations == null){
			transformations = new ArrayList<AffineTransform>();
		}
		
		transformations.add(transformation);
	}
	
	/**
	 * Clones current element
	 */
	public BaseElement clone(){
		
		BaseElement e = null;
		try
		{
			e = (BaseElement)super.clone();			
			e.transformations = new ArrayList<AffineTransform>();
			for (AffineTransform transform : transformations) {
				e.transformations.add(transform);
			}
		}
		catch(Exception ex){
			Viewer.logException(ex);
		}
		return e;
	}
	
	
	/**
	 * Play media
	 */
	public void play(){
		
		
		if(player != null){
			player.start();
			
			int level=0;
			if(Viewer.getViewer().getToolbar().isMute())
				player.getGainControl().setMute(true);				
			else{
				player.getGainControl().setMute(false);
				level =  Viewer.getViewer().getToolbar().getVolume();
			}
			
			setVolume(level);
			
		}
	}
	
	/**
	 * Play media
	 */
	public void resume(){
		
		if(player!=null && player.getMediaTime().getSeconds()!=0){
			player.start();
		}
	}
		
	/**
	 * Pause media
	 */
	public void pause(){
		
		if(player != null)
			player.stop();
	}
	
	/**
	 * Set mute state for media
	 * @param mute
	 */
	public void setMute(boolean mute) {
		if(player != null && player.getGainControl() != null)
			player.getGainControl().setMute(mute);
	}
	
	/**
	 * Set volume of media
	 * @param volume
	 */
	public void setVolume(int volume) {	
		try
		{
			float level = volume/100F;
			
			if(player != null && player.getGainControl()!= null)
				player.getGainControl().setLevel(level);
		}
		catch(Exception e){
			Viewer.logException(e);
		}
	}
	
	/**
	 * Set audio link for element
	 * @param url
	 */
	public void setAudio(String url){
		
		try{
			audioURL = (new File(url)).toURL();
		}
		catch (Exception e) {
			Viewer.logException(e);
		}
	}
	
	/**
	 * Returns whether current element has media
	 * @return
	 */
	public boolean hasMedia(){
		return audioURL!=null;
	}
	
	/**
	 * Returns whether media in this element is playing or not
	 * @return
	 */
	public boolean isMediaPlay(){
		
		return player!=null && player.getState()==Controller.Started;
	}
	
	/**
	 * Returns whether media in this element is playing or not
	 * @return
	 */
	public boolean isMediaPaused(){
		
		return playerPaused;
	}
	
	/**
	 * apply available transformations given shape
	 * @param shape
	 */
	protected Shape applyTransformations(Shape shape) {
		
		if(transformations!=null && transformations.size() != 0){
			
			for (AffineTransform transform : transformations) {
				
				shape = transform.createTransformedShape(shape);
			}
		}
		
		return shape;
	}
	
	/**
	 * Initialize components in this element
	 */
	public void beginInitialize(ControllerListener listener){
		
		this.listener = listener;
		playerPaused = false;
		if(audioURL != null){
			
			try{
				player = Manager.createRealizedPlayer(audioURL);				
			}
			catch (Exception e) {
				Viewer.logException(e);
			}
		}
		
		if(player!=null){
			player.addControllerListener(this);
			player.addControllerListener(listener);
		}
	}
	/**
	 * Called on completing the initialization
	 */
	public void endInitialize(){
	
	}
	/**
	 * Dispose resources used by this element
	 */
	public void dispose(boolean close){
		
		if(player != null){
					
			player.removeControllerListener(this);
			player.removeControllerListener(listener);
			if(close){
				
				player.stop();
				player.close();
				listener = null;
				player = null;
			}
			else{
				player.stop();
								
				player.setMediaTime(new Time(0));
			}
		}
	}
	
	/**
	 * Updates heavy components in this element
	 */
	public void updateHeavyControl(Rectangle bounds,Rectangle2D viewBound){
		
	}
	
	/**
	 * Notifies an action to this element
	 * @param type
	 * @param transform
	 * @param bounds
	 * @return
	 */
	public BaseElement notifyAction(ActionType type, AffineTransform transform,Rectangle bounds) {	
		
		//In the case of translation , if the element can be replciated , then clone the 
		//element and add to the collection.
		if(type == ActionType.TRANSLATION && replicate){
			
			BaseElement replicatedElement = this.clone();
			replicatedElement.setIdentifier(null);
			replicatedElement.setReplicatable(false);
			replicatedElement.setShape(transform.createTransformedShape(getShape()));
			replicatedElement.setGroup(null);
			return replicatedElement;
		}
		else{ //apply trnasformation ( translation / resize) 
			setShape(transform.createTransformedShape(getShape()));
		}
		return this;
		
	}

	public void controllerUpdate(ControllerEvent e) {
		
		playerPaused = e instanceof StopByRequestEvent ? true : false;
		
	}		
}
