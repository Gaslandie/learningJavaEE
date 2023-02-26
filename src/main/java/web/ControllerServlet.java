package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="cs",urlPatterns = {"/controller","*.do"})
public class ControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String path=request.getServletPath();
        if(path.equals("/products.do")){
            request.getRequestDispatcher("products.jsp").forward(request,response);
        }else if(path.equals("/clients.do")){
            request.getRequestDispatcher("clients.jsp").forward(request,response);
        }else if(path.equals("/billings.do")){
            request.getRequestDispatcher("billings.jsp").forward(request,response);
        }else{
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
