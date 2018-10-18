package filter;

import javax.servlet.*;
import java.io.IOException;

public class charSetFilter implements Filter {

    private String encode = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        encode = filterConfig.getInitParameter("encode");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding(encode);
        chain.doFilter(request,response);
    }

    public void destroy() {
    }
}
