package rs.structural.proxy;

public class ProxyPattern {

    public static void run() {
        System.out.println("=== Proxy Pattern ===");
        var remoteService = new RemoteServiceImpl();
        var proxy = new RemoteServiceProxy(remoteService);

        // Results from the remote service
        var proxyResults = proxy.getAllDevelopers();
        for (var x : proxyResults)
            System.out.println(x);

        // Results from the cache
        proxyResults = proxy.getAllDevelopers();
        for (var x : proxyResults)
            System.out.println(x);

        // Wait for the cache to expire
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proxyResults = proxy.getAllDevelopers();
        for (var x : proxyResults)
            System.out.println(x);
        System.out.println();
    }
}
