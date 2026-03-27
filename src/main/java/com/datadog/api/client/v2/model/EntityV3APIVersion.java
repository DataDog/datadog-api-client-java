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
   * <p>The version of the schema data that was used to populate this entity's data. This could be via the API, Terraform, or YAML file in a repository. The field is known as schema-version in the previous version.</p>
 */
@JsonSerialize(using = EntityV3APIVersion.EntityV3APIVersionSerializer.class)
public class EntityV3APIVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v3", "v2.2", "v2.1", "v2"));

  public static final EntityV3APIVersion V3 = new EntityV3APIVersion("v3");
  public static final EntityV3APIVersion V2_2 = new EntityV3APIVersion("v2.2");
  public static final EntityV3APIVersion V2_1 = new EntityV3APIVersion("v2.1");
  public static final EntityV3APIVersion V2 = new EntityV3APIVersion("v2");


  EntityV3APIVersion(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3APIVersionSerializer extends StdSerializer<EntityV3APIVersion> {
      public EntityV3APIVersionSerializer(Class<EntityV3APIVersion> t) {
          super(t);
      }

      public EntityV3APIVersionSerializer() {
          this(null);
      }

      @Override
      public void serialize(EntityV3APIVersion value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static EntityV3APIVersion fromValue(String value) {
    return new EntityV3APIVersion(value);
  }
}
