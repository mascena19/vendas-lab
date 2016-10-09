package lab.fornecedor;

import java.util.Calendar;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FornecedorService {
	
	
	  /**
	   * Quantidade de dias considerados "recentes".
	   */
	  public static final int QTDE_DIAS_RECENTES = 7;

	  @Autowired
	  private FornecedorRepository fornecedorRepository;

	  public Fornecedor registrarFornecedor(Fornecedor fornecedor) {
	    fornecedor.setData(new Date());
	    return fornecedorRepository.save(fornecedor);
	  }

	  public Iterable<Fornecedor> obterFornecedoresRecentes() {
	    Calendar agora = Calendar.getInstance();
	    agora.add(Calendar.DATE, - QTDE_DIAS_RECENTES);
	    return fornecedorRepository.findByDataGreaterThan(agora.getTime());
	  }


	  public Fornecedor obterFornecedor(Integer codigo) {
	    return fornecedorRepository.findOneByCodigo(codigo);
	  }

	  public Iterable<Fornecedor> obterTodos() {
	    return fornecedorRepository.findAll();
	  }

}
