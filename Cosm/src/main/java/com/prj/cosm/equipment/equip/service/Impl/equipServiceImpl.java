package com.prj.cosm.equipment.equip.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.cosm.equipment.equip.mapper.equipMapper;
import com.prj.cosm.equipment.equip.service.equipService;

@Service
public class equipServiceImpl implements equipService {

	@Autowired
	equipMapper mapper;
}
