/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import br.jovani.mercaria.sessao.SessaoHibernate;
import br.jovani.mercaria.sessao.entidades.cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luizcanf
 */
public class Cadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("RECEBENDO O USUARIO DO FORM HTML");
        cliente user = new cliente();
        user.setNm_nome(request.getParameter("nm_nome"));
        user.setDt_nascimento(request.getParameter("dt_nascimento"));
        user.setNr_telefone(request.getParameter("nr_telefone"));
        user.setNr_cpf(request.getParameter("nr_cpf"));
        user.setNr_rg(request.getParameter("nr_rg"));
        user.setDs_senha(request.getParameter("ds_senha"));
        user.setDs_email(request.getParameter("ds_email"));
        user.setEndereco(request.getParameter("endereco"));
        
        
        try {
        System.out.println("SALVANDO USUARIO");
        Session sessao = SessaoHibernate.nova();
        Transaction tx = sessao.beginTransaction();
        sessao.save(user);
        tx.commit();
        sessao.close();
        System.out.println("USUARIO SALVO");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("erro.html");
        }
        // redirecionar p outra página
        response.sendRedirect("pglogin.html");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}