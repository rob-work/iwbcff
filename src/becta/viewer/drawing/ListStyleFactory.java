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

/**
 * This class gives different ListStyle
 */
public class ListStyleFactory {
	
	
	public static ListStyle createListStyle(int type){
		
		ListStyle style = null;
		switch(type)
		{			
			case IWBBridge.IWB_LISTSTYLETYPE_NONE:
				style = new BasicListStyle(" ");
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_DISC:
				style = new BasicListStyle("\u25CF");
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_CIRCLE:
			case IWBBridge.IWB_LISTSTYLETYPE_UNDEFINED:
				style = new BasicListStyle("\u25CF");
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_SQUARE:
				style = new BasicListStyle("\u25A0");
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_DECIMAL:
				style = new DecimalListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_DECIMAL_LEADING_ZERO:
				style = new DecimalLeadingZeroListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_LOWER_ROMAN:
				style = new LowerRomanListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_UPPER_ROMAN:
				style = new UpperRomanListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_UPPER_ALPHA:
				style = new UpperAlphaListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_LOWER_ALPHA:
				style = new LowerAlphaListStyle();
				break;
			case IWBBridge.IWB_LISTSTYLETYPE_LOWER_GREEK:
				style = new LowerGreekListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_LOWER_LATIN:				
				style = new LowerLatinListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_UPPER_LATIN:
				style = new UpperLatinListStyle();
				break;				
			/*case  IWBBridge.IWB_LISTSTYLETYPE_HEBREW:				
				style = new HebrewListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_ARMENIAN:
				style = new ArmenianListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_GEORGIAN:
				style = new GeorgianListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_CJK_IDEOGRAPHIC:
				style = new CjkIdeographicListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_HIRAGANA:
				style = new HiraganaListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_KATAKANA:
				style = new KatakanaListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_HIRAGANA_IROHA:
				style = new HiraganaIrohaListStyle();
				break;
			case  IWBBridge.IWB_LISTSTYLETYPE_KATAKANA_IROHA:				
				style = new KatakanaIrohaListStyle();
				break;*/
			default:
				style = new LowerAlphaListStyle();
		}
		return style;
	}
	
	static class BasicListStyle implements ListStyle
	{
		String listMarker;
		public BasicListStyle(String marker) {
			listMarker = marker;
		}
		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			return listMarker;
		}
	}
	
	/**
	 * This class creates "decimal" list style
	 */
	static class DecimalListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			String listMarker = value.toString();
			return listMarker;
		}
	}
	
	/**
	 * This class creates "decimal-leading-zero" list style
	 */
	static class DecimalLeadingZeroListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			String listMarker = value < 10 ? "0" + value.toString() : value.toString();
			return listMarker;
		}
	}
	
	/**
	 * This class creates "lower-roman" list style
	 */
	static class LowerRomanListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			String listMarker = getRomanValue(value, false);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "upper-roman" list style
	 */
	static class UpperRomanListStyle implements ListStyle{
	    
		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {

			String listMarker = getRomanValue(value, true);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "lower-alpha" list style
	 */
	static class LowerAlphaListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			char[] chars = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			String listMarker = getAlphaValue(chars, value);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "upper-alpha" list style
	 */
	static class UpperAlphaListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
	
			char[] chars = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			String listMarker = getAlphaValue(chars, value);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "lower-greek" list style
	 */
	static class LowerGreekListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			char[] chars = {0x03B1,0x03B2,0x03B3,0x03B4,0x03B5,0x03B6,0x03B7,0x03B8,0x03B9,0x03BA,0x03BB,0x03BC,0x03BD,0x03BE,0x03BF,0x03C0,0x03C1,0x03C3,0x03C4,0x03C5,0x03C6,0x03C7,0x03C8,0x03C9};
			String listMarker = getAlphaValue(chars, value);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "lower-latin" list style
	 */
	static class LowerLatinListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			char[] chars = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			String listMarker = getAlphaValue(chars, value);
			return listMarker;
		}
	}
	
	/**
	 * This class creates "upper-latin" list style
	 */
	static class UpperLatinListStyle implements ListStyle{

		/**
		 * Get the list style string for given value
		 */
		public String getListMarker(Integer value) {
			
			char[] chars = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			String listMarker = getAlphaValue(chars, value);
			return listMarker;
		}
	}
	
	/**
	 * Gets the roman value for given number
	 * @param value
	 * @param isUpperCase
	 * @return Roman Value String
	 */
	private static String getRomanValue(int value, boolean isUpperCase){
		
	    char[] fiveLetterUpper = { 'V', 'L', 'D' };
	    char[] unitLetterUpper = { 'I', 'X', 'C', 'M' };
	    char[] fiveLetterLower = { 'v', 'l', 'd' };
	    char[] unitLetterLower = { 'i', 'x', 'c', 'm' };

	    
	    char[] fiveLetter = isUpperCase ? fiveLetterUpper : fiveLetterLower;
	    char[] unitLetter = isUpperCase ? unitLetterUpper : unitLetterLower;
	    
	    //HowToProcess many of this group is needed to form one of the succeeding group.
	    int[] divisor = {10, 10, 10, 1000000 };
		
		String s = "";
        // Work least significant digit to most, right to left.
        // until high order part is all 0s.
        for ( int group = 0; value > 0; group++ ){
        	
            int remdr = ( int ) ( value % divisor[ group ] );
            value = value / divisor[ group ];
            StringBuilder t;
            if ( group == 3 )
                {
                /* M is as big as it gets, just repeat */
                t = new StringBuilder( remdr );

                for ( int j = 0; j < remdr; j++ )
                    {
                    t.append( unitLetter[ group ] );
                    }
                }
            else {
                t = new StringBuilder( 3 );

                switch ( remdr )
                    {
                    case 0:
                        break;

                    case 1:
                        t.append( unitLetter[ group ] );
                        break;

                    case 2:
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        break;

                    case 3:
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        break;

                    case 4:
                        t.append( unitLetter[ group ] );
                        t.append( fiveLetter[ group ] );
                        break;

                    case 5:
                        t.append( fiveLetter[ group ] );
                        break;

                    case 6:
                        t.append( fiveLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        break;

                    case 7:
                        t.append( fiveLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        break;

                    case 8:
                        t.append( fiveLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group ] );

                        break;

                    case 9:
                        t.append( unitLetter[ group ] );
                        t.append( unitLetter[ group + 1 ] );
                        break;
                    }// end switch
                }// end else
            s = t + s;
            }// end for
        return s;
	}
	
	/**
	 * Get the string for given value
	 * @param chars
	 * @param value
	 * @return
	 */
	private static String getAlphaValue(char[] chars, int value){
		
		String alphaValue="";		
		int x = value;

		while(x > 0){
			int rem = x% chars.length;
			x =x/chars.length;
			if(rem == 0){
				alphaValue=new Character(chars[chars.length-1]).toString()+ alphaValue;
				--x;
			}
			else
				alphaValue = new Character(chars[rem-1]).toString() + alphaValue;
		}
		return alphaValue;
	}
}
