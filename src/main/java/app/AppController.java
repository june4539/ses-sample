package app;

import app.ses.AmazonEmail;
import app.ses.SESFrom;
import app.ses.SESProcessor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private static final String EMAIL_TO = "noreply@mosaicsquare.io";

    @RequestMapping("/")
    public String index() {

        //send Email using default NO_REPLY from email
        SESProcessor.getInstance().add(new AmazonEmail(
                EMAIL_TO,
        "Hey mosaicsquare",
        "We have an offer for you :)"));

        //send Email using ATTA from email
        SESProcessor.getInstance().add(new AmazonEmail(
                EMAIL_TO,
        SESFrom.SUPPORT,
        "Hey mosaicsquare",
        "We have an offer for you :)"));

        return "Emails Sent!";
    }
}
