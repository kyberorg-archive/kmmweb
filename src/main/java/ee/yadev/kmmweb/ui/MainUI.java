package ee.yadev.kmmweb.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
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
        addForm();
        addBody();
    }

    private void setupLayout() {
        mainLayout = new VerticalLayout();
        mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(mainLayout);
    }

    private void addHeader() {
        Label mainLabel = new Label("AppOne");
        mainLabel.setStyleName(ValoTheme.LABEL_H1);
        mainLabel.setSizeUndefined();
        mainLayout.addComponent(mainLabel);
    }

    private void addForm() {
        HorizontalLayout form = new HorizontalLayout();
        form.setSpacing(true);
        form.setWidth("80%");

        TextField payeeInput = new TextField("New payee");
        payeeInput.setWidth("100%");

        Button addPayeeButton = new Button();
        addPayeeButton.setIcon(VaadinIcons.PLUS_CIRCLE);
        addPayeeButton.addStyleName(ValoTheme.BUTTON_PRIMARY);

        form.addComponents(payeeInput, addPayeeButton);
        form.setExpandRatio(payeeInput, 1);

        mainLayout.addComponent(form);
    }

    private void addBody() {
        Label accountLabel = new Label("Accounts");
        accountLabel.setStyleName(ValoTheme.LABEL_H3);

        Label payeeLabel = new Label("Payees");
        payeeLabel.setStyleName(ValoTheme.LABEL_H3);

        payeeList.setWidth("80%");

        mainLayout.addComponents(payeeLabel, payeeList);
    }

}
