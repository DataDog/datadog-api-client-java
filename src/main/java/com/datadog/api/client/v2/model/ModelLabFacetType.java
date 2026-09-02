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

/** The type of facet for filtering Model Lab runs. */
@JsonSerialize(using = ModelLabFacetType.ModelLabFacetTypeSerializer.class)
public class ModelLabFacetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("parameter", "attribute", "tag", "metric"));

  public static final ModelLabFacetType PARAMETER = new ModelLabFacetType("parameter");
  public static final ModelLabFacetType ATTRIBUTE = new ModelLabFacetType("attribute");
  public static final ModelLabFacetType TAG = new ModelLabFacetType("tag");
  public static final ModelLabFacetType METRIC = new ModelLabFacetType("metric");

  ModelLabFacetType(String value) {
    super(value, allowedValues);
  }

  public static class ModelLabFacetTypeSerializer extends StdSerializer<ModelLabFacetType> {
    public ModelLabFacetTypeSerializer(Class<ModelLabFacetType> t) {
      super(t);
    }

    public ModelLabFacetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ModelLabFacetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ModelLabFacetType fromValue(String value) {
    return new ModelLabFacetType(value);
  }
}
