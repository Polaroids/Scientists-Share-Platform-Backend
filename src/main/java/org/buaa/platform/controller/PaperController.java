package org.buaa.platform.controller;

import org.buaa.platform.service.PaperService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/paper/"})
public class PaperController {
    @Autowired
    PaperService paperService;
    @GetMapping({"detail"})
    public RetResult<Object> getDetail(String paperID){
        try {
            return RetResponse.makeOKRsp( paperService.getDetail(paperID));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
