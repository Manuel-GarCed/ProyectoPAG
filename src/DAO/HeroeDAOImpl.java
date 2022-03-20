/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.heroes;
import Interface.DAOHeroe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class HeroeDAOImpl extends Conexion implements DAOHeroe {

    @Override
    public void guardar(heroes hero) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO heores(id, nombre, alterego, primera_publicacion, personajes, imagen) VALUES(?,?,?,?,?,?)");
            st.setString(1, hero.getId());
            st.setString(2, hero.getNombre());
            st.setString(3, hero.getAlterEgo());
            st.setString(4, hero.getPrimera_publicacion());
            st.setString(5, hero.getPersonajes());
            st.setBytes(6, hero.getImagen());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }

    }

    @Override
    public void modificar(heroes hero) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE heroes set id = ?, alterego=?, primera_publicacion=?, personaje= ? where nombre = ? ");
            st.setString(1, hero.getId());
            st.setString(2, hero.getNombre());
            st.setString(3, hero.getAlterEgo());
            st.setString(4, hero.getPrimera_publicacion());
            st.setString(5, hero.getPersonajes());
            st.setBytes(6, hero.getImagen());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void eliminar(heroes hero) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE from heroes where nombre = ? ");
            st.setString(1, hero.getId());
            st.setString(2, hero.getNombre());
            st.setString(3, hero.getAlterEgo());
            st.setString(4, hero.getPrimera_publicacion());
            st.setString(5, hero.getPersonajes());
            st.setBytes(6, hero.getImagen());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public  ArrayList CargarImagenes() throws Exception {
        
        ArrayList imagenes= new ArrayList();
         try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("Select * from heroes");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                heroes hero = new heroes();
                hero.setId(rs.getString("id"));
                hero.setNombre(rs.getString("nombre"));
                hero.setAlterEgo(rs.getString("alterego"));
                hero.setPrimera_publicacion(rs.getString("primera_publicacion"));
                hero.setPersonajes(rs.getString("personajes"));
                hero.setImagen(rs.getBytes("imagen"));
                imagenes.add(hero);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
      
         }
        return imagenes;
    }

    @Override
    public void consultar(heroes hero) throws Exception {
          try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * from heroes WHERE nombre= ?");
            st.setString(1, hero.getId());
            st.setString(2, hero.getNombre());
            st.setString(3, hero.getAlterEgo());
            st.setString(4, hero.getPrimera_publicacion());
            st.setString(5, hero.getPersonajes());
            st.setBytes(6, hero.getImagen());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }


    }

  
}
