package com.xy.tree.socket.schedule;

import com.corundumstudio.socketio.SocketIOClient;
import com.xy.tree.socket.client.ClientOnlineNumber;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleMessage {
    @Scheduled(cron = "0/1 * * * * ? ")
    public void pushMessage() {
        for (SocketIOClient client : ClientOnlineNumber.getClients()) {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            System.out.println(dateString);
            client.sendEvent("pushpoint", dateString);//每隔一秒推送一次
        }
    }
}