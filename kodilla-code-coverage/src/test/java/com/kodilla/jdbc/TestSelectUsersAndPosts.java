package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class TestSelectUsersAndPosts {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(P.BODY) AS POST_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "HAVING COUNT(P.BODY) >= 2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println("User with two comments" + " " +
                    rs.getString("FIRSTNAME") + ", " +
                            rs.getString("LASTNAME")
            + " , " + rs.getString("POST_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(1, counter);
    }
}