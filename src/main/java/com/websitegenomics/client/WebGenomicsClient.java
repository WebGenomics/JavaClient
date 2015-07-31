package com.websitegenomics.client;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicHeader;

/**
 *
 * @author WebGenomics Team
 */
public class WebGenomicsClient {

    private final String HOST = "websitegenomics.cloudapp.net";
    private final String BASE_URL = "http://" + HOST + "/Classify/?uri=";

    public static void main(String[] args) throws IOException {
        Analysis genomics = new WebGenomicsClient().getGenomics("facebook.com");
        System.out.println(genomics);
    }

    /**
     *
     * @param url The target website
     * @return
     * @throws IOException
     */
    public Analysis getGenomics(String url) throws IOException {
        Analysis result = null;
        //Build final request URI
        String uri = BASE_URL.concat(url);

        // Username and password which you get when you registerd on the WebGenomics
        String username = "demo", password = "demo";

        //Accept header must be specified 
        Header accept = new BasicHeader("Accept", "application/json");

        //Apache http commons fluent extention
        Executor executor = Executor.newInstance()
                //Preemptive mode must be set 
                .authPreemptive(new HttpHost(HOST))
                .auth(new UsernamePasswordCredentials(username, password));
        //GET the JSON result from the WebGenomics
        String content = executor.execute(Request.Get(uri).addHeader(accept))
                .returnContent().asString();
        //Deserialize to Analysis class
        result = new Gson().fromJson(content, Analysis.class);

        return result;
    }
}
