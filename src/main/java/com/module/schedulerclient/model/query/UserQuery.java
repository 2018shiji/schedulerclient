package com.module.schedulerclient.model.query;

import com.module.schedulerclient.model.vo.PageVO;
import lombok.Data;

/**
 * @author zxq
 * @date 2020/3/25 16:10
 **/
@Data
public class UserQuery extends PageVO {

    /**
     * 用户名
     */
    private String username;

}
