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

package becta.viewer.accessibility;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.metal.MetalBorders;

import becta.viewer.framework.ExtendedCheckBoxIcon;
import becta.viewer.framework.Viewer;
import becta.viewer.util.Platform;


/**
 * This class manages the theme selection in viewer
 */
public class ThemeManager {
	
	/**
	 * Holds the current theme
	 */
	private static Theme theme;
	/**
	 * Holds the list of available themes
	 */
	private static LinkedHashMap<String, Theme> themes;
	/**
	 * Listener list
	 */
	private static EventListenerList listenerList = new EventListenerList();
	
	/**
	 * Initialise theme manager
	 */
	public static void init() {

		//Creates LinkedHashMap for holding the themes
		themes = new LinkedHashMap<String, Theme>();

		//loops till the "name<i>" is available in theme resource file
		for(int i=1; ; ++i){
			
			//adds try-catch block for catching MissingResourceException that occurs due to
			//non-existence of "name<i>" in theme resource file. This will be the termination criteria for this loop
			try{

				//creates theme from theme resource file for current index
				Theme theme = new ColourTheme(i);
				
				//adds theme to hash map with theme name as key
				themes.put(theme.getName(), theme);
				
				//used for adding SystemTheme to second position in the list
				if(i==1){
					//creates system theme and adds to hash map
					Theme systemTheme = new SystemTheme();
					themes.put(systemTheme.getName(), systemTheme);
				}
			}
			catch(MissingResourceException e){
				
				//breaks the loop if "name<i>" is not in theme resource file
				break;
			}
		}
		
		//set theme as default theme
		ResourceBundle resourceBundle = ResourceBundle.getBundle("becta.viewer.accessibility.resource");
		theme = Platform.isWindows ? themes.get(resourceBundle.getString("WindowsDefaultThemeName")) : themes.get(resourceBundle.getString("DefaultThemeName"));
		theme.loadSystemColors();
		
		setUIProperties();
	}
	
	/**
	 * Used for getting current theme
	 * @return Theme
	 */
	public static Theme getTheme(){
		return theme;
	}
	
	/**
	 * Used for getting the collection of available themes
	 * @return Collection of themes
	 */
	public static Collection<Theme> getAllThemes(){
		
		return themes.values();
	}
	
	/**
	 * Gets whether the current theme is the default one or not
	 * @return
	 */
	public static boolean isDefaultTheme(){
		return theme.isDefaultTheme();
	}
	
	/**
	 * This method is used for changing the theme
	 * @param themeName
	 */
	public static void setTheme(String themeName){
		
		try{
			//creates instance of theme form theme name
			theme = themes.get(themeName);
			
			//loads system colours corresponding to the theme
			theme.loadSystemColors();
			
			//set UI properties
			setUIProperties();
			
			//fires theme changed event
			fireThemeChanged(theme);
		}
		catch (Exception e) {

			Viewer.logException(e);
		}
		
	}
	
    /**
     * Adds an <code>ThemeChangeListener</code> to the button.
     * @param l the <code>ThemeChangeListener</code> to be added
     */
	public static void addThemeChangeListener(ThemeChangeListener l){
		listenerList.add(ThemeChangeListener.class, l);
	}
	
    /**
     * Removes an <code>ThemeChangeListener</code> from the button.
     * @param l the listener to be removed
     */
    public void removeThemeChangeListener(ThemeChangeListener l) {
    	
	    listenerList.remove(ThemeChangeListener.class, l);
    }
    
    /**
     * Set UI properties for different controls
     */
    private static void setUIProperties(){
    	
    	//set colours for button control
		UIManager.put("Button.background", AccessibilityColor.control);
		UIManager.put("Button.foreground", AccessibilityColor.controlText);
		UIManager.put("Button.focus", AccessibilityColor.controlText);

		//set colours for toggle button control
		UIManager.put("ToggleButton.background", AccessibilityColor.control);
		UIManager.put("ToggleButton.foreground", AccessibilityColor.controlText);
		UIManager.put("ToggleButton.focus", AccessibilityColor.controlText);
		
		//set colours for label
		UIManager.put("Label.background", AccessibilityColor.control);
		UIManager.put("Label.foreground", AccessibilityColor.controlText);
		
		//set colours for OptionPane
		UIManager.put("OptionPane.background", AccessibilityColor.control);
		UIManager.put("OptionPane.foreground", AccessibilityColor.controlText);
		UIManager.put("OptionPane.messageForeground", AccessibilityColor.controlText);
		
		//set colours for Panel
		UIManager.put("Panel.background", AccessibilityColor.control);
		UIManager.put("Panel.foreground", AccessibilityColor.controlText);
		
		//set colours for TextField
		UIManager.put("TextField.background", AccessibilityColor.control);
		UIManager.put("TextField.foreground", AccessibilityColor.controlText);
		
		//set colours for List
		UIManager.put("List.background", AccessibilityColor.control);
		UIManager.put("List.foreground", AccessibilityColor.controlText);
		UIManager.put("List.selectionBackground", AccessibilityColor.textHighlight);
		UIManager.put("List.selectionForeground", AccessibilityColor.textHighlightText);
		UIManager.put("List.focus", AccessibilityColor.controlText);
		
		//set UI and colours for ComboBox
		UIManager.put("ComboBox.background", AccessibilityColor.control);
		UIManager.put("ComboBox.foreground", AccessibilityColor.controlText);
		UIManager.put("ComboBox.selectionBackground", AccessibilityColor.textHighlight);
		UIManager.put("ComboBox.selectionForeground", AccessibilityColor.textHighlightText);
		UIManager.put("ComboBoxUI", "becta.viewer.framework.ExtendedMetalComboBoxUI");
		
		//set colours for ScrollBar
		UIManager.put("ScrollBar.track", AccessibilityColor.control);
		UIManager.put("ScrollBar.thumb", AccessibilityColor.scrollbar);
		
		//set colours for ScrollPane
		UIManager.put("ScrollPane.background", AccessibilityColor.control);

		//set colours for FileChooser
		UIManager.put("FileChooser.listViewBackground", AccessibilityColor.control);
		
		//set colours for table control
		UIManager.put("Table.foreground", AccessibilityColor.controlText);
		UIManager.put("Table.background", AccessibilityColor.control);
		UIManager.put("Table.selectionBackground", AccessibilityColor.textHighlight);
		UIManager.put("Table.selectionForeground", AccessibilityColor.textHighlightText);

		//set colours for table header
		UIManager.put("TableHeader.foreground", AccessibilityColor.controlText);
		UIManager.put("TableHeader.background", AccessibilityColor.control);
		
		//set icon and colours for checkbox
		UIManager.put("CheckBox.foreground", AccessibilityColor.controlText);
		UIManager.put("CheckBox.background", AccessibilityColor.control);
		UIManager.put("CheckBox.icon", new ExtendedCheckBoxIcon());
		
		//set colours and border for tooltip
		UIManager.put("ToolTip.foreground", AccessibilityColor.infoText);
		UIManager.put("ToolTip.background", AccessibilityColor.info);
		UIManager.put("ToolTip.border", BorderFactory.createLineBorder(AccessibilityColor.controlText));
		
		//set borders for non-default themes
		if(!isDefaultTheme()){
			
			Border lineBorder = BorderFactory.createLineBorder(AccessibilityColor.controlText);
			
			Border buttonBorder = BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, AccessibilityColor.controlText, AccessibilityColor.controlText), BorderFactory.createEmptyBorder(2, 10, 2, 10));
			UIManager.put("Button.border", buttonBorder);
			UIManager.put("ToggleButton.border", buttonBorder);
			
			Border optionPaneBorder = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(AccessibilityColor.controlText), BorderFactory.createEmptyBorder(10, 10, 10, 10));
			UIManager.put("OptionPane.border", optionPaneBorder);
			UIManager.put("TextField.border", lineBorder);
			UIManager.put("TextArea.border", lineBorder);
			UIManager.put("ScrollBar.border", lineBorder);
			UIManager.put("ScrollPane.border", lineBorder);
			UIManager.put("FileChooser.listViewBorder", lineBorder);
			UIManager.put("ScrollBarUI", "becta.viewer.framework.ExtendedScrollBarUI");			
		}
		else{
			
			//use default border for Default theme
			UIManager.put("Button.border",MetalBorders.getButtonBorder());
			UIManager.put("ToggleButton.border", new MetalBorders.ToggleButtonBorder());
			UIManager.put("OptionPane.border", null);
			UIManager.put("TextField.border", MetalBorders.getTextFieldBorder());
			UIManager.put("TextArea.border", MetalBorders.getTextFieldBorder());
			UIManager.put("ScrollBar.border", null);
			UIManager.put("FileChooser.listViewBorder", null);
			UIManager.put("ScrollBarUI", "javax.swing.plaf.metal.MetalScrollBarUI");
		}
		
		UIManager.put("Label.font", theme.getFont("Label.font"));
		UIManager.put("Button.font", theme.getFont("Button.font"));
		UIManager.put("List.font", theme.getFont("List.font"));
		UIManager.put("ComboBox.font", theme.getFont("ComboBox.font"));
		UIManager.put("TextField.font", theme.getFont("TextField.font"));
		UIManager.put("TableHeader.font", theme.getFont("TableHeader.font"));
		UIManager.put("ToolTip.font", theme.getFont("ToolTip.font"));
    }
    
    /**
     * Fires theme change event
     * @param doc
     */
    private static void fireThemeChanged(Theme theme) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length-2; i>=0; i-=2) {
            if (listeners[i]==ThemeChangeListener.class) {
            	
                ((ThemeChangeListener)listeners[i+1]).themeChanged(theme);
            }          
        }
    }
}
