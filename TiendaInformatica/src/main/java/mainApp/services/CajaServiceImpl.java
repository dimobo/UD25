package mainApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICajaDAO;
import mainApp.dto.Caja;

/**
 * 
 * @author dimobo
 *
 */

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		return iCajaDAO.findAll();
	}

	@Override
	public Caja cajaID(String numReferencia) {
		return iCajaDAO.findById(numReferencia).get();
	}

	@Override
	public Caja crearCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numReferencia) {
		iCajaDAO.deleteById(numReferencia);
	}

}
