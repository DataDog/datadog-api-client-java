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
 * The operation to perform on the selected hierarchy. When set to <code>include</code>,
 * synchronization covers the referenced teams or organizations.
 */
@JsonSerialize(
    using = TeamSyncSelectionStateOperation.TeamSyncSelectionStateOperationSerializer.class)
public class TeamSyncSelectionStateOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("include"));

  public static final TeamSyncSelectionStateOperation INCLUDE =
      new TeamSyncSelectionStateOperation("include");

  TeamSyncSelectionStateOperation(String value) {
    super(value, allowedValues);
  }

  public static class TeamSyncSelectionStateOperationSerializer
      extends StdSerializer<TeamSyncSelectionStateOperation> {
    public TeamSyncSelectionStateOperationSerializer(Class<TeamSyncSelectionStateOperation> t) {
      super(t);
    }

    public TeamSyncSelectionStateOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamSyncSelectionStateOperation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamSyncSelectionStateOperation fromValue(String value) {
    return new TeamSyncSelectionStateOperation(value);
  }
}
