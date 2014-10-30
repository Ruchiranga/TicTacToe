/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.DBConnection;
import connection.DBHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ruchiranga
 */
public class PlayerController {

    public static int addPlayer(String name1, String name2, int x) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnectionToDB();
        if (x == 1) {
            String query1 = "Insert into player Values('" + name1 + "')";
            int res = DBHandler.setData(con, query1);

            String query2 = "Insert into singleplayerscore (PlayerName,Wins,Loses,Ties) Values ('" + name1 + "','0','0','0')";
            res += DBHandler.setData(con, query2);

            return res;
        }else if(x == 2){
            int res = 0;
            try{
                System.out.println("Came");
                String query3 = "Insert into twoplayerscore (Player1,Player2,Player1_score,Player2_score,ties) Values ('" + name1 + "','"+name2+"','0','0','0')";
                res = DBHandler.setData(con, query3);
                System.out.println("res = "+res);
            }catch(SQLException e){
                
            }
            return res;
        }else{
            return -1;
        }

    }

    public static String[] getPlayers() throws ClassNotFoundException, SQLException {
        String query = "Select Playername from player";
        Connection con = DBConnection.getConnectionToDB();
        ResultSet rst = DBHandler.getData(con, query);
        int count = 0;
        while (rst.next()) {
            count++;
        }
        rst.beforeFirst();
        String[] names = new String[count];

        for (int i = 0; rst.next(); i++) {
            names[i] = rst.getString("PlayerName");
        }

        return names;
    }

}
