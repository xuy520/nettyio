package com.xy.tree.socket;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import com.xy.tree.socket.client.ClientOnlineNumber;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Server {

    @Bean
    public Configuration config() {
        Configuration configuration = new Configuration();
        configuration.setHostname("127.0.0.1");//设置主机名
        configuration.setPort(8082);//设置监听的端口号
        return configuration;
    }

    @Bean(initMethod = "start", destroyMethod = "stop", name = "SocketServer")
    public SocketIOServer server(Configuration configuration) throws Exception {
        SocketIOServer server = new SocketIOServer(configuration);//根据配置创建服务器对象
        server.addConnectListener((client) -> {
            System.out.println("connected:SessionId=" + client.getSessionId());
            ClientOnlineNumber.addClient(client);//保存客户端
        });
        return server;
    }
}