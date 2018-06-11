package ee.yadev.kmmweb.ui.payee;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import ee.yadev.kmmweb.model.Payee;

/**
 * Line with payee and edit and delete buttons
 *
 * @since 1.0
 */
class PayeeRow extends HorizontalLayout {

    private Payee payee;

    PayeeRow(PayeeItem payeeItem) {

        setSpacing(true);
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        Button editPayeeButton = new Button("Edit");
        Button deletePayeeButton = new Button("Delete");

        addComponents(payeeItem, editPayeeButton, deletePayeeButton);

    }
}
