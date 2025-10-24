package com.ismayilov.spring.mvc_hibernate_aop.controller;

import com.ismayilov.spring.mvc_hibernate_aop.entity.Employee;
import com.ismayilov.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeDAO) {
        this.employeeService = employeeDAO;
    }


    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "show-allemployees-view";
    }

    @RequestMapping("/addEmployee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info-view";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateInfo(@RequestParam("id") int id,Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info-view";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteInfo(@RequestParam("empId") int id) {
         employeeService.deleteEmployee(id);
        return "redirect:/";
    }


}
