package com.itheima.anno;

import com.itheima.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Documented
@Constraint(
        validatedBy = { StateValidation.class } //指定提供校验规则的类
)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface State {

    String message() default "state参数的值只能是已发布或者草稿";
    //指定分组
    Class<?>[] groups() default {};
    //负载  获取到state注解的详细信息
    Class<? extends Payload>[] payload() default {};

}
