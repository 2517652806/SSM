package com.tt.ssm.Mapper;

import com.tt.ssm.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    User get_user();
}
