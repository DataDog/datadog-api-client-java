/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Events data source. */
@JsonSerialize(
    using = GuidedTableEventsQueryDataSource.GuidedTableEventsQueryDataSourceSerializer.class)
public class GuidedTableEventsQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("logs", "rum", "spans", "ci_pipelines", "events", "product_analytics"));

  public static final GuidedTableEventsQueryDataSource LOGS =
      new GuidedTableEventsQueryDataSource("logs");
  public static final GuidedTableEventsQueryDataSource RUM =
      new GuidedTableEventsQueryDataSource("rum");
  public static final GuidedTableEventsQueryDataSource SPANS =
      new GuidedTableEventsQueryDataSource("spans");
  public static final GuidedTableEventsQueryDataSource CI_PIPELINES =
      new GuidedTableEventsQueryDataSource("ci_pipelines");
  public static final GuidedTableEventsQueryDataSource EVENTS =
      new GuidedTableEventsQueryDataSource("events");
  public static final GuidedTableEventsQueryDataSource PRODUCT_ANALYTICS =
      new GuidedTableEventsQueryDataSource("product_analytics");

  GuidedTableEventsQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableEventsQueryDataSourceSerializer
      extends StdSerializer<GuidedTableEventsQueryDataSource> {
    public GuidedTableEventsQueryDataSourceSerializer(Class<GuidedTableEventsQueryDataSource> t) {
      super(t);
    }

    public GuidedTableEventsQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableEventsQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableEventsQueryDataSource fromValue(String value) {
    return new GuidedTableEventsQueryDataSource(value);
  }
}
