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

package becta.viewer.controls;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ListCellRenderer;
import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import becta.viewer.accessibility.AccessibilityColor;
import becta.viewer.drawing.AnnotationStroke;


/**
 * This class implements the colour chooser panel
 */
public class AnnotationChooser extends JPanel implements ActionListener,ChangeListener,Comparator<Component>{

	/**
	 * Holds selected annotation stroke
	 */
	AnnotationStroke selectedStroke;
	
	/**
	 * Array of predefined colours
	 */
	Color  [][] colors= { {Color.RED,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA},
            {Color.WHITE,new Color(216,216,216),Color.LIGHT_GRAY,Color.GRAY,Color.DARK_GRAY,Color.BLACK},
            {Color.PINK,	new Color(163,212,156),new Color(0,129,255),new Color(96,92,166),new Color(169,99,171),new Color(243,111,171)},
            {new Color(157,11,14),new Color(164,98,11),new Color(172,160,0),new Color(1,92,31),new Color(0,92,81),new Color(1,52,115)}};
	/**
	 * Array of predefined strokes
	 */
	AnnotationStroke [][] strokes ={{new AnnotationStroke(Color.BLACK,2),new AnnotationStroke(Color.BLUE,2),new AnnotationStroke(Color.GREEN,2),new AnnotationStroke(Color.RED,2)},
	{new AnnotationStroke(Color.BLACK,6),new AnnotationStroke(Color.BLUE,6),new AnnotationStroke(Color.GREEN,6),new AnnotationStroke(Color.RED,6)},
	{new AnnotationStroke( new Color(255,255,0,127),6),new AnnotationStroke(new Color(0,129,255,127),6),new AnnotationStroke(new Color(0,255,255,127),6),new AnnotationStroke(new Color(255,0,255,127),6)}};

	/**
	 * Currently selected predefined button
	 */
	ButtonModel selectedPresetButton = null;
	
	/**
	 * Group on the right side
	 */
	ButtonGroup colorGroup;
	
	/**
	 * combo box for showing line width 
	 */
	private JComboBox lineWidth;
	
	/**
	 * Slider for setting transparency
	 */
	private JSlider transparency;
	
	/**
	 * Control to show opacity value
	 */
	private JLabel	opacity;
	
	/**
	 * Constructor for this class
	 */
	public AnnotationChooser(){

		//We have to override the default focus traversal policy
		setFocusable(false);
		setFocusTraversalPolicyProvider(true);		
		setFocusTraversalPolicy(new SortingFocusTraversalPolicy(this));
		
		//set layout and preferred size
	    setLayout(null);
		setPreferredSize(new Dimension(334,80));		

		//creates line width combo box and adds items
		lineWidth = new JComboBox();
		lineWidth.setBounds(234,4,95,20);
		lineWidth.setBackground(AccessibilityColor.window);
		lineWidth.addItem(2);		
		lineWidth.addItem(4);		
		lineWidth.addItem(6);		
		lineWidth.addItem(8);	
		lineWidth.addActionListener(this);
		
		//set renderer for line width combo box
		lineWidth.setRenderer(new LineRenderer());
		
		//Lable to show current opacity
		opacity= new JLabel("");
		opacity.setBounds(234,25,95,25);				
		opacity.setVerticalAlignment(SwingConstants.BOTTOM);
		opacity.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		//creates slider for setting transparency and set its properties
		transparency = new JSlider(0,100,0);
		transparency.setBounds(234,52,95,25);
		transparency.setBackground(AccessibilityColor.window);
		transparency.setUI(new SliderUI(transparency));
		transparency.addChangeListener(this);
		transparency.setFont(new Font("Arial",Font.BOLD, 14));
		
		//lineWidth 
		this.add(lineWidth);
		this.add(transparency);	
		this.add(opacity);
		
		
		//Create stroke buttons		
		int y = 4;
		for(int i = 0; i < 3 ; ++i){	
			
			int x = 4;			
			for(int j = 0; j < 4; ++j){
				
				JRadioButton b = new JRadioButton();	
				b.setModel(new ExtendedButton(strokes[i][j]));
				b.setUI(ExtendedButton.ButtonUI);
			
				String name = "RGB("+strokes[i][j].getColour().getRed()+","+strokes[i][j].getColour().getGreen()+","+strokes[i][j].getColour().getBlue()+","+strokes[i][j].getColour().getAlpha()+")";
				name = String.format(ResourceManager.resource.getString("AnnotationStroke.AccessibleName"),ResourceManager.resource.getString(name),strokes[i][j].getWidth());
				
				b.getAccessibleContext().setAccessibleName(name);
				b.setToolTipText(name);
				b.setSize(22, 22);
				b.setLocation(x, y);
				b.addActionListener(this);
				this.add(b);
				x+=26;
				
				if(selectedPresetButton==null){
					
					
					lineWidth.setSelectedItem(2);
					transparency.setValue(100);
					
					selectedPresetButton = b.getModel();
					selectedPresetButton.setSelected(true);
				}
			}			
			y+=26;
		}
		
		colorGroup = new ButtonGroup();
		
		//Create colour buttons		
		y = 4;
		for(int i = 0; i < 4 ; ++i){			
			int x = 115;			
			for(int j = 0; j < 6; ++j){
				
				JRadioButton b = new JRadioButton();
				b.setModel( new ExtendedButton(colors[i][j]));
				b.setUI(ExtendedButton.ButtonUI);
				
				String name = "RGB("+colors[i][j].getRed()+","+colors[i][j].getGreen()+","+colors[i][j].getBlue()+","+colors[i][j].getAlpha()+")";
				name = ResourceManager.resource.getString(name);
				b.getAccessibleContext().setAccessibleName(name);
				b.setToolTipText(name);
				b.setSize(16, 16);
				b.setLocation(x, y);
				this.add(b);	
				b.addActionListener(this);
				colorGroup.add(b);
				x+=19;
			}			
			y+=19;
		}
		
		//Set focus to the first component
		getComponent(0).requestFocusInWindow();
		
		setOpacityText();
		
	}

	private void setOpacityText(){
		
		String text = ResourceManager.resource.getString("AnnotationWindow.Opacity")+": "+transparency.getValue()+"%";
		String accessText = ResourceManager.resource.getString("AnnotationWindow.Opacity")+" "+transparency.getValue()+"%";
		opacity.setText(text);
		opacity.getAccessibleContext().setAccessibleName(accessText);
	}
	
	/**
	 * gets the current annotation stroke
	 * @return AnnotationStroke
	 */
	public AnnotationStroke getAnnotationStroke(){
		
	    if(selectedPresetButton!=null){
	    	return (AnnotationStroke)((ExtendedButton)selectedPresetButton).getData();
	    }
	    else{	 
	    	//Create AnnotationStroke based on current colour, width  and transparency 
	    	Color c = (Color)((ExtendedButton)colorGroup.getSelection()).getData();
	    	c = new Color(c.getRed(),c.getGreen(),c.getBlue(), (transparency.getValue()*255)/100 );
	    	
	    	return new AnnotationStroke(c,(Integer)lineWidth.getSelectedItem());
	    }		
	}

	/**
	 * Method to handle Button click.
	 */
	public void actionPerformed(ActionEvent e) {
		
		//Update colour , width and transparency on RHS based on the button selected in LHS 
		if(e.getSource() instanceof JRadioButton )
		{
			ExtendedButton eb = (ExtendedButton)((JRadioButton)e.getSource()).getModel();
			Object obj =  eb.getData();
			if(obj instanceof AnnotationStroke){
				
				if(selectedPresetButton!=null)
					selectedPresetButton.setSelected(false);
				
				//Set lien width
				lineWidth.setSelectedItem(((AnnotationStroke)obj).getWidth());
				
				//Compare the buttons on RHS with the currently selected preset button
				for(int i = 0 ; i < getComponentCount();++i){
					Component comp = getComponent(i);
					if( comp instanceof JRadioButton ){
						ExtendedButton temp = (ExtendedButton)((JRadioButton)comp).getModel();
						if(temp.getData() instanceof Color){
							
							Color colour = (Color)temp.getData();
							Color strokeColor = ((AnnotationStroke)obj).getColour();
							//We don't have to compare alpha. so exclude alpha
							if( (colour.getRGB()&0x00ffffff ) == (strokeColor.getRGB()&0x00ffffff)){
								temp.setSelected(true);
								transparency.setValue( (int) Math.ceil(100* (strokeColor.getAlpha()/(float)255)));								
								break;
							}
						}
					}
				}
				
				selectedPresetButton = eb;
				selectedPresetButton.setSelected(true);
				return;
			}
				
		}
		
		//User selected a button on RHS. So clear all selections on LHS
		if(selectedPresetButton!=null)
		{
			selectedPresetButton.setSelected(false);
			selectedPresetButton = null;
		}
		
	}

	/**
	 * Overrides paint for drawing the separator 
	 */
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		//Creates Graphics2D instance
		Graphics2D g2d = (Graphics2D)g;
		
		//creates and set stroke for drawing dotted line
		BasicStroke stroke = new BasicStroke(1 ,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND, 0, new float[]{2}, 0);
		g2d.setStroke(stroke);
		
		//set colour for separator
		g2d.setColor(AccessibilityColor.controlShadow);
		
		//draws separator line
		g2d.drawLine(109, 4, 109, 77);
	}

	/**
	 * Implementation of Comparator. Used to sort the components based on Z-Order 
	 */
	public int compare(Component o1, Component o2) {
		
		int z1 = o1.getParent().getComponentZOrder(o1);
		int z2 = o2.getParent().getComponentZOrder(o2);
		return z1-z2;		
	}

	/**
	 * Implementation of ChangeListener interface. Used to track changes transparency 
	 */
	public void stateChanged(ChangeEvent arg0) {
		
		if(selectedPresetButton!=null)
		{
			selectedPresetButton.setSelected(false);
			selectedPresetButton = null;
		}
		setOpacityText();
	}
}

/**
 * This class implements the list items for line width combo
 */
class LineRenderer extends JLabel implements ListCellRenderer{

	protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);
	int value;
	
	/**
	 * Constructor for this class
	 */
	public LineRenderer() {
        super();
        setOpaque(true);
        setBorder(noFocusBorder);
        setPreferredSize(new Dimension(50,20));
    }
	
	/**
	 * Return the LineRenderer instance that is used to show the list item
	 */
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		
		//set background and foreground colour
		 if (isSelected) {
	         setBackground(list.getSelectionBackground());
	         setForeground(list.getSelectionForeground());
	     }
	     else {
	         setBackground(list.getBackground());
	         setForeground(list.getForeground());
	     }

		 //set font
	     setFont(list.getFont());	        
	     this.value = Integer.parseInt(value.toString());	        
	     return this;
	}
	
	/**
	 * Paints list item. A line with predefined with is drawn here
	 */
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		//get graphics instance and set rendering hints
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		//creates the stroke
		BasicStroke stroke = new BasicStroke(value,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		g2d.setStroke(stroke);
		
		//draws line
		int y = getHeight()/2;
		g2d.drawLine(5, y, getWidth()-10,y );
	}
}
