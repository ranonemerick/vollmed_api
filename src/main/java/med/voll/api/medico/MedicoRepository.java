package med.voll.api.medico;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.channels.FileChannel;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
