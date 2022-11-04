/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Minh Nhat
 */
public abstract class DAL extends DatabaseManager {

    public DAL() {
        super();
    }

    public void Create(Object o) {
        
    }

    public void Read(String para) throws SQLException {
        String sql = "SELECT * FROM ?";
        PreparedStatement ps = this.getConnection().prepareStatement(sql);
        ps.setString(1, para);
        ResultSet rs = this.ExecuteQuery();
        
    }

    public void Update() {
    }

    public void Delete() {
    }

}
