package service;

import dao.CharacterDAO;
import model.Character;

import java.sql.Connection;
import java.util.List;

public class CharacterService {

    private Connection connection = null;

    private void createConnection(CharacterDAO dao){
        this.connection = dao.createConnection();
    }

    private void closeConnection(CharacterDAO dao){
        dao.closeConnection(this.connection);
        this.connection = null;
    }

    public List<Character> findAll(){
        CharacterDAO dao = new CharacterDAO();
        createConnection(dao);
        List<Character> list = dao.findAll(this.connection);
        closeConnection(dao);
        return list;
    }

    public void create(Character chr){
        CharacterDAO dao = new CharacterDAO();
        createConnection(dao);
        dao.create(chr, connection);
        closeConnection(dao);
    }
}
