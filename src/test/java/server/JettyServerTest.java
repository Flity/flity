package server;

import com.flity.kit.LogKit;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.slf4j.Logger;

/**
 * Created by Feng on 2017/8/23.
 */
public class JettyServerTest {

    private static Logger LOG = LogKit.getLog(JettyServerTest.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Jetty Server 测试开始");

        Server server = new Server(9999);
        server.setHandler(new DefaultHandler());
        server.setStopAtShutdown(true);
        server.start();
        server.join();

    }

}
