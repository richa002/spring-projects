/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

/**
 *
 * @author Acer
 */
@Component
public class SimpleJdbcDaoImpl  extends JdbcDaoSupport{
      public int getCircelCount(){
    String sql="SELECT COUNT(*) FROM CIRCLE";
   // jdbctemplate.setDataSource(getDatasource());
   return this.getJdbcTemplate().queryForObject(sql,Integer.class);
   }
   
}
