package ee.yadev.kmmweb.ui.payee;

import com.vaadin.ui.VerticalLayout;
import ee.yadev.kmmweb.dao.PayeeDao;
import ee.yadev.kmmweb.model.Payee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * List of {@link PayeeItem}
 *
 * @since 1.0
 */
@Component
public class PayeeList extends VerticalLayout {
    @Autowired
    PayeeDao payeeDao;

    @PostConstruct
    void init() {
        setSpacing(true);
        setContent(payeeDao.findAll());
    }

    private void setContent(List<Payee> allPayees) {
        removeAllComponents();
        allPayees.forEach(payee -> addComponent(new PayeeItem(payee)));
    }
}
