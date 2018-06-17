package ee.yadev.yamt.ui.elements.layout;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import ee.yadev.yamt.model.Account;

public class AccountLayout extends HorizontalLayout {
    public AccountLayout(Account account) {
        setSpacing(true);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        Label acc = new Label(account.getAccountName());

        addComponent(acc);

    }
}
