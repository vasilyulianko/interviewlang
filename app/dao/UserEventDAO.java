package dao;

import com.google.inject.ImplementedBy;
import model.UserEvent;

import java.sql.SQLException;

/**
 * Created by vasily on 12/02/2016.
 */
@ImplementedBy(UserEventDAOImpl.class)
public interface UserEventDAO {

    public int save(UserEvent userEvent) throws SQLException;
}
