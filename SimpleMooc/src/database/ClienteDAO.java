package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<UsuarioBeans> SelectUsuarios(){
		ArrayList<UsuarioBeans> usuarios = new ArrayList<>();
		
		String sql = "SELECT * FROM usuario";
		
		try {
			Statement st = conex.createStatement();
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				UsuarioBeans user = new UsuarioBeans();
				user.setNome(res.getString(1));
				user.setEmail(res.getString(2));
				user.setSenha(res.getString(3));
				user.setSexo(res.getString(4));
				
				usuarios.add(user);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
		
	}
	
}
