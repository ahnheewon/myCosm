package com.prj.cosm.equipment.equip.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.prj.cosm.equipment.equip.service.EquipVO;

public interface EquipMapper {

		// 설비
	
			//전체조회
			public List<EquipVO> getEquipList();
			
			//단건조회
			public EquipVO getEquipInfo(int equipNo);

			//등록
			public int insertEquip(EquipVO vo);
			
			// 설비 시간테이블 등록
			public int insertEquipTime(EquipVO vo);
			
			// 수정
			public int updateEquip(EquipVO vo);
			
			
			// 삭제
			public int deleteEquip(@Param("equipNo")int equipNo); 
			
			// 설비 삭제 시 설비별 가동 시간 데이터 삭제
			public int deleteEquipTime(@Param("equipNo")int equipNo); 

			//삭제 시 설비 번호 정렬 update문
			public int updateDeleteEquipNo(@Param("equipNo")int equipNo);
			
			//삭제 시 설비별 가동 시간 설비 번호 정렬 update문 
			public int updateDeleteTimeEquipNo(@Param("equipNo")int equipNo); // 설비 테이블이랑 연동되어 있다.
			
			//입력될 번호를 조회
			public EquipVO getEquipNo();
			
//=====================================================================================			
		// 공정 
			
			// 전체조회
			public List<EquipVO> getProcessList();
			
			// 단건조회
			public EquipVO getProcessInfo(int equipNo);

			// 등록
			public int insertProcess(EquipVO vo);
			
			// 수정
			public int updateProcess(EquipVO vo);
			
			// 삭제
			public int deleteProcess(@Param("processNo")int processNo); 
			
			//삭제 시 번호 정렬 update문
			public int updateDeleteProcessNo(@Param("processNo")int processNo);
			
			// 입력될 번호를 조회
			public EquipVO getProcessNo();
	
}
