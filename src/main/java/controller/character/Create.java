package controller.character;

import model.Character;
import service.CharacterService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/characters/create")
public class Create extends HttpServlet {

    //おまじない
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/characters/create.jsp");
        dispatcher.forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("post");
        Character chr = new Character();
        chr.setName(request.getParameter("name"));
        chr.setSpecialAttack(request.getParameter("special_attack"));
        CharacterService service = new CharacterService();
        service.create(chr);
        response.sendRedirect("/SemiJspServlet2020/characters");
    }
}
