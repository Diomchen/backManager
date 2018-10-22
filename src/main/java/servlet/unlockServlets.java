package servlet;

import bean.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "unlockServlets")
public class unlockServlets extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        userService = new UserService();
        super.init();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        userService.unlockId(Integer.valueOf(id));
        User user =null;
        user = userService.getUserById(Integer.valueOf(id));
        System.out.println(user.getUserStatus());
        System.out.println();
        request.getRequestDispatcher("/hello.jsp").forward(request,response);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
