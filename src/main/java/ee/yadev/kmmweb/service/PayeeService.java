package ee.yadev.kmmweb.service;

import ee.yadev.kmmweb.dao.PayeeDao;
import ee.yadev.kmmweb.model.Payee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Service, which manipulates with {@link ee.yadev.kmmweb.model.Payee}
 *
 * @since 1.0
 */
@Service
public class PayeeService {

    @Autowired
    private PayeeDao payeeDao;

    public void addPayee(String payeeName) {
        String lastPayeeId = getLastPayeeId();
        String nextPayeeId = generateNextPayeeId();

        Payee payee = new Payee();
        payee.setName(payeeName);

        //payeeDao.save(payee);
    }

    private String getLastPayeeId() {

        Pageable pageable = new PageRequest(0, 2, Sort.Direction.DESC, "id");
        Page<Payee> payeePage = payeeDao.findAll(pageable);
        List<Payee> lastPayees = payeePage.getContent();
        Payee lastPayee = lastPayees.get(1);
        lastPayee = Objects.nonNull(lastPayee) ? lastPayee : lastPayees.get(0);
        return lastPayee.getId();
    }

    private String generateNextPayeeId() {
        return null;
    }
}
