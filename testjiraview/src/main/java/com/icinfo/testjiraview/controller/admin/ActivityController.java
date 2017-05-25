package com.icinfo.testjiraview.controller.admin;


import com.google.gson.Gson;
import com.icinfo.testjiraview.pojo.jiraDtype;
import com.icinfo.testjiraview.pojo.jiraPro;
import com.icinfo.testjiraview.pojo.jiraUser;
import com.icinfo.testjiraview.service.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description：
 * <p>
 * Created with IntelliJ IDEA.
 * User：wang wencong
 * Date：2017/5/2
 * Time：10:57
 * Copyright© 2003-2016 Zhejiang huixin technology company
 */

@Controller
public class ActivityController {

    @Autowired
    private JiraService jiraService;

    /**
     * 进入默认首页
     *
     * @return 管理首页
     * @throws Exception
     */
    @RequestMapping(value = "/index")
    public String indexdefault() throws Exception {
        return "adminindex";
    }


    /**
     * 进入管理首页
     *
     * @return 管理首页
     * @throws Exception
     */
    @RequestMapping(value = "/admin/index.do")
    public String index() throws Exception {
        return "adminindex";
    }

    /**
     * 进入项目组缺陷横向比较页面
     *
     * @return 比较页面
     * @throws Exception
     */
    @RequestMapping(value = "/admin/horizon.do")
    public String horizon() throws Exception {
        return "admin/proteam/horizon";
    }


    /**
     * 进入项目组缺陷-人员专题页面
     *
     * @return 比较页面
     * @throws Exception
     */
    @RequestMapping(value = "/admin/protopic.do")
    public String protopic() throws Exception {
        return "admin/proteam/protopic";
    }



    /**
     * 进入开发人员专题页面
     *
     * @return 比较页面
     * @throws Exception
     */
    @RequestMapping(value = "/admin/developer.do")
    public String developer() throws Exception {
        return "admin/proteam/developer";
    }

    /**
     * 查询固定时期各项目缺陷
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    @RequestMapping(value = "/admin/gettotalpro.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String gettotalpro(String startTimeV,String endTimeV) throws Exception {


        List<jiraPro> findtotalpro = jiraService.getTotal(startTimeV,endTimeV);

        Gson gson = new Gson();
        String jiraJson = gson.toJson(findtotalpro);

        return jiraJson;
    }

    /**
     * 查询固定时期各项目组缺陷类型
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    @RequestMapping(value = "/admin/getDtype.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getDtype(String startTimeV,String endTimeV,String project) throws Exception {


        List<jiraDtype> findDtype = jiraService.getRDtypebypro(startTimeV,endTimeV,project);

        Gson gson = new Gson();
        String dtypeJson = gson.toJson(findDtype);

        return dtypeJson;
    }

    /**
     * 按月查询固定时期某一开发的缺陷数量
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    @RequestMapping(value = "/admin/getDevstat.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getDevstat(String dstartTimeV,String dendTimeV,String devName) throws Exception {


        List<jiraDtype> findDevstat = jiraService.getRDtypebydev(dstartTimeV,dendTimeV,devName);

        Gson gson = new Gson();
        String devstatJson = gson.toJson(findDevstat);

        return devstatJson;
    }

    /**
     * 返回被查询的开发名字
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    @RequestMapping(value = "/getdevNamelist.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getdevNamelist(String query) throws Exception {


        List<jiraUser> findDevname = jiraService.getRdevNamelist(query);

        Gson gson = new Gson();
        String devnameJson = gson.toJson(findDevname);

        return devnameJson;
    }

    /**
     * 返回被查询的项目团队缺陷状态
     *
     * @return json格式的查询数据
     * @throws Exception
     */


    @RequestMapping(value = "/admin/getDevgroup.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getDevgroup(String dstartTimeV,String dendTimeV,String devGroup) throws Exception {


        List<jiraDtype> findDevgroup = jiraService.getRDprobydevgroup(dstartTimeV,dendTimeV,devGroup);

        Gson gson = new Gson();
        String devgroupJson = gson.toJson(findDevgroup);

        return devgroupJson;
    }

    /**
     * 返回一段时期的某开发的缺陷状态
     *
     * @return json格式的查询数据
     * @throws Exception
     */


    @RequestMapping(value = "/admin/getDevbyperiod.do",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getDevbyperiod(String dstartTimeV,String dendTimeV,String dname) throws Exception {


        List<jiraDtype> findDevperiod = jiraService.getDevbyperiod(dstartTimeV,dendTimeV,dname);

        Gson gson = new Gson();
        String devperiodJson = gson.toJson(findDevperiod);

        return devperiodJson;
    }

}
