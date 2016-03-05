package com.amar.sports.cricket.fantasy;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.IOException;
import java.util.Properties;

public class Application {

    public static void main(String[] args) throws Exception {
        new Application().start();
    }

    private void start() throws Exception {
        Server server = new Server(getPort());
        server.setHandler(getServletContextHandler(getContext()));
        server.start();
        server.join();
    }

    private Integer getPort() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("/application.properties"));
        return Integer.valueOf(properties.getProperty("server.port"));
    }

    private ServletContextHandler getServletContextHandler(WebApplicationContext context) throws IOException {
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath("/fantasy");
        contextHandler.addServlet(new ServletHolder(new DispatcherServlet(context)), "/");
        contextHandler.addEventListener(new ContextLoaderListener(context));
        contextHandler.setResourceBase("src/main/webapp");
        return contextHandler;
    }

    private WebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.amar.sports.cricket.fantasy.config");
        return context;
    }
}
