
package com.onesofts.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao mDao;

	public String addMark(List<MarkSheet> mark) {
		for (MarkSheet ma : mark) {
			ma.setSem1Total(ma.getSem1Practicals() + ma.getSem1Theory());
			ma.setSem2Total(ma.getSem2Practicals() + ma.getSem2Theory());
		}
		return mDao.addMark(mark);
	}

	public List<MarkSheet> getmarks() {
		return mDao.getmarks();
	}

	public int getmark1(int re) {
		return mDao.getmark1(re);
	}

	public int getMark2(int r) {
		return mDao.getMark2(r);
	}
}