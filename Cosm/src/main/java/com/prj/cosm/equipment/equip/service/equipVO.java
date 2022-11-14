package com.prj.cosm.equipment.equip.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class equipVO {

	private int equipNo;
	private int equipProcess;
	private String equipType;
	private String equipName;
	private String equipPurpose;
	private int equipCheckCycle;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date equipDate;
	private int equipRate;
	private int equipStdVibe;
	private int equipStdTemp;
	private int equipState;
	private int unitCode;
	
	
}
