package com.employee.CrudEmployeeOper.Cotroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.CrudEmployeeOper.Services.EmployeeService;
import com.employee.CrudEmployeeOper.model.Employee;



@Controller
@RequestMapping("/Saksoft")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

   
    @RequestMapping("/read-employee")
    public String showReadEmplyeePage(Model model) {
        model.addAttribute("employee", employeeService.findAll());
        return "readEmployee";
    }

    @RequestMapping("/create-employee")
    public String showCreateEmployeePage(Model model) {
        model.addAttribute("command", new Employee());
        return "createemployee";
    }

    @RequestMapping(value = "/create-employee", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/Saksoft/read-employee";
    }

    @RequestMapping(value = "/update-employee/{id}")
    public String showUpdateEmployeePage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", employeeService.findById(id).orElse(null));
        return "updateemployee";
    }

    @RequestMapping(value = "/update-employee/{id}", method = RequestMethod.POST)
    public String updateEmployee(@PathVariable int id, @ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(id, employee);
        return "redirect:/Saksoft/read-employee";
    }

    @RequestMapping(value = "/delete-employee/{id}")
    public String deleteContact(@PathVariable int id) {
        employeeService.deleteById(id);
        return "redirect:/Saksoft/read-employee";
    }

}
