package mainApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IAlmacenDAO;
import mainApp.dto.Almacen;

/**
 * 
 * @author dimobo
 *
 */

@Service
public class AlmacenServiceImpl implements IAlmacenService {
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen almacenID(int id) {
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen crearAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		iAlmacenDAO.deleteById(id);
	}

}
