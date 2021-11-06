package scu.debate.service.user;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class CookieService {
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    private final String COOKIE_NAME = "token";

    public Cookie getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        Cookie token = null;
        if (null != cookies && cookies.length > 0){
            for (Cookie cookie : cookies) {
                if (COOKIE_NAME.equals(cookie.getName())) {
                    token = cookie;
                    break;
                }
            }
        }
        return token;
    }
    public String checkState(HttpServletRequest request) {
        Cookie token = getCookie(request);
        if (null != token) {
            String user = redisTemplate.opsForValue().get(token.getValue());
            if (null != user) {
                return "user already login";
            }
        }
        return "user is not login!";
    }
    public void addUser(String account, HttpServletResponse response) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        response.addCookie(new Cookie(COOKIE_NAME,uuid));
        int timeout = (int) (10 + 5 * Math.random());
        redisTemplate.opsForValue().set(uuid, account, timeout, TimeUnit.MINUTES);
    }

    public void userLogout(HttpServletRequest request) {
        Cookie cookie = getCookie(request);
        if (null == cookie) {
            return ;
        }
        redisTemplate.delete(cookie.getValue());
    }
}