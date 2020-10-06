/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v1.client.api;


import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * API tests for LogsPipelinesApi
 */
public class LogsPipelinesLifecycleTest extends V1ApiTest {
    private static LogsPipelinesApi api;
    private static List<String> pipelinesToDelete;

    @Override
    public String getTracingEndpoint() {
        return "logs-pipelines";
    }

    @Before
    public void init() {
        api = new LogsPipelinesApi(generalApiClient);
        pipelinesToDelete = new ArrayList<>();
    }

    @After
    public void deletePipelines() {
        for (String pipelineID: pipelinesToDelete) {
            try {
                api.deleteLogsPipeline(pipelineID).execute();
            } catch(ApiException e) {}
        }
    }

    @Test
    public void pipelineLifecycleTest() throws ApiException {
        long nowMillis = now.toInstant().toEpochMilli();
        String name = getUniqueEntityName();
        api = new LogsPipelinesApi(generalApiClient);

        // Create a pipeline
        LogsProcessor grokParser = new LogsProcessor(new LogsGrokParser()
                .source("src")
                .addSamplesItem("sample")
                .grok(new LogsGrokParserRules().matchRules("rule1 foo\nrule2 bar").supportRules("support baz"))
                .name("grok parser"));
        LogsProcessor logDateRemapper = new LogsProcessor(new LogsDateRemapper()
                .addSourcesItem("source")
                .name("log date remapper"));
        LogsProcessor logStatusRemapper = new LogsProcessor(new LogsStatusRemapper()
                .addSourcesItem("source")
                .name("log status remapper"));
        LogsProcessor serviceRemapper = new LogsProcessor(new LogsServiceRemapper()
                .addSourcesItem("source")
                .name("service remapper"));
        LogsProcessor logMessageRemapper = new LogsProcessor(new LogsMessageRemapper()
                .addSourcesItem("source")
                .name("log message remapper"));
        LogsProcessor remapperToAttribute = new LogsProcessor(new LogsAttributeRemapper()
                .addSourcesItem("source")
                .sourceType("tag")
                .target("target")
                .targetType("attribute")
                .targetFormat(TargetFormatType.STRING)
                .preserveSource(true)
                .overrideOnConflict(true)
                .name("log message remapper to attribute target type"));
        LogsProcessor remapperToTag = new LogsProcessor(new LogsAttributeRemapper()
                .addSourcesItem("source")
                .sourceType("tag")
                .target("target")
                .targetType("tag")
                .preserveSource(true)
                .overrideOnConflict(true)
                .name("log message remapper to tag target type"));
        LogsProcessor urlParser = new LogsProcessor(new LogsURLParser()
                .addSourcesItem("source")
                .target("target")
                .name("URL parser"));
        LogsProcessor userAgentParser = new LogsProcessor(new LogsUserAgentParser()
                .addSourcesItem("source")
                .target("target")
                .isEncoded(true)
                .name("user agent parser"));
        LogsProcessor categoryProcessor = new LogsProcessor(new LogsCategoryProcessor()
                .addCategoriesItem(
                        new LogsCategoryProcessorCategories()
                            .name("category")
                            .filter(new LogsFilter().query("query"))
                )
                .target("target")
                .name("category processor"));
        LogsProcessor arithmeticProcessor = new LogsProcessor(new LogsArithmeticProcessor()
                .expression("foo + bar")
                .target("target")
                .isReplaceMissing(true)
                .name("arithmetic processor"));
        LogsProcessor stringBuilderProcessor = new LogsProcessor(new LogsStringBuilderProcessor()
                .template("template")
                .target("target")
                .isReplaceMissing(true)
                .name("string builder processor"));
        LogsProcessor geoIPParser = new LogsProcessor(new LogsGeoIPParser()
                .addSourcesItem("source")
                .target("target")
                .name("geo IP parser"));
        LogsProcessor lookupProcessor = new LogsProcessor(new LogsLookupProcessor()
                .source("source")
                .target("target")
                .addLookupTableItem("key,value")
                .defaultLookup("default_lookup")
                .name("lookup processor"));
        LogsProcessor traceRemapper = new LogsProcessor(new LogsTraceRemapper()
                .addSourcesItem("source")
                .name("trace remapper"));
        LogsProcessor pipelineProcessor = new LogsProcessor(new LogsPipelineProcessor()
                .name("pipeline processor")
                .filter(new LogsFilter().query("query"))
                .addProcessorsItem(grokParser)
                .addProcessorsItem(logDateRemapper));
        LogsPipeline pipeline = new LogsPipeline()
                .isEnabled(true)
                .filter(new LogsFilter().query("query"))
                .addProcessorsItem(grokParser)
                .addProcessorsItem(logDateRemapper)
                .addProcessorsItem(logStatusRemapper)
                .addProcessorsItem(serviceRemapper)
                .addProcessorsItem(logMessageRemapper)
                .addProcessorsItem(remapperToAttribute)
                .addProcessorsItem(remapperToTag)
                .addProcessorsItem(urlParser)
                .addProcessorsItem(userAgentParser)
                .addProcessorsItem(categoryProcessor)
                .addProcessorsItem(arithmeticProcessor)
                .addProcessorsItem(stringBuilderProcessor)
                .addProcessorsItem(geoIPParser)
                .addProcessorsItem(lookupProcessor)
                .addProcessorsItem(traceRemapper)
                .addProcessorsItem(pipelineProcessor)
                .name(name);
        LogsPipeline createdPipeline = api.createLogsPipeline().body(pipeline).execute();
        pipelinesToDelete.add(createdPipeline.getId());
        assertEquals(name, createdPipeline.getName());
        assertTrue(createdPipeline.getIsEnabled());
        assertEquals("query", createdPipeline.getFilter().getQuery());
        assertEquals(grokParser, createdPipeline.getProcessors().get(0));
        assertEquals(logDateRemapper, createdPipeline.getProcessors().get(1));
        assertEquals(logStatusRemapper, createdPipeline.getProcessors().get(2));
        assertEquals(serviceRemapper, createdPipeline.getProcessors().get(3));
        assertEquals(logMessageRemapper, createdPipeline.getProcessors().get(4));
        assertEquals(remapperToAttribute, createdPipeline.getProcessors().get(5));
        assertEquals(remapperToTag, createdPipeline.getProcessors().get(6));
        assertEquals(urlParser, createdPipeline.getProcessors().get(7));
        assertEquals(userAgentParser, createdPipeline.getProcessors().get(8));
        assertEquals(categoryProcessor, createdPipeline.getProcessors().get(9));
        assertEquals(arithmeticProcessor, createdPipeline.getProcessors().get(10));
        assertEquals(stringBuilderProcessor, createdPipeline.getProcessors().get(11));
        assertEquals(geoIPParser, createdPipeline.getProcessors().get(12));
        assertEquals(lookupProcessor, createdPipeline.getProcessors().get(13));
        assertEquals(traceRemapper, createdPipeline.getProcessors().get(14));
        assertEquals(pipelineProcessor, createdPipeline.getProcessors().get(15));

        // Nested Pipeline Assertions
        LogsPipelineProcessor nestedPipelineProcessor = (LogsPipelineProcessor) createdPipeline.getProcessors().get(15).getActualInstance();
        assertEquals("query", nestedPipelineProcessor.getFilter().getQuery());
        assertEquals(grokParser, nestedPipelineProcessor.getProcessors().get(0));
        assertEquals(logDateRemapper, nestedPipelineProcessor.getProcessors().get(1));

        // Get all pipelines and assert our freshly created one is part of the result
        List<LogsPipeline> pipelines = api.listLogsPipelines().execute();
        boolean asserted = false;
        for(LogsPipeline pipe: pipelines) {
            if(pipe.equals(createdPipeline)){
                asserted = true;
                break;
            }
        }
        assertTrue(asserted);

        // Get the freshly created pipeline
        LogsPipeline pipe = api.getLogsPipeline(createdPipeline.getId()).execute();
        assertEquals(createdPipeline, pipe);

        // Update the pipeline
        pipeline.addProcessorsItem(pipeline.getProcessors().get(0));
        pipeline.getProcessors().remove(0);
        pipeline.setIsEnabled(false);
        pipeline.setFilter(new LogsFilter().query("updated query"));
        pipeline.setName(name + "-updated");
        LogsPipeline updatedPipeline = api.updateLogsPipeline(createdPipeline.getId()).body(pipeline).execute();
        assertEquals(name + "-updated", updatedPipeline.getName());
        assertFalse(updatedPipeline.getIsEnabled());
        assertEquals("updated query", updatedPipeline.getFilter().getQuery());
        assertEquals(grokParser, updatedPipeline.getProcessors().get(15));
        assertEquals(pipelineProcessor, updatedPipeline.getProcessors().get(14));
        assertEquals(logDateRemapper, updatedPipeline.getProcessors().get(0));
        assertEquals(logStatusRemapper, updatedPipeline.getProcessors().get(1));
        assertEquals(serviceRemapper, updatedPipeline.getProcessors().get(2));
        assertEquals(logMessageRemapper, updatedPipeline.getProcessors().get(3));
        assertEquals(remapperToAttribute, updatedPipeline.getProcessors().get(4));
        assertEquals(remapperToTag, updatedPipeline.getProcessors().get(5));
        assertEquals(urlParser, updatedPipeline.getProcessors().get(6));
        assertEquals(userAgentParser, updatedPipeline.getProcessors().get(7));
        assertEquals(categoryProcessor, updatedPipeline.getProcessors().get(8));
        assertEquals(arithmeticProcessor, updatedPipeline.getProcessors().get(9));
        assertEquals(stringBuilderProcessor, updatedPipeline.getProcessors().get(10));
        assertEquals(geoIPParser, updatedPipeline.getProcessors().get(11));
        assertEquals(lookupProcessor, updatedPipeline.getProcessors().get(12));
        assertEquals(traceRemapper, updatedPipeline.getProcessors().get(13));

        // Delete the pipeline
        api.deleteLogsPipeline(createdPipeline.getId()).execute();
    }
}
