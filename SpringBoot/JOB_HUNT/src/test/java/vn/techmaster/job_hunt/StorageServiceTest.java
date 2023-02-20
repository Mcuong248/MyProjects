package vn.techmaster.job_hunt;

import org.junit.jupiter.api.Test;
import vn.techmaster.job_hunt.service.StorageService;
import static org.assertj.core.api.Assertions.*;

public class StorageServiceTest {
    @Test
    public void test_getFileExtension() {
        StorageService s = new StorageService();
        String extension = s.getFileExtendsion("pic1.png");
        assertThat(extension).isEqualTo("jpg");

        extension = s.getFileExtendsion("pic1.png");
        assertThat(extension).isEqualTo("png");
    }
}
