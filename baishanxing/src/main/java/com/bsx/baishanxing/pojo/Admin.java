package com.bsx.baishanxing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private Integer id;

    private String account;

    private String password;

    private String nickname;

    private String tel;

    private String email;

    private Integer del;
}
