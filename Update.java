package Codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/senai2","root","012017Pioneiro.@");
			PreparedStatement atualizar = conect.prepareStatement("UPDATE  usuario SET email = 'victoryuri@gmail.com' WHERE id_user = '7'");
			atualizar.executeUpdate();
		}catch(Exception erro) {}

	}

}
