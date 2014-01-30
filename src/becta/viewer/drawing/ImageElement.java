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

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;

import org.freehep.graphicsio.emf.EMFInputStream;
import org.freehep.graphicsio.emf.EMFRenderer;
import org.jfree.pixie.wmf.WmfFile;

import becta.viewer.framework.Viewer;
import becta.viewer.selection.ActionType;
import becta.viewer.selection.Deletable;
import becta.viewer.selection.Resizable;
import becta.viewer.selection.Selectable;

/**
 * Handles drawing of image element
 */
public class ImageElement extends MediaElement implements Selectable,Resizable,Deletable {
	
	/**
	 * Holds the image to be displayed
	 */
	private BufferedImage image;

	/**
	 * Holds the flip applied to image
	 */
	private int flip;
	
	/**
	 * Holds the opacity
	 */
	private float opacity;
	
	/**
	 * Holds the transformations due to drag & resize
	 */
	private AffineTransform appliedTransform;
	/**
	 * Holds all the transformations defined in file
	 */
	private AffineTransform definedTransform;
			
	private void createImage(){
		
		//Get default graphics configuration
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

		image = gc.createCompatibleImage((int)area.getWidth(), (int)area.getHeight(), Transparency.BITMASK);
		
		//Convert url to lower case
		String temp = url.toLowerCase();
		
		if(temp.endsWith(".wmf")){
			
			//creates WMF image
			createWMFImage();
		}
		else if(temp.endsWith(".emf")){
			
			//creates EMF image
			createEMFImage();
		}
		else if(temp.endsWith(".tif") || temp.endsWith(".tiff")){
			
			//creates TIFF image
			createTIFFImage();
		}
		else{			
			//creates image of other supported formats
			createGeneralImage();
		}
		
		image = getFlippedImage(image);
	}
	
	/**
	 * Returns the image
	 * @return
	 */
	public Image getImage(){
		
		if(image==null)
			createImage();
		return image;
	}
	/**
	 * Constructor for this class
	 * @param url
	 * @param location
	 * @param size
	 */
	public ImageElement(String url, float x, float y, float width, float height) {
		
		setArea(new Rectangle2D.Double(x, y, width, height));
		setURL(url);
	}
	
	/**
	 * Set flip
	 * @param flip
	 */
	public void setFlip(int flip) {
		
		this.flip = flip;
	}
	
	/**
	 * Set Opacity
	 * @param opacity
	 */
	public void setOpacity(float opacity) {
		
		this.opacity = opacity;
	}
	

	/**
	 * Gets the shape after applying transformations
	 */
	@Override
	public Shape getShape() {

		if(super.getShape() ==null){

			Shape shape = new Rectangle2D.Double(area.getX(), area.getY(), area.getWidth(), area.getHeight());
			
			//apply available transformations
			shape = applyTransformations(shape);
			
			setShape(shape);
		}
		
		return super.getShape();
		
	}
	
	/**
	 * Handles drawing of image
	 */
	@Override
	public void draw(Graphics2D g) {
			
		//Hold current properties. We have to set it back at the end
		AffineTransform oldTransform = g.getTransform();
		
		if(definedTransform == null)
			definedTransform = getAllTransformation();
		
        AffineTransform tx = (AffineTransform)definedTransform.clone();
        
        if(tx!=null){
        	
        	if(appliedTransform != null)
        		tx.preConcatenate(appliedTransform);
        	
        	tx.preConcatenate(oldTransform);
        	g.setTransform(tx);
        }
        
		//Make sure that the image is in the visible area
		if(g.getClipBounds().intersects(area)){
		
			//Hold current properties. We have to set it back at the end
			Composite oldComposite = g.getComposite();
			
			//Set opacity if it is specified
			if( opacity!=IWBBridge.IWB_VALUE_UNDEFINED){
				AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,opacity);
				g.setComposite(alphaComposite);
			}
			
			if(image==null)
				createImage();
		        
	        g.drawImage(image, (int)area.getX(), (int)area.getY(), (int)area.getWidth(), (int)area.getHeight(), null);
	        
			g.setComposite(oldComposite);
		
		}
		
		g.setTransform(oldTransform);
	}

	public BaseElement notifyAction(ActionType type, AffineTransform transform,
			Rectangle bounds) {	
		
		ImageElement element = (ImageElement)super.notifyAction(type, transform, bounds);

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
	 * Creates WMF image
	 * @return
	 */
	private void createWMFImage(){
		
		try{
			
			File wmf=new File(url);
			WmfFile wmfFile = new WmfFile(wmf.getAbsolutePath());
			Graphics2D g2d = (Graphics2D)image.getGraphics();
			wmfFile.draw(g2d, new Rectangle2D.Double(0,0,area.getWidth(), area.getHeight()));
			g2d.dispose();
		}
		catch (Exception e) {
			createErrorImage();	
			Viewer.logException(e);
		}
	}
	
	private void createErrorImage(){
		
		Graphics2D g2d = image.createGraphics();
		g2d.setColor(Color.BLACK);		
		g2d.setStroke( new BasicStroke(2));
		g2d.drawRect(1, 1, (int)area.getWidth()-1, (int)area.getHeight()-1);		
		g2d.dispose();
	}
	/**
	 * Creates EMF image
	 * @return
	 */
	private void createEMFImage(){

		try{
			
			File imageFile = new File(url);
			FileInputStream emfStream=new FileInputStream(imageFile.getAbsolutePath());
			EMFInputStream eis = new EMFInputStream(emfStream);
			
			EMFRenderer renderer = new EMFRenderer(eis);
			
			Dimension size = renderer.getSize();
			Graphics2D g = image.createGraphics();
			g.transform(AffineTransform.getScaleInstance(area.getWidth() / (float)size.getWidth(),area.getHeight() / (float)size.getHeight()));
			renderer.paint(g);
			g.dispose();		
			
		}
		catch (Exception e) {
			createErrorImage();	
			Viewer.logException(e);
		}
	}
	
	/**
	 * Creates the TIFF image
	 * @return
	 */
	private void createTIFFImage(){
		
		File imageFile = new File(url);
		RenderedImage renderedImage = JAI.create("fileload", imageFile.getAbsolutePath());
		
		Graphics2D g = image.createGraphics();
		g.drawRenderedImage(renderedImage,AffineTransform.getScaleInstance(area.getWidth() / (float)renderedImage.getWidth(),area.getHeight() / (float)renderedImage.getHeight()));
		g.dispose();
	}
	
	/**
	 * Get the image after applying flip
	 * @param image
	 * @return
	 */
	private BufferedImage getFlippedImage(BufferedImage image){
		
		BufferedImage flippedImage = image;
        
        if(flip == IWBBridge.IWB_FLIP_HORIZONTAL){
        	
        	AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
            tx.translate(-image.getWidth(), 0);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
            flippedImage = op.filter(image, null);
        }
        else if(flip == IWBBridge.IWB_FLIP_VERTICAL){
        	
        	AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
            tx.translate(0, -image.getHeight());
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
            flippedImage = op.filter(image, null);
        }
        else if(flip == IWBBridge.IWB_FLIP_BOTH){
        	
        	AffineTransform tx = AffineTransform.getScaleInstance(-1, -1);
            tx.translate(-image.getWidth(), -image.getHeight());
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
            flippedImage = op.filter(image, null);
        }
        
        return flippedImage;
	}
	
	/**
	 * Creates image
	 * @return
	 */
	private void createGeneralImage(){

		try{

			BufferedImage bimg = ImageIO.read(new File(url));
			Graphics2D g = image.createGraphics();
			g.drawImage(bimg, 0, 0, (int)area.getWidth(), (int)area.getHeight(), 0, 0 , bimg.getWidth(), bimg.getHeight(), null);
			g.dispose();
		}
		catch (Exception e) {
			createErrorImage();	
			Viewer.logException(e);
		}
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

	
}
