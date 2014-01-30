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

import iwb.IWBBridge;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.EventListenerList;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.controls.FloatChangeListener;
import becta.viewer.controls.SelectionModeListener;
import becta.viewer.drawing.BaseElement;
import becta.viewer.filemanagement.Document;
import becta.viewer.filemanagement.Page;
import becta.viewer.selection.SelectionManager;
import becta.viewer.selection.SelectionMode;

/**
 * This class implements the canvas for drawing various elements 
 */
public class Canvas extends JPanel{

	/**
	 * Field that hold the back colour of viewer
	 */
	private static final Color BACKCOLOUR = AccessibilityColor.window;
	/**
	 * the offscreen image of the canvas
	 */
	private BufferedImage canvasOffscreenImage;
	
	/**
	 * the document
	 */
	private Document document;
	/**
	 * Holds the paint listeners
	 */
	private Set<CanvasPainter> paintListeners;
	/**
	 * Holds the zoommanager instance
	 */
	private ZoomManager zoomManager;
	/**
	 * Holds the scroll pane in which this canvas is placed
	 */
	private ScrollPane scrollPane;
	
	
	/**
	 * Holds the selection mode
	 */
	private static SelectionMode selectionMode = SelectionMode.NONE;
	
	/**
	 * List of listeners interested in selection mode changes
	 */
	private static EventListenerList listenerList = new EventListenerList();
		
	/**
	 * Gets the selection mode
	 * @return current selection mode
	 */
	public static SelectionMode getSelectionMode() {
		
		return selectionMode;
	}
	
	/**
	 * Sets the selection mode
	 * @param mode new selection mode
	 */
	public void setSelectionMode(SelectionMode mode){
		
		selectionMode = mode;
		this.setCursor(getDefaultCursor());
		
		// Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length-2; i>=0; i-=2) {
            if (listeners[i]==SelectionModeListener.class) {
            	
                ((SelectionModeListener)listeners[i+1]).selectionModeChanged(mode);
            }          
        }
	}
	
	public static void addSelectionModeListener(SelectionModeListener l){
		
		listenerList.add(SelectionModeListener.class, l);
	}
	
	/**
	 * The constructor for this class
	 */
	public Canvas(ScrollPane scrollPane){

		setLayout(null);	
		//setBorder(BorderFactory.createLineBorder(AccessibilityColor.controlText, 2));
		this.setBackground(BACKCOLOUR);
		
		paintListeners = new HashSet<CanvasPainter>();
		
		zoomManager = new ZoomManager(this);
		this.scrollPane = scrollPane;
		
	}
	
	public void checkHeavyComponent(Rectangle bounds){
	
		//TODO: implement the logic for replacing place holder with actual component 
		for (BaseElement element : document.getCurrentPage().getElements()) {
			
			element.updateHeavyControl(bounds,getDocument().getViewbox());
		}
	}

	/**
	 * @return the document of the canvas
	 */
	public Document getDocument(){
		
		return document;
	}
	
	/**
	 * this method used for setting the document
	 * @param document
	 */
	public void setDocument(Document document){
		
		this.document = document;
		Rectangle2D viewport = document.getViewport();
		setCanvasSize(new Dimension((int)viewport.getWidth(), (int)viewport.getHeight()));
	}
	
	/**
	 * setting the new canvas size
	 * @param newSize
	 */
	public void setCanvasSize(Dimension newSize){

		// set canvas size and refresh canvas content
		this.setPreferredSize(newSize);
		scrollPane.updateSize();
		refreshCanvasContent(true);
	}
	
	/**
	 * Adds paint listener to canvas
	 * @param painter
	 */
	public void addPaintListener(CanvasPainter painter) {
		
		paintListeners.add(painter);
	}
	
	/**
	 * Remove paint listener from canvas
	 * @param painter
	 */
	public void removePaintListener(CanvasPainter painter){
		
		paintListeners.remove(painter);
	}
	
	/**
	 * Gets the zoom manager for the canvas
	 * @return ZoomManager
	 */
	public ZoomManager getZoomManager(){
		
		return zoomManager;
	}
	
	/**
	 * Get the scrollpane in which canvas is placed
	 * @return ScrollPane
	 */
	public ScrollPane getScrollPane() {
		return scrollPane;
	}
	
	/**
	 * Overrides paintComponent for handling drawing in canvas
	 */
	public void paintComponent(Graphics g) {

		//super.paintComponent(g);
	
		if(canvasOffscreenImage!=null) {
			
			//draw buffered image			
			g.drawImage(canvasOffscreenImage, getVisibleRect().x, getVisibleRect().y, null);
		}
		
		drawPainters((Graphics2D)g);
	}
	
	/**
	 * This method is used for updating the mouse cursor based on the mode
	 */
	public static Cursor getDefaultCursor(){
		
		if(getSelectionMode() == SelectionMode.NONE ||  getSelectionMode() == SelectionMode.REGULAR){
			return Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
		}
		else{		
			//set cursor for drawing mode
			return Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR);
		}
	}
	
	/**
	 * Refresh the canvas contents
	 */
	public void refreshCanvasContent(boolean doRepaint){
		
		BufferedImage tempCanvasOffscreenImage = canvasOffscreenImage;
		
		Rectangle viewportBounds = scrollPane.getViewportBounds();
		int width = getPreferredSize().width < viewportBounds.width || viewportBounds.width == 0 ? getPreferredSize().width : viewportBounds.width;
		int height = getPreferredSize().height < viewportBounds.height || viewportBounds.height == 0 ? getPreferredSize().height : viewportBounds.height;
		
		Rectangle visibleRect =  new Rectangle(0,0,width, height);
		
		//if canvas can be shown
		if(visibleRect.width > 0 && visibleRect.height > 0){
			
			//BufferedImage is created only when it is null or the size of canvas is changed 
			if(tempCanvasOffscreenImage == null || tempCanvasOffscreenImage.getWidth() != visibleRect.width || tempCanvasOffscreenImage.getHeight() != visibleRect.height){
			
				//tempCanvasOffscreenImage = new BufferedImage(getPreferredSize().width, getPreferredSize().height,BufferedImage.TYPE_INT_ARGB);
				tempCanvasOffscreenImage = new BufferedImage(visibleRect.width, visibleRect.height,BufferedImage.TYPE_INT_ARGB);
			}
		
			if(tempCanvasOffscreenImage!=null){
				
				// creates Graphics instance from buffered image
				Graphics2D g2d = tempCanvasOffscreenImage.createGraphics();
				g2d.setClip(0, 0, visibleRect.width, visibleRect.height);
				setRenderingHints(g2d);
				
				Color oldColor = g2d.getColor();
				Stroke oldStroke = g2d.getStroke();
				
				Page page = document.getCurrentPage();
				
				//draw background colour and image
				if(page.getBackgroundColour()!=null)
					g2d.setColor(page.getBackgroundColour());
				else
					//clears canvas
					g2d.setColor(BACKCOLOUR);
				
				g2d.fillRect(0, 0, tempCanvasOffscreenImage.getWidth(), tempCanvasOffscreenImage.getHeight());
				
				// set scale transform for having zooming 
				g2d.setTransform(zoomManager.getScaleTransform());
				
				g2d.translate(-(scrollPane.getScrollValues().width/ zoomManager.getCurrentScale()), -(scrollPane.getScrollValues().height/ zoomManager.getCurrentScale()));
				
				if(page.getBackgroundImage()!=null){
					
					switch(page.getBackgroundImagePosture()){
						case IWBBridge.IWB_POSTURE_UNDEFINED:
						case IWBBridge.IWB_POSTURE_BY_POSITION:
							page.getBackgroundImage().draw(g2d);
							break;
						case IWBBridge.IWB_POSTURE_STRETCHED_TO_FILL:
						{
							Image img =  page.getBackgroundImage().getImage();
							g2d.drawImage(img, 0, 0, width, height, 0, 0, img.getWidth(null), img.getHeight(null), null);
							break;
						}
						case IWBBridge.IWB_POSTURE_SCALED_TO_FIT:
						{
							Image img =  page.getBackgroundImage().getImage();
							
					        double xScale = (double)width/img.getWidth(null);
					        double yScale = (double)height/img.getHeight(null);
					        double scale = Math.min(xScale, yScale);    // scale to fit
					        int w = (int)(scale*img.getWidth(null));
					        int h = (int)(scale*img.getHeight(null));
					        int x = (width - width)/2;
					        int y = (height - height)/2;
					        g2d.drawImage(img, x, y, w, h, this);
					        
							break;
						}
						case IWBBridge.IWB_POSTURE_REPEATED:
						{
							Image img =  page.getBackgroundImage().getImage();							
							
							if(width > 0 && height > 0)
							{

								for(int x = 0; x < width ; x += img.getWidth(null))
								{
									for(int y = 0; y < height ; y += img.getHeight(null))
									{
										g2d.drawImage(img,x,y,null);
									}
								}
							}

							break;
						}					
						
					}
				}
				
				
				// draw elements to buffered image
				for (BaseElement element : page.getElements()) {
					
					g2d.setColor(oldColor);
					g2d.setStroke(oldStroke);
					
					element.draw(g2d);
				}
				
				// draw elements to buffered image
				for (BaseElement element : page.getAnnotations()) {
					
					g2d.setColor(oldColor);
					g2d.setStroke(oldStroke);
					
					element.draw(g2d);
				}
				// dispose graphics object after use
				g2d.dispose();
			}
	
			canvasOffscreenImage = tempCanvasOffscreenImage;
			
			// repaints canvas
			if(doRepaint)
				repaint();
		
		}
	}
	
	/**
	 * Set rendering hints
	 * @param g
	 */
	private void setRenderingHints(Graphics2D g) {
		
		//setting the rendering hints
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_DISABLE);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
	}
	
	/**
	 * This method will invoke the paintToBeDone method of all paint listeners added 
	 * @param g
	 */
	private void drawPainters(Graphics2D g){
		
		g = (Graphics2D)g.create();
		
		setRenderingHints(g);
		AffineTransform oldTransformation = g.getTransform();
		oldTransformation.concatenate(zoomManager.getScaleTransform());
		g.setTransform(oldTransformation);
		
		for (CanvasPainter painter : paintListeners) {
			
			painter.paintToBeDone(g);
		}
		
		
		g.dispose();
		
	}
}
