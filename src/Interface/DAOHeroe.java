/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Datos.heroes;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface DAOHeroe {

    public void registrar(heroes hero) throws Exception;

    public void modificar(heroes hero) throws Exception;

    public void eliminar(heroes hero) throws Exception;

    public List<heroes> listar ()throws Exception;

}
