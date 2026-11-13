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
 * Retention policy to set for Product Analytics data derived from RUM events. <code>PREVIEW</code>
 * is the initial state of a new application and is reported as <code>NONE</code> in responses.
 * Setting <code>MAX</code> requires the <code>product_analytics_apps_write</code> permission.
 */
@JsonSerialize(
    using =
        RUMProductAnalyticsRetentionStateRequest.RUMProductAnalyticsRetentionStateRequestSerializer
            .class)
public class RUMProductAnalyticsRetentionStateRequest extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("MAX", "NONE", "PREVIEW"));

  public static final RUMProductAnalyticsRetentionStateRequest MAX =
      new RUMProductAnalyticsRetentionStateRequest("MAX");
  public static final RUMProductAnalyticsRetentionStateRequest NONE =
      new RUMProductAnalyticsRetentionStateRequest("NONE");
  public static final RUMProductAnalyticsRetentionStateRequest PREVIEW =
      new RUMProductAnalyticsRetentionStateRequest("PREVIEW");

  RUMProductAnalyticsRetentionStateRequest(String value) {
    super(value, allowedValues);
  }

  public static class RUMProductAnalyticsRetentionStateRequestSerializer
      extends StdSerializer<RUMProductAnalyticsRetentionStateRequest> {
    public RUMProductAnalyticsRetentionStateRequestSerializer(
        Class<RUMProductAnalyticsRetentionStateRequest> t) {
      super(t);
    }

    public RUMProductAnalyticsRetentionStateRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMProductAnalyticsRetentionStateRequest value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMProductAnalyticsRetentionStateRequest fromValue(String value) {
    return new RUMProductAnalyticsRetentionStateRequest(value);
  }
}
