//import java.io.*;
//import jakarta.servlet.*;
//import jakarta.servlet.http.*;
//
//public class HelloWorld extends HttpServlet {
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws IOException, ServletException
//    {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Hello World!</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Hello World!</h1>");
//        out.println("</body>");
//        out.println("</html>");
//    }
//}
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class WebServlet extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException
    {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw=res.getWriter();//get the stream to write the data

        //writing html in the stream
        pw.println("<html><body>");
        pw.println("Bonjour Elie El Helou!");
        pw.println("</body></html>");

        pw.close();//closing the stream
    }
}