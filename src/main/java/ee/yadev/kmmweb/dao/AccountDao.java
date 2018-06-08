package ee.yadev.kmmweb.dao;

import ee.yadev.kmmweb.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao extends JpaRepository<Account, String> {
}
