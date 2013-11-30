import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s =req.getParameter("name");
        //resp.setContentType("text/plain");
        PrintWriter out =resp.getWriter();
        out.print("<html><body>");
        out.print("<h1>Prived "+s+"</h1>");
        out.print("</body></html>");


    }



}
