package service;

import com.google.inject.ImplementedBy;
import model.UserEvent;

/**
 * Created by vasily on 12/02/2016.
 */
@ImplementedBy(EventServiceImpl.class)
public interface EventService {

    public void save(UserEvent userEvent);
}
