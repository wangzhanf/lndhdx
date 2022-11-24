package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessVO;
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
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

//该Serlet的目的是获取商家列表，post--添加，get--获取
@WebServlet(urlPatterns = "/business/list.do")
public class BusinessListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pages = Integer.valueOf(req.getParameter("pages"));
        Integer pageSize = Integer.valueOf(req.getParameter("pageSize"));
        pageSize = pageSize==null ? 10 : pageSize;//3
        pages = (pages==null) ? 0 : (pages-1) * pageSize;//1
        //处理检索条件
        String cond = req.getParameter("cond")==null?"":req.getParameter("cond");
        //通过工具类进行解码
        cond  = URLDecoder.decode(cond,"utf-8");
        System.out.println(cond);
        //
        BusinessVO businessVO = new BusinessVO();
        for (String s : cond.split("&")) {
            String[] ss1 = s.split("=");
            if("bidCon".equals(ss1[0]) && ss1.length>1)
                businessVO.setCon(ss1[1]);
            if("id".equals(ss1[0]) && ss1.length>1)
                businessVO.setId(Integer.valueOf(ss1[1]));
            if("businessName".equals(ss1[0]) && ss1.length>1)
                businessVO.setBusinessName(ss1[1]);
        }


        //调用service执行查询业务
        CommonService<Business,BusinessVO> businessService = new BusinessServiceImpl();
        Map map = businessService.queryAll(pages, pageSize,businessVO);
        //封装查询结果
        MessageAndData mad = MessageAndData.success("查询商家数据成功").add("ret",map);
        //转换为JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String ret = objectMapper.writeValueAsString(mad);
        //返回给view,因为是前后端分离，交互JSON数据，需要告知客户端
        PrintWriter writer = resp.getWriter();
        writer.print(ret);
        writer.flush();
    }
}
