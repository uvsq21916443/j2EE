package tp10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tp10.entity.Adresse;
import tp10.entity.Customer;
import tp10.entity.Email;
import tp10.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerService.grabAll());
        return "list";
    }

    @RequestMapping(value = "/new customer")
    public String newCustomerForm(Model model) {
        model.addAttribute("customer", new Customer()); 
        return "addCustomer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.sauve(customer);
        return "redirect:/list";
    }
    
    @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam("id") Long id) {
        customerService.deleteById(id);
        return "redirect:/list";
    }

    @RequestMapping("/edit")
    public String editCustomerForm(@RequestParam("id") Long id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "/addCustomer"; 
    }
    
    @RequestMapping("/")
    public String loginPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
    }
    
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute("customer") Customer customer, Model model) {
    	if (customer.getId() == null) {
            model.addAttribute("error", "Saisissez un id.");
            return "login";
        }
    	Long id = customer.getId();
        Customer existing = customerService.findById(id);
        
        if (existing != null) {
            return "redirect:/list";
        } else {
            return "login";
        }
    }
}