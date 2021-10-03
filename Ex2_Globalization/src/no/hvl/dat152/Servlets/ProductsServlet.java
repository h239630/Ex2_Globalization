package no.hvl.dat152.Servlets;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import no.hvl.dat152.Description;
import no.hvl.dat152.Product;
import no.hvl.dat152.ProductMockDAO;

/**
 * Servlet implementation class products
 */
@WebServlet(name="ProductServlet", urlPatterns="/products")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ProductMockDAO productDAO;
    
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsServlet() {
        super();
        productDAO = new ProductMockDAO();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("locale")) {
					Config.set(request.getSession(), Config.FMT_LOCALE, cookie.getValue());
				}
			}
		} else {
			Locale locale = request.getLocale();
			
			Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage());
			
			Cookie localeCookie = new Cookie("locale", locale.getLanguage());
			localeCookie.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(localeCookie);
					
		}
		
		
		
		List<Product> products = productDAO.getProdutcts();
		List<Description> descriptions = productDAO.getDescriptions();
		
		request.setAttribute("products", products);
		request.setAttribute("descriptions", descriptions);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}


}
