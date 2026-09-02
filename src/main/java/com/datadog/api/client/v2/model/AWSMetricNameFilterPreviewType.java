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

/** The <code>AWSMetricNameFilterPreviewResponseData</code> <code>type</code>. */
@JsonSerialize(
    using = AWSMetricNameFilterPreviewType.AWSMetricNameFilterPreviewTypeSerializer.class)
public class AWSMetricNameFilterPreviewType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric_name_filter_preview"));

  public static final AWSMetricNameFilterPreviewType METRIC_NAME_FILTER_PREVIEW =
      new AWSMetricNameFilterPreviewType("metric_name_filter_preview");

  AWSMetricNameFilterPreviewType(String value) {
    super(value, allowedValues);
  }

  public static class AWSMetricNameFilterPreviewTypeSerializer
      extends StdSerializer<AWSMetricNameFilterPreviewType> {
    public AWSMetricNameFilterPreviewTypeSerializer(Class<AWSMetricNameFilterPreviewType> t) {
      super(t);
    }

    public AWSMetricNameFilterPreviewTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AWSMetricNameFilterPreviewType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSMetricNameFilterPreviewType fromValue(String value) {
    return new AWSMetricNameFilterPreviewType(value);
  }
}
