package cn.tangue.templateenginee.service;

import cn.tangue.templateenginee.exception.CustomException;
import cn.tangue.templateenginee.exception.CustomExceptionType;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class ExceptionService {
    //业务层模拟排除系统异常
    public void systemBizError() {
        try {
            Class.forName("com.mysql.jdbc.XXX.Driver");
        } catch (ClassNotFoundException e) {
            throw new CustomException(
                    CustomExceptionType.SYSTEM_ERROR,
                    "在XXX业务里，systemBizError方法内，出现ClassNotFoundException异常，请告知管理员"
            );
        }
    }

    //用户输入校验
    public void userBizError(int input) {
        //自定义
        /*if (input < 0) {
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                    "你输入的数据不符合业务逻辑,请重新输入");
        }*/
        //Assert
        Assert.isTrue(input >= 0, "你输入的数值不符合业务逻辑，请重新输入");
    }
}
