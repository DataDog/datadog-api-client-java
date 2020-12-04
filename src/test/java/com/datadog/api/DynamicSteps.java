package com.datadog.api;

import java.util.List;
import java.util.Map;

import io.cucumber.java8.En;

public class DynamicSteps implements En {

    private World world;

    public DynamicSteps(World world) {
        this.world = world;

        for (Map.Entry<String, List<Given>> e : GivenAction.GivenAction().steps.entrySet()) {
            for (Given settings : e.getValue()) {
                Given(settings.step, () -> world.given(e.getKey(), settings));
            }
        }
    }
}