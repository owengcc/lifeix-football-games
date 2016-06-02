package com.lifeix.football.games.module.staff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Staff;
import com.lifeix.football.games.module.staff.service.StaffService;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/{staffId}", method = RequestMethod.GET)
    @Cacheable(value = "staff", keyGenerator = "wiselyKeyGenerator")
    public Staff findStaff(@PathVariable(value = "staffId") Long id) {
        return staffService.findOne(id);
    }
}
