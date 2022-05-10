package Codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/senai2","root","012017Pioneiro.@");
			PreparedStatement pesquisa = conect.prepareStatement("SELECT * FROM usuario");
			ResultSet resultado = pesquisa.executeQuery();
			while(resultado.next()){
				String nome = resultado.getString("nome_usuario");
				String senha = resultado.getString("senha");
				String email = resultado.getString("email");
				System.out.println("Nome: " +nome+ " Senha: " +senha+ " Email: " +email);
			}
					
		}catch(Exception erro) {}

	}

}
