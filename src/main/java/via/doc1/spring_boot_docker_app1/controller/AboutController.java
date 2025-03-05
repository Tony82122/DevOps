package via.doc1.spring_boot_docker_app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @GetMapping("/about")
    public String aboutMe() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head>" +
               "<title>About - Spring Boot Docker App</title>" +
               "</head>" +
               "<body bgcolor=\"#9FE2BF\">" +
               "<h1>DevOps and Cloud</h1>" +
               "<h2>Dockerizing Spring Boot Application</h2>" +
               "<section>" +
                "<h2>About Me</h2>" +
               "<p>My name is Anthony Richards </p>"+
               "<p>My <span style=\"color: blue;\">team wish for SEP4</span> is to be the Frontend Developer and create an amazing user experience!</p>" +
               "</section>" +
               "<p>Team members wish</p>" +
               "<ul>" +
               "<li>Anthony Richards - Frontend </li>" +
               "<li>Josip - Mr Wiseflow </li>" +
               "<li>Sneha - Frontend </li>" +
               "</ul>" +
               "<p><a href=\"/\">Back to Home</a></p>" +
               "</body>" +
               "</html>";
    }
}