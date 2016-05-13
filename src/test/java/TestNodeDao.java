import com.chinamobile.App;
import com.chinamobile.dao.NodeDao;
import com.chinamobile.model.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by szl on 2016/5/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class TestNodeDao {


    @Autowired
    private NodeDao dao;

    @Test
    public void test(){

        Node n = dao.getById("768679", "Picker");

        System.out.println(n.toString());

    }


}
