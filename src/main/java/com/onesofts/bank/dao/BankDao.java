package com.onesofts.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.onesofts.bank.entity.Bank;
import com.onesofts.bank.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;
	public String addBankDetails(List<Bank>b) {
		bankRepo.saveAll(b);
		return "Sucessfully saved";
	}
	public String getIfsc(String branch) {
		return bankRepo.getifscviabranch(branch);

}
}