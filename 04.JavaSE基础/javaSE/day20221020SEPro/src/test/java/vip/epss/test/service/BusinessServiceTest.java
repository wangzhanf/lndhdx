package vip.epss.test.service;

import org.junit.Test;
import vip.epss.dao.BusinessDao;
import vip.epss.service.BusinessService;

import java.util.Scanner;

public class BusinessServiceTest {
    @Test
    public void testRegisterBusiness(){
        BusinessService businessService = new BusinessService();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String repass = scanner.nextLine();
        String s = businessService.registerNew(name, pass, repass);
        System.out.println(s);
    }
}
