package io.github.fairyspace.test.bean;

import io.github.fairyspace.beans.factory.annotation.Autowired;
import io.github.fairyspace.beans.factory.annotation.Value;
import io.github.fairyspace.stereotype.Component;

import java.util.Random;

@Component("userService")
public class UserService implements IUserService{

    @Value("${token}")
    private String token;

    @Autowired
    private UserDao userDao;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //String s = userDao.queryUserName("10001")+"飞翔的鸭子，100001，广州"+token;
        String s = "飞翔的鸭子，100001，广州"+token;
        return s;
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserService#token = { " + token + " }";
    }
}
