package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.vo.Company;
import com.example.demo.vo.Employee;

@Controller
public class CompanyController {
	
	List<Company> companyList = new ArrayList<Company>() {
		{
		add(new Company("nextree", "1111", "서울 금천구") {
			{
			addEmployee(new Employee("김세희", "0001", "010-1111-1111"));
			addEmployee(new Employee("홍길동","0002", "010-2222-2222"));
			addEmployee(new Employee("김직원","0002", "010-3333-2222"));
			}
		});
		add(new Company("naver", "2222", "서울 금천구"));
		add(new Company("kakao", "3333", "서울 금천구"));
		add(new Company("goolgle", "4444", "서울 금천구"));
		add(new Company("samsung", "5555", "서울 금천구"));
		}
	};

	
	@RequestMapping("/company/{name}")
	public String company(@PathVariable("name") String id, Model model) {
		int idx = 0;


		for(int i =  0; i<companyList.size(); i++) {
			if(companyList.get(i).getName().equals(id)) {
				idx = i;
				
			}
		}
		System.out.println(companyList.get(idx).getLayoutType());
		
	
		model.addAttribute(companyList.get(idx));
		return "employeeList";
	}
	
	
	@RequestMapping("/companyList")
	public String companyList(Model model) {
		model.addAttribute(companyList);
		return "companyList";
	}
	
	//layout바꾸는 페이지로 이동
	@RequestMapping("/changeLayout")
	public String changeLayout() {
		return "chooseLayout";
	}
	
	//layout바꿈
	@RequestMapping(value = "/chooseLayout", method=RequestMethod.POST)
	public String chooseLayout(@RequestParam("type")String type, Model model) {
		for(int i = 0; i<companyList.size(); i++) {
			companyList.get(i).setLayoutType(type);
		}
		
		System.out.println(type);
		
		//바꾸고 회사목록 보여줌
		model.addAttribute(companyList);
		return "companyList";

	}
}
