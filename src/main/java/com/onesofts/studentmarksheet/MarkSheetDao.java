package com.onesofts.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mRepo;

	public String addMark(List<MarkSheet> mark) {
		mRepo.saveAll(mark);
		return "mark successfull Add";
	}

	public List<MarkSheet> getmarks() {
		return mRepo.findAll();
	}

	public int getmark1(int re) {
		return mRepo.findmark1(re);
	}

	public int getMark2(int r) {
		return mRepo.findmark2(r);
	}
}