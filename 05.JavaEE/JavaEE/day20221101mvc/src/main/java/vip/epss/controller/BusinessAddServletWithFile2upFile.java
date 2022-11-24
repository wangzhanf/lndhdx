package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import vip.epss.domain.Business;
import vip.epss.service.BusinessServiceImpl;
import vip.epss.service.CommonService;
import vip.epss.utils.MessageAndData;
import vip.epss.utils.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//该Serlet的目的是添加商家
@WebServlet(urlPatterns = "/business/addOneWithFile2upFile.do")
public class BusinessAddServletWithFile2upFile extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DiskFileItemFactory factory = new DiskFileItemFactory();
        //2、创建一个文件上传解析器
        ServletFileUpload upload = new ServletFileUpload(factory);
        Map<String, String> aList = new HashMap<>();
        List<FileItem> list = null;
        String filename = null;

        try {
            list = upload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }


        for (FileItem item : list) {
            //如果fileitem中封装的是普通输入项的数据
            if (item.isFormField()) {
//                String name = item.getFieldName();
//                String value = item.getString("UTF-8");
//                for (String s : value.split("&")) {
//                    String[] args = s.split("=");
//                    aList.put(args[0], args[1]);
//                }
//
//                System.out.println("name" + name + "value" + value);
                continue;
            } else {//如果fileitem中封装的是上传文件
                InputStream stream = item.getInputStream();//上传文件需要的文件流参数
                filename = item.getName();   //上传文件需要的参数


                //String savepath = getServletContext().getRealPath("/WEB-INF/upload");
                String savepath = "C:\\b\\upload";
                File path = new File(savepath);  //这个要自己写具体的路径，是需要上传文件需要的参数
                Upload.uploadFile(stream, path, filename);   //调用工具类方法
//                if (filename == null || filename.trim().equals("")) {
//                    //判空处理}
//                    continue;
            }
        }
        //开始顺序取非文件参数


//            Date contract_date =formatChange.tosqldate(date);
//
//            String money=pList.get(5);
//            BigDecimal contract_money =formatChange.tobigdecimal(money);
//
//            String contract_appendices=filename;
//
//            int row=contractFormService.contractFormUpdate(contract_name, customer_company_name, technical_director, contract_money, contract_date, contract_appendices, project_id);
//
//            if (row>0) {
//                response.sendRedirect(request.getContextPath()+"/contractlist.html" );
//            }

        //获取客户端传递过来的数据值
//        String businessName = aList.get("businessName");
//        String password = aList.get("password");
//        String businessExplain = aList.get("businessExplain");
//        String businessAddress = filename;


//        Business business = new Business(password, businessName).setBusinessExplain(businessExplain).setBusinessAddress(businessAddress);
        //调用service执行查询业务
//        CommonService businessService = new BusinessServiceImpl();
//        Integer num = businessService.addOne(business);
        //封装查询结果
        MessageAndData mad = null;   //  课间休息：  10：05
//        if (num < 1)
            mad = MessageAndData.success(filename);
//        else
//            mad = MessageAndData.success("添加商家数据成功");
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
