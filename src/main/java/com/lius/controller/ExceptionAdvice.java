package com.lius.controller;

import com.lius.common.Result;
import com.lius.common.Utils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class ExceptionAdvice {

    /**
     * java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'admin@admin.com' for key 'user_email'
     * <p>
     * 表中字段约束为unique,因为往数据库中写入数据不唯一,所以报错
     * <p>
     *
     * @return 该方法返回的错误信息，关键的是需要返回哪个字段不唯一。如下代码
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public Result<Object> doSQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException exception) {
        String message = exception.getMessage();

        if (!message.contains("key")) {
            return new Result<>(false, exception.getMessage());
        } else {
            // 获取到致使报错的column
            String key = message.substring(message.indexOf("key") + 3).trim();
            // 判断是否有_,如果没有就直接返回key,如果有就将字段变为驼峰命名法的字段表示
            return new Result<Object>(false, exception.getMessage(), Utils.mapUnderscoreToCamelCase(key));
        }
    }
}
