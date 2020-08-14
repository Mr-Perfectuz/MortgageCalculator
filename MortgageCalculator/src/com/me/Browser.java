package com.me;

import java.security.PublicKey;

public class Browser {
    public void navigate(String adress) {
        String ip =  findIpAdress(adress);
        String htmp =  sendHtppRequest(ip);
        System.out.println(htmp);
    }

    private String sendHtppRequest(String ip) {
        return "<html>/</html>";
    }

    private String findIpAdress(String adress) {
        return  "1242,235,456";
    }
}
