package com.onesofts.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService mser;

	
	@PostMapping(value = "/addMarklist")
	public String addMark(@RequestBody List<MarkSheet> mark) {
		return mser.addMark(mark);
	}

	@GetMapping(value = "/semmarks")
	public List<MarkSheet> getmarks() {
		return mser.getmarks();
	}

	@GetMapping(value = "/mark1/{re}")
	public int getmark1(@PathVariable int re) {
		return mser.getmark1(re);
	}

	@GetMapping(value = "/mark2/{r}")
	public int getMark2(@PathVariable int r) {
		return mser.getMark2(r);
	}
}