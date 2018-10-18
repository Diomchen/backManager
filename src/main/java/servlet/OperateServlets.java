package servlet;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "OperateServlets")
public class OperateServlets extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        userService = new UserService();
        super.init();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aTip = request.getServletPath();
        System.out.println(aTip);
        if(Objects.equals(aTip,"/examine.do")){
            request.getRequestDispatcher("/WEB-INF/views/examine.jsp").forward(request,response);
        }
        else if(Objects.equals(aTip,"/modify.do")){

        }
        else if(Objects.equals(aTip,"/delete.do")){

        }
        else{
            request.getRequestDispatcher("/WEB-INF/error/404.jsp").forward(request,response);
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
