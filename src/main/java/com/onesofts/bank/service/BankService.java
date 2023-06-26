package com.onesofts.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.onesofts.bank.dao.BankDao;
import com.onesofts.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;
	public String addBankDetails(List<Bank>b) {
		return bankDao.addBankDetails(b);
		
	}
	
	 public String getIfsc(@PathVariable String branch) {
		 return bankDao.getIfsc(branch);
	 }

}
