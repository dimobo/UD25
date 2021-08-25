package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Caja;


/**
 * 
 * @author dimobo
 *
 */
public interface ICajaDAO extends JpaRepository<Caja, String>{

}
