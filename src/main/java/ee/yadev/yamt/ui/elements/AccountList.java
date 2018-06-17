package ee.yadev.yamt.ui.elements;

import com.vaadin.ui.VerticalLayout;
import ee.yadev.yamt.dao.AccountDao;
import ee.yadev.yamt.model.Account;
import ee.yadev.yamt.ui.elements.layout.AccountLayout;
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
        all.forEach(account -> addComponent(new AccountLayout(account)));
    }
}
