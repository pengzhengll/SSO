package com.myimooc.sso.util;

import java.io.Serializable;

import lombok.Data;
/**
 * 消息响应对象
 * @version V1.0
 */
@Data
public class RespMessage implements Serializable{
    
    private static final long serialVersionUID = 1L;
    /** 响应编号 */
    private String respCode;
    /** 响应消息 */
    private String respMsg;
}
