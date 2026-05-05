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

/** The status of a maintenance update. */
@JsonSerialize(
    using =
        CreateMaintenanceRequestDataAttributesUpdatesItemsStatus
            .CreateMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer.class)
public class CreateMaintenanceRequestDataAttributesUpdatesItemsStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("in_progress", "completed", "canceled"));

  public static final CreateMaintenanceRequestDataAttributesUpdatesItemsStatus IN_PROGRESS =
      new CreateMaintenanceRequestDataAttributesUpdatesItemsStatus("in_progress");
  public static final CreateMaintenanceRequestDataAttributesUpdatesItemsStatus COMPLETED =
      new CreateMaintenanceRequestDataAttributesUpdatesItemsStatus("completed");
  public static final CreateMaintenanceRequestDataAttributesUpdatesItemsStatus CANCELED =
      new CreateMaintenanceRequestDataAttributesUpdatesItemsStatus("canceled");

  CreateMaintenanceRequestDataAttributesUpdatesItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static class CreateMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer
      extends StdSerializer<CreateMaintenanceRequestDataAttributesUpdatesItemsStatus> {
    public CreateMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer(
        Class<CreateMaintenanceRequestDataAttributesUpdatesItemsStatus> t) {
      super(t);
    }

    public CreateMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateMaintenanceRequestDataAttributesUpdatesItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateMaintenanceRequestDataAttributesUpdatesItemsStatus fromValue(String value) {
    return new CreateMaintenanceRequestDataAttributesUpdatesItemsStatus(value);
  }
}
