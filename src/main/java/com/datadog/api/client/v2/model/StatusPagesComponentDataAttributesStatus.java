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

/** The status of the component. */
@JsonSerialize(
    using =
        StatusPagesComponentDataAttributesStatus.StatusPagesComponentDataAttributesStatusSerializer
            .class)
public class StatusPagesComponentDataAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("operational", "degraded", "partial_outage", "major_outage"));

  public static final StatusPagesComponentDataAttributesStatus OPERATIONAL =
      new StatusPagesComponentDataAttributesStatus("operational");
  public static final StatusPagesComponentDataAttributesStatus DEGRADED =
      new StatusPagesComponentDataAttributesStatus("degraded");
  public static final StatusPagesComponentDataAttributesStatus PARTIAL_OUTAGE =
      new StatusPagesComponentDataAttributesStatus("partial_outage");
  public static final StatusPagesComponentDataAttributesStatus MAJOR_OUTAGE =
      new StatusPagesComponentDataAttributesStatus("major_outage");

  StatusPagesComponentDataAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class StatusPagesComponentDataAttributesStatusSerializer
      extends StdSerializer<StatusPagesComponentDataAttributesStatus> {
    public StatusPagesComponentDataAttributesStatusSerializer(
        Class<StatusPagesComponentDataAttributesStatus> t) {
      super(t);
    }

    public StatusPagesComponentDataAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPagesComponentDataAttributesStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatusPagesComponentDataAttributesStatus fromValue(String value) {
    return new StatusPagesComponentDataAttributesStatus(value);
  }
}
