package com.bsx.baishanxing.dao;

import com.bsx.baishanxing.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdminDao {
    public List<Admin> select();
    public Admin selectOne(Admin admin);
    public void insert(Admin admin);
    public void update(Admin admin);
    public void delete(Admin admin);
}
