package cn.hsiangsun.config;

import cn.hsiangsun.intercepter.Myintercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//一定不要忘了加这个
public class MvcConfig implements WebMvcConfigurer {

    //注册拦截器
    @Bean
    public Myintercepter myintercepter(){
        return new Myintercepter();
    }

    //添加拦截器到spring MVC 拦截器链
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myintercepter()).addPathPatterns("/**");
    }
}
