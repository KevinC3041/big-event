package com.itheima.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class User {

    private Integer id;

    //用户名
    private String username;

    //密码
    @JsonIgnore //让springmvc把当前对象转换成json字符串的时候，忽略password，最终的json字符串中就没有password这个属性了
    private String password;

    //昵称
    private String nickname;

    //邮箱
    private String email;

    //头像
    private String user_pic;

    //创建时间
    private LocalDateTime createTime;

    //修改时间
    private LocalDateTime updateTime;

}
