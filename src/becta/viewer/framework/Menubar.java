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

import java.awt.Color;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ResourceBundle;

import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.accessibility.ThemeManager;
import becta.viewer.undoredo.UndoRedoStatus;
import becta.viewer.util.Platform;


/**
 * Menu bar for the viewer is implemented in this class 
 */
public class Menubar extends JMenuBar implements FileChangeListener,StateChangeListener,ActionListener {

	/**
	 * Close button
	 */
	private JButton btnClose;
	/**
	 * Minimise button
	 */
	private JButton btnMinimise;
	/**
	 * Label for showing filename
	 */
	private JLabel lblFilename;
	/**
	 * Holds the title
	 */
	private JLabel lblTitle;
	/**
	 * File menu
	 */
	private JMenu fileMenu;
	/**
	 * Edit menu
	 */
	private JMenu editMenu;
	/**
	 * View menu
	 */
	private JMenu viewMenu;
	/**
	 * Menu item for Save a Copy
	 */
	private JMenuItem miSaveCopy;
	/**
	 * Menu item for Close
	 */
	private JMenuItem miCloseFile;
	/**
	 * Menu item for Undo/Redo
	 */
	private JMenuItem miUndoRedo;
	/**
	 * Menu item for Select Tool
	 */
	private JMenuItem miSelectTool;
	/**
	 * Menu item for ChangePen
	 */
	private JMenuItem miChangePen;
	/**
	 * Menu item for Reset File
	 */
	private JMenuItem miResetFile;
	/**
	 * Menu item for Clear Annotations
	 */
	private JMenuItem miClearAnnotations;
	/**
	 * Menu item for Zoom In
	 */
	private JMenuItem miZoomIn;
	/**
	 * Menu item for Zoom Out
	 */
	private JMenuItem miZoomOut;
	/**
	 * Menu item for Reset Zoom
	 */
	private JMenuItem miResetZoom;
	/**
	 * Menu item for Hide/Show Reveal
	 */
	private JMenuItem miHideReveal;
	/**
	 * Resource bundle instance
	 */
	private ResourceBundle resourceBundle;

	/**
	 * Holds maximum limit for files that can be opened at a time
	 */
	private static final int OPEN_FILE_LIMIT = 9;
	/**
	 * Indicates whether mac menu is used
	 */
	private boolean isMacMenu = false;
	
	/**
	 * Keep the last selected directory
	 */
	private File lastUsedDirectory =null;

	/**
	 * Constructor for this class
	 */
	public Menubar(){
		
		
		isMacMenu = Platform.isOSX && "true".compareToIgnoreCase(System.getProperty("apple.laf.useScreenMenuBar"))==0;
		
		//set layout for menu bar
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		//creates instance of resource bundle
		resourceBundle = ResourceBundle.getBundle("becta.viewer.framework.resources");
																		
		//Set accelerator delimiter and font for menu item
		UIManager.put("MenuItem.acceleratorDelimiter", "+");
		UIManager.put("MenuItem.acceleratorFont", ThemeManager.getTheme().getFont("MenuItemFont"));
		
			
		//create file menu and its menu items
		createFileMenu(isMacMenu);
		
		//create edit menu and its menu items
		createEditMenu(isMacMenu);
		
		//create view menu and its menu items
		createViewMenu(isMacMenu);
		
		
		//set properties of lblFilename
		lblFilename = new JLabel();	
		//lblFilename.setForeground(AccessibilityColor.controlText);
		
		lblTitle = new JLabel(resourceBundle.getString("mainFrame.Title"));
		
		//set properties of btnClose
		btnClose = new JButton(){
			
			//Shift+TAb is not working. Temporary fix.
			@Override
			public void transferFocusBackward() {
				
				btnMinimise.requestFocus();
			}
		};
		
		
		setCommonButtonProperties(btnClose);
		btnClose.setToolTipText(resourceBundle.getString("btnClose.ToolTipText"));
		btnClose.setActionCommand("Close");
		btnClose.setIcon(new ImageIcon(Menubar.class.getResource("resources/close.png")));
		setAccessibleProperties(btnClose.getAccessibleContext(), resourceBundle.getString("btnClose.AccessibleName"), resourceBundle.getString("btnClose.AccessibleDescription"));
		
		//set properties of btnMinimize
		btnMinimise = new JButton();
		setCommonButtonProperties(btnMinimise);
		btnMinimise.setToolTipText(resourceBundle.getString("btnMinimise.ToolTipText"));
		btnMinimise.setActionCommand("Minimise");
		btnMinimise.setIcon(new ImageIcon(Menubar.class.getResource("resources/minimise.png")));
		setAccessibleProperties(btnMinimise.getAccessibleContext(), resourceBundle.getString("btnMinimise.AccessibleName"), resourceBundle.getString("btnMinimise.AccessibleDescription"));
		
		//set properties of this control
		this.setBackground(AccessibilityColor.control);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, AccessibilityColor.controlShadow));
		
		//divider icon between buttons
		Icon divider = new ImageIcon(Menubar.class.getResource("resources/top_bar_divider.png"));
		
		// add components to this control
		this.add(Box.createRigidArea(new Dimension(40,30)));
		this.add(fileMenu);
		this.add(Box.createRigidArea(new Dimension(40,30)));
		this.add(editMenu);
		this.add(Box.createRigidArea(new Dimension(40,30)));
		this.add(viewMenu);
		
		if(!isMacMenu){			
			this.add(Box.createHorizontalGlue());
			this.add(lblTitle);
			this.add(Box.createRigidArea(new Dimension(20,30)));
			this.add(lblFilename);
			this.add(Box.createRigidArea(new Dimension(40,30)));
			this.add(new JLabel(divider));
			this.add(btnMinimise);
			this.add(new JLabel(divider));
			this.add(btnClose);
			
			setMenubarSize();
		}

	}
	public void enableUndoRedo(UndoRedoStatus status,boolean enable){
		
		miUndoRedo.setText(status == UndoRedoStatus.REDO ? "Redo" : "Undo");
		miUndoRedo.setActionCommand(miUndoRedo.getText());
		miUndoRedo.setEnabled(status !=UndoRedoStatus.NONE && enable);
		
		if(status == UndoRedoStatus.REDO)
			setAccessibleProperties(miUndoRedo.getAccessibleContext(), resourceBundle.getString("miRedo.AccessibleName"), resourceBundle.getString("miRedo.AccessibleDescription"));
		else
			setAccessibleProperties(miUndoRedo.getAccessibleContext(), resourceBundle.getString("miUndo.AccessibleName"), resourceBundle.getString("miUndo.AccessibleDescription"));
		
		
		//updates accelerator key
		KeyStroke accelerator = KeyStroke.getKeyStroke(status == UndoRedoStatus.REDO ? KeyEvent.VK_Y : KeyEvent.VK_Z, InputEvent.CTRL_MASK);
		miUndoRedo.setAccelerator(accelerator);
		
	}
	/**
	 * Handles actions
	 * @param e
	 */
	public void actionPerformed(ActionEvent e){

		//Get the viewer
		Viewer viewer = Viewer.getViewer();
		
		if(e.getActionCommand().equals("Undo")){
			Viewer.getViewer().getActiveFrame().undo();
		}
		else if(e.getActionCommand().equals("Redo")){
			Viewer.getViewer().getActiveFrame().redo();
		}
		//Handles open file command
		else if(e.getActionCommand().equals("OpenFile")) {
			
			//Creates file chooser
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new IwbFilter());
			fileChooser.setAcceptAllFileFilterUsed(false);
			
			//Set working path
			if(lastUsedDirectory!=null)
				fileChooser.setCurrentDirectory(lastUsedDirectory);
			
			if(viewer.getOpenFileCount() >= OPEN_FILE_LIMIT)
				Viewer.showMessageDialog(viewer.getContainer(),null,resourceBundle.getString("MaximumOpenFileLimitMsg"),JOptionPane.INFORMATION_MESSAGE);
			
			//Shows open file dialog
			else if(fileChooser.showOpenDialog(viewer.getContainer()) == JFileChooser.APPROVE_OPTION) {
				
				//show waring message
				if(Viewer.showConfirmationDialog(viewer.getContainer(), resourceBundle.getString("OpenFileMsgTitle"), resourceBundle.getString("OpenFileMsg"), JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION){
				//opens file
				viewer.openFile(fileChooser.getSelectedFile().getAbsolutePath());
				
				//Update last used directory
				lastUsedDirectory = fileChooser.getCurrentDirectory();
				//set filename of opened file
				//lblFilename.setText(fileChooser.getSelectedFile().getName());
				
				//updates recent file menu
				updateOpenedFilesMenu();
				}
			}
			
		}
		//Handles save a copy command
		else if(e.getActionCommand().equals("SaveCopy")) {
		
			if(Viewer.showConfirmationDialog(viewer.getContainer(),resourceBundle.getString("SaveCopyMsgTitle") ,resourceBundle.getString("SaveCopyMsg"), JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION){
				
				//creates file chooser
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setAcceptAllFileFilterUsed(false);
				fileChooser.addChoosableFileFilter(new IwbFilter());
				
				//Set working path
				if(lastUsedDirectory!=null)
					fileChooser.setCurrentDirectory(lastUsedDirectory);
				
				//shows save file dialog
				if(fileChooser.showSaveDialog(viewer.getContainer()) == JFileChooser.APPROVE_OPTION) {
					
					File selectedFile = fileChooser.getSelectedFile();
					
										
					if(!selectedFile.getName().toLowerCase().endsWith(resourceBundle.getString("IWBFileExtension"))){
						//adds iwb extension to selected file
						selectedFile = new File(fileChooser.getSelectedFile().getAbsolutePath() + resourceBundle.getString("IWBFileExtension"));
					}
				
					//save copy of file
					viewer.saveCopy(selectedFile.getPath());
					
					//Update last used directory
					lastUsedDirectory = fileChooser.getCurrentDirectory();
					
				
				}
			}
		}
		//Handles close file command
		else if(e.getActionCommand().equals("CloseFile")) {
			
			//checks whether current document is dirty
			boolean isUnchanged = !viewer.getActiveFrame().getCanvas().getDocument().isDirty();
			if(isUnchanged || Viewer.showConfirmationDialog(viewer.getContainer(),resourceBundle.getString("CloseFileMsgTitle") ,resourceBundle.getString("CloseFileMsg"), JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION){
				//close the file
				viewer.closeFile();
				
				//clear filename label
				/*if(viewer.getActiveFrame() != null)
					lblFilename.setText(viewer.getActiveFrame().getFilename());
				else
					lblFilename.setText(null);*/
				
				//updates recent file menu
				updateOpenedFilesMenu();
			}
		}
		//Handles about command
		else if(e.getActionCommand().equals("About")){
			
			viewer.showAbout();
		}
		//Handles undo/redo command
		else if(e.getActionCommand().equals("UndoRedo")){
			
			viewer.undoRedo();
		}
		//Handles select tool command
		else if(e.getActionCommand().equals("SelectTool")){
		
			viewer.selectTool();
		}
		//Handles change pen command
		else if(e.getActionCommand().equals("ChangePen")){
		
			viewer.changePen();
		}
		//Handles colour mapping command
		else if(e.getActionCommand().equals("ColourMapping")){
		
			viewer.colourMapping();
		}
		//Handles reset viewer command
		else if(e.getActionCommand().equals("ResetViewer")){
		
			viewer.resetViewer();
		}
		//Handles reset file command
		else if(e.getActionCommand().equals("ResetFile")){
		
			if(Viewer.showConfirmationDialog(viewer.getContainer(),resourceBundle.getString("ResetFileMsgTitle") ,resourceBundle.getString("ResetFileMsg"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			
				viewer.resetFile();
			}
		}
		//Handles clear annotation command
		else if(e.getActionCommand().equals("ClearAnnotations")){
		
			if(Viewer.showConfirmationDialog(viewer.getContainer(),resourceBundle.getString("ClearAnnotationMsgTitle") ,resourceBundle.getString("ClearAnnotationMsg"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
				
				viewer.clearAnnotations();
			}
		}
		//Handles zoom in command
		else if(e.getActionCommand().equals("ZoomIn")){
		
			viewer.zoom(true);
		}
		//Handles zoom out command
		else if(e.getActionCommand().equals("ZoomOut")){
		
			viewer.zoom(false);
		}
		//Handles reset zoom command
		else if(e.getActionCommand().equals("ResetZoom")){
		
			viewer.resetZoom();
		}
		//Handles hide/reveal command
		else if(e.getActionCommand().equals("HideReveal")){
		
			viewer.toggleRevealer();
		}
		//Handles close file command
		else if(e.getActionCommand().equals("Close") || e.getActionCommand().equals("Exit")){
		
			viewer.exit();
		}
		//Handles minimise command
		else if(e.getActionCommand().equals("Minimise")){
		
			viewer.minimise();
		}
		//Handles recent file open command
		else if(e.getActionCommand().equals("OpenedFile")){
			
			ExtendedMenuItem openedFile = (ExtendedMenuItem)e.getSource();
			Frame frame = (Frame)openedFile.getTag();
			//lblFilename.setText(frame.getFilename());
			viewer.setActiveFrame(frame);
			//openedFile.getLabelControl().setForeground(AccessibilityColor.controlText);
		}	
	}
	
	/**
	 * Updates Show/hide revealer text in menu
	 * @param isShowing
	 */
	public void updateRevealerMenu(boolean isShowing) {
		
		if(isShowing){
			
			miHideReveal.setText(resourceBundle.getString("HideRevealText"));
			//set accessible name
			miHideReveal.getAccessibleContext().setAccessibleName(resourceBundle.getString("miHideReveal.AccessibleName"));
		}
		else{
			miHideReveal.setText(resourceBundle.getString("ShowRevealText"));
			miHideReveal.getAccessibleContext().setAccessibleName(resourceBundle.getString("miShowReveal.AccessibleName"));
		}
	}
	
	/**
	 * Handles file changed event
	 * @param document Newly loaded document
	 */
	public void fileChanged(Frame frame) {

		//menu items are enabled only when a file is opened
		boolean isEnabled = frame != null;

		//Enables/Disables menu items
		miSaveCopy.setEnabled(isEnabled);
		miCloseFile.setEnabled(isEnabled);
		//miUndoRedo.setEnabled(isEnabled);
		miSelectTool.setEnabled(isEnabled);
		miChangePen.setEnabled(isEnabled);
		miResetFile.setEnabled(isEnabled);
		miClearAnnotations.setEnabled(isEnabled);
	
		miResetZoom.setEnabled(isEnabled);
		miHideReveal.setEnabled(isEnabled);
		
		lblFilename.setText("");
		if(frame!=null)
			lblFilename.setText(frame.getFilename());	
		
		zoomStateChanged(frame);
		updateOpenedFilesMenu();
		
	}
	
	/**
	 * Handles painting of this component
	 * This used for having gradient painting on the control
	 */
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		//Gradient is painted only for default theme
		if(ThemeManager.isDefaultTheme()){
			Graphics2D g2d = (Graphics2D)g;
		    GradientPaint gradient = new GradientPaint(0, 0, Color.white, 0,getHeight(), AccessibilityColor.control, false);   
		    g2d.setPaint(gradient);
		    g2d.fillRect(0, 0, getWidth(), getHeight());
		}
	}
    
	/**
	 * Creates File menu and its menu items
	 */
	private void createFileMenu(boolean macMenu) {
				
		// creates Open File menu item
		JMenuItem miOpenFile = new JMenuItem(resourceBundle.getString("miOpenFile.Text"));
		setCommonMenuItemProperties(miOpenFile);
		miOpenFile.setActionCommand("OpenFile");
		KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK);
		miOpenFile.setAccelerator(ctrlO);
		setAccessibleProperties(miOpenFile.getAccessibleContext(), resourceBundle.getString("miOpenFile.AccessibleName"), resourceBundle.getString("miOpenFile.AccessibleDescription"));
		
		// creates Save a Copy menu item
		miSaveCopy = new JMenuItem(resourceBundle.getString("miSaveCopy.Text"));
		setCommonMenuItemProperties(miSaveCopy);
		miSaveCopy.setActionCommand("SaveCopy");
		miSaveCopy.setEnabled(false);
		KeyStroke ctrlS = KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK);
		miSaveCopy.setAccelerator(ctrlS);
		setAccessibleProperties(miSaveCopy.getAccessibleContext(), resourceBundle.getString("miSaveCopy.AccessibleName"), resourceBundle.getString("miSaveCopy.AccessibleDescription"));
		
		// creates Close File menu item
		miCloseFile = new JMenuItem(resourceBundle.getString("miCloseFile.Text"));
		setCommonMenuItemProperties(miCloseFile);
		miCloseFile.setActionCommand("CloseFile");
		miCloseFile.setEnabled(false);
		KeyStroke ctrlW = KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK);
		miCloseFile.setAccelerator(ctrlW);
		setAccessibleProperties(miCloseFile.getAccessibleContext(), resourceBundle.getString("miCloseFile.AccessibleName"), resourceBundle.getString("miCloseFile.AccessibleDescription"));
		
		// creates About menu item
		JMenuItem miAbout = new JMenuItem(resourceBundle.getString("miAbout.Text"));
		setCommonMenuItemProperties(miAbout);
		miAbout.setActionCommand("About");
		KeyStroke ctrlA = KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK);
		miAbout.setAccelerator(ctrlA);
		setAccessibleProperties(miAbout.getAccessibleContext(), resourceBundle.getString("miAbout.AccessibleName"), resourceBundle.getString("miAbout.AccessibleDescription"));
		
		// creates Reset File menu item
		JMenuItem miResetViewer = new JMenuItem(resourceBundle.getString("miResetViewer.Text"));
		setCommonMenuItemProperties(miResetViewer);
		miResetViewer.setActionCommand("ResetViewer");
		KeyStroke ctrlR = KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK);
		miResetViewer.setAccelerator(ctrlR);
		setAccessibleProperties(miResetViewer.getAccessibleContext(), resourceBundle.getString("miResetViewer.AccessibleName"), resourceBundle.getString("miResetViewer.AccessibleDescription"));
		
		// creates Exit menu item
		JMenuItem miExit = new JMenuItem(resourceBundle.getString("miExit.Text"));
		setCommonMenuItemProperties(miExit);
		miExit.setActionCommand("Exit");
		KeyStroke ctrlQ = KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK);
		miExit.setAccelerator(ctrlQ);
		setAccessibleProperties(miExit.getAccessibleContext(), resourceBundle.getString("miExit.AccessibleName"), resourceBundle.getString("miExit.AccessibleDescription"));
		
		//set properties of fileMenu
		fileMenu = new JMenu(resourceBundle.getString("fileMenu.Text"));
		setCommonMenuProperties(fileMenu);
		if(!macMenu)
			fileMenu.setMnemonic(KeyEvent.VK_F);
		setAccessibleProperties(fileMenu.getAccessibleContext(), resourceBundle.getString("fileMenu.AccessibleName"), resourceBundle.getString("fileMenu.AccessibleDescription"));
		
		//add menu items to file menu
		fileMenu.add(miOpenFile);
		fileMenu.add(miSaveCopy);
		fileMenu.add(miCloseFile);
		fileMenu.add(miAbout);
		fileMenu.add(miResetViewer);
		fileMenu.add(miExit);
	}
	
	/**
	 * Create edit menu and its menu items
	 */
	private void createEditMenu(boolean macMenu) {
				
		// creates Undo/Redo menu item
		miUndoRedo = new JMenuItem(resourceBundle.getString("miUndoRedo.Text"));
		setCommonMenuItemProperties(miUndoRedo);
		miUndoRedo.setEnabled(false);
		miUndoRedo.setActionCommand("UndoRedo");
		KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK);
		miUndoRedo.setAccelerator(ctrlZ);
		setAccessibleProperties(miUndoRedo.getAccessibleContext(), resourceBundle.getString("miUndo.AccessibleName"), resourceBundle.getString("miUndo.AccessibleDescription"));
		
		// creates Select Tool menu item
		miSelectTool = new JMenuItem(resourceBundle.getString("miSelectTool.Text"));
		setCommonMenuItemProperties(miSelectTool);
		miSelectTool.setEnabled(false);
		miSelectTool.setActionCommand("SelectTool");
		KeyStroke ctrlT = KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miSelectTool.setAccelerator(ctrlT);
		setAccessibleProperties(miSelectTool.getAccessibleContext(), resourceBundle.getString("miSelectTool.AccessibleName"), resourceBundle.getString("miSelectTool.AccessibleDescription"));
		
		// creates Change Pen menu item
		miChangePen = new JMenuItem(resourceBundle.getString("miChangePen.Text"));
		setCommonMenuItemProperties(miChangePen);
		miChangePen.setEnabled(false);
		miChangePen.setActionCommand("ChangePen");
		KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miChangePen.setAccelerator(ctrlP);
		setAccessibleProperties(miChangePen.getAccessibleContext(), resourceBundle.getString("miChangePen.AccessibleName"), resourceBundle.getString("miChangePen.AccessibleDescription"));
		
		// creates Colour Mapping menu item
		JMenuItem miColourMapping = new JMenuItem(resourceBundle.getString("miColourMapping.Text"));
		setCommonMenuItemProperties(miColourMapping);
		miColourMapping.setActionCommand("ColourMapping");
		KeyStroke ctrlM = KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miColourMapping.setAccelerator(ctrlM);
		setAccessibleProperties(miColourMapping.getAccessibleContext(), resourceBundle.getString("miColourMapping.AccessibleName"), resourceBundle.getString("miColourMapping.AccessibleDescription"));
		
		// creates Reset File menu item
		miResetFile = new JMenuItem(resourceBundle.getString("miResetFile.Text"));
		setCommonMenuItemProperties(miResetFile);
		miResetFile.setEnabled(false);
		miResetFile.setActionCommand("ResetFile");
		KeyStroke ctrlR = KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miResetFile.setAccelerator(ctrlR);
		setAccessibleProperties(miResetFile.getAccessibleContext(), resourceBundle.getString("miResetFile.AccessibleName"), resourceBundle.getString("miResetFile.AccessibleDescription"));
		
		// creates Clear Annotations menu item
		miClearAnnotations = new JMenuItem(resourceBundle.getString("miClearAnnotations.Text"));
		setCommonMenuItemProperties(miClearAnnotations);
		miClearAnnotations.setEnabled(false);
		miClearAnnotations.setActionCommand("ClearAnnotations");
		KeyStroke ctrlC = KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miClearAnnotations.setAccelerator(ctrlC);
		setAccessibleProperties(miClearAnnotations.getAccessibleContext(), resourceBundle.getString("miClearAnnotations.AccessibleName"), resourceBundle.getString("miClearAnnotations.AccessibleDescription"));
		
		//set properties of editMenu
		editMenu = new JMenu(resourceBundle.getString("editMenu.Text"));
		if(!macMenu)
			editMenu.setMnemonic(KeyEvent.VK_E);
		setCommonMenuProperties(editMenu);
		setAccessibleProperties(editMenu.getAccessibleContext(), resourceBundle.getString("editMenu.AccessibleName"), resourceBundle.getString("editMenu.AccessibleDescription"));
		
		//adds menu items to edit menu
		editMenu.add(miUndoRedo);
		editMenu.add(miSelectTool);
		editMenu.add(miChangePen);
		editMenu.add(miColourMapping);
		editMenu.add(miResetFile);
		editMenu.add(miClearAnnotations);
	}
	
	/**
	 * Creates view menu and its menu items
	 */
	private void createViewMenu(boolean macMenu) {
		
		// Menu items under View Menu
		viewMenu = new JMenu(resourceBundle.getString("viewMenu.Text"));
		setCommonMenuProperties(viewMenu);
		if(!macMenu)
			viewMenu.setMnemonic(KeyEvent.VK_V);
		
		setAccessibleProperties(viewMenu.getAccessibleContext(), resourceBundle.getString("viewMenu.AccessibleName"), resourceBundle.getString("viewMenu.AccessibleDescription"));
		
		// creates Zoom menu item
		miZoomIn = new JMenuItem(resourceBundle.getString("miZoomIn.Text"));
		setCommonMenuItemProperties(miZoomIn);
		miZoomIn.setEnabled(false);
		miZoomIn.setActionCommand("ZoomIn");
		KeyStroke ctrlPlus = KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK);
		miZoomIn.setAccelerator(ctrlPlus);
		setAccessibleProperties(miZoomIn.getAccessibleContext(), resourceBundle.getString("miZoomIn.AccessibleName"), resourceBundle.getString("miZoomIn.AccessibleDescription"));
		
		// creates Zoom menu item
		miZoomOut = new JMenuItem(resourceBundle.getString("miZoomOut.Text"));
		setCommonMenuItemProperties(miZoomOut);
		miZoomOut.setEnabled(false);
		miZoomOut.setActionCommand("ZoomOut");
		KeyStroke ctrlMinus = KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK);
		miZoomOut.setAccelerator(ctrlMinus);
		setAccessibleProperties(miZoomOut.getAccessibleContext(), resourceBundle.getString("miZoomOut.AccessibleName"), resourceBundle.getString("miZoomOut.AccessibleDescription"));
		
		// creates Reset Zoom menu item
		miResetZoom = new JMenuItem(resourceBundle.getString("miResetZoom.Text"));
		setCommonMenuItemProperties(miResetZoom);
		miResetZoom.setEnabled(false);
		miResetZoom.setActionCommand("ResetZoom");
		KeyStroke ctrlEqual = KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK);
		miResetZoom.setAccelerator(ctrlEqual);
		setAccessibleProperties(miResetZoom.getAccessibleContext(), resourceBundle.getString("miResetZoom.AccessibleName"), resourceBundle.getString("miResetZoom.AccessibleDescription"));
		
		// creates Hide/Reveal menu item
		miHideReveal = new JMenuItem(resourceBundle.getString("ShowRevealText"));
		setCommonMenuItemProperties(miHideReveal);
		miHideReveal.setEnabled(false);
		miHideReveal.setActionCommand("HideReveal");
		KeyStroke ctrlR = KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK);
		miHideReveal.setAccelerator(ctrlR);
		setAccessibleProperties(miHideReveal.getAccessibleContext(), resourceBundle.getString("miShowReveal.AccessibleName"), resourceBundle.getString("miHideReveal.AccessibleDescription"));
		
		//adds menu items to viewMenu
		viewMenu.add(miZoomIn);
		viewMenu.add(miZoomOut);
		viewMenu.add(miResetZoom);
		viewMenu.add(miHideReveal);
	}

	/**
	 * Updates the recent files in menu
	 */
	private void updateOpenedFilesMenu(){

		Viewer viewer = Viewer.getViewer();
		
		//clears opened file list 
		int itemCount = viewMenu.getItemCount();
		for(int i=0; i< itemCount - 4;++i){
			viewMenu.remove(4);
		}
		
		ButtonGroup group = new ButtonGroup();
		
		int index = 1;
		//updates opened files in View Menu
		for (Frame frame : viewer.getFrames()) {
			
			//creates new menuitem and adds to view menu
			ExtendedMenuItem openFile = new ExtendedMenuItem();
			openFile.setLayout(null);			
			openFile.setTag(frame);
			setCommonMenuItemProperties(openFile);
			if(!isMacMenu)
				openFile.setUI(new ExtendedMenuItemUI());
			openFile.setSelected(frame == viewer.getActiveFrame());
			group.add(openFile);
			
			//use system font and size for newly created menuitem. This is obtained from existing menuitems
			openFile.setFont(miResetZoom.getFont());
			openFile.setPreferredSize(miResetZoom.getPreferredSize());
			
			openFile.setActionCommand("OpenedFile");

			//openFile.setLabelControl(lblText);
			openFile.setText(frame.getFilename());
			
			KeyStroke accelerator = getOpenFileAccelerator(index);
			openFile.setAccelerator(accelerator);
			++index;
			
			viewMenu.add(openFile);
			setAccessibleProperties(openFile.getAccessibleContext(), getAccessibleFilename(frame.getFilename()) + " Ctrl+" + (index-1), resourceBundle.getString("miRecentfile.AccessibleDescription"));
		}
	}
	
	/**
	 * Converts file name to more accessible form for screen readers
	 * @param fileName
	 * @return
	 */
	private String getAccessibleFilename(String fileName){
		
		String nameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
		return nameWithoutExt + resourceBundle.getString("AccessibleIWBExtension");
	}
	
	/**
	 * Get the keystroke corresponding to no. of file opened
	 * @param value
	 * @return
	 */
	private KeyStroke getOpenFileAccelerator(int value){
		
		switch (value) {
		
			case 0:
				return KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK);
			case 1:
				return KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK);
			case 2:
				return KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK);
			case 3:
				return KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_MASK);
			case 4:
				return KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_MASK);
			case 5:
				return KeyStroke.getKeyStroke(KeyEvent.VK_5, InputEvent.CTRL_MASK);
			case 6:
				return KeyStroke.getKeyStroke(KeyEvent.VK_6, InputEvent.CTRL_MASK);
			case 7:
				return KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.CTRL_MASK);
			case 8:
				return KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.CTRL_MASK);
			case 9:
				return KeyStroke.getKeyStroke(KeyEvent.VK_9, InputEvent.CTRL_MASK);
	
			default:
				return null;
		}
	}
	
	/**
	 * This method is used for setting the common properties of Menu Item
	 * @param menuItem
	 */
	private void setCommonMenuItemProperties(JMenuItem menuItem) {
		
		if(!(menuItem instanceof JRadioButtonMenuItem))
			menuItem.setUI(new MenuItemUI());
		menuItem.setFont(ThemeManager.getTheme().getFont("MenuItemFont"));
		menuItem.addActionListener(this);
		menuItem.setBorder(BorderFactory.createLineBorder(AccessibilityColor.menuItemSeparator));
		/*FontMetrics fm = menuItem.getFontMetrics(menuItem.getFont());
		int stringWidth = fm.stringWidth(menuItem.getText()) + fm.stringWidth("Ctrl+Shift+X") + 25;
		menuItem.setPreferredSize(new Dimension(stringWidth > 186 ? stringWidth : 186 ,25));*/
		setMenuItemSize(menuItem);
		menuItem.setBackground(AccessibilityColor.menuItem);
		menuItem.setForeground(AccessibilityColor.controlText);
	}
	
	/**
	 * This method is used for setting the common properties of Menu
	 * @param menu
	 */
	private void setCommonMenuProperties(JMenu menu){
		
		menu.setUI(new MenuUI());
		menu.setBorder(null);
		menu.getPopupMenu().setBorder(BorderFactory.createLineBorder(AccessibilityColor.controlShadow));
		menu.setBackground(AccessibilityColor.control);
		menu.setForeground(AccessibilityColor.controlText);
		menu.setFont(ThemeManager.getTheme().getFont("ViewerControlFont"));
		setMenuSize(menu);
	}
	
	/**
	 * This method is used for setting the common properties of Button
	 * @param button
	 */
	private void setCommonButtonProperties(JButton button) {
		
		button.setRolloverEnabled(false);
		button.setContentAreaFilled(false);
		button.setPreferredSize(new Dimension(30,30));
		button.setMaximumSize(new Dimension(30,30));
		button.addActionListener(this);
		button.setBorder(null);
	}
	
	/**
	 * Set Accessible Properties
	 * @param context
	 * @param name
	 * @param description
	 */
	private void setAccessibleProperties(AccessibleContext context, String name, String description){
		
		//set accessible name
		context.setAccessibleName(name);
		
		//set accessible description
		context.setAccessibleDescription(description);
	}

	public void pageChanged(Frame frame, int number) {
		// TODO Auto-generated method stub		
	}
	
	/**
	 * Handles theme change event
	 */
	public void updateForThemeChanged(Font menuFont, Font menuItemFont) {
		
		if(!isMacMenu){
			lblFilename.setFont(menuFont);
			lblTitle.setFont(menuFont);
			fileMenu.setFont(menuFont);
			editMenu.setFont(menuFont);
			viewMenu.setFont(menuFont);
	
			updateLayoutForThemeChange(menuItemFont);
		}

	}
	
	/**
	 * Update layout of controls due to change in font size
	 * @param isDefault
	 */
	private void updateLayoutForThemeChange(Font menuItemFont){
		
		updateMenuSize(fileMenu, menuItemFont);
		updateMenuSize(editMenu, menuItemFont);
		updateMenuSize(viewMenu, menuItemFont);
		
		setMenubarSize();
	}
	
	/**
	 * Update size of menu and menubar for theme change
	 * @param menu
	 * @param isDefault
	 */
	private void updateMenuSize(JMenu menu, Font menuItemFont){

		setMenuSize(menu);
		
		for (int i=0; i< menu.getPopupMenu().getComponentCount();++i) {
			
			Object menuItemObject = menu.getPopupMenu().getComponent(i);
			if(menuItemObject != null && (menuItemObject instanceof JMenuItem || menuItemObject instanceof ExtendedMenuItem)){
				
				JMenuItem menuItem = (JMenuItem)menuItemObject;
				
				if(menuItem instanceof JRadioButtonMenuItem){
					ExtendedMenuItemUI ui = (ExtendedMenuItemUI)menuItem.getUI();
					ui.setAcceleratorFont(menuItemFont);
					menuItem.setUI(ui);
				}
				else{
					MenuItemUI ui = (MenuItemUI)menuItem.getUI();
					ui.setAcceleratorFont(menuItemFont);
					menuItem.setUI(ui);
				}
				
				menuItem.setFont(menuItemFont);
				setMenuItemSize(menuItem);
			}
		}		
	}
	
	/**
	 * Set size for menubar based on font size
	 */
	private void setMenubarSize(){
		
		FontMetrics fontMetrics = fileMenu.getFontMetrics(fileMenu.getFont());
		int height = fontMetrics.getHeight() + 20;
		this.setPreferredSize(new Dimension(10, height < 30 ? 30 : height));
	}
	
	/**
	 * Set size for menu based on menu text
	 * @param menu
	 */
	private void setMenuSize(JMenu menu){
		int menuWidth = SwingUtilities.computeStringWidth(menu.getFontMetrics(menu.getFont()), menu.getText()) + 20;
		menu.setPreferredSize(new Dimension(menuWidth < 37 ? 37 : menuWidth, 24));
	}
	
	/**
	 * Set size for menuitem based on menuitem text
	 * @param menuItem
	 */
	private void setMenuItemSize(JMenuItem menuItem){
		
		FontMetrics fontMetrics = menuItem.getFontMetrics(menuItem.getFont());
		int menuItemWidth = 2 * fontMetrics.stringWidth(menuItem.getText()) + 20;
		int menuItemHeight = fontMetrics.getHeight() + 10;
		menuItem.setPreferredSize(new Dimension(menuItemWidth < 186 ? 186 : menuItemWidth, menuItemHeight < 25 ? 25 : menuItemHeight));
	}
	public void zoomStateChanged(Frame frame) {
		
		if(frame!=null){
		
			ZoomManager manager = frame.getCanvas().getZoomManager();
			miZoomIn.setEnabled(manager.canZoomIn());
			miZoomOut.setEnabled(manager.canZoomOut());
		}
		else{
			miZoomIn.setEnabled(false);
			miZoomOut.setEnabled(false);
		}			
	}
}
