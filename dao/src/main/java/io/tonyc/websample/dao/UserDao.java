package io.tonyc.websample.dao;

import io.tonyc.web.common.persistence.CrudDao;
import io.tonyc.websample.domain.User;

/**
 * Created by Tony on 2015/12/10.
 */
public interface UserDao extends CrudDao<Integer, User> {

}
