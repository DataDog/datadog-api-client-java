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

/** Type of the Cloud Cost Management tag description resource. */
@JsonSerialize(using = CostTagDescriptionType.CostTagDescriptionTypeSerializer.class)
public class CostTagDescriptionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_tag_description"));

  public static final CostTagDescriptionType COST_TAG_DESCRIPTION =
      new CostTagDescriptionType("cost_tag_description");

  CostTagDescriptionType(String value) {
    super(value, allowedValues);
  }

  public static class CostTagDescriptionTypeSerializer
      extends StdSerializer<CostTagDescriptionType> {
    public CostTagDescriptionTypeSerializer(Class<CostTagDescriptionType> t) {
      super(t);
    }

    public CostTagDescriptionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagDescriptionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagDescriptionType fromValue(String value) {
    return new CostTagDescriptionType(value);
  }
}
