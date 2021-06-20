package cn.com.sky.advice;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE,ElementType.METHOD })
@Documented
public @interface DesensitizeSupport {
}