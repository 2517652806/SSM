package com.tt.ssm.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class User {
    private String userName;
    private String password;
    private String email;
}
