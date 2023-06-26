package com.onesofts.studentmarksheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {
	@Query(value = "SELECT sem1total From mark_sheet Where roll_no=?", nativeQuery = true)
	public int findmark1(int re);

	@Query(value = "SELECT sem2total From mark_sheet Where roll_no=?", nativeQuery = true)
	public int findmark2(int r);
}
