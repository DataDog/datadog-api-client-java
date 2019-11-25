
package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.github.tomakehurst.wiremock.client.MappingBuilder;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class OrgApiTest extends V1ApiTest {

    private static DowntimesApi api;

    @BeforeClass
    public static void initApi() {
        api = new DowntimesApi(generalApiUnitTestClient);
    }

    // Use downtimes as a known working endpoint while finishing setting up the unit testing framework
    @Test
    public void getAllDowntimesTest() throws ApiException, IOException {
        MappingBuilder stub = beginStub("/api/v1/downtime/", "org_fixtures/get_orgs.json");
        stub.withQueryParam("current_only", equalTo("false"));
        stubFor(stub);

        DowntimesApi.GetAllDowntimesParams opts = new DowntimesApi.GetAllDowntimesParams().currentOnly(false);
        System.out.printf("%s\n", api.getAllDowntimes(opts));
    }

}
