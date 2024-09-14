package utils;

import db.DB;
import db.DBException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DBAcesso {

    public void Consulta(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from departamento");

            while (rs.next()){
                System.out.printf("%d,%s\n",rs.getInt("Id"),rs.getString("Nome"));
            }

        }catch (SQLException e){
            throw new DBException(e.getMessage());

        } finally {
                    DB.closeResult(rs);
                    DB.closeStatement(st);
                    DB.closeConnection();
        }

    }
    //retornar ID,nome,SAlario e o departamento tem que ser igual a 3
    public void consultaVendedor(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from vendedor where departamentoid=3");

            while (rs.next()){
                System.out.printf("%d,%s,%.0f,%d\n",rs.getInt("Id"),rs.getString("Nome"),rs.getDouble("SalarioBase"),rs.getInt("DepartamentoId"));
            }

        }catch (SQLException e){
            throw new DBException(e.getMessage());

        } finally {
            DB.closeResult(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }

    public void InserirDados(){
        Connection conn = null;
        //PreparedStatement é usado para inserir dados
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement(
                    "insert into vendedor "+
                            "(Nome, Email, Aniversario, SalarioBase, DepartamentoId) values" +
                            "(?,?,?,?,?)");

            ps.setString(1,"Felipe Carrasco");
            ps.setString(2,"felipincarras@yahoo.com");
            ps.setDate(3,new java.sql.Date(sdf.parse("18/08/1995").getTime()));
            ps.setDouble(4,14875);
            ps.setInt(5,3);
            ps.executeUpdate();
        } catch (SQLException | ParseException e){
            throw  new DBException(e.getMessage());
        }finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
