package com.fosun.fc.projects.creepers.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 *<p>
 *description: 代理IP公共方法类
 *</p>
 * @author MaXin
 * @since 2016年8月24日
 * @see
 */
/**
 * @author Administrator
 *
 */
public class ProxyPoolUtil {

    public static List<String[]> proxyArrayList = new ArrayList<String[]>();
    
    private static void initProxyArrayList(){
        List<String[]> list = new ArrayList<String[]>();
        list.add(new String[] { "120.52.72.58", "80" });
        list.add(new String[] { "123.125.122.224", "80" });
        list.add(new String[] { "120.52.72.20", "80" });
        list.add(new String[] { "60.195.17.240", "3128" });
        list.add(new String[] { "60.195.148.247", "3128" });
        list.add(new String[] { "122.226.128.251", "3128" });
        list.add(new String[] { "58.247.125.205", "10175" });
        list.add(new String[] { "58.247.125.205", "10286" });
        list.add(new String[] { "120.55.245.47", "80" });
        list.add(new String[] { "58.247.125.205", "10239" });
        list.add(new String[] { "124.206.250.5", "3128" });
        list.add(new String[] { "223.197.56.102", "80" });
        list.add(new String[] { "60.206.94.247", "3128" });
        list.add(new String[] { "182.254.216.147", "80" });
        list.add(new String[] { "58.247.125.205", "443" });
        list.add(new String[] { "221.199.203.106", "3128" });
        list.add(new String[] { "118.144.23.120", "3128" });
        list.add(new String[] { "120.52.72.54", "80" });
        list.add(new String[] { "183.61.71.112", "8888" });
        list.add(new String[] { "112.126.65.26", "12345" });
        list.add(new String[] { "120.25.198.198", "3128" });
        list.add(new String[] { "27.218.54.169", "81" });
        list.add(new String[] { "61.143.158.238", "808" });
        list.add(new String[] { "39.67.80.229", "81" });
        list.add(new String[] { "111.151.128.146", "8888" });
        list.add(new String[] { "123.121.103.62", "8888" });
        list.add(new String[] { "118.187.10.11", "80" });
        list.add(new String[] { "182.43.152.191", "8888" });
        list.add(new String[] { "115.29.76.108", "8088" });
        list.add(new String[] { "123.7.78.157", "9999" });
        list.add(new String[] { "124.132.139.226", "81" });
        list.add(new String[] { "118.119.168.172", "9999" });
        list.add(new String[] { "112.255.179.92", "8888" });
        list.add(new String[] { "39.1.36.96", "8080" });
        list.add(new String[] { "39.88.214.50", "81" });
        list.add(new String[] { "119.10.72.34", "80" });
        list.add(new String[] { "203.187.160.133", "80" });
        list.add(new String[] { "118.144.149.200", "3128" });
        list.add(new String[] { "60.207.189.250", "3128" });
        list.add(new String[] { "120.52.72.24", "80" });
        list.add(new String[] { "14.120.66.250", "9797" });
        list.add(new String[] { "120.52.72.52", "80" });
        list.add(new String[] { "122.226.62.90", "3128" });
        list.add(new String[] { "121.41.110.73", "8080" });
        list.add(new String[] { "60.206.80.218", "3128" });
        list.add(new String[] { "58.247.125.205", "17777" });
        list.add(new String[] { "124.193.29.8", "3128" });
        list.add(new String[] { "124.206.241.221", "3128" });
        list.add(new String[] { "119.129.96.26", "9797" });
        list.add(new String[] { "124.206.254.216", "3128" });
        list.add(new String[] { "218.67.126.15", "3128" });
        list.add(new String[] { "60.191.168.181", "3128" });
        list.add(new String[] { "115.25.138.245", "3128" });
        list.add(new String[] { "219.238.21.90", "3128" });
        list.add(new String[] { "61.166.56.177", "3128" });
        list.add(new String[] { "60.191.180.38", "3128" });
        list.add(new String[] { "42.96.129.44", "8088" });
        list.add(new String[] { "106.35.100.203", "8888" });
        list.add(new String[] { "171.221.246.52", "8998" });
        list.add(new String[] { "120.197.57.244", "8000" });
        list.add(new String[] { "125.39.225.42", "20000" });
        list.add(new String[] { "116.19.181.94", "3128" });
        list.add(new String[] { "218.191.247.51", "80" });
        list.add(new String[] { "106.38.251.62", "8088" });
        list.add(new String[] { "115.28.1.194", "8088" });
        list.add(new String[] { "123.124.168.149", "80" });
        list.add(new String[] { "220.186.151.199", "81" });
        list.add(new String[] { "121.8.58.247", "9999" });
        list.add(new String[] { "103.254.108.37", "8080" });
        list.add(new String[] { "211.77.5.38", "80" });
        list.add(new String[] { "43.243.112.115", "3128" });
        list.add(new String[] { "218.56.132.154", "8080" });
        list.add(new String[] { "218.72.172.227", "8888" });
        list.add(new String[] { "118.169.118.177", "8080" });
        list.add(new String[] { "115.29.37.86", "8088" });
        list.add(new String[] { "61.223.97.91", "3128" });
        list.add(new String[] { "124.193.7.247", "3128" });
        list.add(new String[] { "58.96.172.205", "8888" });
        list.add(new String[] { "115.196.54.99", "9797" });
        list.add(new String[] { "61.55.135.192", "82" });
        list.add(new String[] { "27.205.95.97", "9999" });
        list.add(new String[] { "124.88.67.7", "843" });
        list.add(new String[] { "124.248.237.250", "80" });
        list.add(new String[] { "221.203.162.110", "53000" });
        list.add(new String[] { "123.5.57.136", "9999" });
        list.add(new String[] { "103.1.48.76", "8088" });
        list.add(new String[] { "120.236.148.199", "2226" });
        list.add(new String[] { "123.121.163.136", "8000" });
        list.add(new String[] { "120.236.138.27", "8118" });
        list.add(new String[] { "60.19.7.107", "8888" });
        list.add(new String[] { "123.125.122.204", "80" });
        list.add(new String[] { "111.224.13.72", "8888" });
        list.add(new String[] { "49.76.229.91", "8080" });
        list.add(new String[] { "125.39.225.63", "20000" });
        list.add(new String[] { "43.243.112.79", "3128" });
        list.add(new String[] { "125.38.236.77", "9797" });
        list.add(new String[] { "1.195.110.103", "8888" });
        list.add(new String[] { "121.40.82.1", "3128" });
        list.add(new String[] { "124.88.67.30", "83" });
        list.add(new String[] { "183.13.43.87", "9797" });
        list.add(new String[] { "61.162.223.41", "9797" });
        list.add(new String[] { "103.250.15.212", "80" });
        list.add(new String[] { "111.13.7.42", "81" });
        list.add(new String[] { "58.67.159.50", "80" });
        list.add(new String[] { "111.126.235.246", "8888" });
        list.add(new String[] { "125.39.226.5", "20000" });
        list.add(new String[] { "125.39.225.67", "20000" });
        list.add(new String[] { "1.163.31.232", "8080" });
        list.add(new String[] { "122.96.59.104", "82" });
        list.add(new String[] { "124.250.236.26", "80" });
        list.add(new String[] { "183.238.80.236", "8118" });
        list.add(new String[] { "183.19.9.98", "3128" });
        list.add(new String[] { "118.169.119.25", "8080" });
        list.add(new String[] { "103.207.69.102", "25" });
        list.add(new String[] { "123.57.23.114", "3128" });
        list.add(new String[] { "182.61.58.100", "3128" });
        list.add(new String[] { "43.224.234.86", "80" });
        list.add(new String[] { "117.162.238.88", "8123" });
        list.add(new String[] { "119.1.151.246", "9797" });
        list.add(new String[] { "103.1.48.77", "8088" });
        list.add(new String[] { "123.160.166.108", "81" });
        list.add(new String[] { "125.39.226.33", "20000" });
        list.add(new String[] { "112.92.209.93", "9797" });
        list.add(new String[] { "110.211.46.156", "8080" });
        list.add(new String[] { "218.29.111.106", "9999" });
        list.add(new String[] { "223.243.128.241", "81" });
        list.add(new String[] { "119.28.11.13", "3128" });
        list.add(new String[] { "113.73.212.9", "8118" });
        list.add(new String[] { "101.200.144.37", "3128" });
        list.add(new String[] { "183.234.48.201", "8080" });
        list.add(new String[] { "59.108.201.236", "80" });
        list.add(new String[] { "120.52.72.47", "9011" });
        list.add(new String[] { "222.161.209.167", "8102" });
        list.add(new String[] { "116.30.152.141", "9797" });
        list.add(new String[] { "123.7.38.31", "9999" });
        list.add(new String[] { "119.88.128.78", "80" });
        list.add(new String[] { "118.144.156.2", "3128" });
        list.add(new String[] { "218.76.84.206", "3128" });
        list.add(new String[] { "139.129.206.6", "82" });
        list.add(new String[] { "58.247.125.205", "10218" });
        list.add(new String[] { "60.195.54.221", "3128" });
        list.add(new String[] { "58.247.125.205", "10157" });
        list.add(new String[] { "42.86.58.181", "81" });
        list.add(new String[] { "101.200.84.28", "8080" });
        list.add(new String[] { "119.18.234.60", "80" });
        list.add(new String[] { "42.84.60.193", "8888" });
        list.add(new String[] { "222.79.206.28", "81" });
        list.add(new String[] { "202.106.16.36", "3128" });
        list.add(new String[] { "120.90.6.92", "8080" });
        list.add(new String[] { "112.91.208.78", "9999" });
        list.add(new String[] { "59.34.2.93", "3128" });
        list.add(new String[] { "113.97.230.0", "9999" });
        list.add(new String[] { "183.1.42.14", "9999" });
        list.add(new String[] { "106.75.198.201", "443" });
        list.add(new String[] { "221.206.5.51", "8080" });
        list.add(new String[] { "113.10.214.213", "3123" });
        list.add(new String[] { "59.34.2.92", "3128" });
        list.add(new String[] { "110.230.101.208", "8888" });
        list.add(new String[] { "120.52.72.47", "80" });
        list.add(new String[] { "111.206.81.248", "80" });
        list.add(new String[] { "123.125.122.205", "80" });
        list.add(new String[] { "58.247.125.205", "10109" });
        list.add(new String[] { "58.247.125.205", "10242" });
        list.add(new String[] { "122.72.30.72", "80" });
        list.add(new String[] { "182.90.252.10", "2226" });
        list.add(new String[] { "119.34.185.237", "82" });
        list.add(new String[] { "111.40.84.73", "9999" });
        list.add(new String[] { "124.206.167.250", "3128" });
        list.add(new String[] { "123.7.88.171", "3128" });
        list.add(new String[] { "115.29.34.2", "3128" });
        list.add(new String[] { "183.14.225.54", "8088" });
        list.add(new String[] { "218.77.83.89", "3128" });
        list.add(new String[] { "180.109.63.101", "8888" });
        list.add(new String[] { "116.31.52.5", "8888" });
        list.add(new String[] { "120.27.142.209", "82" });
        list.add(new String[] { "112.64.142.254", "81" });
        list.add(new String[] { "175.180.209.112", "8998" });
        list.add(new String[] { "180.110.42.240", "8118" });
        list.add(new String[] { "221.219.217.152", "9000" });
        list.add(new String[] { "220.164.96.24", "8888" });
        list.add(new String[] { "123.56.182.111", "83" });
        list.add(new String[] { "123.7.115.141", "9999" });
        list.add(new String[] { "116.26.100.115", "8118" });
        list.add(new String[] { "14.223.84.143", "8118" });
        list.add(new String[] { "218.90.174.167", "3128" });
        list.add(new String[] { "124.240.187.84", "80" });
        list.add(new String[] { "60.163.186.197", "81" });
        list.add(new String[] { "113.65.20.77", "9999" });
        list.add(new String[] { "112.90.72.83", "80" });
        list.add(new String[] { "60.171.80.252", "81" });
        list.add(new String[] { "121.201.24.248", "8088" });
        list.add(new String[] { "124.88.67.7", "83" });
        list.add(new String[] { "125.39.226.125", "20000" });
        list.add(new String[] { "122.147.24.103", "8080" });
        list.add(new String[] { "120.52.72.55", "80" });
        list.add(new String[] { "121.17.18.149", "3128" });
        list.add(new String[] { "220.249.185.178", "9999" });
        list.add(new String[] { "106.75.129.29", "80" });
        list.add(new String[] { "60.191.153.12", "3128" });
        list.add(new String[] { "58.247.125.205", "10274" });
        list.add(new String[] { "60.194.72.253", "3128" });
        list.add(new String[] { "60.191.160.20", "3128" });
        list.add(new String[] { "59.108.201.238", "80" });
        list.add(new String[] { "43.243.112.88", "3128" });
        list.add(new String[] { "58.247.125.205", "10052" });
        list.add(new String[] { "60.250.81.118", "80" });
        list.add(new String[] { "112.91.218.21", "9000" });
        list.add(new String[] { "60.207.168.246", "3128" });
        list.add(new String[] { "118.144.192.207", "3128" });
        list.add(new String[] { "124.206.56.125", "3128" });
        list.add(new String[] { "202.107.238.51", "3128" });
        list.add(new String[] { "58.247.125.205", "10080" });
        list.add(new String[] { "122.72.18.160", "80" });
        list.add(new String[] { "61.134.25.106", "3128" });
        list.add(new String[] { "123.146.41.102", "82" });
        list.add(new String[] { "218.17.8.19", "8118" });
        list.add(new String[] { "112.81.19.71", "8888" });
        list.add(new String[] { "116.19.192.131", "3128" });
        list.add(new String[] { "112.74.25.121", "3128" });
        list.add(new String[] { "222.81.61.29", "808" });
        list.add(new String[] { "1.82.216.135", "80" });
        list.add(new String[] { "101.69.161.198", "3128" });
        list.add(new String[] { "117.158.1.210", "9999" });
        list.add(new String[] { "1.82.216.134", "80" });
        list.add(new String[] { "113.110.234.77", "9999" });
        list.add(new String[] { "125.39.226.71", "20000" });
        list.add(new String[] { "42.202.146.58", "8080" });
        list.add(new String[] { "43.243.112.78", "3128" });
        list.add(new String[] { "120.234.46.114", "8118" });
        list.add(new String[] { "60.221.249.115", "8080" });
        list.add(new String[] { "222.82.222.242", "9999" });
        list.add(new String[] { "202.103.215.23", "2226" });
        list.add(new String[] { "121.230.19.179", "8998" });
        list.add(new String[] { "118.140.169.90", "80" });
        list.add(new String[] { "120.83.248.36", "9797" });
        list.add(new String[] { "120.83.228.124", "9999" });
        list.add(new String[] { "59.108.201.242", "80" });
        list.add(new String[] { "112.91.93.224", "9000" });
        list.add(new String[] { "218.29.237.206", "3128" });
        list.add(new String[] { "61.150.89.67", "3128" });
        list.add(new String[] { "61.185.137.126", "3128" });
        list.add(new String[] { "58.247.125.205", "10220" });
        list.add(new String[] { "120.52.72.56", "80" });
        list.add(new String[] { "120.52.72.53", "80" });
        list.add(new String[] { "124.64.220.59", "9797" });
        list.add(new String[] { "124.206.164.180", "3128" });
        list.add(new String[] { "58.247.125.205", "10141" });
        list.add(new String[] { "60.206.111.116", "3128" });
        list.add(new String[] { "59.108.201.237", "80" });
        list.add(new String[] { "60.10.182.175", "81" });
        list.add(new String[] { "58.243.0.162", "9999" });
        list.add(new String[] { "124.88.67.31", "81" });
        list.add(new String[] { "121.31.101.178", "8123" });
        list.add(new String[] { "114.42.189.123", "8088" });
        list.add(new String[] { "116.9.156.105", "3123" });
        list.add(new String[] { "58.247.30.222", "8080" });
        list.add(new String[] { "219.141.225.107", "80" });
        list.add(new String[] { "124.88.67.32", "83" });
        list.add(new String[] { "125.39.226.90", "20000" });
        list.add(new String[] { "114.42.191.71", "8088" });
        list.add(new String[] { "103.247.108.2", "80" });
        list.add(new String[] { "49.69.135.208", "8888" });
        list.add(new String[] { "183.248.67.185", "81" });
        list.add(new String[] { "39.161.24.58", "8118" });
        proxyArrayList.addAll(list);
    }
    public static List<String[]> getProxyArrayList(){
        if (CommonMethodUtils.isEmpty(proxyArrayList)) {
            initProxyArrayList();
        }
        return proxyArrayList;
    }

    /**
     * 
     * <p>
     * description: 代理IP有效检测
     * </p>
     * 
     * @author pengyk
     * @since 2016年12月08日
     * @see
     */
    public static void createIPAddress(String ip, int port, String targetUrl, String proxyType) {
        if(StringUtils.isBlank(targetUrl)){
            targetUrl = "http://www.baidu.com";
        }
        URL url = null;
        try {
            url = new URL(targetUrl);
        } catch (MalformedURLException e) {
            System.out.println("url invalidate");
        }
        InetSocketAddress addr = null;
        addr = new InetSocketAddress(ip, port);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, addr); // http proxy
        InputStream in = null;
        try {
            URLConnection conn = url.openConnection(proxy);
            conn.setConnectTimeout(30000);
            in = conn.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ip " + ip + " is not aviable");// 异常IP
        }
        String s = convertStreamToString(in);
        System.out.println(s);
        // System.out.println(s);
        if (s.indexOf("baidu") > 0) {// 有效IP
            System.out.println(ip + ":" + port + " is ok");
        }
    }

    public static String convertStreamToString(InputStream is) {
        if (is == null)
            return "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "/n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();

    }    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        createIPAddress("111.202.154.88",8080,null,null);

    }

}
