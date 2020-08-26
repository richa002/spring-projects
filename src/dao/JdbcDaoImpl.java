/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import model.Circle;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Acer
 */
@Component
public class JdbcDaoImpl {
 @Autowired    
 private DataSource datasource;
// private JdbcTemplate jdbctemplate=new JdbcTemplate();
private JdbcTemplate jdbctemplate;
private NamedParameterJdbcTemplate namedparameterjdbctemplate;


    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }
    public DataSource getDatasource() {
        return datasource;
    }
  @Autowired
    public void setDatasource(DataSource datasource) {
       // this.datasource = datasource;
       this.jdbctemplate=new JdbcTemplate(datasource);
     this.namedparameterjdbctemplate=new NamedParameterJdbcTemplate(datasource);
           
    }

    
    
  /*  public Circle getCircle(int id){
     Connection conn=null;
     //String driver="com.mysql.jdbc.Driver";
    try{
     //Class.forName(driver);
     //conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbctest","root","");
     conn=datasource.getConnection();
     PreparedStatement ps=conn.prepareStatement("select * from circle  where id=?");
     ps.setInt(1,id);
     ResultSet rs=ps.executeQuery();
  
     Circle circle =null;
              if(rs.next()){
                   circle=new Circle(id,rs.getString("name"));
                 }
     rs.close();
     ps.close();
        
   return circle;
    }catch(Exception e){throw new RuntimeException();}  
   finally{
         try {
             conn.close();
              } catch (SQLException ex) {
             Logger.getLogger(JdbcDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
              }
         }
    }
*/
    public int getCircelCount(){
    String sql="SELECT COUNT(*) FROM CIRCLE";
   // jdbctemplate.setDataSource(getDatasource());
   return jdbctemplate.queryForObject(sql,Integer.class);
   }
    
    public String getCircleName(int id){
    String sql="SELECT NAME FROM CIRCLE WHERE ID=?";
    return jdbctemplate.queryForObject(sql,new Object[]{id},String.class);
    } 
    
    public Circle getCircleforId(int id){
    String sql="SELECT * FROM CIRCLE WHERE ID=?";
    return jdbctemplate.queryForObject(sql,new Object[]{id},new MyRowMapper());
    }
     private class MyRowMapper implements RowMapper<Circle>
     {

        @Override
        public Circle mapRow(ResultSet rs, int i) throws SQLException {
        Circle circle=new Circle();
        circle.setId(rs.getInt("id"));
        circle.setName(rs.getString("name"));
        return circle;
        }
     
     }
     
     public List<Circle> getAllCircle(){
     String sql="SELECT * FROM CIRCLE";
    return jdbctemplate.query(sql,new MyRowMapper());
    
     }
  /*  public void insertCircle(Circle circle)
    {
    String sql="INSERT INTO CIRCLE (ID,NAME) VALUES(?,?)";
    jdbctemplate.update(sql,new Object[]{circle.getId(),circle.getName()});
    }
    */
      public void insertCircle(Circle circle)
    {
    String sql="INSERT INTO CIRCLE (ID,NAME) VALUES(:id,:name)";
    SqlParameterSource namedparameters=new MapSqlParameterSource("id",circle.getId()).addValue("name",circle.getName());
    int i=namedparameterjdbctemplate.update(sql, namedparameters);
    
    if(i>0)System.out.println("inserted successfully");else System.out.println("some problem");}
    
      public void createTriangleTable(){
    String sql="CREATE TABLE TRIANGLE(ID INTEGER, NAME VARCHAR(50))";
    jdbctemplate.execute(sql);
    }
     
    }

