package home;

import java.sql.SQLException;
import java.util.ArrayList;

public class StuService {

    StuDao dao = new StuDao();
    HomeController controller;

    public StuService(HomeController controller) {
        this.controller = controller;
    }

    public void setTb() throws ClassNotFoundException, SQLException {

        ArrayList<StPojo> lst = dao.selectAll();

        for (StPojo data : lst) {
            controller.tbDetails.getItems().addAll(data);
        }
    }

}
