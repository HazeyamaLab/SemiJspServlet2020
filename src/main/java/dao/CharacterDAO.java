package dao;

import model.Character;
import util.DriverAccessor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterDAO extends DriverAccessor {
    private static final String INDEX = "SELECT * FROM characters";
    private static final String CREATE = "INSERT INTO characters (name, special_attack) VALUES (?,?) ";


    public List<Character> findAll(Connection connection){
        try{
            List<Character> list = new ArrayList<>();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(INDEX);
            while(rs.next()){
                Character character = new Character();
                character.setID(rs.getInt("id"));
                character.setName(rs.getString("name"));
                character.setSpecialAttack(rs.getString("special_attack"));
                list.add(character);
            }
            stmt.close();
            rs.close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(Character chr, Connection connection){
        try{
            PreparedStatement pstmt = connection.prepareStatement(CREATE);
            pstmt.setString(1,chr.getName());
            pstmt.setString(2,chr.getSpecialAttack());
            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
