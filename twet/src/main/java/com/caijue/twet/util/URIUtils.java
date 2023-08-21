package com.caijue.twet.util;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * URI工具类（可以传一个URL然后截取本机IP和端口号）
 * e.g:localhost：8080
 */
public class URIUtils {

    public  static URI getHost(URI uri) {
        URI effectiveURI;
        try {
            effectiveURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                    null, null, null);
        } catch (URISyntaxException e) {
            effectiveURI = null;
        }
        return effectiveURI;
    }


}
