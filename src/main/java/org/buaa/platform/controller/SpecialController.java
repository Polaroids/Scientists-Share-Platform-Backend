package org.buaa.platform.controller;

import org.buaa.platform.service.SpecialService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/special/"})
public class SpecialController {
    @Autowired
    SpecialService specialService;
    @GetMapping({"detail"})
    public RetResult<Object> getDetail(String specialID){
        try {
            return RetResponse.makeOKRsp( specialService.getDetail(specialID));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @GetMapping(value = "/getPapers")
    public RetResult<Object> getPapers(String specialID){
        try {
            return RetResponse.makeOKRsp(specialService.getPapers(specialID));

        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @GetMapping(value = "search")
    public RetResult<Object> search(String name,Integer crtPage,Integer pageSize){
        return RetResponse.makeOKRsp(specialService.search(name,crtPage,pageSize));
    }
}
