package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.domain.Business;
import vip.epss.service.BusinessServiceImpl;
import vip.epss.service.CommonService;
import vip.epss.utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//该Serlet的目的是删除商家
@WebServlet(urlPatterns = "/business/updateOne.do")
public class BusinessUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取客户端传递过来的数据值
        Integer id = Integer.valueOf(req.getParameter("id"));
        Integer aid = Integer.valueOf(req.getParameter("aid"));
        String businessName = req.getParameter("businessName");
        String password = req.getParameter("password");
        String businessExplain = req.getParameter("businessExplain");
        Business business = new Business(password , businessName).setBusinessExplain(businessExplain).setId(id).setAid(aid);
        //调用service执行查询业务
        CommonService businessService = new BusinessServiceImpl();
        Integer num  = businessService.updateOne(business);
        //封装查询结果
        MessageAndData mad = null;
        if(num<1)
            mad = MessageAndData.error("修改商家数据失败");
        else
            mad = MessageAndData.success("修改商家数据成功");
        //转换为JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String ret = objectMapper.writeValueAsString(mad);
        //返回给view,因为是前后端分离，交互JSON数据，需要告知客户端
        PrintWriter writer = resp.getWriter();
        writer.print(ret);
        writer.flush();
        writer.close();
    }
}
