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

import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javax.media.Controller;
import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.RealizeCompleteEvent;
import javax.media.StartEvent;
import javax.media.StopByRequestEvent;
import javax.media.Time;
import javax.media.TransitionEvent;
import javax.sound.sampled.BooleanControl;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import becta.viewer.controls.Toolbar;
import becta.viewer.controls.ToolbarAction;
import becta.viewer.drawing.BaseElement;
import becta.viewer.filemanagement.Document;
import becta.viewer.filemanagement.Page;
import becta.viewer.link.LinkManager;
import becta.viewer.selection.Deletable;
import becta.viewer.selection.SelectionManager;
import becta.viewer.selection.SelectionMode;
import becta.viewer.undoredo.UndoRedoCache;
import becta.viewer.undoredo.UndoRedoManager;
import becta.viewer.util.HyperlinkNavigator;

/**
 * This class implements the frame for the viewer
 */
public class Frame extends JPanel implements ControllerListener {
	
	/**
	 * scrollPane linked with this frame
	 */
	private ScrollPane scrollPane;
	/**
	 * Holds the originally loaded document
	 */
	private Document document;
	/**
	 * Holds the file name associated with this frame
	 */
	private File file;
	/**
	 * Holds the selection manager instance
	 */
	private SelectionManager selection;
	
	private UndoRedoManager  undoManager;
	private LinkManager   linkManager;
	private File workingPath;
	/**
	 * Constructor for this class
	 * @param handle
	 */
	public Frame(String workingPath, String filePath) throws Exception{

		//set the file name associated with this frame
		this.file = new File(filePath);
		
		this.workingPath = new File(workingPath);
		
		//loads original document
		document = Document.load(workingPath, filePath);
		
		//set layout for the frame
		this.setLayout(null);
		
		//creates instance of scroll pane
		scrollPane = new ScrollPane();
		
		selection = new SelectionManager(this);
		
		linkManager = new LinkManager(this,ResourceBundle.getBundle("becta.viewer.framework.resources").getString("LinkHelperMessage"));
		
		undoManager = new UndoRedoManager(this);
		
		this.add(scrollPane);
				
	}
	
	public void close()
	{
		try
		{
			getCanvas().getDocument().getCurrentPage().dispose(true);
			Viewer.deleteDirectory(workingPath);
		}
		catch (Exception e) {
			Viewer.logException(e);
		}
		
	}

	/**
	 * Gets the working path
	 * @return
	 */
	public String getWorkingPath(){
		return workingPath.getName();
	}
	
	public void undo(){
		
		undoManager.undo();
	}
	
	public void redo(){
		
		undoManager.redo();
	}
	/**
	 * This method is used to get the Canvas linked to this frame
	 * @return instance of Canvas
	 */
	public Canvas getCanvas() {
		
		return scrollPane.getCanvas();
	}
	
	/**
	 * 
	 * @return instance of ScrollPane
	 */
	public ScrollPane getScrollPane() {
		
		return scrollPane;
	}
	
	/**
	 * Loads document to frame
	 */
	public void load(boolean creatDocument) {
		
		if(creatDocument)
		{
			if(document != null){
				scrollPane.getCanvas().setDocument(document.clone());
				setActivePage(1);
			}
		}
		else{
			
			getCanvas().getDocument().getCurrentPage().beginInitialize(this);			
			getCanvas().refreshCanvasContent(true);
			getCanvas().getScrollPane().updateHeavyComponent();			
		}
			
	}
	/**
	 * Loads document to frame
	 */
	public void loadComplete() {
		
		if(document != null){
			scrollPane.getCanvas().getDocument().getCurrentPage().endInitialize();			
		}
	}
	/**
	 * This method is used for saving the copy of file
	 * @param fileName
	 */
	public void save(String workingpath, String newFileName) throws Exception{
		
		document.saveAs(workingpath,file.getAbsolutePath(), newFileName);
	}
	
	/**
	 * Sets the selection mode
	 * @param mode new selection mode
	 */
	public void setSelectionMode(SelectionMode mode){
		
		if(mode!=SelectionMode.REGULAR){
			selection.clear();
		}
		getCanvas().setSelectionMode(mode);
	}
	
	public String getFilename(){
		
		return file.getName();
	}
	
	public void setActivePage(int pageNo){
		
		
		
		Canvas canvas = getCanvas();
		
		canvas.getDocument().getCurrentPage().dispose(false);

		canvas.getDocument().setActivePageIndex(pageNo);		

		
		canvas.removeAll();
		
		canvas.getDocument().getCurrentPage().beginInitialize(this);
		
		canvas.refreshCanvasContent(true);
		
		selection.clear();
		
		linkManager.setLinks(canvas.getDocument().getCurrentPage().getLinks());

		
		canvas.getScrollPane().updateHeavyComponent();
		
		//update revealer
		if(canvas.getDocument().getCurrentPage().getRevealer()!=null){
			
			Rectangle2D revealArea = canvas.getDocument().getCurrentPage().getRevealer().getShape().getBounds();
						
			double cx =  revealArea.getCenterX();
			double cy = revealArea.getCenterY();
			
			Rectangle2D viewBox  = document.getViewbox();
			
			double toleranceWidth =  viewBox.getWidth()/10;
			double toleranceHeight =  viewBox.getHeight()/10;
			
			Rectangle2D temp = new Rectangle2D.Double(viewBox.getCenterX() - toleranceWidth , viewBox.getCenterY() - toleranceHeight, toleranceWidth*2,toleranceHeight*2);
			if( temp.contains(cx, cy)){
				canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.CENTER, 0);
			}
			else{
				
				double hfactor =  revealArea.getHeight() / viewBox.getHeight();
				double wfactor = revealArea.getWidth() / viewBox.getWidth();
				
				if(hfactor == wfactor){
					
					double westDist = Math.abs(viewBox.getX() - cx);
					double eastDist = Math.abs(viewBox.getX() + viewBox.getWidth() - cx);
					double northDist = Math.abs(viewBox.getY() - cy);
					double southDist = Math.abs(viewBox.getY() + viewBox.getHeight() - cy);
					
					double min = Math.min(Math.min(westDist, eastDist),Math.min(northDist, southDist));
					if(min==westDist)
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.WEST, (int) (revealArea.getX()+ revealArea.getWidth()));
					else if(min==eastDist)
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.EAST, (int) revealArea.getX());
					else if(min==northDist)
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.NORTH, (int) ( revealArea.getY() + revealArea.getHeight()));
					else 
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.SOUTH, (int) revealArea.getY());
					
				}
				else if( hfactor > wfactor ){
					
					if( cx <= viewBox.getCenterX()){    
					//dock left with width as revealArea.getWidth
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.WEST, (int) (revealArea.getX()+ revealArea.getWidth()));
					}
					else{
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.EAST, (int) revealArea.getX());
					}
				}
				else{
					
					if( cy <= viewBox.getCenterY()){
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.NORTH, (int) ( revealArea.getY() + revealArea.getHeight()));
					}
					else{
						canvas.getScrollPane().getRevealer().setInitialPosition(SwingConstants.SOUTH, (int) revealArea.getY());
					}
					
				}
			}
			canvas.getScrollPane().showRevealer(true);
						
		}
		canvas.getDocument().getCurrentPage().endInitialize();
	}
	
	public void updateMenuAndToolbar()
	{
		Page page = getCanvas().getDocument().getCurrentPage();
		
		Toolbar toolbar = Viewer.getViewer().getToolbar();
		
		toolbar.setActionEnabled(ToolbarAction.Delete,selection.getSelectedElement() instanceof Deletable);
		toolbar.setActionEnabled(ToolbarAction.Selection,page.hasSelectableItem());
		
		if(Canvas.getSelectionMode() != SelectionMode.DRAWING)
			getCanvas().setSelectionMode(page.hasSelectableItem() ? SelectionMode.REGULAR : SelectionMode.NONE);
		
		if(! page.hasMedia())
			toolbar.setActionEnabled(ToolbarAction.Play,false);
		else{
			
			boolean enablePlay = false;
			boolean setPause = false;
			for (BaseElement e : page.getElements()) {
				
				if(e.isMediaPlay()){					
					toolbar.setActionEnabled(ToolbarAction.Pause,true);
					setPause = true;
					break;
				}
				else if(e.isMediaPaused()){
					enablePlay = true;
				}
			}
			
			
			if(!setPause){
				toolbar.setActionEnabled(ToolbarAction.Play,enablePlay);
			}
				
		}
		
		Viewer.getViewer().getMenubar().enableUndoRedo(undoManager.getStatus(), true);
	}
	
	/**
	 * Reset file to original state
	 */
	public void resetFile(){
		
		Canvas canvas = scrollPane.getCanvas();
		
		canvas.getDocument().getCurrentPage().dispose(false);
		
		canvas.removeAll();
		
		canvas.setDocument(document.clone());
		
		canvas.getDocument().getCurrentPage().beginInitialize(this);
		canvas.getDocument().getCurrentPage().endInitialize();
		//set new size for canvas with respect to zoom level
		double width = canvas.getDocument().getViewport().getWidth() * canvas.getZoomManager().getCurrentScale();
		double height = canvas.getDocument().getViewport().getHeight() * canvas.getZoomManager().getCurrentScale();
		canvas.setCanvasSize(new Dimension((int)width, (int)height));
		
		selection.clear();
		
		//clear undo cache		
		undoManager.addUndoRedo(null);
	}
	public void clearAnnotations(){
		
		getCanvas().getDocument().clearAnnotations();
		
		selection.clear();		
		//clear undo cache		
		undoManager.addUndoRedo(null);
		
		getCanvas().refreshCanvasContent(true);
		
	}
	
	/**
	 * Play media in current page
	 */
	public void resumeMedia(){
		
		Canvas canvas = scrollPane.getCanvas(); 
		canvas.getDocument().getCurrentPage().resumeMedia();
	}
	
	/**
	 * Stop media in current page
	 */
	/*public void stopMedia(){
		
		Canvas canvas = scrollPane.getCanvas(); 
		canvas.getDocument().getCurrentPage().stopMedia(true);
	}*/
	
	/**
	 * Pause media in current page
	 */
	public void pauseMedia(){
		
		Canvas canvas = scrollPane.getCanvas(); 
		canvas.getDocument().getCurrentPage().pauseMedia();
	}

	/**
	 * Mute media in current page
	 */
    public void setMute(boolean enable){
    	
		Canvas canvas = scrollPane.getCanvas(); 
		canvas.getDocument().getCurrentPage().setMute(enable);
		
    }
    
	/**
	 * Set volume for media in current page
	 */
    public void setVolume( int volume){
		Canvas canvas = scrollPane.getCanvas(); 
		canvas.getDocument().getCurrentPage().setVolume(volume);
    }
    
    public void navigateURL(String url,boolean internal){
    	
    	try
    	{
	    	if(internal){
	    		
	    		//opens internal element links
	    		if(url.startsWith("#")){
	    		    
		    		url = url.substring(1);
		    		
		    		List<Page> pages = getCanvas().getDocument().getPages();
		        	
		        	int count = 0;
		        	for (Page page : pages) {
		    			++count;
		    			if( url.equals(page.getIdentifier())){
		    				
		    				if(getCanvas().getDocument().getCurrentPage() != page){
	        					Viewer.getViewer().pageChanged(this, count);
	        					setActivePage(count);
	        				}
	        				getCanvas().refreshCanvasContent(true);
	        				return;
		    			}
		    			else{
			        		for (BaseElement element : page.getElements()) {
			    				
			        			if(url.equals(element.getIdentifier())){
			        				
			        				if(getCanvas().getDocument().getCurrentPage() != page){
			        					Viewer.getViewer().pageChanged(this, count);
			        					setActivePage(count);
			        				}        				
			        				getCanvas().scrollRectToVisible(getCanvas().getZoomManager().getScaleTransform().createTransformedShape(element.getShape()).getBounds());
			        				getCanvas().refreshCanvasContent(true);
			        				return;
			        			}
			    			}
		    			}
		    		}
	    		}
	    		else{
	    			
	    			//opens internal file links
	    			HyperlinkNavigator.navigate(workingPath.getAbsolutePath() + File.separator + url);
	    		}
	    	}
	    	else{
	    	
	    		String urlString;
	    		try{
	    			
	    			//checks whether the link is a URL or relative file path
	    			URL tempURL = new URL(url);
	    			
	    			//if link is a URL no exception is thrown
	    			urlString = tempURL.toString();
	    		}
	    		catch (MalformedURLException e) {
					
	    			//if exception is thrown, link is not a URL
	    			//so we add the relative path to location of IWB file
	    			urlString = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(File.separator)) + File.separator + url;
				}
	    		HyperlinkNavigator.navigate(urlString);
	    	}
    	}
    	catch(IOException ex){
    		Viewer.logException(ex);
    	}
    	
    }
    
    public void doAction(UndoRedoCache cache){
    	  
    	this.undoManager.addUndoRedo(cache);
    	cache.execute();
    }
    
    public void deleteElement(){
    
    	final BaseElement element = selection.getSelectedElement();
    	final Document doc =  getCanvas().getDocument();
    	
    	Runnable executeRunnable=new Runnable(){
    		
    		public void run() {

    			if(element.getGroup()!=null){
					for (BaseElement e : element.getGroup()) {
						doc.getCurrentPage().removeElement(e);
					}
				}
				else
					doc.getCurrentPage().removeElement(element);
    			if(selection!=null)
    				selection.clear();
    	    	getCanvas().refreshCanvasContent(true);
    	    	linkManager.setLinks(doc.getCurrentPage().getLinks());
    	    	
    		}
    	};
    	
    	Runnable undoRunnable=new Runnable(){
    		
    		public void run() {
    			
    			if(element.getGroup()!=null){
					for (BaseElement e : element.getGroup()) {
						doc.getCurrentPage().addElement(e);
					}
				}
				else
					doc.getCurrentPage().addElement(element);
    			
    			linkManager.setLinks(doc.getCurrentPage().getLinks());
    			getCanvas().refreshCanvasContent(true);
    			
    		}
    	};
    	
    	doAction(new UndoRedoCache(executeRunnable,undoRunnable));
    	
    	//mark document as dirty after deletion
    	doc.setDirty();
    }

    /**
     * Event handler for media player
     */
	public void controllerUpdate(ControllerEvent e) {

		
		if(e instanceof StartEvent || e instanceof EndOfMediaEvent || e instanceof StopByRequestEvent){
			updateMenuAndToolbar();
		}
	}
	
	public void updateLinks(){
		
		linkManager.setLinks(getCanvas().getDocument().getCurrentPage().getLinks());
	}
    
}
