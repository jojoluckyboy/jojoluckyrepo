package com.icinfo.testjiraview.service;

import com.icinfo.testjiraview.mapper.hxjiraMapper;
import com.icinfo.testjiraview.pojo.jiraDtype;
import com.icinfo.testjiraview.pojo.jiraPro;
import com.icinfo.testjiraview.pojo.jiraUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Description：
 * <p>
 * Created with IntelliJ IDEA.
 * User：wang wencong
 * Date：2017/5/5
 * Time：16:46
 * Copyright© 2003-2016 Zhejiang huixin technology company
 */
@Service
@Transactional
public class JiraService {
    @Resource
    private hxjiraMapper  jiraMapper;
    /**
     * 查询固定时期各项目缺陷
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraPro> getTotal(String startTimeV,String endTimeV) {

        Map<String,Object> qryMap = new HashMap<String,Object>();
        qryMap.put("startTimeV",startTimeV);
        qryMap.put("endTimeV",endTimeV);

        List<jiraPro> jlist = jiraMapper.getRtotalbypro(qryMap);


        //表拆解
        /*List templist = new ArrayList<String>();
        templist.add("新建");
        templist.add("打开");
        templist.add("拒绝");
        templist.add("延迟修复");
        templist.add("已解决待确认");
        templist.add("已关闭");


        for(int i=0;i<jlist.size();i++) {

            for( Object str: templist){

                System.out.print(str.toString());
                jlist.

            }


        }*/
        return jlist;
    }

    /**
     * 查询固定时期各项目缺陷
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraDtype> getRDtypebypro(String startTimeV, String endTimeV,String project) {

        Map<String,Object> qryMap = new HashMap<String,Object>();
        qryMap.put("startTimeV",startTimeV);
        qryMap.put("endTimeV",endTimeV);
        qryMap.put("project",project);

        List<jiraDtype> jlist = jiraMapper.getRDtypebypro(qryMap);
        List<jiraDtype> plist = jiraMapper.getRDtypebytopdev(qryMap);

        jlist.addAll(plist);

        return jlist;
    }

    /**
     * 按月查询某个开发的缺陷
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraDtype> getRDtypebydev(String dstartTimeV, String dendTimeV,String devName) {

        Map<String,Object> qryMap = new HashMap<String,Object>();
        qryMap.put("dstartTimeV",dstartTimeV);
        qryMap.put("dendTimeV",dendTimeV);
        qryMap.put("devName",devName);

        List<jiraDtype> jlist = jiraMapper.getRDtypebydev(qryMap);

        return jlist;
    }

    /**
     * 按关键字拼音查询返回开发的list
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraUser> getRdevNamelist(String typeName) {


        List<jiraUser> jlist = jiraMapper.getRdevNamelist(typeName);

        return jlist;
    }

    /**
     * 按项目组查询各开发的缺陷
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraDtype> getRDprobydevgroup(String dstartTimeV, String dendTimeV,String devGroup) {

        Map<String,Object> qryMap = new HashMap<String,Object>();
        qryMap.put("dstartTimeV",dstartTimeV);
        qryMap.put("dendTimeV",dendTimeV);
        qryMap.put("devGroup",devGroup);

        List<jiraDtype> jlist = jiraMapper.getRDprobydevgroup(qryMap);

        return jlist;
    }


    /**
     * 返回一段时期的某开发的缺陷状态
     *
     * @return json格式的查询数据
     * @throws Exception
     */
    public List<jiraDtype> getDevbyperiod(String dstartTimeV, String dendTimeV,String dname) {

        Map<String,Object> qryMap = new HashMap<String,Object>();
        qryMap.put("dstartTimeV",dstartTimeV);
        qryMap.put("dendTimeV",dendTimeV);
        qryMap.put("dname",dname);

        List<jiraDtype> jlist = jiraMapper.getRDevbyperiod(qryMap);

        return jlist;
    }


}
