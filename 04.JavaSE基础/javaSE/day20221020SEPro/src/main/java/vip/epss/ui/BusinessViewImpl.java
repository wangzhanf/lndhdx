package vip.epss.ui;

import vip.epss.pojo.Business;
import vip.epss.service.BusinessService;

public class BusinessViewImpl implements BusinessView{
    private BusinessService businessService = new BusinessService();
    @Override
    public void showAll() {
        //System.out.printf("%-8d\t商家名称\t商家地址");
        System.out.println("id\t商家名称\t商家地址");
        for (Business business : businessService.selectAll()) {
            System.out.println(
                    business.getId() + "\t" +
                    business.getBusinessName() + "\t" +
                    business.getBusinessAddress());
        }

    }
}
