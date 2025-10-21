package com.ismayilov.spring.mvc_hibernate_aop;

import com.ismayilov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.ismayilov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private final EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/a")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "show-allemployees-view";
    }
}
