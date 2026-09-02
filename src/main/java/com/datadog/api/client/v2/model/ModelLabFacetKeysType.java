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

/** The JSON:API type for a facet keys resource. */
@JsonSerialize(using = ModelLabFacetKeysType.ModelLabFacetKeysTypeSerializer.class)
public class ModelLabFacetKeysType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("facet_keys"));

  public static final ModelLabFacetKeysType FACET_KEYS = new ModelLabFacetKeysType("facet_keys");

  ModelLabFacetKeysType(String value) {
    super(value, allowedValues);
  }

  public static class ModelLabFacetKeysTypeSerializer extends StdSerializer<ModelLabFacetKeysType> {
    public ModelLabFacetKeysTypeSerializer(Class<ModelLabFacetKeysType> t) {
      super(t);
    }

    public ModelLabFacetKeysTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ModelLabFacetKeysType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ModelLabFacetKeysType fromValue(String value) {
    return new ModelLabFacetKeysType(value);
  }
}
