

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
@WebServlet("/Greet")
public class Greet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    PrintWriter log;
    public Greet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			log = new PrintWriter(new FileWriter("c:/log/log.txt",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Greet init PrintWriter 오류...");
		}		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		if(log!=null) log.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String msg = name + "님 반가워\r\n";
		GregorianCalendar	gc = new GregorianCalendar();
		// TF -> 날짜, TT -> 시간
		String date = String.format("%TF %TT\r\n", gc,gc);
		//System.out.println("GregorianCalendar date->"+date);
		log.print(date + msg);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>인사</h2>"+msg);
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
