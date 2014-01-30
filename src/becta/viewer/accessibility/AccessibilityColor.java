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

import java.awt.Color;

/**
 * This class provides the Accessibility colours for viewer
 */
public final class AccessibilityColor extends Color implements java.io.Serializable {
	
	/**
	 * Holds RGB values for various accessibility colours
	 */
	private static int[] accessibilityColors;
	
	/**
	 * Holds the index of colour in accessibilityColors array
	 */	
	private int index;
	
	/**
	 * The number of system colors in the array.
	 */
	public static final int NUM_COLORS = 36;
	
	/**
	 * The array index for the desktop accessibility colour
	 */
	public static final int DESKTOP = 0;
	 
	/**
	 * The array index for the activeCaption accessibility colour
	 */
	public static final int ACTIVE_CAPTION = 1;
	
	/**
	 * The array index for the activeCaptionText accessibility colour
	 */
	public static final int ACTIVE_CAPTION_TEXT = 2;
	
	/**
	 * The array index for the activeCaptionBorder accessibility colour
	 */
	public static final int ACTIVE_CAPTION_BORDER = 3;
	
	/**
	 * The array index for the inactiveCaption accessibility colour
	 */
	public static final int INACTIVE_CAPTION = 4;
	
	/**
	 * The array index for the inactiveCaptionText accessibility colour
	 */
	public static final int INACTIVE_CAPTION_TEXT = 5;
	
	/**
	 * The array index for the inactiveCaptionBorder accessibility colour
	 */
	public static final int INACTIVE_CAPTION_BORDER = 6;
	
	/**
	 * The array index for the window accessibility colour
	 */
	public static final int WINDOW = 7;
	
	/**
	 * The array index for the windowBorder accessibility colour
	 */
	public static final int WINDOW_BORDER = 8;
	
	/**
	 * The array index for the windowText accessibility colour
	 */
	public static final int WINDOW_TEXT = 9;
	
	/**
	 * The array index for the menu accessibility colour
	 */
	public static final int MENU = 10;
	
	/**
	 * The array index for the menuText accessibility colour
	 */
	public static final int MENU_TEXT = 11;
	
	/**
	 * The array index for the text accessibility colour
	 */
	public static final int TEXT = 12;
	
	/**
	 * The array index for the textText accessibility colour
	 */
	public static final int TEXT_TEXT = 13;
	
	/**
	 * The array index for the textHighlight accessibility colour
	 */
	public static final int TEXT_HIGHLIGHT = 14;
	
	/**
	 * The array index for the textHighlightText accessibility colour
	 */
	public static final int TEXT_HIGHLIGHT_TEXT = 15;
	
	/**
	 * The array index for the textInactiveText accessibility colour
	 */
	public static final int TEXT_INACTIVE_TEXT = 16;
	
	/**
	 * The array index for the control accessibility colour
	 */
	public static final int CONTROL = 17;
	
	/**
	 * The array index for the controlText accessibility colour
	 */
	public static final int CONTROL_TEXT = 18;
	
	/**
	 * The array index for the controlHighlight accessibility colour
	 */
	public static final int CONTROL_HIGHLIGHT = 19;
	
	/**
	 * The array index for the controlLtHighlight accessibility colour
	 */
	public static final int CONTROL_LT_HIGHLIGHT = 20;
	
	/**
	 * The array index for the controlShadow accessibility colour
	 */
	public static final int CONTROL_SHADOW = 21;
	
	/**
	 * The array index for the controlDkShadow accessibility colour
	 */
	public static final int CONTROL_DK_SHADOW = 22;
	
	/**
	 * The array index for the scrollbar accessibility colour
	 */
	public static final int SCROLLBAR = 23;
	
	/**
	 * The array index for the info accessibility colour
	 */
	public static final int INFO = 24;
	
	/**
	 * The array index for the infoText accessibility colour
	 */
	public static final int INFO_TEXT = 25;
	
	/**
	 * The array index for the menuitem accessibility colour
	 */
	public static final int MENUITEM = 26;
	
	/**
	 * The array index for the menuItemSeparator accessibility colour
	 */
	public static final int MENUITEMSEPARATOR = 27;
	
	/**
	 * The array index for the toolButtonHighlight accessibility colour
	 */
	public static final int TOOLBUTTONHIGHLIGHT = 28;
	
	/**
	 * The array index for the toolButtonHighlightBorder accessibility colour
	 */
	public static final int TOOLBUTTONHIGHLIGHTBORDER = 29;
	
	/**
	 * The array index for the selectionBorderColor accessibility colour
	 */
	public static final int SELECTIONBORDER = 30;
	
	/**
	 * The array index for the selectionFillColor accessibility colour
	 */
	public static final int SELECTIONFILL = 31;
	
	/**
	 * The array index for the revealerColour accessibility colour
	 */
	public static final int REVEALERCOLOUR = 32;
	
	/**
	 * The array index for the canvasBorder accessibility colour
	 */
	public static final int CANVASBORDER = 33;
	
	/**
	 * The array index for the revealerBorder accessibility colour
	 */
	public static final int REVEALERBORDER = 34;
	/**
	 * The array index for the contentBackColour accessibility colour
	 */
	public static final int CONTENTBACKCOLOUR = 35;
	
	/**
	 * The color rendered for the background of the desktop
	 */
	public static final AccessibilityColor desktop = new AccessibilityColor((byte)DESKTOP);
		
	/**
	 * The color rendered for the window-title background of the currently active window
	 */
	public static final AccessibilityColor activeCaption = new AccessibilityColor((byte)ACTIVE_CAPTION);

	/**
	 * The color rendered for the window-title text of the currently active window
	 */
	public static final AccessibilityColor activeCaptionText = new AccessibilityColor((byte)ACTIVE_CAPTION_TEXT);
	
	/**
	 * The color rendered for the border around the currently active window
	 */
	public static final AccessibilityColor activeCaptionBorder = new AccessibilityColor((byte)ACTIVE_CAPTION_BORDER);
	
	/**
	 * The color rendered for the window-title background of inactive windows
	 */
	public static final AccessibilityColor inactiveCaption = new AccessibilityColor((byte)INACTIVE_CAPTION);

	/**
	 * The color rendered for the window-title text of inactive windows
	 */
	public static final AccessibilityColor inactiveCaptionText = new AccessibilityColor((byte)INACTIVE_CAPTION_TEXT);
	
	/**
	 * The color rendered for the border around inactive windows
	 */
	public static final AccessibilityColor inactiveCaptionBorder = new AccessibilityColor((byte)INACTIVE_CAPTION_BORDER);
	
	/**
	 * The color rendered for the background of interior regions inside windows
	 */
	public static final AccessibilityColor window = new AccessibilityColor((byte)WINDOW);
	
	/**
	 * The color rendered for the border around interior regions inside windows
	 */
	public static final AccessibilityColor windowBorder = new AccessibilityColor((byte)WINDOW_BORDER);
	
	/**
	 * The color rendered for text of interior regions inside windows
	 */
	public static final AccessibilityColor windowText = new AccessibilityColor((byte)WINDOW_TEXT);
	
	/**
	 * The color rendered for the background of menus
	 */
	public static final AccessibilityColor menu = new AccessibilityColor((byte)MENU);
	
	/**
	 * The color rendered for the text of menus
	 */
	public static final AccessibilityColor menuText = new AccessibilityColor((byte)MENU_TEXT);
	
	/**
	 * The color rendered for the background of text control objects
	 */
	public static final AccessibilityColor text = new AccessibilityColor((byte)TEXT);
	
	/**
	 * The color rendered for the text of text control objects
	 */
	public static final AccessibilityColor textText = new AccessibilityColor((byte)TEXT_TEXT);
			
	/**
	 * The color rendered for the background of selected items
	 */
	public static final AccessibilityColor textHighlight = new AccessibilityColor((byte)TEXT_HIGHLIGHT);
	
	/**
	 * The color rendered for the text of selected items
	 */
	public static final AccessibilityColor textHighlightText = new AccessibilityColor((byte)TEXT_HIGHLIGHT_TEXT);
	
	/**
	 * The color rendered for the text of inactive items
	 */
	public static final AccessibilityColor textInactiveText = new AccessibilityColor((byte)TEXT_INACTIVE_TEXT);
	
	/**
	 * The color rendered for the background of control panels and control objects
	 */
	public static final AccessibilityColor control = new AccessibilityColor((byte)CONTROL);

	/**
	 * The color rendered for the text of control panels and control objects
	 */
	public static final AccessibilityColor controlText = new AccessibilityColor((byte)CONTROL_TEXT);
	
	/**
	 * The color rendered for light areas of 3D control objects
	 */
	public static final AccessibilityColor controlHighlight = new AccessibilityColor((byte)CONTROL_HIGHLIGHT);
	
	/**
	 * The color rendered for highlight areas of 3D control objects
	 */
	public static final AccessibilityColor controlLtHighlight = new AccessibilityColor((byte)CONTROL_LT_HIGHLIGHT);
	
	/**
	 * The color rendered for shadow areas of 3D control objects
	 */
	public static final AccessibilityColor controlShadow = new AccessibilityColor((byte)CONTROL_SHADOW);
	
	/**
	 * The color rendered for dark shadow areas on 3D control objects
	 */
	public static final AccessibilityColor controlDkShadow = new AccessibilityColor((byte)CONTROL_DK_SHADOW);
	
	/**
	 * The color rendered for the background of scrollbars
	 */
	public static final AccessibilityColor scrollbar = new AccessibilityColor((byte)SCROLLBAR);
	
	/**
	 * The color rendered for the background of tooltips or spot help
	 */
	public static final AccessibilityColor info = new AccessibilityColor((byte)INFO);
	
	/**
	 * The color rendered for the text of tooltips or spot help
	 */
	public static final AccessibilityColor infoText = new AccessibilityColor((byte)INFO_TEXT);
	
	/**
	 * The color rendered for the background of menu item
	 */
	public static final AccessibilityColor menuItem = new AccessibilityColor((byte)MENUITEM);
	
	/**
	 * The color rendered for the background of menu item separator
	 */
	public static final AccessibilityColor menuItemSeparator = new AccessibilityColor((byte)MENUITEMSEPARATOR);
	
	/**
	 * The color rendered for the toolbar button highlight
	 */
	public static final AccessibilityColor toolButtonHighlight = new AccessibilityColor((byte)TOOLBUTTONHIGHLIGHT);
	
	/**
	 * The color rendered for the toolbar button highlight border
	 */
	public static final AccessibilityColor toolButtonHighlightBorder = new AccessibilityColor((byte)TOOLBUTTONHIGHLIGHTBORDER);
	
	/**
	 * The color rendered for the selection border
	 */
	public static final AccessibilityColor selectionBorderColor = new AccessibilityColor((byte)SELECTIONBORDER);
	
	/**
	 * The color rendered for the selection fill
	 */
	public static final AccessibilityColor selectionFillColor = new AccessibilityColor((byte)SELECTIONFILL);
	
	/**
	 * The color rendered for the canvas background
	 */
	public static final AccessibilityColor revealerColour = new AccessibilityColor((byte)REVEALERCOLOUR);
	
	/**
	 * The color rendered for the canvas border
	 */
	public static final AccessibilityColor canvasBorder = new AccessibilityColor((byte)CANVASBORDER);
	
	/**
	 * The color rendered for the revealer border
	 */
	public static final AccessibilityColor revealerBorder = new AccessibilityColor((byte)REVEALERBORDER);
	
	/**
	 * The color rendered for the region outside viewport
	 */
	public static final AccessibilityColor contentBackColour = new AccessibilityColor((byte)CONTENTBACKCOLOUR);
	
	
	/**
	 * Constructor for this class
	 */
	public AccessibilityColor(){

		super(0,0,0);
	}

	/**
	 * Creates a symbolic color that represents an indexed entry into accessibility color cache 
	 * @param index
	 */
	private AccessibilityColor(byte index){
		super(index);
		this.index = index;		
	}

	/**
	 * Returns the RGB value representing the color
	 */
	public int getRGB(){
		return accessibilityColors[index];
	}

	/**
	 * Loads new system colors
	 * @param colors
	 */
	public static void loadSystemColors(int[] colors) {

		accessibilityColors = colors;		
	}
}