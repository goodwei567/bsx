package com.bsx.baishanxing.service.impl;

import com.bsx.baishanxing.dao.AdminDao;
import com.bsx.baishanxing.pojo.Admin;
import com.bsx.baishanxing.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//定义一个实体实现对应接口中的功能，该类充当服务层类，负责完成服务器内部业务的具体逻辑处理
//@Service修饰Java类，将Java类转换成服务层类
@Service
public class AdminServiceImpl implements AdminService  {
    //导入Admin的数据库映射(mapper)对象
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> query() {
        try {
            return adminDao.select();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean login(Admin admin) {
        try {
            Admin admin1 = adminDao.selectOne(admin);
            return admin1 != null ? true:false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public void add(Admin admin) throws Exception {
        try {
            adminDao.insert(admin);
        }catch (Exception e){
            throw new Exception("添加失败");
        }
    }


    @Override
    public void edite(Admin admin) throws Exception {
        try {
            adminDao.update(admin);
        }catch (Exception e){
            throw new Exception("更新失败");
        }
    }

    @Override
    public void remove(Admin admin) throws Exception {
        try {
            adminDao.delete(admin);
        }catch (Exception e){
            throw new Exception("删除失败");
        }
    }
}