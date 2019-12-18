package org.buaa.platform.controller;

import org.buaa.platform.service.InstitutionService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/institution/"})
public class InstitutionController {
    @Autowired
    InstitutionService institutionService;
    @GetMapping({"detail"})
    public RetResult<Object> getDetail(String name) {
        try {
           return  RetResponse.makeOKRsp(institutionService.getDetail(name));
        }
        catch (Exception e) {
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
