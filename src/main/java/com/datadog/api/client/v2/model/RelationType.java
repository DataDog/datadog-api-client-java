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
   * <p>Supported relation types.</p>
 */
@JsonSerialize(using = RelationType.RelationTypeSerializer.class)
public class RelationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("RelationTypeOwns", "RelationTypeOwnedBy", "RelationTypeDependsOn", "RelationTypeDependencyOf", "RelationTypePartsOf", "RelationTypeHasPart", "RelationTypeOtherOwns", "RelationTypeOtherOwnedBy", "RelationTypeImplementedBy", "RelationTypeImplements"));

  public static final RelationType RELATIONTYPEOWNS = new RelationType("RelationTypeOwns");
  public static final RelationType RELATIONTYPEOWNEDBY = new RelationType("RelationTypeOwnedBy");
  public static final RelationType RELATIONTYPEDEPENDSON = new RelationType("RelationTypeDependsOn");
  public static final RelationType RELATIONTYPEDEPENDENCYOF = new RelationType("RelationTypeDependencyOf");
  public static final RelationType RELATIONTYPEPARTSOF = new RelationType("RelationTypePartsOf");
  public static final RelationType RELATIONTYPEHASPART = new RelationType("RelationTypeHasPart");
  public static final RelationType RELATIONTYPEOTHEROWNS = new RelationType("RelationTypeOtherOwns");
  public static final RelationType RELATIONTYPEOTHEROWNEDBY = new RelationType("RelationTypeOtherOwnedBy");
  public static final RelationType RELATIONTYPEIMPLEMENTEDBY = new RelationType("RelationTypeImplementedBy");
  public static final RelationType RELATIONTYPEIMPLEMENTS = new RelationType("RelationTypeImplements");


  RelationType(String value) {
    super(value, allowedValues);
  }

  public static class RelationTypeSerializer extends StdSerializer<RelationType> {
      public RelationTypeSerializer(Class<RelationType> t) {
          super(t);
      }

      public RelationTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(RelationType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static RelationType fromValue(String value) {
    return new RelationType(value);
  }
}
