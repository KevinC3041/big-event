package com.itheima.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {

    @NotNull(groups = Update.class)
    private Integer id;

    //分类名称
    @NotEmpty(groups = {Update.class, Add.class})
    private String categoryName;

    //分类别名
    @NotEmpty(groups = {Update.class, Add.class})
    private String categoryAlias;

    //创建人ID
    private Integer createUser;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    //如果说某个校验项没有指定分组，默认属于Default分组
    //分组之间可以继承，A extends B   那么A中拥有B中所有的校验项


    public interface Add {

    }

    public interface Update {

    }

}
