package service;


import dao.UserEventDAO;
import model.UserEvent;
import play.Logger;

import javax.inject.Inject;

/**
 * Created by vasily on 12/02/2016.
 */
public class EventServiceImpl implements EventService {

    @Inject
    UserEventDAO userEventDAO;

    public void saveUserEvent(UserEvent event) {
        Logger.info("EventServiceImpl");

        userEventDAO.save(event);

    }
}
