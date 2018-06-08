package ee.yadev.kmmweb.ui;

import com.vaadin.ui.VerticalLayout;
import ee.yadev.kmmweb.dao.AccountDao;
import ee.yadev.kmmweb.model.Account;
import ee.yadev.kmmweb.ui.layout.AccountLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class AccountList extends VerticalLayout {

    @Autowired
    AccountDao accountDao;

    @PostConstruct
    void init() {
        setSpacing(true);
        setAccounts(accountDao.findAll());
    }

    private void setAccounts(List<Account> all) {
        removeAllComponents();
        all.forEach(account -> {
            addComponent(new AccountLayout(account));
        });
    }
}
