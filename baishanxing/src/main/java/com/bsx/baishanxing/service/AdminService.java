package com.bsx.baishanxing.service;

import java.util.List;

import com.bsx.baishanxing.pojo.Admin;

/**
 * 管理员服务接口，定义管理员相关的业务逻辑操作
 * 用于在 Service 层处理与管理员相关的功能，如登录、增删改查等
 */
public interface AdminService {

    /**
     * 查询所有管理员信息
     *
     * @return 返回包含所有管理员对象的列表
     */
    List<Admin> query();

    /**
     * 管理员登录验证
     * 根据传入的 Admin 对象中的账号和密码进行登录校验
     *
     * @param admin 包含账号和密码的 Admin 对象
     * @return 登录成功返回 true，否则返回 false
     */
    boolean login(Admin admin);

    /**
     * 添加新的管理员信息
     *
     * @param admin 要添加的管理员对象，包含账号、密码等信息
     * @throws Exception 添加失败时抛出异常
     */
    void add(Admin admin) throws Exception;

    /**
     * 修改已有管理员的信息
     *
     * @param admin 包含更新数据的管理员对象（通常包含 id）
     * @throws Exception 修改失败时抛出异常
     */
    void edite(Admin admin) throws Exception;

    /**
     * 根据管理员 ID 删除管理员账号（可能是逻辑删除）
     * param "要删除的管理员的唯一标识"
     * @throws Exception 删除失败时抛出异常
     */
    void remove(Admin admin) throws Exception;
}
