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

/** Type of cost data. */
@JsonSerialize(using = CostByOrgType.CostByOrgTypeSerializer.class)
public class CostByOrgType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_by_org"));

  public static final CostByOrgType COST_BY_ORG = new CostByOrgType("cost_by_org");

  CostByOrgType(String value) {
    super(value, allowedValues);
  }

  public static class CostByOrgTypeSerializer extends StdSerializer<CostByOrgType> {
    public CostByOrgTypeSerializer(Class<CostByOrgType> t) {
      super(t);
    }

    public CostByOrgTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CostByOrgType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostByOrgType fromValue(String value) {
    return new CostByOrgType(value);
  }
}
