package dao;

import java.sql.Connection;

import conexaojdbc.SingleConnection;

public class UserPostegresDAO {
	
	private Connection connection; //Variável que recebe a conexão.
	
	public UserPostegresDAO() {//Construtor que cria a conexão.
		connection = SingleConnection.getConection(); //Conexão instâciada.
	}
	
}
