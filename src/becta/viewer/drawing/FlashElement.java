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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javax.media.ControllerListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.jdesktop.jdic.browser.BrowserEngineManager;
import org.jdesktop.jdic.browser.IWebBrowser;
import org.jdesktop.jdic.browser.WebBrowser;
import org.jdesktop.jdic.browser.WebBrowserEvent;
import org.jdesktop.jdic.browser.WebBrowserListener;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.ThemeManager;
import becta.viewer.framework.Frame;
import becta.viewer.framework.Viewer;
import becta.viewer.util.Platform;

/**
 * Handles the presentation of flash element
 */
public class FlashElement extends MediaElement {

	/**
	 * Holds the player
	 */
	private IWebBrowser player;
	/**
	 * Panel that holds the browser control
	 */
	private JPanel browserControl;
	/**
	 * Place holder that is used when control is not fully visible
	 */
	private PlaceHolder placeHolder;
	
	private ResourceBundle resourceBundle;
	
	private File tempFile = null;
	
	private boolean initialized = false;
	
	private Rectangle2D actualBound;

	/**
	 * Constructor for this class
	 */
	public FlashElement() {
		
		resourceBundle = ResourceBundle.getBundle("becta.viewer.drawing.resources");

		placeHolder = new PlaceHolder();
		placeHolder.setBackground(Color.GRAY);
		browserControl = new JPanel(new BorderLayout());
		browserControl.setBorder(null);
	}
	
	@Override
	public void setArea(Rectangle2D area) {
		
		actualBound = area;
		super.setArea(area);
		applyViewportTransformation();
	}
	
	@Override
	public void draw(Graphics2D g) {
		
		
		if(player != null && !initialized){
			
			
			try{
				
				URL url = Platform.isLinux ? new URL("file", "", "/" + tempFile.getAbsolutePath().replaceAll(" ", "%20")) : new URL(tempFile.toURL().toString().replaceAll(" ", "%20"));
				player.setURL(url);
			}
			catch (Exception e) {
				Viewer.logException(e);
			}
		}
		
		
		//applies zoom if any
		AffineTransform tx = g.getTransform();
		applyZoom(tx.getScaleX());
		
	}
	@Override
	public void endInitialize() {
		
		super.endInitialize();
		
		initialized = true;
		
		try{
			
			URL url = Platform.isLinux ? new URL("file", "", "/" + tempFile.getAbsolutePath().replaceAll(" ", "%20")) : new URL(tempFile.toURL().toString().replaceAll(" ", "%20"));
			player.setURL(url);
		}
		catch (Exception e) {
			Viewer.logException(e);
		}
		
		
	}
	@Override
	public void beginInitialize(ControllerListener listener) {
		
		super.beginInitialize(listener);
		
		try{
			
			Frame frame = Viewer.getViewer().getActiveFrame();
			
			browserControl.removeAll();
			
			BrowserEngineManager bem = BrowserEngineManager.instance();
			
			//For windows platform we will embed IE browser engine
			if(Platform.isWindows && bem.getActiveEngine().getBrowserName()!=BrowserEngineManager.IE){
				bem.setActiveEngine(BrowserEngineManager.IE);
			}
			
			player = createWebBrowser();
			//creates temporary HTML file for embedding flash content
			String tempFileName = frame.getWorkingPath() + "_" + new File(this.url).getName();
			tempFile = File.createTempFile(tempFileName, null);
			FileWriter writer = new FileWriter(tempFile);
			writer.write(String.format(resourceBundle.getString("FlashEmbedString"),this.url));
			writer.close();
			initialized = false;
			//URL url = Platform.isLinux ? new URL("file", "", "/" + tempFile.getAbsolutePath().replaceAll(" ", "%20")) : new URL(tempFile.toURL().toString().replaceAll(" ", "%20"));
			//player.setURL(url);
							
			browserControl.setLocation((int)area.getX(), (int)area.getY());
			browserControl.setSize((int)area.getWidth(), (int)area.getHeight());
			browserControl.add(player.asComponent(), BorderLayout.CENTER);
			
			placeHolder.setLocation((int)area.getX(), (int)area.getY());
			placeHolder.setSize((int)area.getWidth(), (int)area.getHeight());
			placeHolder.setBorder(BorderFactory.createLineBorder(AccessibilityColor.controlText, 2));
			
			frame.getCanvas().add(placeHolder);
			frame.getCanvas().add(browserControl);
			player.asComponent().setVisible(true);

		}
		catch (Exception e) {

			Viewer.logException(e);
		}
	}
	
	/**
	 * Dispose instance of player
	 */
	@Override
	public void dispose(boolean close) {
		
		if(player != null){
			
			player.stop();
					
			if(!Platform.isOSX){

				//keep one instance for preventing embedded browser from getting destroyed
				if(player.getInstanceNum() != 0 && !player.isInitialized()){
					((WebBrowser)player).dispose();
				}
				else{
					player.setURL();
				}
			}
			player = null;
			initialized = false;
			
			try{
				//deletes temp file
				if(tempFile != null){
					tempFile.delete();
					tempFile = null;
				}
			}
			catch (Exception e) {
				
				Viewer.logException(e);
			}
		}
	}
	
	/**
	 * This method is used for showing place holder in the place of AWT component if it is not visible in screen
	 */
	@Override
	public void updateHeavyControl(Rectangle bounds,Rectangle2D viewBound) {
			
		try
		{
		boolean controlVisible	= viewBound.contains(actualBound);
		
		if(controlVisible){
			Point scrLocation = !browserControl.isVisible() ? placeHolder.getLocationOnScreen() : browserControl.getLocationOnScreen();
			controlVisible = bounds.contains(new Rectangle(scrLocation, placeHolder.getSize()));
		}
		
		if(controlVisible){
			
			if(!browserControl.isVisible()){
				browserControl.setVisible(true);
				browserControl.setSize(placeHolder.getSize());
			}
			player.asComponent().setVisible(true);
		}
		else{
			
			if(browserControl.isVisible()){
				
				browserControl.setSize(1, 1);
				browserControl.validate();
				browserControl.setVisible(false);
			}
			player.asComponent().setVisible(false);
		}
		placeHolder.setVisible(!controlVisible);
		
		}
		catch(Exception ex){
			
		}
	}
	
	/**
	 * Performs zoom for control
	 * @param factor
	 */
	private void applyZoom(double factor){
	
		//get new location due to zooming
		Point2D newLocation =AffineTransform.getScaleInstance(factor, factor).transform(new Point2D.Double(area.getX(), area.getY()), null); 

		//set new size for control
		double width = area.getWidth() * factor;
		double height = area.getHeight() * factor;
		placeHolder.setSize((int)width, (int)height);
		placeHolder.setLocation((int)newLocation.getX(), (int)newLocation.getY());
		
		if(browserControl.isVisible()){
			browserControl.setSize(placeHolder.getSize());	
		}
		
		browserControl.setLocation(placeHolder.getLocation());
		browserControl.validate();
	}
	
	/**
	 * Creates instance of web browser
	 * @return
	 */
	private IWebBrowser createWebBrowser(){
		
		if(Platform.isOSX){
			BrowserEngineManager bem = BrowserEngineManager.instance();
			return bem.getActiveEngine().getWebBrowser();
		}
		else
		{
			return new WebBrowser(false);
		}
	}
	
	class PlaceHolder extends JPanel{
		
		public PlaceHolder() {
			setFont(new Font("Arial", Font.BOLD, 16));
		}
		@Override
		public void paint(Graphics g) {
			
			super.paint(g);
			
			g.setFont(getFont());
			FontMetrics fm = g.getFontMetrics();
			String placeHolderText = clipStringIfNecessary(this, fm, resourceBundle.getString("FlashPlaceHolderText"), getWidth());
			
			
			int height = fm.getHeight();
			int width = fm.stringWidth(placeHolderText);
			
			int x = (getWidth() - width)/2;
			int y = (getHeight() - height)/2;
			g.drawString(placeHolderText, x, y);
		}
		
		/**
		 * Clips text if exceeds width
		 * @param c
		 * @param fm
		 * @param string
		 * @param availTextWidth
		 * @return
		 */
		private String clipStringIfNecessary(JComponent c, FontMetrics fm,  String string,  int availTextWidth) {
			
			if ((string == null) || (string.equals("")))  {
				return "";
			}
		
			int textWidth = fm.stringWidth(string);
			if (textWidth > availTextWidth) {
				String clipString = "...";
				int width = fm.stringWidth(clipString);
				// NOTE: This does NOT work for surrogate pairs and other fun
				// stuff
				int nChars = 0;
				for(int max = string.length(); nChars < max; nChars++) {
					width += fm.charWidth(string.charAt(nChars));
					if (width > availTextWidth) {
						break;
					}
				}
				string = string.substring(0, nChars) + clipString;
				return string;
			}
			return string;
		}
	}
}
