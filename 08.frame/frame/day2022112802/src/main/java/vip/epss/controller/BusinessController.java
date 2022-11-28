package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import vip.epss.dao.AdminMapper;
import vip.epss.service.BusinessServiceImpl;
import vip.epss.service.CommonService;

public class BusinessController {
    @Autowired
    @Qualifier("businessService")
    private CommonService businessService;


}
