package com.greenfoxacademy.contollers;

import com.greenfoxacademy.model.StudentService;
import com.greenfoxacademy.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    UtilityService utilityService;

    @Autowired
    public MainController(UtilityService utilityService, StudentService studentService) {
        this.utilityService = utilityService;
    }


    @RequestMapping(value = "/useful")
    public String links(){
        return "useful";
    }

    @RequestMapping(value = "/useful/colored")
    public String randomBackground(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "background";
    }

    @GetMapping(value = "/useful/email")
    public String email(String email, Model model){
        if (email != null) {
            if (validateEmail(email)){
                model.addAttribute("valid", email + " is a valid email address");
            }
            else {
                model.addAttribute("valid", email + " is not a valid email address");
            }
        }
        return "email";
    }

    @GetMapping(value = "useful/decoder")
    public String decode(@RequestParam(name = "text", required = false) String text, @RequestParam(name = "number", required = false) Integer number, Model model){
        if (text != null && number != null) {
            model.addAttribute("decodedText", caesar(text, number));
        }
        return "decoder";
    }

    public static boolean validateEmail(String email){
        if (email.contains("@") && (email.substring(email.indexOf("@") + 2).contains("."))) return true;
        else return false;
    }

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }
}
