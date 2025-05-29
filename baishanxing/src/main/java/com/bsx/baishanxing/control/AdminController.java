package com.bsx.baishanxing.control;

import com.bsx.baishanxing.pojo.Admin;
import com.bsx.baishanxing.service.AdminService;
import com.bsx.baishanxing.utills.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/list")
    public Result getAdminList() { // 修改返回类型为 Result
        List<Admin> admins = adminService.query();
        if (admins != null) {
            return Result.success(admins);
        } else {
            return Result.fail(500, "拉取失败");
        }
    }
    @PostMapping("/admin/login")
    public Result loginAction(@RequestBody Admin admin){
        boolean result = adminService.login(admin);
        if (result) {
            return Result.success("登录成功");
        }
        return Result.fail(500,"登录失败");

    }

    @PostMapping("/admin/add")
    public Result addAdmin(@RequestBody Admin admin){
        try{
            adminService.add(admin);
            return Result.success("新增成功");
        }catch (Exception e){
            return Result.fail(500,e.toString());
        }
    }
    @PostMapping("/admin/edite")
    public Result editeAdmin(@RequestBody Admin admin){
        try{
            adminService.edite(admin);
            return Result.success("新增成功");
        }catch (Exception e){
            return Result.fail(500,e.toString());
        }
    }
    @PostMapping("/admin/remove")
    public Result removeAdmin(@RequestBody Admin admin){
        try{
            adminService.remove(admin);
            return Result.success("新增成功");
        }catch (Exception e){
            return Result.fail(500,e.toString());
        }
    }
}