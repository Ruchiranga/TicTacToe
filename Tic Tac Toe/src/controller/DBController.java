/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import connection.DBConnection;
import connection.DBHandler;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ruchiranga
 */
public class DBController {
    public static int addPlayer(String name) throws ClassNotFoundException, SQLException{
        String query = "Insert into player Values('"+name+"')";
        Connection con = DBConnection.getConnectionToDB();
        return DBHandler.setData(con, query);
    }

    public static String[] getPlayers() throws ClassNotFoundException, SQLException {
        String query = "Select Playername from player";
        Connection con = DBConnection.getConnectionToDB();
        ResultSet rst =  DBHandler.getData(con, query);
        int count = 0;
        while(rst.next()){
            count++;
        }
        rst.beforeFirst();
        String[] names =new String[count];
        
        for (int i = 0; rst.next(); i++){
            names[i]= rst.getString("PlayerName");
        }
        
        return names;
    }

    public static int getSPUserWinCount(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getSPComWinCount(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
