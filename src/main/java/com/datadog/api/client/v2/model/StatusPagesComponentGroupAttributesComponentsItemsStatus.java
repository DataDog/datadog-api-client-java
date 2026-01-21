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
        StatusPagesComponentGroupAttributesComponentsItemsStatus
            .StatusPagesComponentGroupAttributesComponentsItemsStatusSerializer.class)
public class StatusPagesComponentGroupAttributesComponentsItemsStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("operational", "degraded", "partial_outage", "major_outage"));

  public static final StatusPagesComponentGroupAttributesComponentsItemsStatus OPERATIONAL =
      new StatusPagesComponentGroupAttributesComponentsItemsStatus("operational");
  public static final StatusPagesComponentGroupAttributesComponentsItemsStatus DEGRADED =
      new StatusPagesComponentGroupAttributesComponentsItemsStatus("degraded");
  public static final StatusPagesComponentGroupAttributesComponentsItemsStatus PARTIAL_OUTAGE =
      new StatusPagesComponentGroupAttributesComponentsItemsStatus("partial_outage");
  public static final StatusPagesComponentGroupAttributesComponentsItemsStatus MAJOR_OUTAGE =
      new StatusPagesComponentGroupAttributesComponentsItemsStatus("major_outage");

  StatusPagesComponentGroupAttributesComponentsItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static class StatusPagesComponentGroupAttributesComponentsItemsStatusSerializer
      extends StdSerializer<StatusPagesComponentGroupAttributesComponentsItemsStatus> {
    public StatusPagesComponentGroupAttributesComponentsItemsStatusSerializer(
        Class<StatusPagesComponentGroupAttributesComponentsItemsStatus> t) {
      super(t);
    }

    public StatusPagesComponentGroupAttributesComponentsItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPagesComponentGroupAttributesComponentsItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatusPagesComponentGroupAttributesComponentsItemsStatus fromValue(String value) {
    return new StatusPagesComponentGroupAttributesComponentsItemsStatus(value);
  }
}
