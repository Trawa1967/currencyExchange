package pl.trawa.currency.currency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.trawa.currency.currency.services.CourseService;

@Controller
public class HomeController {

    private CourseService courseService;


    @Autowired
    public HomeController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    public String index(@RequestParam("currencyCode") String currencyCode,
                        Model model) {
//        model.addAttribute("course", courseService.getCourse(currencyCode).getRates().get(0).getMid());
        model.addAttribute("mid", courseService.getCourse(currencyCode));
        model.addAttribute("nameCurrency", courseService.getCourse(currencyCode));
        model.addAttribute("effectiveDate", courseService.getCourse(currencyCode));
        model.addAttribute("no", courseService.getCourse(currencyCode));
        model.addAttribute("currencyList", courseService.getListCourse(currencyCode));
        //model.addAttribute("mid",courseService.getCourse(currencyCode).getRates().get(0).getMid());
        //cos= courseService.getCourse(currencyCode).getRates().get(0).getMid();
        System.out.println();
        System.out.println(model);
        System.out.println(courseService.getCourse(currencyCode).getCurrency());
        System.out.println(courseService.getCourse(currencyCode).getRates().get(0).getMid());
        System.out.println(courseService.getCourse(currencyCode).getRates().get(0).getEffectiveDate() );


        return "index";
    }


}
