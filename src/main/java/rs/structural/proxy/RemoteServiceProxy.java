package rs.structural.proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RemoteServiceProxy implements RemoteService {
    private RemoteService service;
    private List<Developer> getAllDevelopersCache;
    long timeToLive = 0;

    public RemoteServiceProxy(RemoteService service) {
        this.service = service;
    }

    @Override
    public List<Developer> getAllDevelopers() {
        var unixTime = System.currentTimeMillis();
        var formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS");
        if (unixTime > timeToLive) {
            timeToLive = unixTime + 1000;
            getAllDevelopersCache = service.getAllDevelopers();
            System.out.println(LocalDateTime.now().format(formatter) +
                    " : getAllDevelopers() from the remote service");
        } else
            System.out.println(LocalDateTime.now().format(formatter) +
                    " : getAllDevelopers() from the cache");
        return getAllDevelopersCache;
    }
}
