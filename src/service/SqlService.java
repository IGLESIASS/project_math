package service;

import java.sql.SQLException;

public interface SqlService {

    void processSqlQuery(String SqlQuery) throws SQLException;

}
