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

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.InputMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.Theme;
import becta.viewer.accessibility.ThemeChangeListener;
import becta.viewer.accessibility.ThemeManager;
import becta.viewer.controls.Toolbar;
import becta.viewer.selection.SelectionMode;
import becta.viewer.util.Platform;

/**
 * This is the main class for viewer
 * The framework for the viewer is implemented in this class
 */
public class Viewer implements ThemeChangeListener {

	/**
	 * instance of viewer
	 */
	private static Viewer viewer;
	/**
	 * the desktop pane
	 */
	private JPanel desktop;
	/**
	 * holds the list of frames
	 */
	private ArrayList<becta.viewer.framework.Frame> frames = new ArrayList<becta.viewer.framework.Frame>();
	/**
	 * holds the frame that is currently viewed
	 */
	private becta.viewer.framework.Frame activeFrame;
	/**
	 * menu bar for the viewer
	 */
	private Menubar menubar;
	/**
	 * tool bar for the viewer
	 */
	private Toolbar toolbar;
	/**
	 * instance of resource bundle
	 */
	private ResourceBundle resourceBundle;
	/**
	 * instance of parent container
	 */
	private JFrame parentContainer;
	/**
	 * Listener list
	 */
	private EventListenerList listenerList = new EventListenerList();
		
	
	/**
	 * The constructor of the class
	 */
	public Viewer(){
		
		//In Linux , the file is put in to edit mode on trying to select it by double click
		//So disable edit mode in File chooser		
		UIManager.put("FileChooser.readOnly", Boolean.TRUE); 
		
		//creates instance of resource bundle
		resourceBundle = ResourceBundle.getBundle("becta.viewer.framework.resources");
		
		JPopupMenu.setDefaultLightWeightPopupEnabled(false);

		ThemeManager.addThemeChangeListener(this);
		
		//Creates main frame
		JFrame mainFrame = new JFrame();
		

		//For getting the desktop size
		Insets screenInsets = java.awt.Toolkit.getDefaultToolkit().getScreenInsets(mainFrame.getGraphicsConfiguration());			
		Rectangle screenSize = mainFrame.getGraphicsConfiguration().getBounds();
		final Rectangle maxBounds = new Rectangle(screenInsets.left + screenSize.x, 
											screenInsets.top + screenSize.y, 
											screenSize.x + screenSize.width - screenInsets.right - screenInsets.left,
											screenSize.y + screenSize.height - screenInsets.bottom - screenInsets.top);
		
		//set properties for main frame
		mainFrame.setMaximizedBounds(maxBounds);
		mainFrame.setUndecorated(true);
		mainFrame.setTitle(resourceBundle.getString("mainFrame.Title"));
		
		try
		{
			//creates the image for the slider thumb
			BufferedImage icon = ImageIO.read(Viewer.class.getResource("resources/application_icon.png"));
			mainFrame.setIconImage(icon);
		}
		catch (Exception e) {
			Viewer.logException(e);
		}

		// handles windowClosing for viewer
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Add a listener to exit the application on closing the main window
		mainFrame.addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent evt) {

				try
				{
				for (becta.viewer.framework.Frame frame : getFrames()) {
					
					frame.close();
				}
				exit();
				}
				catch (Exception e) {
					Viewer.logException(e);
				}
			}			
			
			@Override
			public void windowActivated(WindowEvent e) {

				//Fix for issue with application size in some versions of linux. If size is less that half of screen
				//we will set size to screen size
				if(Platform.isLinux && parentContainer.getHeight() < (maxBounds.getHeight()/2)){
					
					parentContainer.setSize(maxBounds.getSize());
				}
			}
		});
		
		//set parent container as main frame
		parentContainer = mainFrame;
	
		//Create menu bar and toolbar
		menubar = new Menubar();
		toolbar = new Toolbar();
	
		Canvas.addSelectionModeListener(toolbar);
		
		//set properties of desktop
		desktop = new JPanel();
		desktop.setLayout(new BorderLayout());
		desktop.setBackground(AccessibilityColor.window);
			
		//set menu bar for viewer
		parentContainer.setJMenuBar(menubar);

		//adds desktop and tool bar to viewer
		//We don't support docking toolbar on top. So add a dummy control on top to block it
		JPanel dummy = new JPanel();
		dummy.setPreferredSize(new Dimension(0,0));
		parentContainer.add(dummy,BorderLayout.NORTH);
		parentContainer.add(desktop, BorderLayout.CENTER);
		parentContainer.add(toolbar, BorderLayout.SOUTH);
		
		//set frame visible
		mainFrame.pack();
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//add FileChange listener
		this.addFileChangeListener(menubar);
		this.addFileChangeListener(toolbar);
		addStateChangeListener(menubar);
		addStateChangeListener(toolbar);
		
	}
	

	
    /**
     * Adds an <code>FileChangeListener</code> to the button.
     * @param l the <code>FileChangeListener</code> to be added
     */
	public void addFileChangeListener(FileChangeListener l){
		listenerList.add(FileChangeListener.class, l);
	}
	
	/**
     * Adds an <code>StateChangeListener</code> to the button.
     * @param l the <code>StateChangeListener</code> to be added
     */
	public void addStateChangeListener(StateChangeListener l){
		listenerList.add(StateChangeListener.class, l);
	}
	
	/**
	 * Gets the desktop of this viewer
	 * @return the component into which all internal frames will be placed
	 */
	public final JPanel getDesktop(){
		
		return desktop;
	}
	
	/**
	 * Gets the toolbar
	 * @return the toolbar of this viewer
	 */
	public final Toolbar getToolbar(){
		return toolbar;
	}
	
	/**
	 * Gets the menubar
	 * @return the menubar of this viewer
	 */
	public final Menubar getMenubar(){
		return menubar;
	}
	/**
	 * Method to get parent container
	 * @return parentContainer
	 */
	public final Frame getContainer(){
		
		return parentContainer;
	}	
	
	/**
	 * Get the list of frames that are opened
	 * @return ArrayList of Frame
	 */
	public final List<becta.viewer.framework.Frame> getFrames(){
		return frames;
	}
	
	/**
	 * Gets the currently viewed frame
	 * @return activeFrame
	 */
	public final becta.viewer.framework.Frame getActiveFrame(){
		return activeFrame;
	}
	
	/**
	 * Sets active theme
	 * Used to switch between opened files
	 * @param frame
	 */
	public void setActiveFrame(becta.viewer.framework.Frame frame){
		
		if(frame != activeFrame){
			
			if(activeFrame != null)
				activeFrame.getCanvas().getDocument().getCurrentPage().dispose(false);
			
			//removes currently showing frame from desktop
			desktop.removeAll();
			desktop.repaint();
			
			//adds new frame
			activeFrame = frame;
			desktop.add(activeFrame, BorderLayout.CENTER);
			desktop.validate();
			fireFileChange(activeFrame);
			frame.load(false);
			frame.loadComplete();
		}
	}
		
	/**
	 * Gets the instance of viewer
	 * @return instance of Viewer
	 */
	public static Viewer getViewer() {
		
		return viewer;
	}
	
	/**
	 * Log details of exception
	 * @param ex Exception
	 */
	public static void logException(Exception ex){
		
		//get the stack trace of exception
		StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter, true);
        ex.printStackTrace(printWriter);
        printWriter.flush();
        stringWriter.flush();

        //log stack trace
		logException(stringWriter.toString());
	}
	
	/**
	 * Log an error message
	 * @param msg Message string
	 */
	public static void logException(String msg){
		
		//get current time and formats it
        Date now = new Date();
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
        String currentTime = df.format(now);
       
        try
        {
        	FileWriter fileWriter = new FileWriter(System.getProperty("user.dir")+ File.separator + "log.txt", true);
        	fileWriter.write(currentTime + " " + msg + System.getProperty("line.separator"));
        	fileWriter.flush();
        	fileWriter.close();
        }
        catch(Exception e){
        	
        	//Error occurred during logging is ignored
        }
	}
		
	/**
	 * Shows confirmation message dialog
	 * @param owner
	 * @param title
	 * @param message
	 * @param type
	 * @return
	 */
	public static int showConfirmationDialog(Frame owner, String title, String message, int optionType){
				
		//Set default title , if it is not passed
		if(title==null)
			title = Viewer.getViewer().resourceBundle.getString("mainFrame.Title");
		
		JOptionPane pane = new JOptionPane(message, JOptionPane.QUESTION_MESSAGE,optionType,null,null,null);
		pane.getAccessibleContext().setAccessibleDescription(message);
		pane.selectInitialValue();
		JDialog dlg =  pane.createDialog(owner, title);
		dlg.setVisible(true);
		dlg.dispose();
		
		Object        selectedValue = pane.getValue();
		
        if(selectedValue == null)
            return JOptionPane.CLOSED_OPTION;
        if(selectedValue instanceof Integer)
            return ((Integer)selectedValue).intValue();
        
        return JOptionPane.CLOSED_OPTION;
	}
	
	public static void showMessageDialog(Component owner, String title, String message, int messageType){
		
		//Set default title , if it is not passed
		if(title==null)
			title = Viewer.getViewer().resourceBundle.getString("mainFrame.Title");
		
		JOptionPane pane = new JOptionPane(message, messageType,JOptionPane.DEFAULT_OPTION,null,null,null);
		pane.getAccessibleContext().setAccessibleDescription(message);
		pane.selectInitialValue();
		JDialog dlg =  pane.createDialog(owner, title);
		dlg.setVisible(true);
		dlg.dispose();
	}
	
	/**
	 * Main class
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			ThemeManager.init();
			
			if(!Platform.isOSX || System.getProperty("apple.laf.useScreenMenuBar").equals(Boolean.FALSE)){
				
				MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
				//set cross platform look and feel
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			}
			
			//for using ENTER key for clicking a button
			InputMap inputMap = (InputMap)UIManager.get("Button.focusInputMap");
			inputMap.put( KeyStroke.getKeyStroke( "ENTER" ), "pressed" );
			inputMap.put( KeyStroke.getKeyStroke( "released ENTER" ), "released" );
			
			//creates viewer
			viewer = new Viewer();
		}
		catch(Exception ex)
		{
			logException(ex);
			showMessageDialog(null,null, ex.getMessage(),JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Minimise the application
	 */
	public final void minimise() {
		parentContainer.setState(Frame.ICONIFIED);
	}
	
	/**
	 * Opens a file
	 * @param filePath file to be opened
	 */
	public final void openFile(String filePath) {
		
		File workingPath=null;
		
		try
		{	
			workingPath = createWorkingPath();
			becta.viewer.framework.Frame frame = new becta.viewer.framework.Frame(workingPath.getAbsolutePath(),filePath);
			
			if(activeFrame != null){
				activeFrame.getCanvas().getDocument().getCurrentPage().dispose(false);
				desktop.removeAll();
				desktop.repaint();
			}
			
			activeFrame = frame;			
			frames.add(frame);
			
			desktop.add(activeFrame, BorderLayout.CENTER);			
			activeFrame.load(true);
			desktop.validate();
			
			if(activeFrame.getCanvas().getDocument().hasFlashContent()){
				
				Viewer.showMessageDialog(this.getContainer(), null,resourceBundle.getString("FlashContentMsg") , JOptionPane.INFORMATION_MESSAGE);
			}
			fireFileChange(activeFrame);
			
			activeFrame.loadComplete();
		}
		catch(Exception ex){
			
			logException(ex);
			Viewer.showMessageDialog(this.getContainer(), null, resourceBundle.getString("FileLoadErrorMsg"),JOptionPane.ERROR_MESSAGE);
			if(workingPath!=null)
				deleteDirectory(workingPath);
		}
	}
		
	private static File createWorkingPath() throws Exception{
		
		File file = File.createTempFile("iwb", null);
		file.delete();
		file.mkdir();
		
		return file;
		
	}
	
	/**
	 * Save a copy of file
	 * @param filePath name of file to be created
	 */
	public final void saveCopy(String filePath) {
		
		try
		{
			File file = new File(filePath);
			if(file.exists()){
				
				if(showConfirmationDialog(getContainer(), resourceBundle.getString("WarningMsgTitle"),resourceBundle.getString("FileAlreadyExistMsg") ,JOptionPane.YES_NO_OPTION) !=0){
					return;
				}
			}
			File dir = createWorkingPath();
			activeFrame.save(dir.getAbsolutePath(),filePath);
			deleteDirectory(dir);
		}
		catch(Exception ex){
			logException(ex);
			JOptionPane.showMessageDialog(this.getContainer(), resourceBundle.getString("FileSaveErrorMsg"));
			
		}
			
	}
	
	static public boolean deleteDirectory(File path) {
		
		try
		{
		    if( path.exists() ) {
		      File[] files = path.listFiles();
		      for(int i=0; i<files.length; i++) {
		         if(files[i].isDirectory()) {
		           deleteDirectory(files[i]);
		         }
		         else {
		           files[i].delete();
		         }
		      }
		    }
		    return( path.delete() );
		}
		catch (Exception e) {			
			return false;
		}
	  }

	
	/**
	 * Close file
	 */
	public final void closeFile() {
		
		//activeFrame.stopMedia();
		activeFrame.close();
		frames.remove(activeFrame);
		desktop.removeAll();
		desktop.repaint();
		
		if(frames.size() > 0){
			
			activeFrame =frames.get(0);
			desktop.add(activeFrame, BorderLayout.CENTER);
			desktop.validate();
			fireFileChange(activeFrame);
			activeFrame.load(false);
			activeFrame.loadComplete();
		}
		else{
			activeFrame = null;
			fireFileChange(null);
		}	
		
	}
	
	/**
	 * Shows about dialog box
	 */
	public final void showAbout() {
		
		AboutDialog.showDialog(parentContainer);
	}
	
	/**	
	 * Closes the application
	 */
	public final void exit() {
		
		//checks whether any of the opened frame is dirty
		boolean unChanged = true;
		for (becta.viewer.framework.Frame frame : getFrames()) {
			if(frame.getCanvas().getDocument().isDirty()){
				unChanged = false;
				break;
			}
		}

		//shows confirmation message if any of the document is dirty
		if(unChanged || Viewer.showConfirmationDialog(viewer.getContainer(),resourceBundle.getString("ExitViewerMsgTitle") ,resourceBundle.getString("ExitViewerMsg"), JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
			
			System.exit(0);
		}
	}
	
	/**
	 * Handles undo/redo operation
	 */
	public final void undoRedo() {
		
	}

	/**
	 * Toggles selection tool
	 */
	public final void selectTool() {

		toolbar.showAnnotationDialog(false);
		activeFrame.setSelectionMode(SelectionMode.REGULAR);
	}
	
	/**
	 * Select annotation mode
	 */
	public final void selectPen(){		

		
		activeFrame.setSelectionMode(SelectionMode.DRAWING);
	}

	/**
	 * shows change pen dialog
	 */
	public final void changePen() {
		
		toolbar.showAnnotationDialog(true);		
	}

	/**
	 * shows colour mapping menu
	 */
	public final void colourMapping() {
		
		toolbar.showAccessibilityMenu();		
	}

	/**
	 * resets file
	 */
	public final void resetFile() {
		
		activeFrame.resetFile();
		toolbar.resetPageNo();
		
	}
	/**
	 * Reset viewer
	 */
	public void resetViewer() {
		
		toolbar.reset();
	}

	/**
	 * clear annotations
	 */
	public final void clearAnnotations() {
		
		if(activeFrame != null){			
			activeFrame.clearAnnotations();
		}
	}

	/**
	 * handles zooming
	 */
	public final void zoom(boolean isZoomIn) {

		if(activeFrame != null){
			ZoomManager zoomManager = activeFrame.getCanvas().getZoomManager();
			double currentZoomFactor = zoomManager.getCurrentScale() - 1;
			double newZoomFactor = isZoomIn ? currentZoomFactor + 0.2 : currentZoomFactor - 0.2;
			zoomManager.scaleTo(newZoomFactor + 1);
			fireZoomChange(activeFrame);
		}
		
		
	}
	public final void resetZoom() {

		if(activeFrame != null){
			ZoomManager zoomManager = activeFrame.getCanvas().getZoomManager();			
			zoomManager.scaleTo(1);
			fireZoomChange(activeFrame);	
		}
	}

	/**
	 * hide/show revealer
	 * @return Boolean value indicating whether revealer is shown or not
	 */
	public final void toggleRevealer() {
		
		if(activeFrame != null){
			
			activeFrame.getScrollPane().showRevealer(!activeFrame.getScrollPane().getRevealer().isVisible());
		}
	}
	
	/**
	 * Updates menutext and toolbar icon based on state of revealer
	 * @param isVisible
	 */
	public final void toggleRevealerIcon(boolean isVisible){
		
		menubar.updateRevealerMenu(isVisible);
		toolbar.updateRevealerIcon(isVisible);
	}
	
	/**
	 * Handles themeChanged event
	 */
	public void themeChanged(Theme theme) {
		
		menubar.updateForThemeChanged(theme.getFont("ViewerControlFont"), theme.getFont("MenuItemFont"));
		toolbar.updateForThemeChanged(theme.getFont("ViewerControlFont"));

		parentContainer.repaint();
		
		//if toolbar is in floating state, it is repainted
		if(toolbar.isFloating()){
			
			toolbar.repaint();
		}
		
		//if annotation dialog is active, it is repainted
		if(toolbar.isAnnotationDialogShowing()){
			
			toolbar.repaintAnnotationDialog();
		}
		
		if(activeFrame!= null){
			
			if(activeFrame.getScrollPane().getRevealer()!= null)
				activeFrame.getScrollPane().getRevealer().repaint();
			
			activeFrame.getCanvas().refreshCanvasContent(true);
		}
	}
	
	public void toolbarStateChanged()
	{
		for (becta.viewer.framework.Frame frame : frames) {
			frame.getScrollPane().floatChanged();
		}
	}
	
	/**
	 * Gets the number of open files
	 * @return
	 */
	public int getOpenFileCount(){
		
		return frames.size();
	}
	
    /**
     * Fires file change event
     * @param doc
     */
    private void fireFileChange(becta.viewer.framework.Frame frame) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length-2; i>=0; i-=2) {
            if (listeners[i]==FileChangeListener.class) {
            	
                ((FileChangeListener)listeners[i+1]).fileChanged(frame);
            }          
        }
    }
    
    /**
     * Fires file change event
     * @param doc
     */
    private void firePageChange(becta.viewer.framework.Frame frame,int number ) {
    	
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length-2; i>=0; i-=2) {
            if (listeners[i]==FileChangeListener.class) {
            	
                ((FileChangeListener)listeners[i+1]).pageChanged(frame, number);
            }          
        }
    }
    
    /**
     * Fires Zoom change event
     * @param doc
     */
    private void fireZoomChange(becta.viewer.framework.Frame frame ) {
    	
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length-2; i>=0; i-=2) {
            if (listeners[i]==StateChangeListener.class) {
            	
                ((StateChangeListener)listeners[i+1]).zoomStateChanged(frame);
            }          
        }
    }
    
    public void pageChanged(becta.viewer.framework.Frame frame,int number){
    	
    	firePageChange(frame,number);
    }
    
    /**
     * Mute media in current page
     * @param enable
     */
    public void setMute(boolean enable){
    	
    	if(activeFrame!=null)
    	activeFrame.setMute(enable);
    }
    
	/**
	 * Set volume for media
	 */
    public void setVolume( int volume){
    	
    	if(activeFrame!=null)
    		activeFrame.setVolume(volume);
    }
    
    /**
     * Play media in current page
     */
    public void resumeMedia(){
    	
    	//set volume and mute settings
    	activeFrame.setMute(toolbar.isMute());
    	activeFrame.setVolume(toolbar.getVolume());
    	
    	activeFrame.resumeMedia();
    }
    
    /**
     * Pause media in current page
     */
    public void pauseMedia(){
    	activeFrame.pauseMedia();
    }
}
