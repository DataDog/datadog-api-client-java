package com.datadog.api;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.HookTestStep;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.Step;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestCaseStarted;
import io.cucumber.plugin.event.TestStepFinished;
import io.cucumber.plugin.event.TestStepStarted;

import datadog.trace.api.DDTags;
import datadog.trace.api.interceptor.MutableSpan;
import io.opentracing.Scope;
import io.opentracing.Span;
import io.opentracing.tag.Tags;
import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;

public class TracePlugin implements EventListener {

    private String TRACING_SPAN_TYPE = "test";
    private String TRACING_TAG_ENDPOINT = "version";

    private Span scenarioSpan;
    private Scope scenarioScope;
    private Span stepSpan;
    private Scope stepScope;

    private void receiveTestCaseStarted(TestCaseStarted event) {
        Tracer tracer = GlobalTracer.get();
        scenarioSpan = GlobalTracer.get().activeSpan();
        if (scenarioSpan != null) {
            MutableSpan s = (MutableSpan) scenarioSpan;
            s.setResourceName(event.getTestCase().getScenarioDesignation());
            s.setTag("test.framework", "io.cucumber");
            s.setTag(DDTags.RESOURCE_NAME, event.getTestCase().getScenarioDesignation());
            s.setTag("test.name", event.getTestCase().getName());
            s.setTag("test.suite", event.getTestCase().getUri().toString());
        }
    }

    private void receiveTestStepStarted(TestStepStarted event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep ts = (PickleStepTestStep) event.getTestStep();
            Step step = ts.getStep();
            String name = step.getText();
            Tracer tracer = GlobalTracer.get();
            stepSpan = tracer.buildSpan("step").asChildOf(scenarioSpan).withTag(DDTags.RESOURCE_NAME, name)
                    .withTag(DDTags.SPAN_TYPE, step.getKeyword()).withTag("span.kind", "step")
                    .withTag("test.framework", "io.cucumber").withTag("test.name", name).start();
            MutableSpan ms = (MutableSpan) stepSpan;
            ms.setResourceName(name);
            ms.setSpanType(step.getKeyword());
            stepScope = tracer.activateSpan(scenarioSpan);
            // stepScope.setAsyncPropagation(true);
        }
    }

    private void receiveTestStepFinished(TestStepFinished event) {
        if (stepSpan != null) {
            try {
                Result result = event.getResult();
                if (!result.getStatus().isOk()) {
                    MutableSpan s = (MutableSpan) stepSpan;
                    s.setError(true);
                }
            } finally {
                stepScope.close();
                stepScope = null;
                stepSpan.finish();
                stepSpan = null;
            }
        }
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseStarted.class, this::receiveTestCaseStarted);
        publisher.registerHandlerFor(TestStepStarted.class, this::receiveTestStepStarted);
        publisher.registerHandlerFor(TestStepFinished.class, this::receiveTestStepFinished);
    }
}
