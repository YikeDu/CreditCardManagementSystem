package com.example.creditcardmanagementsystem;


import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;


import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        // start tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.getInteger("port", 8080));
        tomcat.getConnector();

        // create webapp
        Context ctx = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(
                new DirResourceSet(resources, "/WEB-INF/classes", new File("target/classes").getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }


//    @Bean
//    public CommandLineRunner run() throws LifecycleException {
//
//        // start tomcat
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(Integer.getInteger("port", 8080));
//        tomcat.getConnector();
//
//        // create webapp
//        Context ctx = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
//        WebResourceRoot resources = new StandardRoot(ctx);
//        resources.addPreResources(
//                new DirResourceSet(resources, "/WEB-INF/classes", new File("target/classes").getAbsolutePath(), "/"));
//        ctx.setResources(resources);
//
//        tomcat.start();
//        tomcat.getServer().await();
//
////        return (args) -> {
////            insertFourEmployees(repository);
////            System.out.println(repository.findAll());
////        };
//        return null;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
//    }
}