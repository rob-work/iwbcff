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

import iwb.IWBBridge;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import becta.viewer.framework.Viewer;
import becta.viewer.selection.ActionType;
import becta.viewer.selection.Resizable;
import becta.viewer.selection.Selectable;

/**
 * This class handles the drawing of polyline and polygon
 */
public class PolylineElement extends LinkableElement implements Selectable,Resizable{

	private static final int HIGHLIGHT_OPACITY = 127;
	/**
	 * Holds whether the element is closed or not
	 * If closed element will become a polygon
	 */
	private boolean isClosed;
	/**
	 * Holds the stroke
	 */
	private ElementStroke stroke;
	/**
	 * Holds the points for drawing element
	 */
	private ArrayList<Point2D> points;
	
	/**
	 * Holds value indicating whether the polyline is used for highlight
	 */
	private boolean highlight;
	/**
	 * Holds value indicating whether polyline is drawn freehand or not
	 */
	private boolean freehand;
	/**
	 * Holds start-lineshape for the stroke 
	 */
	private StrokeLineShape startShape;
	/**
	 * Holds end-lineshape for the stroke 
	 */
	private StrokeLineShape endShape;
	
	private ArrayList<Shape> lineShapes;
	
	
	public PolylineElement() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor for this class
	 * @param points
	 * @param isClosed
	 */
	public PolylineElement(ArrayList<Point2D> points, boolean isClosed){
		
		
		this.isClosed = isClosed;
		setPoints(points);
	}
	
	public void setPoints(ArrayList<Point2D> points){
		
		this.points = points;
		
	}
	
	public void setClosed(boolean closed){
		this.isClosed = closed;
	}
	
	/**
	 * Set the start-lineshape for the stroke 
	 * @param shape
	 */
	public void setStartLineShape(StrokeLineShape shape) {
		startShape = shape;
	}
	
	/**
	 * Set the end-lineshape for the stroke
	 * @param shape
	 */
	public void setEndLineShape(StrokeLineShape shape) {
		endShape = shape;
	}
	
	/**
	 * Gets the final shape of element after applying transformations
	 */
	@Override
	public Shape getShape() {
		
		
		if(super.getShape() == null ){
			
			if(points.size()>1){
				GeneralPath polyLine = new GeneralPath();
				polyLine.setWindingRule(GeneralPath.WIND_EVEN_ODD);
				Point2D movePoint = points.get(0);
				polyLine.moveTo((float)movePoint.getX(), (float)movePoint.getY());
				
				for(int i=1; i<points.size();++i){
					
					Point2D point = points.get(i);
					polyLine.lineTo((float)point.getX(), (float)point.getY());
				}
				
				//set stroke-lineshape for line
				if(!isClosed && stroke != null){
					setStartLineShapes(polyLine);
					setEndLineShapes(polyLine);
				}
				
				if(isClosed){
					polyLine.closePath();
				}
				
				//apply available transformations
				
				setShape(applyTransformations(polyLine));
				
				if(lineShapes != null){
					for (int i = 0; i < lineShapes.size(); i++) {
						lineShapes.set(i, applyTransformations ( lineShapes.get(i)));
					}
				}
			}
			else
				setShape(new Rectangle(0,0,0,0));
		}
		
		return super.getShape();
	}
	
	@Override
	public BaseElement notifyAction(ActionType type, AffineTransform transform,
			Rectangle bounds) {

		if(lineShapes != null && type == ActionType.TRANSLATION && !isReplicable()){
			for (int i = 0; i < lineShapes.size(); i++) {
				lineShapes.set(i, transform.createTransformedShape ( lineShapes.get(i)));
			}
		}
		
		return super.notifyAction(type, transform, bounds);
	}
	
	/**
	 * Handles the drawing of element
	 */
	@Override
	public void draw(Graphics2D g) {
		
		Shape shape = getShape();
		
		//set fill colour
		if(isClosed && fillColour != null){
			g.setColor(fillColour);
			g.fill(shape);
		}
		
		//set stroke
		if(stroke != null && stroke.getStrokeColour()!=null){
			
			g.setStroke(stroke);
			
			//if polyline is used for highlight
			if(highlight && stroke.getStrokeColour().getAlpha() == IWBBridge.IWB_VALUE_UNDEFINED){
				
				//set opacity implicitly when this polyline is used for highlight
				Color c =  stroke.getStrokeColour().getColour();
				c = new Color( c.getRed(),c.getGreen(),c.getBlue(),HIGHLIGHT_OPACITY);
				g.setColor(c);
			}
			else{
				g.setColor(stroke.getStrokeColour().getColour());
			}
			
			if(lineShapes != null){
				for (Shape s : lineShapes) {
	
					g.fill(s);
				}
			}
		}
		
		//draw shape
		g.draw(shape);
	}
	
	@Override
	public boolean contains(Point p) {
	
		if(points.size() == 2)
			return stroke != null ? stroke.createStrokedShape(getShape()).contains(p) : false;
		else
			return super.contains(p);
	}
	
	/**
	 * Set stroke for drawing the element
	 * @param stroke
	 */
	public void setStroke(ElementStroke stroke) {
		
		this.stroke = stroke;
	}
	
	/**
	 * Set whether polyline is used for highlight
	 * @param highlight
	 */
	public void setHighlight(boolean highlight){
		
		//highlight is applicable only for polyline
		this.highlight = isClosed? false:highlight;
	}
	
	/**
	 * Set whether drawing is made freehand
	 * @param freehand
	 */
	public void setFreehand(boolean freehand){
		
		//freehand is applicable only for polyline
		this.freehand = isClosed? false:freehand;
	}
	
	/**
	 * Gets the clone of this element
	 */
	@Override
	public PolylineElement clone(){

		//creates new element
		PolylineElement clone = (PolylineElement)super.clone();
		clone.setPoints(points);
		clone.setClosed(isClosed);
		clone.setFreehand(freehand);
		//copy properties of element		
		clone.setHighlight(this.highlight);		
		clone.setStroke(this.stroke);
		clone.setStartLineShape(this.startShape);
		clone.setEndLineShape(this.endShape);
						
		return clone;
	}
	
	/**
	 * This method is used for setting stroke-lineshape-start
	 */
	private void setStartLineShapes(GeneralPath polyLine){
		
		Point2D start = points.get(0);
		Point2D end = points.get(1);
		
	
		if(startShape == StrokeLineShape.LINE){
			Shape s = new Line2D.Double(start.getX()-stroke.getLineWidth(), start.getY(), start.getX() + stroke.getLineWidth(),start.getY() );
			
			if(start.getX() != end.getX()){
				double slope = (end.getY() - start.getY())/(end.getX() - start.getX());
				s = AffineTransform.getRotateInstance(Math.atan(-1/slope), start.getX(), start.getY()).createTransformedShape(s);
			}
			
			polyLine.append(s, false);
		}
		else if(startShape == StrokeLineShape.CIRCLE){

			Shape s = new Ellipse2D.Double(start.getX()-stroke.getLineWidth()/2, start.getY()-stroke.getLineWidth()/2, stroke.getLineWidth(),stroke.getLineWidth());
			polyLine.append(s, false);
			addStrokeShape(s);
		}
		else if(startShape == StrokeLineShape.ARROW){

			int[] xPoints = new int[]{(int)start.getX() - (int)stroke.getLineWidth(), (int)start.getX(), (int)start.getX() + (int)stroke.getLineWidth()};
			int[] yPoints = new int[]{(int)start.getY()  + (int)stroke.getLineWidth(), (int)start.getY() - (int)stroke.getLineWidth()/2, (int)start.getY()  + (int)stroke.getLineWidth()};
			Shape s = new Polygon(xPoints, yPoints, 3);
			
			if(start.getX() != end.getX()){
				double slope = (end.getY() - start.getY())/(end.getX() - start.getX());
				s = AffineTransform.getRotateInstance(Math.atan(-1/slope), start.getX(), start.getY()).createTransformedShape(s);
			}
			
			polyLine.append(s, false);
			addStrokeShape(s);
		}
	}
	
	/**
	 * This method is used for setting stroke-lineshape-end
	 */
	private void setEndLineShapes(GeneralPath polyLine){
		
		Point2D start = points.get(points.size() - 2);
		Point2D end = points.get(points.size() - 1);
		

		
		if(endShape == StrokeLineShape.LINE){
			Shape s = new Line2D.Double(end.getX()-stroke.getLineWidth(), end.getY(), end.getX() + stroke.getLineWidth(),end.getY() );
			
			double slope = (end.getX() - start.getX())/(end.getY() - start.getY());
			s = AffineTransform.getRotateInstance(Math.atan(-slope), end.getX(), end.getY()).createTransformedShape(s);
			
			polyLine.append(s, false);
		}
		else if(endShape == StrokeLineShape.CIRCLE){

			Shape s = new Ellipse2D.Double(end.getX()-stroke.getLineWidth()/2, end.getY()-stroke.getLineWidth()/2, stroke.getLineWidth(),stroke.getLineWidth());
			polyLine.append(s, false);
			addStrokeShape(s);
		}
		else if(endShape == StrokeLineShape.ARROW){

			int[] xPoints = new int[]{(int)end.getX() - (int)stroke.getLineWidth(), (int)end.getX(), (int)end.getX() + (int)stroke.getLineWidth()};
			int[] yPoints = new int[]{(int)end.getY()  - (int)stroke.getLineWidth(), (int)end.getY() + (int)stroke.getLineWidth()/2, (int)end.getY()  - (int)stroke.getLineWidth()};
			Shape s = new Polygon(xPoints, yPoints, 3);

			double slope = (end.getX() - start.getX())/(end.getY() - start.getY());
			s = AffineTransform.getRotateInstance(Math.atan(-slope), end.getX(), end.getY()).createTransformedShape(s);
		
			polyLine.append(s, false);
			addStrokeShape(s);
		}
	}
	
	/**
	 * Adds stroke shapes
	 * @param s
	 */
	private void addStrokeShape(Shape s){
		if(lineShapes==null)
			lineShapes = new ArrayList<Shape>(2);
		lineShapes.add(s);
	}
}
