package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexaojdbc.SingleConnection;
import model.Userpostegres;

public class UserPostegresDAO {
	
	private Connection connection; //Variável que recebe a conexão.
	
	public UserPostegresDAO() {//Construtor que cria a conexão.
		connection = SingleConnection.getConection(); //Conexão instâciada.
	}
	
	public void salvar(Userpostegres obj) { // Vai salvar um registro recebendo um obj por parâmetro.
		try {
		String sql = "INSERT INTO userpostegres (id, nome, email) VALUES(?,?,?)"; // String que representa o SQL.
		PreparedStatement insert = connection.prepareStatement(sql); //Prepara a instrução que antes é uma String.
		insert.setLong(1, obj.getId());
		insert.setString(2, obj.getNome());
		insert.setString(3, obj.getEmail());
		insert.execute();
		
		connection.commit(); //Salva no banco de dados.
		
		}catch(Exception e) {
			
			try {
				connection.rollback();//Se algo der errado ele execulta um rollback que desfaz a operação de commit.
			
			}catch(Exception ex){
				
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
}
