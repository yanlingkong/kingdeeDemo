package com.kingdee.model;

import lombok.Data;

/**
 * User: liuc
 * Date: 2017/6/14
 * Time: 11:07
 */
@Data//用户实体
public class AppUser {
    private String fullname;
    private String username;
    private String title;
    private Long userId;
    private String mobile;
    private String email;
}
