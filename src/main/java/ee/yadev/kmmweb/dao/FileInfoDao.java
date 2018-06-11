package ee.yadev.kmmweb.dao;

import ee.yadev.kmmweb.model.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface FileInfoDao extends JpaRepository<FileInfo, String> {
}
