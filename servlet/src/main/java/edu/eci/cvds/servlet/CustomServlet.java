package edu.eci.cvds.servlet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.eci.cvds.servlet.Model.Todo;

@WebServlet(
    urlPatterns = "/customServlet"
)

public class CustomServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try{
            if(optName.isPresent()){
                resp.setStatus(HttpServletResponse.SC_OK);
                String stringId = optName.get();
                int id = Integer.parseInt(stringId);
                Todo todo = Service.getTodo(id);
                ArrayList<Todo> todoList = new ArrayList<Todo>();   
                todoList.add(todo);
                responseWriter.write(Service.todosToHTMLTable(todoList));
            }
        } catch(FileNotFoundException excep){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se ha encontrado el item con ese id");
        } catch(MalformedURLException excep){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno del servidor");
        } catch(NumberFormatException excep){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Formato invalido para el id");
        } catch(Exception excep){
            resp.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            responseWriter.write("Requerimiento Invalido");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try{
            if(optName.isPresent()){
                resp.setStatus(HttpServletResponse.SC_OK);
                String stringId = optName.get();
                int id = Integer.parseInt(stringId);
                Todo todo = Service.getTodo(id);
                ArrayList<Todo> todoList = new ArrayList<Todo>();   
                todoList.add(todo);
                responseWriter.write(Service.todosToHTMLTable(todoList));
            }
        } catch(FileNotFoundException excep){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se ha encontrado el item con ese id");
        } catch(MalformedURLException excep){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno del servidor");
        } catch(NumberFormatException excep){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Formato invalido para el id");
        } catch(Exception excep){
            resp.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            responseWriter.write("Requerimiento Invalido");
        }
    }
}
