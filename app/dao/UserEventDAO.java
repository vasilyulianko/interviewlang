package dao;

import com.google.inject.ImplementedBy;
import model.UserEvent;

/**
 * Created by vasily on 12/02/2016.
 */
@ImplementedBy(UserEventDAOImpl.class)
public interface UserEventDAO {

    public void save(UserEvent userEvent);
}
