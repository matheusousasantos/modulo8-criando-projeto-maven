package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import dao.UserPostegresDAO;
import model.Userpostegres;

public class TesteBancoJdbc {
	
	@Test //Anotação d teste
	public void initBanco() { //Inicializa o banco.
		
		UserPostegresDAO userPostegresDAO = new UserPostegresDAO(); //Criando um dao junto com a conexão
		Userpostegres userPostegres = new Userpostegres(); //Criando um novo obj
		
		userPostegres.setId(6L);
		userPostegres.setNome("Sandra");
		userPostegres.setEmail("sandra@gmail.com");
		
		userPostegresDAO.salvar(userPostegres);
		
	}

}
