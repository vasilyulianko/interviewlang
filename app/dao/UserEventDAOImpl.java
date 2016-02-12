package dao;

import model.UserEvent;
import play.Logger;
import play.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by vasily on 12/02/2016.
 */
public class UserEventDAOImpl implements UserEventDAO {


    @Override
    public void save(UserEvent userEvent) {
        Logger.info("UserEventDAOImpl.save");
        /*
        try (Connection c = DB.getConnection()) {
            String insert = "insert into  personid, firstname,lastname, address, city from Persons p where p.personid = ?";

            try (PreparedStatement stmt = c.prepareStatement(select)) {
                stmt.setLong(1, id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    person = new Person(
                            rs.getLong("personid"),
                            rs.getString("firstname"),
                            rs.getString("lastname"),
                            rs.getString("address"),
                            rs.getString("city"))
                    ;
                }
            }
        }

        return person;*/


    }
}
