package Day23.Day23workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Day23.Day23workshop.model.Order;
import Day23.Day23workshop.repo.OrderRepo;

@Controller
@RequestMapping(path="/")
public class OrderController {
    
    @Autowired
    OrderRepo repo;

    @GetMapping(path={"/order/total/{order_id}"})
    public ModelAndView getOrderTotal(@RequestParam Integer order_id){
        ModelAndView mav = new ModelAndView("order_details");
        Order Order = repo.getOrderByID(order_id);
        mav.addObject("Order", Order);
        return mav;

    }
}
