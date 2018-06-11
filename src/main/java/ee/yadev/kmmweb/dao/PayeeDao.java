package ee.yadev.kmmweb.dao;

import ee.yadev.kmmweb.model.Payee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PayeeDao extends JpaRepository<Payee, String> {

}
