package com.itheima.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itheima.anno.State;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.groups.Default;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;

@Data
public class Article {

    @NotNull(groups = Update.class)
    private Integer id;

    //文章标题
    @NotEmpty
    @Pattern(regexp = "^\\S{1,10}$")
    private String title;

    //文章内容
//    @NotEmpty(groups = {Add.class, Update.class})
    @NotEmpty
    private String content;

    //文章封面
    @NotEmpty
    @URL
    private String coverImg;

    //文章状态：只能是【已发布】或者【草稿】
    @State
    private String state;

    //文章分类ID
    @NotNull
    private Integer categoryId;

    //创建人ID
    private Integer createUser;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    public interface Add extends Default {

    }

    public interface Update extends Default{

    }
}
