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

/** The status of a backfilled maintenance update. */
@JsonSerialize(
    using =
        CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus
            .CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer.class)
public class CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("in_progress", "completed"));

  public static final CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus
      IN_PROGRESS =
          new CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus("in_progress");
  public static final CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus COMPLETED =
      new CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus("completed");

  CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static class CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer
      extends StdSerializer<CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus> {
    public CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer(
        Class<CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus> t) {
      super(t);
    }

    public CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus fromValue(
      String value) {
    return new CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus(value);
  }
}
