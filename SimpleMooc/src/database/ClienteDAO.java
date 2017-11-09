package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.UsuarioBeans;

public class ClienteDAO {
	private Connection conex = DataBaseConex.getInstance();
	
	public ClienteDAO () {
		//nada
	}
	
	public void CadastraCliente(UsuarioBeans user) {
		String sql = "INSERT INTO usuario (NOME, EMAIL, SENHA, SEXO) values (?,?,?,?)";
		
		try {
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setString(1, user.getNome());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getSenha());
			statement.setString(4, user.getSexo());
			
			statement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
