package com.ssk.bookController;

import com.ssk.Bookbindings.BookStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/")
    public ModelAndView indexPage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
//        mav.setViewName("welcome");
//        mav.setViewName("wish");

        return mav;
    }

    @GetMapping("/book")
    public String getBookDetails(Model model) {

        BookStore bookobj = new BookStore(101, "Spring", 450.00);

        model.addAttribute("book", bookobj);

        return "book";


    }

    @GetMapping("/books")
    public String getBooksDeatails(Model model) {

        List<BookStore> bookobjlist = new ArrayList<>();

        bookobjlist.add(new BookStore(101, "SpringBoot", 450.0));
        bookobjlist.add(new BookStore(102, "Java", 600.0));
        bookobjlist.add(new BookStore(103, "Python", 750.0));
        bookobjlist.add(new BookStore(104, "DevOps", 1000.0));
        bookobjlist.add(new BookStore(105, "Microservices", 850.0));


        model.addAttribute("booklist", bookobjlist);

        return "books";
    }
}
