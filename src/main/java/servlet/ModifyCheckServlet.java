package servlet;

import bean.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

@WebServlet(name = "ModifyCheckServlet")
public class ModifyCheckServlet extends HttpServlet {

    private UserService userService = null;
    @Override
    public void init() throws ServletException {
        userService = new UserService();
        super.init();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getServletPath();
        if(Objects.equals("/modifyCheck.do",url)){
            String id = request.getParameter("id");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String nickname = request.getParameter("nickname");
            int age = Integer.valueOf(request.getParameter("age"));
            int gender = -1;
            if(Objects.equals("男",request.getParameter("gender"))){
                gender = 1;
            }
            else if(Objects.equals("女",request.getParameter("gender"))){
                gender = 0;
            }
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            System.out.println(id+"---"+username+"---"+nickname+"---"+gender);
            String remark = request.getParameter("remark");

            Date updateTime = new Date();

            User user = new User(Integer.valueOf(id),username,password,nickname,Integer.valueOf(age),String.valueOf(gender),phone,email,updateTime, remark);

            userService.updateUserByUser(user);

            request.getRequestDispatcher("/hello.jsp").forward(request,response);
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
