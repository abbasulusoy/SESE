package tuwien.at.sese.hotelreservation.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" Unable to load driver. ");
        }
        String url = "jdbc:mysql://db4free.net:3306/hotel2018xp1";
        String username = "hotel2018xp1";
        String password = "hotel2018xp1";
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(" Connection Established. ");
        } catch (SQLException e) {
            System.out.println(" Error connecting to database:  " + e);
        }
		SpringApplication.run(HotelApplication.class, args);
	}
}