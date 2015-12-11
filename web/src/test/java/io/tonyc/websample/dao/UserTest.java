package io.tonyc.websample.dao;

import io.tonyc.websample.BaseTest;
import io.tonyc.websample.domain.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Tony on 2015/12/10.
 */
public class UserTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void testId() {
        User user = userDao.findById(1);

        logger.info(user.toString());
    }

}
