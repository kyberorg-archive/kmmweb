package ee.yadev.kmmweb.ui.payee;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import ee.yadev.kmmweb.model.Payee;

/**
 * Displays information about payee
 *
 * @since 1.0
 */
class PayeeItem extends HorizontalLayout {
    PayeeItem(Payee payee) {
        setSpacing(true);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        Label payeeLabel = new Label(payee.getName());

        addComponent(payeeLabel);
    }
}
