package FinanFilmsAdmin.Repositorios;

import FinanFilmsAdmin.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioMovimientoDinero extends JpaRepository<MovimientoDinero,Long> {
}
