/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Lifecycle phase of a launch. A new launch starts in <code>plan</code> or <code>setup</code>, and
 * defaults to <code>plan</code>. Allowed changes: <code>plan</code> to <code>setup</code>, <code>
 * setup</code> to <code>ready</code>, <code>ready</code> to <code>setup</code> or <code>launched
 * </code>, and <code>launched</code> to <code>ready</code>.
 */
@JsonSerialize(using = ProductAnalyticsLaunchPhase.ProductAnalyticsLaunchPhaseSerializer.class)
public class ProductAnalyticsLaunchPhase extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("plan", "setup", "ready", "launched"));

  public static final ProductAnalyticsLaunchPhase PLAN = new ProductAnalyticsLaunchPhase("plan");
  public static final ProductAnalyticsLaunchPhase SETUP = new ProductAnalyticsLaunchPhase("setup");
  public static final ProductAnalyticsLaunchPhase READY = new ProductAnalyticsLaunchPhase("ready");
  public static final ProductAnalyticsLaunchPhase LAUNCHED =
      new ProductAnalyticsLaunchPhase("launched");

  ProductAnalyticsLaunchPhase(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsLaunchPhaseSerializer
      extends StdSerializer<ProductAnalyticsLaunchPhase> {
    public ProductAnalyticsLaunchPhaseSerializer(Class<ProductAnalyticsLaunchPhase> t) {
      super(t);
    }

    public ProductAnalyticsLaunchPhaseSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsLaunchPhase value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsLaunchPhase fromValue(String value) {
    return new ProductAnalyticsLaunchPhase(value);
  }
}
