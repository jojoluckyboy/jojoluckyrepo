package com.icinfo.testjiraview.mapper;

import com.icinfo.testjiraview.pojo.hxjira;
import com.icinfo.testjiraview.pojo.jiraDtype;
import com.icinfo.testjiraview.pojo.jiraPro;
import com.icinfo.testjiraview.pojo.jiraUser;

import java.util.List;
import java.util.Map;

public interface hxjiraMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(hxjira record);

    hxjira selectByPrimaryKey(Integer id);

    List<hxjira> selectAll();

    int updateByPrimaryKey(hxjira record);

    List<jiraPro> getTotalbypro(Map<String,Object> map);
    List<jiraPro> getRtotalbypro(Map<String,Object> map);
    List<jiraDtype> getRDtypebypro(Map<String,Object> map);
    List<jiraDtype> getRDtypebytopdev(Map<String,Object> map);
    List<jiraDtype> getRDtypebydev(Map<String,Object> map);
    List<jiraUser> getRdevNamelist(String typename);
    List<jiraDtype> getRDprobydevgroup(Map<String,Object> map);
    List<jiraDtype> getRDevbyperiod(Map<String,Object> map);

}