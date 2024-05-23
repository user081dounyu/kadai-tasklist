package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Tasks;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/new")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());

//        EntityManager em = DBUtil.createEntityManager();
//        em.getTransaction().begin();
//
//        //Tasksのインスタンスを生成
//        Tasks m = new Tasks();
//
//        String content = "Hello World!";
//        m.setContent(content);
//
//        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
//        m.setCreated_at(currentTime);
//        m.setUpdated_at(currentTime);
//
//        //データベースに保存
//        em.persist(m);
//        em.getTransaction().commit();
//
//        //自動採番されたIDを表示
//        response.getWriter().append(Integer.valueOf(m.getId()).toString());
//
//        em.close();
        request.setAttribute("_token", request.getSession().getId());
        request.setAttribute("tasks", new Tasks());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/messages/new.jsp");
        rd.forward(request, response);
    }
}
