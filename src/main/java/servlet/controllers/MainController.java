/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

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
        String btnGet = request.getParameter("btnSubmit");
        String url = "ctlError";
        
        switch (btnGet) {
            case "Login":
                url = "ctlLogin";
                break;
            case "Update":
                url = "ctlUpdate";
                break;
            case "Register":
                url = "ctlRegist";
                break;
            case "Verify":
                url = "ctlVerify";
                break;
            case "Recovery":
                url = "ctlRecovery";
                break;
            case "ChangePassword":
                url = "ctlChangePassword";
                break;
            case "Design":
                url = "ctlDesign";
                break;
            case "Increment": case "Decrement":
                url = "ctlModify";
                break;
            case "checkout":
                url = "checkout.jsp";
                break;
            case "RequestOrder":
                url = "ctlOrder";
                break;
            case "OrderStatus":
                url = "ctlOrderStatus";
                break;
            case "Feedback":
                url = "ctlFeedback";
                break;
            case "Cancel":
                url = "ctlOrderCancel";
                break;
            case "Logout":
                request.getSession().setAttribute("UserAccount", null);
                url = "home.jsp";
                break;
        }
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
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
