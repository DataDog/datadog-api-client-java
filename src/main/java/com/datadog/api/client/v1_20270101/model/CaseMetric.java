/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = CaseMetric.CaseMetricSerializer.class)
public class CaseMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("time_to_close", "time_to_assign", "event_count"));

  public static final CaseMetric TIME_TO_CLOSE = new CaseMetric("time_to_close");
  public static final CaseMetric TIME_TO_ASSIGN = new CaseMetric("time_to_assign");
  public static final CaseMetric EVENT_COUNT = new CaseMetric("event_count");

  CaseMetric(String value) {
    super(value, allowedValues);
  }

  public static class CaseMetricSerializer extends StdSerializer<CaseMetric> {
    public CaseMetricSerializer(Class<CaseMetric> t) {
      super(t);
    }

    public CaseMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(CaseMetric value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseMetric fromValue(String value) {
    return new CaseMetric(value);
  }
}
