package ee.yadev.yamt.dao;


import ee.yadev.yamt.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao extends JpaRepository<Account, String> {
}
