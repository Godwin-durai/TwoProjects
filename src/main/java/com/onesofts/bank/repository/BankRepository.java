package com.onesofts.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesofts.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="select ifsc from bank where branch=?",nativeQuery = true)
	public String getifscviabranch(String branch);

}
