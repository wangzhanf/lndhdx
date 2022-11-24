package vip.epss.ui;

import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;

import java.util.Scanner;

public class AdminViewImpl implements AdminView{
    private Scanner scanner = new Scanner(System.in);
    private AdminService adminService = new AdminService();
    private BusinessService businessService = new BusinessService();
    @Override
    public void showAll() {

    }

    //管理员子菜单
    @Override
    public void showSubMenu(){
        int choice = 0;
        while(true){
            System.out.println("--------管理员子菜单----------");
            System.out.println("1   信息管理");
            System.out.println("2   商家管理");
            System.out.println("3   商家列表");
            System.out.println("0   返回上级菜单");
            System.out.println("----------------------------");
            System.out.print("请输入菜单编号：");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    return;
                case 3:
                    BusinessView businessView = new BusinessViewImpl();
                    businessView.showAll();
                    System.out.print("输入要删除的id：");
                    int id = scanner.nextInt();
                    String s = businessService.removeOne(id);
                    System.out.println(s);
            }
        }
    }
}
