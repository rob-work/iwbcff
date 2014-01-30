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

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.ThemeManager;
import becta.viewer.selection.ActionType;
import becta.viewer.selection.Deletable;
import becta.viewer.selection.Resizable;
import becta.viewer.selection.Selectable;

/**
 * This class handles the rendering of text and text area
 */
public class TextElement extends LinkableElement implements Selectable ,Resizable,Deletable{

	/**
	 * Holds the padding for list marker
	 */
	private static final int LISTMARKER_PADDING = 10;
	private static final int LINE_BREAK_HEIGHT = 5;
	
	private ParagrapghLayout layout;	
	/**
	 * Holds the bounds of textarea
	 */
	private Rectangle2D area;
	/**
	 * Holds the transformations due to drag & resize
	 */
	private AffineTransform appliedTransform;
	/**
	 * Checks whether link is added
	 */
	private boolean isLinkAdded = false;
	ArrayList<Link> links;
	
	boolean textarea;
	
	/**
	 * Holds the width for text element
	 */
	private double width;
	
	/**
	 * Constructor for this class
	 * @param textData
	 */
	public TextElement(ParagrapghLayout layout,boolean teaxtarea) {

		this.layout = layout;
		this.textarea = teaxtarea;
	}
	
	/**
	 * Set area
	 * @param area
	 */
	public void setArea(Rectangle2D area){
		this.area = area;
	}
	
	/**
	 * Handles the drawing of element
	 */
	@Override
	public void draw(Graphics2D g) {

		Graphics2D g2d = (Graphics2D)g.create();
		
		AffineTransform oldTransform = g2d.getTransform();
        AffineTransform tx = getAllTransformation();
        
        if(tx!=null){
        	        	
        	if(appliedTransform != null)
        		tx.preConcatenate(appliedTransform);

        	tx.preConcatenate(oldTransform);
        	
        	g2d.setTransform(tx);
        }
		
		//only text area has size
		drawElement(g2d);

		g2d.dispose();
	}
	
	/**
	 * Handles actions like resize or translation
	 */
	public BaseElement notifyAction(ActionType type,AffineTransform transform, Rectangle bounds) {

		TextElement element = (TextElement)super.notifyAction(type, transform, bounds);
		
		if(type == ActionType.TRANSLATION && replicate){
			element.appliedTransform = (AffineTransform)transform.clone();
		}
		else{
			if(appliedTransform == null)
				appliedTransform = (AffineTransform)transform.clone();
			else
				appliedTransform.preConcatenate(transform);
		}
		
		return element;
	}
	
	/**
	 * This method is used for rendering text element
	 * @param g
	 */
	private void drawElement(Graphics2D g){
		
		if(area.getWidth() > 0 || !textarea){
			links = new ArrayList<Link>();
			
			Point2D.Double p = new Point2D.Double(area.getX(), area.getY());
			width = 0;
			
			//restrict rendering of text area in given bounds
			if(textarea)
				g.setClip((int)area.getX(),(int) area.getY(), (int)area.getWidth(), (int)area.getHeight());
			
			//renders text or textarea
			drawLayout(g, layout, p);
			
			if(getShape() == null){
				
				//for text element width is the width of text
				double outlineWidth = textarea ? area.getWidth():width;
				double outlineHeight = p.getY()-area.getY();
				
				//creates outline shape, if height actual height of textarea exceeds defined height we will use the actual height
				Rectangle2D.Double outlineShape = new Rectangle2D.Double(area.getX(), area.getY(), outlineWidth < area.getWidth() ? area.getWidth() : outlineWidth, textarea ? area.getHeight() : outlineHeight);
				setShape(g.getTransform().createTransformedShape(outlineShape));
			}
			
			//Ensures that shape is added to links if an <svg:a> tag appears outside the text or text area
			if(super.links != null && super.links.size() > 0 && super.links.get(0).area == null){
				super.links.get(0).setArea(getShape());
			}
			
			  //adds links region inside text/text area
			if(!isLinkAdded){
				isLinkAdded = true;
				
				if(super.links == null){
					super.links = links;
				}
				else{
					for (Link link : links) {
						super.links.add(link);
					}
				}
			}
		}
	}
	
	private void drawLayout(Graphics2D g, ParagrapghLayout layout, Point2D p){
		
		int index = 0;
		
		for (Object obj : layout.getItems()) {
			
			if(obj == null){
				//null means line break
					p.setLocation(p.getX(), p.getY() + LINE_BREAK_HEIGHT);
			}
			else if(obj instanceof AttributedString){
				
				index = layout.isList() ? index + 1 : 0;
				
				if(!textarea)
					drawText(g, (AttributedString)(obj), layout, p, index);
				else
					drawTextArea(g, (AttributedString)(obj), layout, p, index);
			}
			else{
				drawLayout(g, (ParagrapghLayout)obj, p);
			}
		}
	}

	private void drawText(Graphics2D g, AttributedString attributedString, ParagrapghLayout layout, Point2D p, int index){

	    int indent = layout.isList() ? getIndent(g, index, layout.getListStyleType()) + LISTMARKER_PADDING : 0;
	    
	    TextLayout textLayout = new TextLayout(attributedString.getIterator(), g.getFontRenderContext());
	    
	    if(layout.isList()){
	    	
			textLayout.draw(g, (float)p.getX() + indent, (float)p.getY() + textLayout.getAscent());
			String family = attributedString.getIterator().getAttribute(TextAttribute.FAMILY).toString();
			Float size = (Float)attributedString.getIterator().getAttribute(TextAttribute.SIZE);
			Shape listTypeShape = getListTypeShape(g,family, size, new Rectangle2D.Double(p.getX(), p.getY() - (int) textLayout.getAscent(), indent, (int)textLayout.getBounds().getHeight()), index, layout.getListStyleType()); 
			g.fill(listTypeShape);
	    }
	    else{
	    	
			textLayout.draw(g, (float)p.getX(), (float)p.getY() + textLayout.getAscent());
	    }
		
		//set hyperlink
		List<TextLinkPoint> linkPoints = layout.getLinks(attributedString);
		
		if(linkPoints != null){
			for (TextLinkPoint textLinkPoint : linkPoints) {
								
				Rectangle2D.Double bounds = null;
				
				Rectangle boundSize = textLayout.getBlackBoxBounds(textLinkPoint.startIndex, textLinkPoint.endIndex).getBounds();
				bounds = new Rectangle2D.Double(p.getX() + indent + boundSize.x, p.getY()+ textLayout.getAscent() +boundSize.y, boundSize.width, boundSize.height);

				if(bounds != null)
					links.add(new Link(textLinkPoint.url, getAllTransformation().createTransformedShape(bounds), textLinkPoint.isInternal));
			}
		}
		
		
		p.setLocation(p.getX(), p.getY() + textLayout.getAscent() + textLayout.getDescent()+ textLayout.getLeading());
		
		if(width < textLayout.getBounds().getWidth())
			width = textLayout.getBounds().getWidth();
	}
	
	private void drawTextArea(Graphics2D g, AttributedString attributedString, ParagrapghLayout layout, Point2D p, int index){
		
		AttributedCharacterIterator aci = attributedString.getIterator();
		
		//creates for LineBreakMeasurer for having word wrap
	    LineBreakMeasurer lbm = new LineBreakMeasurer(aci, g.getFontRenderContext());
	    
	    double x = p.getX();
	    double y = p.getY();
	    int indent = layout.isList() ? getIndent(g, index, layout.getListStyleType()) + LISTMARKER_PADDING : 0;
	    boolean isMarkerDrawn = false;
	    
	    int layoutStart = 0;
	    //renders string in current paragraph with line wrap
	    while (lbm.getPosition() < aci.getEndIndex()) {
	    	
	    	
	    	float width = layout.isList() ? (float)area.getWidth() - indent : (float)area.getWidth();
	    	TextLayout textLayout = lbm.nextLayout(width);
	    	
	    	if(layout.getAlignment() == IWBBridge.IWB_TEXTALIGN_JUSTIFY)
	    		textLayout = textLayout.getJustifiedLayout(width);
	    	
			y += textLayout.getAscent();
			
			int alignedX = getAlignedX((float)x, width - textLayout.getVisibleAdvance(), layout.getAlignment());

			if(layout.isList()){
				
				textLayout.draw(g, alignedX + indent, (float)y);

				if(!isMarkerDrawn){
				
					String family = (String)aci.getAttribute(TextAttribute.FAMILY);
					Float size = (Float)aci.getAttribute(TextAttribute.SIZE);
					Shape listTypeShape = getListTypeShape(g, family, size, new Rectangle2D.Double(x, y - textLayout.getAscent(), indent, textLayout.getBounds().getHeight()), index, layout.getListStyleType());
					g.setColor(ThemeManager.isDefaultTheme() ? layout.getListFillColour() : AccessibilityColor.controlText);
					g.fill(listTypeShape);
					isMarkerDrawn = true;
				}
			}
			else{
				textLayout.draw(g, alignedX, (float)y);
			}
			
			//set hyperlink
			List<TextLinkPoint> linkPoints = layout.getLinks(attributedString);
			
			if(linkPoints != null){
				
				int layoutEnd = layoutStart + textLayout.getCharacterCount() -1 ;
				for (TextLinkPoint textLinkPoint : linkPoints) {
									
					Rectangle2D.Double bounds = null;
					
					Rectangle boundSize = null;
					
					if(textLinkPoint.startIndex >= layoutStart && textLinkPoint.endIndex <= layoutEnd )
						boundSize = textLayout.getBlackBoxBounds(textLinkPoint.startIndex - layoutStart, textLinkPoint.endIndex - layoutStart).getBounds();
					else if(textLinkPoint.endIndex < layoutStart || textLinkPoint.startIndex > layoutEnd )
						continue;
					else if(textLinkPoint.startIndex < layoutStart && textLinkPoint.endIndex >= layoutStart && textLinkPoint.endIndex <= layoutEnd)
						boundSize = textLayout.getBlackBoxBounds(0, textLinkPoint.endIndex - layoutStart).getBounds();
					else if(textLinkPoint.startIndex < layoutStart && textLinkPoint.endIndex > layoutEnd)
						boundSize = textLayout.getBlackBoxBounds(0, textLayout.getCharacterCount()).getBounds();
					else if(textLinkPoint.startIndex >= layoutStart && textLinkPoint.startIndex <= layoutEnd && textLinkPoint.endIndex > layoutEnd)
						boundSize = textLayout.getBlackBoxBounds(textLinkPoint.startIndex - layoutStart, textLayout.getCharacterCount()).getBounds();
					
					if(boundSize != null){
						bounds = new Rectangle2D.Double(alignedX+ indent + boundSize.x, y+ boundSize.y, boundSize.width, boundSize.height);
		
						if(bounds != null)
							links.add(new Link(textLinkPoint.url, getAllTransformation().createTransformedShape(bounds), textLinkPoint.isInternal));
					}
				}
			}
			
			//updates location
			y += textLayout.getDescent() + textLayout.getLeading();
			x = p.getX();
			layoutStart += textLayout.getCharacterCount();
	    }

		p.setLocation(x, y);
	}

	/**
	 * Get the shape for list marker
	 * @param g
	 * @param bounds
	 * @param index
	 * @return
	 */
	private Shape getListTypeShape(Graphics2D g, String family, float size,Rectangle2D bounds, int index, int listStyleType){
		
		Shape listTypeShape;

		TextLayout layout = getLineMarkerLayout(g,family, size, index, listStyleType);

		Rectangle2D lbounds = layout.getBounds();
		double cx = bounds.getX() + (bounds.getWidth() - lbounds.getWidth()) / 2;
		double cy = bounds.getY() + (bounds.getHeight() - lbounds.getHeight()) / 2;

		listTypeShape = layout.getOutline(AffineTransform.getTranslateInstance(cx, cy + layout.getAscent() + (lbounds.getHeight() - layout.getAscent())/2));
		return listTypeShape;
	}
	
	/**
	 * Get the layout for list style marker
	 * @param g
	 * @param value
	 * @return
	 */
	private TextLayout getLineMarkerLayout(Graphics2D g, String family, float size, int value, int listStyleType){

		ListStyle style = ListStyleFactory.createListStyle(listStyleType);		
		AttributedString str= new AttributedString(style.getListMarker(value));
		str.addAttribute(TextAttribute.FAMILY, family);
		str.addAttribute(TextAttribute.SIZE, size);
		TextLayout layout = new TextLayout(str.getIterator(), g.getFontRenderContext());
		
		return layout;
	}
	
	private int getIndent(Graphics2D g, int value, int listStyleType){
		
		ListStyle style = ListStyleFactory.createListStyle(listStyleType);
		AttributedString str= new AttributedString(style.getListMarker(value));
		TextLayout layout = new TextLayout(str.getIterator(), g.getFontRenderContext());
		return (int)layout.getBounds().getWidth();
	}
	
	/**
	 * Get the overall transformation applied to the element
	 * @return AffineTransform
	 */
	private AffineTransform getAllTransformation(){
		
		AffineTransform tx = AffineTransform.getTranslateInstance(0, 0);
		
		if(transformations!=null && transformations.size() != 0){
			
			for (AffineTransform transform : transformations) {

				tx.preConcatenate(transform);
			}
		}
		
		return tx;
	}
	
	/**
	 * Get the location based on text alignment
	 * @param p
	 * @param width
	 * @param visibleAdvance
	 * @return
	 */
	private int getAlignedX(float x, float offset, int textAlign){
		
		float alignedX = 0;
		
		if(textAlign == IWBBridge.IWB_TEXTALIGN_END){
			
			alignedX = x + offset;
		}
		else if(textAlign == IWBBridge.IWB_TEXTALIGN_CENTER){
			
			alignedX = (x + x + offset) / 2;
		}
		else{
			alignedX = x;
		}

		return (int)alignedX;
	}
}
