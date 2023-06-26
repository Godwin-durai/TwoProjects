package com.onesofts.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.bank.entity.Bank;
import com.onesofts.bank.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankSer;

	@PostMapping(value = "/addBankDetail")
	public String addBankDetails(@RequestBody List<Bank> b) {
		return bankSer.addBankDetails(b);

	}
 @GetMapping(value="/getifscviabranch/{branch}")
 public String getIfsc(@PathVariable String branch) {
	 return bankSer.getIfsc(branch);
 }


}

