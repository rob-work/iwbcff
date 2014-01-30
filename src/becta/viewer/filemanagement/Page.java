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

package becta.viewer.filemanagement;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.media.ControllerListener;
import javax.media.Manager;

import becta.viewer.drawing.Annotation;
import becta.viewer.drawing.BaseElement;
import becta.viewer.drawing.FlashElement;
import becta.viewer.drawing.Group;
import becta.viewer.drawing.ImageElement;
import becta.viewer.drawing.Link;
import becta.viewer.drawing.Linkable;
import becta.viewer.drawing.MovieElement;
import becta.viewer.drawing.RectangleElement;

/**
 * This class implements each page of the document
 */
public class Page {
	
	/**
	 * Content type not defined
	 */
	private static final int CONTENT_UNDEFINED = 1;
	/**
	 * Normal content
	 */
	private static final int CONTENT_NORMAL = 2;
	/**
	 * content contains audio
	 */
	private static final int CONTENT_AUDIO = 4;
	/**
	 * content contains video
	 */
	private static final int CONTENT_MOVIE = 8;
	/**
	 * content contains flash
	 */
	private static final int CONTENT_FLASH = 16;

	/**
	 * Reference to revealr
	 */
	private RectangleElement revealer;
	
	/**
	 * Holds the list of elements
	 */
	private ArrayList<BaseElement> elements;
	
	/**
	 * Holds annotations
	 */
	private ArrayList<Annotation> annotations;
	
	/**
	 * Background colour
	 */
	private Color bgColour;
	/**
	 * background image
	 */
	private ImageElement bgImage;
	
	/**
	 * background image posture
	 */
	private int bgImagePosture;
	
	/**
	 * Page id
	 */
	private String id;
	
	/**
	 * content type
	 */
	private int contentType =CONTENT_UNDEFINED;
	
	/**
	 * Constructor for this class
	 */
	public Page() {

		elements = new ArrayList<BaseElement>();
		annotations = new ArrayList<Annotation>();
	}
	
	/**
	 * Initialize controls added to elements in this page
	 */
	public void beginInitialize(ControllerListener listener){
		
		for (BaseElement element : elements) {
			element.beginInitialize(listener);			
			element.play();
		}
	}
	
	/**
	 *  Called on completing the initialization
	 */
	public void endInitialize(){
		
		for (BaseElement element : elements) {
			element.endInitialize();
		}
	}
	/**
	 * Dispose controls added to elements in this page
	 */
	public void dispose(boolean close){
		
		for (BaseElement element : elements) {
			element.dispose(close);
		}
	}
	
	/**
	 * Gets page identifier
	 * @return id
	 */
	public String getIdentifier(){
		return id;
	}
	
	/**
	 * Sets page identifier
	 * @param id
	 */
	public void setIdentifier(String id){
		this.id = id;
	}
	
	/**
	 * Gets page revealer
	 * @return id
	 */
	public RectangleElement getRevealer(){
		return revealer;
	}
	
	/**
	 * Sets page revealer
	 * @param element
	 */
	public void setRevealer(RectangleElement element){
		this.revealer = element;
	}
	
	/**
	 * Add an element to the elements list
	 * @param element
	 */
	public void addElement(BaseElement element) {
		
		elements.add(element);
	}
	
	/**
	 * Removes an element
	 * @param element
	 */
	public void removeElement(BaseElement element){
		
		elements.remove(element);
		
		//if the element has gotr audio , then we have to
		// to update the content type by going through all the elements
		//We don't have to consider MOVIE and Flash as it is not possible to 
		//delete elements from a page having movie/flash
		
		if(elements.size()<=0 || element.hasMedia())
			contentType = CONTENT_UNDEFINED;
		
	}
	
	/**
	 * Adds an annotation to the page
	 * @param element
	 */
	public void addAnnotation(Annotation element) {
		
		annotations.add(element);
	}
	
	/**
	 * Removes an annotation from the page
	 * @param element
	 */
	public void removeAnnotation(Annotation element) {
		
		annotations.remove(element);
	}
		
	/**
	 * Gets the list elements in this page
	 * @return
	 */
	public List<BaseElement> getElements(){
		
		return elements;
	}
	
	/**
	 * Gets the list elements in this page
	 * @return
	 */
	public List<Annotation> getAnnotations(){
		
		return annotations;
	}
	
	/**
	 * Gets the list of links in the page
	 * @return
	 */
	public List<Link>  getLinks(){
		
		ArrayList<Link> links = new ArrayList<Link>();
		
		for (BaseElement element : elements) {
			
			if(element instanceof Linkable  ){
				
				List<Link> elementLinks = ((Linkable)element).getLinks();
				if(elementLinks!=null)
					links.addAll(elementLinks);
			}
		}
		
		return links;
	}
	
	/**
	 * Sets background colour
	 * @param colour
	 */
	public void setBackgroundColour(Color colour){
		
		this.bgColour = colour;
	}
	/**
	 * Sets the background image
	 * @param colour
	 */
	public void setBackgroundImage(ImageElement image, int posture){
		
		this.bgImage = image;
		bgImage.setLocked(true);
		bgImagePosture = posture;
	}
	
	/**
	 * Gets background colour
	 * @param colour
	 */
	public Color getBackgroundColour(){
		
		return this.bgColour;
	}
	/**
	 * Gets the background image
	 * @param colour
	 */
	public ImageElement getBackgroundImage(){
		
		return this.bgImage;
	}
	
	/**
	 * Sets the background image posture
	 * @param colour
	 */
	public int getBackgroundImagePosture(){
		
		return this.bgImagePosture;
	}
	
	/**
	 * Clears all annotation in this page
	 */
	public void clearAnnotations() {
		
		annotations.clear();
	}
	
	private void findContentType(){
		
		//if the content type is not yet defined. go through the elements to find the type
		if(contentType==CONTENT_UNDEFINED)
		{
			for (BaseElement element : elements) {
	    		
				if(element.hasMedia())
					contentType = contentType | CONTENT_AUDIO;
				
			 	if(element instanceof MovieElement)
			 		contentType = contentType | CONTENT_MOVIE;
			 	
	    		else if(element instanceof FlashElement)
	    			contentType = contentType | CONTENT_FLASH;	
	    		else
	    			contentType = contentType | CONTENT_NORMAL;
	    	}
		}
	}
	
	/**
	 * Gets whether current page has movie/audio element
	 * @return
	 */
	public boolean hasMedia(){
		
		findContentType();
		return (contentType & CONTENT_MOVIE) ==CONTENT_MOVIE || (contentType & CONTENT_AUDIO) ==CONTENT_AUDIO;
	}
	
	/**
	 * Gets whether current page has movie or flash element
	 * @return
	 */
	public boolean hasMediaElement(){
		
		findContentType();
    	return (contentType & CONTENT_MOVIE) ==CONTENT_MOVIE  || (contentType & CONTENT_FLASH) ==CONTENT_FLASH;
	}
	
	/**
	 * Gets whether current page has flash element
	 * @return
	 */
	public boolean hasFlash(){
		
		findContentType();
    	return (contentType & CONTENT_FLASH) ==CONTENT_FLASH;
	}
	
	/**
	 * Gets whether the page has got selectable items
	 * @return
	 */
	public boolean hasSelectableItem(){
		
		findContentType();
		//Selection is enabled in folloing cases
		//1-Annotation exists
		//2- The page has got ordinary elements at the same time doesn't have any flash/video
		return  annotations.size()>0 || (contentType!=CONTENT_UNDEFINED && !hasMediaElement());
	}
	
	/**
	 * Play each media element in this page
	 */
	public void resumeMedia() {

    	for (BaseElement element : elements) {
    		
    		element.resume();
    	}
	}
	
	/**
	 * Stop each media element in this page
	 */
	/*public void stopMedia(boolean close) {

    	for (BaseElement element : elements) {    		
    		element.stop(close);
    	}
	}*/
	
	/**
	 * Pause each media element in this page
	 */
	public void pauseMedia() {
		
    	for (BaseElement element : elements) {
    		element.pause();
    	}
	}
	
	/**
	 * Set mute for each media element in this page
	 * @param enable
	 */
    public void setMute(boolean enable){
    	
    	for (BaseElement element : elements) {
    		element.setMute(enable);
    	}
    }
    
    /**
     * Set volume for each media element in this page
     * @param volume
     */
    public void setVolume( int volume){
    	
    	for (BaseElement element : elements) {
    		
    		element.setVolume(volume);
    	}
    }
	
	/**
	 * Clones current page
	 */
	@Override
	protected Page clone(){

		Page clone = new Page();
		
		ArrayList<BaseElement> clonedElements = new ArrayList<BaseElement>(elements.size());
		
		//create clone of elements
		for (BaseElement element : elements) {
			
			BaseElement ce =  element.clone();
			ce.setGroup(null);
			clonedElements.add(ce);
		}
		
		for (int i = 0; i < elements.size(); i++) {
			
			Group group = elements.get(i).getGroup();
			if( group!=null && clonedElements.get(i).getGroup()==null){
				Group cgroup = new Group(group.size());
				for (BaseElement baseElement : group) {
					for (BaseElement cElement : clonedElements) {
						if(baseElement.getIdentifier()==cElement.getIdentifier()){
							cgroup.add(cElement);
							cElement.setGroup(cgroup);
							break;
						}
					}
				}
			}
		}
		
		clone.elements = clonedElements;
		clone.bgImage = this.bgImage;
		clone.bgColour = this.bgColour;
		clone.bgImagePosture = this.bgImagePosture;
		clone.id = this.id;
		clone.revealer = this.revealer;
		return clone;
	}
}
