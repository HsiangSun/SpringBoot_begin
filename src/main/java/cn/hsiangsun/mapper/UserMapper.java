package cn.hsiangsun.mapper;

import cn.hsiangsun.pojo.User;
import tk.mybatis.mapper.common.Mapper;


//@Mapper 不推荐使用 因为多了就很麻烦
public interface UserMapper extends Mapper<User> {
}
