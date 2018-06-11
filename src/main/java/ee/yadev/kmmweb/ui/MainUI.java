package ee.yadev.kmmweb.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import ee.yadev.kmmweb.ui.elements.AccountList;
import ee.yadev.kmmweb.ui.payee.PayeeList;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class MainUI extends UI {
    private VerticalLayout mainLayout;

    @Autowired
    private AccountList accountList;

    @Autowired
    private PayeeList payeeList;

    @Override
    protected void init(VaadinRequest request) {
        setupLayout();
        addHeader();
        addBody();
    }

    private void setupLayout() {
        mainLayout = new VerticalLayout();
        setContent(mainLayout);
    }

    private void addHeader() {
        Label mainLabel = new Label("AppOne");
        mainLabel.setStyleName(ValoTheme.LABEL_H1);
        mainLabel.setSizeUndefined();
        mainLayout.addComponent(mainLabel);
    }

    private void addBody() {
        Label accountLabel = new Label("Accounts");
        accountLabel.setStyleName(ValoTheme.LABEL_H3);

        Label payeeLabel = new Label("Payees");
        payeeLabel.setStyleName(ValoTheme.LABEL_H3);

        mainLayout.addComponents(payeeLabel, payeeList);
    }

}
