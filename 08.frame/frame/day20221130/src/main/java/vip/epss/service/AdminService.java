package vip.epss.service;

import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

public interface AdminService extends CommonService<Admin, AdminExample>{
    Admin loginCheck(Admin admin);
}
