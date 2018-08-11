package cn.com.myapp.mapper;

import cn.com.myapp.polo.User;

/**
 * Created by Yangzu on 2018/8/9
 */
public interface UserMapper {

    /**
     *新增用戶
     * @param pid
     * @return
     */
    User selectById(String pid);

    /**
     *新增用戶
     * @param entity
     * @return
     */
    int innserUser(User entity);

    /**
     *新增用戶
     * @param entity
     * @param pid
     * @return
     */
    int updateUser(User entity, String pid);

    /**
     *新增用戶
     * @param pid
     * @return
     */
    int deleteUser(String pid);
}
