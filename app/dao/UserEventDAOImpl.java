package dao;

import model.UserEvent;
import play.Logger;
import play.db.DB;

import java.sql.*;

/**
 * Created by vasily on 12/02/2016.
 */
public class UserEventDAOImpl implements UserEventDAO {


    @Override
    public int save(UserEvent userEvent) throws SQLException {
        int result = 0;
        Logger.info("UserEventDAOImpl.save");

        try (Connection c = DB.getConnection()) {
            String insert = "INSERT INTO auditservice.event (" +
                    "event_time," +
                    "school," +
                    "user," +
                    "user_role," +
                    "affected_user," +
                    "component," +
                    "feature," +
                    "subfeature," +
                    "action," +
                    "quanity," +
                    "payload) values (?,?,?,?,?,?,?,?,?,?,?)";

            try (PreparedStatement stmt = c.prepareStatement(insert)) {
                int i = 1;
                Timestamp time = new Timestamp(userEvent.getEventTime().getTime());
                stmt.setTimestamp(i++, time);
                stmt.setString(i++, userEvent.getSchool());
                stmt.setLong(i++, userEvent.getUser());
                stmt.setString(i++, userEvent.getUserRole());
                stmt.setLong(i++, userEvent.getAffectedUser());
                stmt.setString(i++, userEvent.getComponent());
                stmt.setString(i++, userEvent.getFeature());
                stmt.setString(i++, userEvent.getSubfeature());
                stmt.setString(i++, userEvent.getAction());
                stmt.setBigDecimal(i++, userEvent.getQuantity());
                stmt.setString(i++, userEvent.getPayload());
                stmt.executeUpdate();


            }
        }

        return result;


    }
}
