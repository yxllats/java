package frank.mapper;

import frank.base.BaseMapper;
import frank.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}