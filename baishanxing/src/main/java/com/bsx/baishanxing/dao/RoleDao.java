package com.bsx.baishanxing.dao;

import com.bsx.baishanxing.pojo.Admin;
import com.bsx.baishanxing.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleDao {
    public List<Role> select();
    public Role selectOne(Role role);
    public void insert(Role role);
    public void update(Role role);
    public void delete(Role role);
}