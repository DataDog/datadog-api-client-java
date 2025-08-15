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

/** Team sync bulk type. */
@JsonSerialize(using = TeamSyncBulkType.TeamSyncBulkTypeSerializer.class)
public class TeamSyncBulkType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_sync_bulk"));

  public static final TeamSyncBulkType TEAM_SYNC_BULK = new TeamSyncBulkType("team_sync_bulk");

  TeamSyncBulkType(String value) {
    super(value, allowedValues);
  }

  public static class TeamSyncBulkTypeSerializer extends StdSerializer<TeamSyncBulkType> {
    public TeamSyncBulkTypeSerializer(Class<TeamSyncBulkType> t) {
      super(t);
    }

    public TeamSyncBulkTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TeamSyncBulkType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamSyncBulkType fromValue(String value) {
    return new TeamSyncBulkType(value);
  }
}
