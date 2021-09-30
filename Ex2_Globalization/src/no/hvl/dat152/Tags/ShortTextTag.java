package no.hvl.dat152.Tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.commons.lang3.StringUtils;

/**
 * Limits the ammount of text shown in a field.
 * 
 * @author Mikael
 */
public class ShortTextTag extends SimpleTagSupport {
	
	private int maxchars;
	
	
	/**
	 * Sets the tag attribute for maxchars
	 */
	public final void setMaxchars(int max) {
		this.maxchars = max;
	}
	
	@Override
	public final void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		StringWriter stringWriter = new StringWriter();
		JspFragment body = getJspBody();
		body.invoke(stringWriter);
		String bodyText = stringWriter.getBuffer().toString();
		
		out.print(StringUtils.abbreviate(bodyText, maxchars+4));
	}
}











