package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginManager {
    public boolean authenticateLogin(Connection conn, String username, String password) {
        try {
            // Query untuk mencari data dari tabel akun
            String query = "SELECT * FROM akun WHERE username = ? AND password = ?";
            
            // Persiapan statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Eksekusi query
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true; // Jika data ditemukan
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Jika tidak ditemukan
    }
}

