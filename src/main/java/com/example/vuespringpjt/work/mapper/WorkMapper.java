package com.example.vuespringpjt.work.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vuespringpjt.work.domain.WorkRequestDTO;
import com.example.vuespringpjt.work.domain.WorkResponseDTO;

@Mapper
public interface WorkMapper {
    // mapper에 정의된 메서드이름은 추후 .xml 파일에 정의 되는 태그의 식별자 역할
    public List<WorkResponseDTO> findAll() ;
    public void                  addWork(WorkRequestDTO params) ;  
    public void                  deleteWork(Integer params) ;  
    public WorkResponseDTO       findWork(Integer params) ;  
    public void                  updateWork(WorkRequestDTO params) ;  
    
}




