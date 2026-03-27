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

/** Team hierarchy link type */
@JsonSerialize(using = TeamHierarchyLinkType.TeamHierarchyLinkTypeSerializer.class)
public class TeamHierarchyLinkType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_hierarchy_links"));

  public static final TeamHierarchyLinkType TEAM_HIERARCHY_LINKS =
      new TeamHierarchyLinkType("team_hierarchy_links");

  TeamHierarchyLinkType(String value) {
    super(value, allowedValues);
  }

  public static class TeamHierarchyLinkTypeSerializer extends StdSerializer<TeamHierarchyLinkType> {
    public TeamHierarchyLinkTypeSerializer(Class<TeamHierarchyLinkType> t) {
      super(t);
    }

    public TeamHierarchyLinkTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamHierarchyLinkType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamHierarchyLinkType fromValue(String value) {
    return new TeamHierarchyLinkType(value);
  }
}
