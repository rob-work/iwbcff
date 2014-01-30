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

package becta.viewer.selection;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.drawing.Annotation;
import becta.viewer.drawing.AnnotationStroke;
import becta.viewer.drawing.BaseElement;
import becta.viewer.framework.Canvas;
import becta.viewer.framework.CanvasPainter;
import becta.viewer.framework.Viewer;
import becta.viewer.undoredo.UndoRedoCache;

/**
 * This class implements the Mouse listeners for the canvas.
 * This class handles the selection and annotation functionalities
 */
public class SelectionListener extends MouseInputAdapter {
		
	/** CanvasPainter instance to draw selection
	*/
	private SelectionPainter selectionPainter = new SelectionPainter();
	
	/** CanvasPainter instance to dragging state
	*/
	private SelectionGhostPainter ghostPainter = new SelectionGhostPainter();
	/**
	 * Holds the initial point of dragging
	 */
	private Point initialPoint;
	/**
	 * Holds the selected element
	 */
	private BaseElement selectedElement;
	/**
	 * Holds the currently active SelectionItem
	 */
	private SelectionItem actionItem;
	
	/**
	 * Collection of SelectionItem instances to represent the resize points
	 */
	private Set<SelectionItem> selectionItems;
	
	SelectionManager manager;
	
	
	/**
	 * Holds the annotation made by user
	 */
	private GeneralPath annotation;
	/**
	 * CanvasPainter instance to annotation state
	 */
	private AnnotationPainter annotationPainter = new AnnotationPainter();
	/**
	 * Holds stroke for annotation
	 */
	private AnnotationStroke annotationStroke;
	/**
	 * Holds previous point while drawing annotation
	 */
	private Point prevPoint;
	
	/**
	 * Constructor
	 * @param manager
	 */
	public SelectionListener(SelectionManager manager){
		
		this.manager = manager;
	}
	
	/**
	 * Gets the selected item
	 * @return
	 */
	public BaseElement getSelection(){
	
		return selectedElement;
	}
	
	/**
	 * Clear the selection
	 * @param c
	 */
	public void clear(Canvas c){
		
		c.removePaintListener(selectionPainter);
		c.removePaintListener(ghostPainter);
		c.repaint();
		
		initialPoint = null;
		selectedElement=null;
		actionItem = null;
		selectionItems = null;
		
		manager.selectionChanged(null);
	}
	
	/**
	 * Set the selection
	 * @param selection
	 */
	private void setSelection(BaseElement selection) {

		selectedElement = selection;		
		selectionItems = getResizeSelectionItems(selectedElement,selection.getGroupShape().getBounds());
		
		//Inform manager about selection change
		manager.selectionChanged(selection);
		
	}
	
	private static Set<SelectionItem> getResizeSelectionItems( BaseElement element, Rectangle area){
		
		
		//the set of the selection items that will be returned
		Set<SelectionItem> items=new HashSet<SelectionItem>();

		if(element instanceof Resizable){
			items.add(new SelectionItem( element, 
					new Point((int)area.getX(), (int)area.getY()),
					SwingConstants.NORTH_WEST));
			
			items.add(new SelectionItem( element, 
					new Point((int)area.getMaxX(), (int)area.getMaxY()),
					SwingConstants.SOUTH_EAST));
		
			items.add(new SelectionItem( element, 
					new Point((int)area.getMaxX(), (int)area.getY()),
					SwingConstants.NORTH_EAST));
			
			items.add(new SelectionItem( element, 
					new Point((int)area.getX(), (int)area.getMaxY()),
					SwingConstants.SOUTH_WEST));
		}
		return items;
	}

	private static AffineTransform getResizeTransform( Rectangle2D bounds, SelectionItem item, 
			Point2D firstPoint, Point2D secondPoint){
	
		//getting the diff point
		Point2D diff=new Point2D.Double(secondPoint.getX()-firstPoint.getX(), 
				secondPoint.getY()-firstPoint.getY());
	
		//getting the scale and the translation factors
		double sx=1.0, sy=1.0, tx=0, ty=0;
		int type=item.getType();
		
		switch (type){
		
			case SwingConstants.NORTH_EAST :
				
				sx=1+diff.getX()/bounds.getWidth();
				sy=1-diff.getY()/bounds.getHeight();
				tx=(bounds.getX())*(1-sx);
				ty=(bounds.getY()+bounds.getHeight())*(1-sy);	
				break;
				
			case SwingConstants.NORTH_WEST :
				
				sx=1-diff.getX()/bounds.getWidth();
				sy=1-diff.getY()/bounds.getHeight();
				tx=(bounds.getX()+bounds.getWidth())*(1-sx);
				ty=(bounds.getY()+bounds.getHeight())*(1-sy);
				break;
				
			case SwingConstants.SOUTH_EAST :
				
				sx=1+diff.getX()/bounds.getWidth();
				sy=1+diff.getY()/bounds.getHeight();
				tx=bounds.getX()*(1-sx);
				ty=bounds.getY()*(1-sy);
				break;
				
			case SwingConstants.SOUTH_WEST :
				
				sx=1-diff.getX()/bounds.getWidth();
				sy=1+diff.getY()/bounds.getHeight();
				tx=(bounds.getX()+bounds.getWidth())*(1-sx);
				ty=(bounds.getY())*(1-sy);		
				break;
		}
	
		//creating the transform
		AffineTransform af=new AffineTransform();
		af.preConcatenate(AffineTransform.getScaleInstance(sx, sy));
		af.preConcatenate(AffineTransform.getTranslateInstance(tx, ty));
	
		return af;
	}
	/**
	 * Handles mouse drag event
	 */
	public void mouseDragged(MouseEvent e) {
		
		//get the instance of canvas
		Canvas canvas = (Canvas)e.getSource();
		//all mouse operations are done with left mouse button
		if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0){
			
			AffineTransform t = canvas.getZoomManager().getScaleTransform();
			Point p = getInverseTransformPoint(t, e.getPoint());
			
			//annotation is drawn in DRAWING mode
			if(Canvas.getSelectionMode() == SelectionMode.DRAWING){

				Point currPoint = e.getPoint();
				SwingUtilities.convertPointToScreen(currPoint, canvas);
				boolean isOverRevealer =canvas.getScrollPane().getRevealer().isVisible() && !canvas.getScrollPane().getRevealer().getViewBounds().contains(currPoint);

				if(!isOverRevealer && annotation != null){
					
					//ensure that points are only added when a line segment exceeds some minimum length
					if(p.distanceSq(prevPoint) >= 9){
						
						//remove current annotation painter
						canvas.removePaintListener(annotationPainter);
											
						//Add current point to annotation
						annotation.lineTo(p.x, p.y);
						
						// adds current point to list
						prevPoint = p;
						
						//set new shape for annotation painter
						annotationPainter.shape = annotation;
						
						//adds new painter and repaints canvas
						canvas.addPaintListener(annotationPainter);
						canvas.repaint();
					}
				}
			}	
			
			else if(Canvas.getSelectionMode() == SelectionMode.REGULAR && canvas.getDocument().getCurrentPage().hasSelectableItem()){
				
				
				//if an element is selected for dragging
				if(selectedElement != null || actionItem!=null){
					
					//removes previous painter
					canvas.removePaintListener(ghostPainter);
					AffineTransform transformation =null;
					
					if(actionItem!=null)
					{
						//corrects final point to maintain aspect ratio
						
						Point correctedPoint = getCorrectedPoint(actionItem, selectedElement.getGroupShape().getBounds(), initialPoint, p);
						transformation= getResizeTransform(selectedElement.getGroupShape().getBounds2D(),actionItem , initialPoint,correctedPoint);
						
					}
					else
					{
						//	updates cursor
						canvas.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
						
						//calculates the translation made by dragging
						Point diff = new Point(p.x - initialPoint.x, p.y - initialPoint.y);
						transformation= AffineTransform.getTranslateInstance(diff.x, diff.y);
						
					}
					
					//set translated shape for drawing the outline of element
					ghostPainter.setShape(transformation.createTransformedShape(selectedElement.getGroupShape()));
					
					//adds new painter and repaints canvas
					canvas.addPaintListener(ghostPainter);
					canvas.repaint();
				}
			}
				
		}
	}

		
	/**
	 * Handles mouse pressed event
	 */
	public void mousePressed(MouseEvent e) {
		
		//get the instance of canvas
		Canvas canvas = (Canvas)e.getSource();
		
		//all mouse operations are done with left mouse button
		if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0){
			
			AffineTransform t = canvas.getZoomManager().getScaleTransform();
			Point p = getInverseTransformPoint(t, e.getPoint());
			
			//annotation is drawn in DRAWING mode
			if(Canvas.getSelectionMode() == SelectionMode.DRAWING){
				
				Point currPoint = e.getPoint();
				SwingUtilities.convertPointToScreen(currPoint, canvas);
				boolean isOverRevealer = canvas.getScrollPane().getRevealer().isVisible() && !canvas.getScrollPane().getRevealer().getViewBounds().contains(currPoint);

				if(!isOverRevealer){
					
					//creates annotation
					annotation = new GeneralPath();
					annotation.moveTo(p.x, p.y);
					annotation.lineTo(p.x, p.y);

					//sets properties for annotation painter
					annotationStroke = Viewer.getViewer().getToolbar().getAnnotationStroke();
					annotationPainter.colour = annotationStroke.getColour();
					annotationPainter.stroke = new BasicStroke(annotationStroke.getWidth(),BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
					annotationPainter.shape = annotation;
					
					//adds new painter and repaints canvas
					canvas.addPaintListener(annotationPainter);
					canvas.repaint();
					
					//adds first point
					prevPoint = p;
				}
			}
			else if( Canvas.getSelectionMode() == SelectionMode.REGULAR && canvas.getDocument().getCurrentPage().hasSelectableItem() )
			{
				//set initial point
				initialPoint = p;
				
				
				BaseElement newElement = null;
				
				if(actionItem==null){
					
					//get elements in current page
					List<Annotation> annotations = canvas.getDocument().getCurrentPage().getAnnotations();
					//loops through element list to identify the element under mouse press
					for (int i = annotations.size()-1; i>=0;i--) {
						
						//adds the element to selection list if it is not locked and is under mouse click
						if( annotations.get(i).contains(p)){
							newElement = annotations.get(i);								
							break;							
						}
					}
					
					if(newElement==null && !canvas.getDocument().getCurrentPage().hasMediaElement())
					{
						//get elements in current page
						List<BaseElement> elements = canvas.getDocument().getCurrentPage().getElements();
						//loops through element list to identify the element under mouse press
						for (int i = elements.size()-1; i>=0;i--) {
							
							BaseElement baseElement = elements.get(i);
							//identifies selectable element
							if(baseElement instanceof Selectable){
								
								//adds the element to selection list if it is not locked and is under mouse click
								if(baseElement.contains(p)){
									
									if(!baseElement.isLocked() ){
										boolean locked= false;
										if(baseElement.getGroup()!=null){
											for (BaseElement ge : baseElement.getGroup()) {
												if(ge.isLocked()){
													locked = true;
													break;
												}
											}
										}
										if(!locked)
											newElement = baseElement;
									}	
									//breaks loop once an element is found
									break;							
								}
							}
						}
					}
				}
				
				if(newElement!=null){
					
					ghostPainter.setShape(newElement.getGroupShape());
					canvas.addPaintListener(ghostPainter);
					canvas.repaint();
					
					setSelection(newElement);
				}
				else{
					if(selectedElement!=null ){
					
						if(actionItem==null)
						{
							clear(canvas);
						}
					}
					
					canvas.removePaintListener(selectionPainter);
				}
			}
		}
	}

	/**
	 * Handles mouse released event
	 */
	public void mouseReleased(MouseEvent e) {
		
		//all mouse operations are done with left mouse button
		if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0 && (e.getModifiers() & InputEvent.CTRL_MASK) == 0){
			
			//get the instance of canvas
			final Canvas canvas = (Canvas)e.getSource();
			
			AffineTransform t = canvas.getZoomManager().getScaleTransform();
			Point p = getInverseTransformPoint(t, e.getPoint());
			
			//annotation is drawn in DRAWING mode
			if(Canvas.getSelectionMode() == SelectionMode.DRAWING){
				
				if(annotation!=null){
					//creates annotation and adds to the canvas
					final Annotation annotation = new Annotation(this.annotation, Viewer.getViewer().getToolbar().getAnnotationStroke());
					
					Runnable executeRunnable=new Runnable(){
			    		
			    		public void run() {

			    			canvas.getDocument().getCurrentPage().addAnnotation(annotation);
							canvas.refreshCanvasContent(true);
							manager.selectionChanged(selectedElement);
			    	    	
			    		}
			    	};
			    	
			    	Runnable undoRunnable=new Runnable(){
			    		
			    		public void run() {

			    			canvas.getDocument().getCurrentPage().removeAnnotation(annotation);
							canvas.refreshCanvasContent(true);
							manager.selectionChanged(selectedElement);
			    		}
			    	};
			    	
			    	manager.getFrame().doAction(new UndoRedoCache(executeRunnable,undoRunnable));
					
					//mark document as dirty
					canvas.getDocument().setDirty();
				}
				
				//set points to null
				prevPoint = null;
				annotation = null;
				annotationStroke = null;
				
				//removes painter
				canvas.removePaintListener(annotationPainter);
			}
			else if( Canvas.getSelectionMode() == SelectionMode.REGULAR && canvas.getDocument().getCurrentPage().hasSelectableItem()){
								
				//if an element is selected
				if(selectedElement != null){
					
					//reset cursor after dragging
					canvas.setCursor(canvas.getDefaultCursor());
				
					if( actionItem==null)
					{
						
						//calculates the translation made through dragging
						Rectangle bounds = selectedElement.getGroupShape().getBounds();
						Rectangle newBounds = new Rectangle(p.x - initialPoint.x,p.y - initialPoint.y, bounds.width, bounds.height);
			
						//notifies translation if some dragging had occurred
						if(newBounds.x != 0 || newBounds.y != 0){
							//canvas.
							doAction(canvas,ActionType.TRANSLATION,AffineTransform.getTranslateInstance(newBounds.x,  newBounds.y ),newBounds);
							
							//mark document as dirty after translation
							canvas.getDocument().setDirty();
						}
						
						
						
						canvas.addPaintListener(selectionPainter);
						canvas.repaint();						
						
					}
					else{
						
						
						//calculates the translation made through dragging
						Rectangle bounds = selectedElement.getGroupShape().getBounds();
						Rectangle newBounds = new Rectangle(p.x - initialPoint.x,p.y - initialPoint.y, bounds.width, bounds.height);
			
						//notifies translation if some dragging had occurred
						if(newBounds.x != 0 || newBounds.y != 0){
							
							//corrects final point to maintain aspect ratio
							Point correctedPoint = getCorrectedPoint(actionItem, bounds, initialPoint, p);
							
							AffineTransform transform = getResizeTransform(bounds, actionItem, initialPoint, correctedPoint);
							doAction(canvas,ActionType.RESIZE,transform,newBounds);
							
							//mark document as dirty after resize
							canvas.getDocument().setDirty();
						}
						
						
						
						canvas.addPaintListener(selectionPainter);
						//canvas.repaint();
						
						//refresh canvas content
						canvas.refreshCanvasContent(true);
					}
				
					//removes painter and reset variables
					canvas.removePaintListener(ghostPainter);
					initialPoint = null;
				
				}
			}
			
		}
	}
	
	
	public void mouseMoved(MouseEvent e) {
		

		actionItem = null;
		//get the instance of canvas
		Canvas canvas = (Canvas)e.getSource();

		//reset cursor after dragging
		canvas.setCursor(Canvas.getDefaultCursor());
		
		AffineTransform t = canvas.getZoomManager().getScaleTransform();
		Point p = getInverseTransformPoint(t, e.getPoint());
	
		if(selectionItems!=null)
		{
			for(SelectionItem item : selectionItems) {
				
				if(item.intersectsItem(p)){
					
					canvas.setCursor(item.getCursor());
					actionItem = item;
					break;
				}
			}
		}
		
	}
	
	/**
	 * Get the corrected point for maintaining aspect ratio after resize
	 * @param item
	 * @param bounds
	 * @param initialPoint
	 * @param finalPoint
	 * @return Corrected Point
	 */
	private Point getCorrectedPoint(SelectionItem item, Rectangle bounds, Point initialPoint, Point finalPoint){
		
		//holds the tolerance angle for maintaining aspect ratio
		final int CORRECTION_ANGLE = 2;
		
		//Calculates origin based on resize cone selected
		Point origin = new Point(0, 0);
		switch (item.getType()){
		
			case SwingConstants.NORTH_EAST :
				
				origin.setLocation(bounds.x, bounds.y + bounds.height);
				
				break;
				
			case SwingConstants.NORTH_WEST :
				
				origin.setLocation(bounds.x + bounds.width, bounds.y + bounds.height);
				break;
				
			case SwingConstants.SOUTH_EAST :
				
				origin.setLocation(bounds.x, bounds.y);
				break;
				
			case SwingConstants.SOUTH_WEST :
					
				origin.setLocation(bounds.x + bounds.width, bounds.y);
				break;
		}
		
		//calculates the slope of line where aspect ratio is maintained
		double baselineSlope = (initialPoint.getY() - origin.getY())/(initialPoint.getX() - origin.getX());
		
		//calculates the new slope due to resize
		double currentSlope = (finalPoint.getY() - origin.getY())/(finalPoint.getX() - origin.getX());
		
		//calculates angle between the baseline and the line formed due to resize
		//this is calculated using formula tan(A) = abs(m1 - m2)/(1 + m1m2)
		double value = Math.abs(baselineSlope - currentSlope)/(1 + (baselineSlope*currentSlope));
		double angle = Math.toDegrees(Math.atan(value));
		
		//if angle is in the limit of tolerance, we will correct the final point to maintain aspect ratio
		if(Math.abs(angle) < CORRECTION_ANGLE){
		
			double y = baselineSlope * (finalPoint.getX() - origin.getX()) + origin.getY();
			return new Point(finalPoint.x, (int)y);
		}
		else{
			
			
			//otherwise check for horizontal/vertical resize			
			double horizontalDiff = Math.abs(finalPoint.getX() - initialPoint.getX());
			
			if(horizontalDiff/bounds.getWidth() <=0.05 ){
			
				return new Point( (int)initialPoint.getX(),finalPoint.y);
			}		
			else{
				double verticalDiff = Math.abs(finalPoint.getY() - initialPoint.getY());
			
				if(verticalDiff/bounds.getHeight() <=0.05 ){
			
					return new Point( finalPoint.x , (int)initialPoint.getY());
				}
			}
			return finalPoint;
		}
	}
	
	private void doAction(final Canvas canvas,final ActionType type, final AffineTransform transform,final Rectangle bound ){
		
		try{
			
			final BaseElement element = selectedElement;
	    	final ArrayList<BaseElement> elements = new ArrayList<BaseElement>(0);
	    	final AffineTransform inverseTransform= transform.createInverse();
	    	Runnable executeRunnable=new Runnable(){
				
				public void run() {
					if(element.getGroup()!=null){
						for (BaseElement e : element.getGroup()) {
							BaseElement newe = e.notifyAction(type, transform, bound);
							if(newe!=e){
								elements.add(newe);								
							}
						}
						element.getGroup().clearShape();
					}
					else {
						BaseElement newe = element.notifyAction(type, transform, bound);
						if(newe!=element){
							elements.add(newe);								
						}
					}
					
					if(elements.size()>0){
						for (BaseElement baseElement : elements) {
							canvas.getDocument().getCurrentPage().addElement(baseElement);
						}

						manager.getFrame().updateLinks();
					}
					setSelection(element);
					canvas.refreshCanvasContent(true);
				}
			};
			
			Runnable undoRunnable=new Runnable(){
				
				public void run() {
	
					if(element.getGroup()!=null){
						for (BaseElement e : element.getGroup()) {
							e.notifyAction(type, inverseTransform, bound);	
						}
						element.getGroup().clearShape();
					}
					else
						element.notifyAction(type, inverseTransform, bound);	
					
					if(elements.size()>0){
						for (BaseElement baseElement : elements) {
							canvas.getDocument().getCurrentPage().removeElement(baseElement);
						}
						manager.getFrame().updateLinks();
					}
					setSelection(element);
					canvas.refreshCanvasContent(true);
				}
			};
	    	
			
			manager.getFrame().doAction(new UndoRedoCache(executeRunnable,undoRunnable));
		
    	}
    	catch (Exception e) {
			Viewer.logException(e);
		}
	}
	/**
	 * Gets the InverseTransform corresponding to given point
	 * @param transform AffineTransform
	 * @param point Point
	 * @return new point
	 */
	private Point getInverseTransformPoint(AffineTransform transform, Point point){
		
		Point newPoint = point;
		try{
			
			transform.inverseTransform(point, newPoint);
		}
		catch (Exception ex) {

			Viewer.logException(ex);
		}
		
		return newPoint;
	}
	
	
	/**
	 * This class is used for drawing the selection outline of shape while dragging
	 */
	class SelectionGhostPainter extends CanvasPainter{
		
		/**
		 * Holds the shape
		 */
		private Shape shape;
		
		/**
		 * This method is used for setting shape
		 * @param s
		 */
		public void setShape(Shape s){
			shape = s;
		}
		
		/**
		 * Painting of outline will be done in this method
		 */
		@Override
		public void paintToBeDone(Graphics2D g) {		
			g.draw(shape);
		}
	}
	
	/**
	 * This class is used for drawing the selection outline of shape while dragging
	 */
	class SelectionPainter extends CanvasPainter{
		
		/**
		 * Painting of outline will be done in this method
		 */
		@Override
		public void paintToBeDone(Graphics2D g) {
			
			Stroke oldStroke = g.getStroke();
			Color oldColor = g.getColor();
			
			g.setStroke(new BasicStroke(3));
			
			g.setColor(AccessibilityColor.selectionBorderColor);
			
			Rectangle rect = selectedElement.getGroupShape().getBounds();
			g.drawRect(rect.x, rect.y,rect.width,rect.height);			
			
			g.setStroke(oldStroke);
			g.setColor(oldColor);
			
			for(SelectionItem item : selectionItems) {
				
				item.paint(g);
			}
		}
	}
	
	/**
	 * Handles drawing of annotation
	 */
	class AnnotationPainter extends CanvasPainter{
		
		/**
		 * Holds the shape
		 */
		private Shape shape;
		/**
		 * Holds annotation colour
		 */
		private Color colour;
		/**
		 * Holds annotation stroke
		 */
		private Stroke stroke;


		@Override
		public void paintToBeDone(Graphics2D g) {
			
			Stroke oldStroke = g.getStroke();
			Color oldColor = g.getColor();
			
			g.setColor(colour);
			g.setStroke(stroke);
			
			g.draw(shape);
			
			g.setStroke(oldStroke);
			g.setColor(oldColor);
			
		}
		
	}
}
