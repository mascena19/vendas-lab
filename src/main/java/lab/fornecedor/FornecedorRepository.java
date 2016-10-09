package lab.fornecedor;


import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import lab.fornecedor.Fornecedor;


public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer> {
	public Iterable<Fornecedor> findByDataGreaterThan(Date data);
	public Fornecedor findOneByCodigo(Integer codigo);

}
