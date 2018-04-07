import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Created by guxianxiong on 2018/4/4.
 */
@OnApplicationStart
public class Bootstrap extends Job {
    @Override
    public void doJob() throws Exception {
//        super.doJob();
        // Check if the database is empty
        if(User.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }
}
