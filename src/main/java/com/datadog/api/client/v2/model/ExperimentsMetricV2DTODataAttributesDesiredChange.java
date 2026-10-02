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

/** Direction of metric change considered desirable. */
@JsonSerialize(
    using =
        ExperimentsMetricV2DTODataAttributesDesiredChange
            .ExperimentsMetricV2DTODataAttributesDesiredChangeSerializer.class)
public class ExperimentsMetricV2DTODataAttributesDesiredChange extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("METRIC_INCREASES", "METRIC_DECREASES", "UNKNOWN"));

  public static final ExperimentsMetricV2DTODataAttributesDesiredChange METRIC_INCREASES =
      new ExperimentsMetricV2DTODataAttributesDesiredChange("METRIC_INCREASES");
  public static final ExperimentsMetricV2DTODataAttributesDesiredChange METRIC_DECREASES =
      new ExperimentsMetricV2DTODataAttributesDesiredChange("METRIC_DECREASES");
  public static final ExperimentsMetricV2DTODataAttributesDesiredChange UNKNOWN =
      new ExperimentsMetricV2DTODataAttributesDesiredChange("UNKNOWN");

  ExperimentsMetricV2DTODataAttributesDesiredChange(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsMetricV2DTODataAttributesDesiredChangeSerializer
      extends StdSerializer<ExperimentsMetricV2DTODataAttributesDesiredChange> {
    public ExperimentsMetricV2DTODataAttributesDesiredChangeSerializer(
        Class<ExperimentsMetricV2DTODataAttributesDesiredChange> t) {
      super(t);
    }

    public ExperimentsMetricV2DTODataAttributesDesiredChangeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsMetricV2DTODataAttributesDesiredChange value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsMetricV2DTODataAttributesDesiredChange fromValue(String value) {
    return new ExperimentsMetricV2DTODataAttributesDesiredChange(value);
  }
}
