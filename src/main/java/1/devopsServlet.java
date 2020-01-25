package 1;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(urlPatterns = { "/main/*", "/VAADIN/*", "/UIDL/*", "/HEARTBEAT" }, asyncSupported = true)
@VaadinServletConfiguration(productionMode = true, ui = devopsUI.class)
public class devopsServlet extends VaadinServlet {

    private static final long serialVersionUID = 1L;

}
