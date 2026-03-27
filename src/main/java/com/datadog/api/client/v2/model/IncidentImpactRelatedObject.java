/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>A reference to a resource related to an incident impact.</p>
 */
@JsonSerialize(using = IncidentImpactRelatedObject.IncidentImpactRelatedObjectSerializer.class)
public class IncidentImpactRelatedObject extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("incident", "created_by_user", "last_modified_by_user"));

  public static final IncidentImpactRelatedObject INCIDENT = new IncidentImpactRelatedObject("incident");
  public static final IncidentImpactRelatedObject CREATED_BY_USER = new IncidentImpactRelatedObject("created_by_user");
  public static final IncidentImpactRelatedObject LAST_MODIFIED_BY_USER = new IncidentImpactRelatedObject("last_modified_by_user");


  IncidentImpactRelatedObject(String value) {
    super(value, allowedValues);
  }

  public static class IncidentImpactRelatedObjectSerializer extends StdSerializer<IncidentImpactRelatedObject> {
      public IncidentImpactRelatedObjectSerializer(Class<IncidentImpactRelatedObject> t) {
          super(t);
      }

      public IncidentImpactRelatedObjectSerializer() {
          this(null);
      }

      @Override
      public void serialize(IncidentImpactRelatedObject value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static IncidentImpactRelatedObject fromValue(String value) {
    return new IncidentImpactRelatedObject(value);
  }
}
