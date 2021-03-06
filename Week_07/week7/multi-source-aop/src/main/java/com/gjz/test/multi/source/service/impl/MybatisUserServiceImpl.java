package com.gjz.test.multi.source.service.impl;

import com.gjz.test.multi.source.entity.User;
import com.gjz.test.multi.source.mapper.UserMapper;
import com.gjz.test.multi.source.service.MybatisUserService;
import com.gjz.test.multi.source.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * <pre>
 * MybatisUserServiceImpl
 * </pre>
 *
 * @author guojz
 * @version 1.00.00
 * @createDate 2020/12/6 下午11:41
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@Service
public class MybatisUserServiceImpl implements MybatisUserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 添加
     *
     * @param user
     */
    @Override
    public void create(User user) {
        userMapper.createUser(user);
    }


    /**
     * 查找
     *
     * @param userId
     * @return
     */
    @Override
    public User get(Long userId) {
        return userMapper.getUser(userId);
    }

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<User> list() {
        return userMapper.listUser();
    }
}

