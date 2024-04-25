package com.example.vuespringpjt.work.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vuespringpjt.work.domain.WorkRequestDTO;
import com.example.vuespringpjt.work.domain.WorkResponseDTO;
import com.example.vuespringpjt.work.service.WorkService;



@RestController
public class WorkController {

    @Autowired
    private WorkService workService ; 
    //                             cors 발생
    // vue(http://localhost:8080) -----------> http://localhost:8888/works
    @GetMapping("/works")
    public List<WorkResponseDTO> works() {
        System.out.println(">>> debug Work Ctrl GET: /works ");
        List<WorkResponseDTO> result = workService.getWorks() ; 
        return result ; 
    }

    @PostMapping("/save")
    public String save(@RequestBody WorkRequestDTO params) {
        System.out.println(">>> debug Work Ctrl POST: /save ");
        System.out.println(">>> debug request params , "+ params);
        workService.addWork(params); 
        return null ; 
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println(">>> debug Work Ctrl DELETE: /delete ");
        System.out.println(">>> debug request params , "+ id) ;
        workService.deleteWork(id) ;  
        return null ;
    }
    @GetMapping("/find/{id}")
    public WorkResponseDTO find(@PathVariable Integer id) {
        System.out.println(">>> debug Work Ctrl GET: /find ");
        System.out.println(">>> debug request params , "+ id) ;
        WorkResponseDTO result = workService.findWork(id) ;  
        return result ;
    }
    @PutMapping("/update")
    public String update(@RequestBody WorkRequestDTO params) {
        System.out.println(">>> debug Work Ctrl PUT: /update ");
        System.out.println(">>> debug request params , "+ params);
        workService.updateWork(params); 
        return null ; 
    }

    @GetMapping("jenkins")
    public String debugMsg() {
        System.out.println(">>> debug Work Ctrl GET: /jenkins");
        // test
        return "success";
    }

}













