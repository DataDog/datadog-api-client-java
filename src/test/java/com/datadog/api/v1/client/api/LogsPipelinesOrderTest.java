package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LogsPipelinesOrderTest extends V1ApiTest {
    private static LogsPipelinesApi api;

    @BeforeClass
    public static void initApi() {
        api = new LogsPipelinesApi(generalApiClient);
    }

    @Test
    public void pipelineOrderTest() throws ApiException {

        // Get current pipelines order
        LogsPipelinesOrder pipelinesOrder = api.getLogsPipelineOrder().execute();
        List<String> pipelineIDs = pipelinesOrder.getPipelineIds();

        // Slightly change order
        List<String> newOrder = new ArrayList<>(pipelineIDs);
        newOrder.add(newOrder.get(0));
        newOrder.remove(0);
        pipelinesOrder.setPipelineIds(newOrder);

        LogsPipelinesOrder updatedPipelinesOrder = api.updateLogsPipelineOrder().body(pipelinesOrder).execute();
        assertEquals(newOrder, updatedPipelinesOrder.getPipelineIds());
    }
}
