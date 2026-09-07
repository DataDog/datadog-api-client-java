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

/** List deployment rule resource type. */
@JsonSerialize(using = ListDeploymentRulesDataType.ListDeploymentRulesDataTypeSerializer.class)
public class ListDeploymentRulesDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("list_deployment_rules"));

  public static final ListDeploymentRulesDataType LIST_DEPLOYMENT_RULES =
      new ListDeploymentRulesDataType("list_deployment_rules");

  ListDeploymentRulesDataType(String value) {
    super(value, allowedValues);
  }

  public static class ListDeploymentRulesDataTypeSerializer
      extends StdSerializer<ListDeploymentRulesDataType> {
    public ListDeploymentRulesDataTypeSerializer(Class<ListDeploymentRulesDataType> t) {
      super(t);
    }

    public ListDeploymentRulesDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListDeploymentRulesDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListDeploymentRulesDataType fromValue(String value) {
    return new ListDeploymentRulesDataType(value);
  }
}
