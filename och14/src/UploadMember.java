

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadMember
 */
@WebServlet("/UploadMember")
public class UploadMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UploadMember doPost start...");
		request.setCharacterEncoding("utf-8");
		int result=0;
		int maxSize = 5*1024*1024; // 5M
		String fileSave = "/fileSave";
		String realPath = getServletContext().getRealPath(fileSave);
		String filename="";
		System.out.println("realPath->"+realPath);
		MultipartRequest multi = new MultipartRequest(request, realPath, maxSize,"utf-8", new DefaultFileRenamePolicy());
		Enumeration en = multi.getFileNames();
		while(en.hasMoreElements()){
			//input 태그의 속성이 file인 태그의 name 속성값 : 파라미터이름m
			String filename1 = (String)en.nextElement();
			System.out.println(filename1);
			//서버에 저장된 파일 이름
			filename = multi.getFilesystemName(filename1);
			//전송전 원래의 파일 이름
			String original = multi.getOriginalFileName(filename1);
			//전송된 파일의 내용 타입
			String type = multi.getContentType(filename1);
			//전송된 파일 속성이 file인 태그의 name 속성값을 이용해 파일객체생성
			File file = multi.getFile(filename1);
			System.out.println("real Path : "+realPath);
			System.out.println("파라메터 이름 : "+filename1);
			System.out.println("실제 파일 이름 : "+original);
			System.out.println("저장된 파일 이름 : "+filename);
			System.out.println("파일 타입 : "+type);
			if(file!=null){
				System.out.println("크기 : "+ file.length());
			}
		}
		String id 		= multi.getParameter("id");
		String name 	= multi.getParameter("name");
		String passwd 	= multi.getParameter("passwd");
		
		MemberDao md = new MemberDao();
		MemberDto member = new MemberDto();
		member.setId(id);
		member.setName(name);
		member.setPassword(passwd);
		member.setImage("fileSave\\"+filename);
		
		try {
			result = md.insert(member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("passwd", passwd);
		request.setAttribute("fileName", "fileSave\\"+filename);
		
		RequestDispatcher rd = request.getRequestDispatcher("uploadMemberResult.jsp");
		rd.forward(request, response);
	}

}
