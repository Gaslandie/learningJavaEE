package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {
    private Controller controller;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String path=request.getServletPath();//recuperer le path de la requete qui parvient à notre servlet
        //afficher du contenu en fonction du path saisi depuis le navigateur

        String controllerClassName=path.substring(1,path.indexOf(".do"));

        /*String pathView="views/"+viewName+".jsp";
        request.getRequestDispatcher(pathView).forward(request,response);*/

    }
}
