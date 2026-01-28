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

/** Project favorite resource type */
@JsonSerialize(using = ProjectFavoriteResourceType.ProjectFavoriteResourceTypeSerializer.class)
public class ProjectFavoriteResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("project_favorite"));

  public static final ProjectFavoriteResourceType PROJECT_FAVORITE =
      new ProjectFavoriteResourceType("project_favorite");

  ProjectFavoriteResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ProjectFavoriteResourceTypeSerializer
      extends StdSerializer<ProjectFavoriteResourceType> {
    public ProjectFavoriteResourceTypeSerializer(Class<ProjectFavoriteResourceType> t) {
      super(t);
    }

    public ProjectFavoriteResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProjectFavoriteResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProjectFavoriteResourceType fromValue(String value) {
    return new ProjectFavoriteResourceType(value);
  }
}
