package com.shiro.menu.code;

import com.alibaba.fastjson.JSONObject;
import com.shiro.menu.bean.MenuBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test
{

    public static void main(String[] args) {
        String menus="[{'id':1,'name':'用户管理'},{'id':2,'name':'删除用户',pid:1},{'id':3,'name':'添加用户',pid:1},{'id':4,'name':'修改用户','pid':3},{'id':5,'name':'修改用户','pid':4},{'id':6,'name':'修改用户','pid':5}]";
        List<MenuBean> list = JSONObject.parseArray(menus, MenuBean.class);
        List<Object> objects = new ArrayList<>();
        for (MenuBean menuBean : list) {
            if(menuBean.getPid()!=null){
                continue;
            }
            Integer id = menuBean.getId();
            List<MenuBean> chid = new ArrayList<>();
            getChid(id,list,chid);
            menuBean.setChid(chid);
            objects.add(menuBean);
        }
        System.out.println(JSONObject.toJSONString(objects));
        Array<MenuBean> menuBeanArray = new Array<>();

        menuBeanArray.get();
        menuBeanArray.remove();
        menuBeanArray.insert();
        menuBeanArray.add();
        menuBeanArray.size();
        menuBeanArray.isNull();

    }

    private static void getChid(Integer id,List<MenuBean> list,List<MenuBean> chid){
        for (MenuBean bean : list) {
            if(id.equals(bean.getPid())){
                System.out.println(JSONObject.toJSONString(bean));

                chid.add(bean);
                for (MenuBean menuBean : chid) {
                    List<MenuBean> objects = new ArrayList<>();
                    getChid(menuBean.getId(),list,objects);
                    if(!objects.isEmpty()){
                        menuBean.setChid(objects);
                    }else {
                        continue;
                    }
                }
            }
        }
        return;
    }



}
class Array<T>{
    private Object[] data = new Object[16];
    /*
    * 扩容
    * */
    private int kuorong(){

    }
    public T get(Integer index){
    return null;
    }
    /**
     * 成功返回0
     * 失败返回-1
     *
     *
     */
    public int remove(Integer index){
        return -1;
    }
    /**
     * 成功返回0
     * 失败返回-1
     * @deprecated 添加对象
     *
     */
    public int add(T object){
    return -1;
    }
    /***
     * 插入对象
     *成功返回0
     * 失败返回-1
     *
     */
    public int insert(T object,Integer insertIndex){
        return -1;
    }

    public int update(T object,Integer updateIndex){
        return -1;
    }
    /*
    *
    * 获取大小
    * */
    public int size(){


    }

    /*
    * 判断是否为空
    *
    * */
    public int isNull(){

    }



}