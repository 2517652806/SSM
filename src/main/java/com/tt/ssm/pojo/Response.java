package com.tt.ssm.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    public String code ;
    public String msg ;
    public Object data ;


    public Response(String msg, Object data, String code) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
