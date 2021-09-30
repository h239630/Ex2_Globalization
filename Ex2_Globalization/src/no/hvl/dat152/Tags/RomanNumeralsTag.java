package no.hvl.dat152.Tags;

import java.io.IOException;
import java.time.Year;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * Converts year from int to roman numerals
 * 
 * @author Mikael
 */
public class RomanNumeralsTag extends SimpleTagSupport {
	
	private int sinceYear;
	private int currentYear;
	private String name;
	int copyrightSymbolCodePoint = 169 ;

	/**
	 * Sets the tag attribute sinceYear
	 * 
	 * @param year
	 */
	public final void setSince(final int since) {
		this.sinceYear = since;
	}
	/**
	 * Sets the tag attribute name
	 */
	public final void setName(final String name) {
		this.name = name;
	}
	
	@Override
	public final void doTag() throws JspException, IOException {
		String s = Character.toString( copyrightSymbolCodePoint ) ;
		currentYear = Year.now().getValue();
		
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder currentYearRoman = new StringBuilder();
		StringBuilder sinceYearRoman = new StringBuilder();
		
        for(int i = 0; i < values.length; i++) {
            while(currentYear >= values[i]) {
            	currentYear -= values[i];
                currentYearRoman.append(romanLiterals[i]);
            }
        }
        
        for(int i = 0; i < values.length; i++) {
            while(sinceYear >= values[i]) {
            	sinceYear -= values[i];
            	sinceYearRoman.append(romanLiterals[i]);
            }
        }
        JspWriter out = getJspContext().getOut();
        out.print(s + " " + sinceYearRoman + " - " + currentYearRoman + " " + name);
	}

}
