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

/** The definition of <code>DORAListDeploymentsRequestDataType</code> object. */
@JsonSerialize(
    using = DORAListDeploymentsRequestDataType.DORAListDeploymentsRequestDataTypeSerializer.class)
public class DORAListDeploymentsRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dora_deployments_list_request"));

  public static final DORAListDeploymentsRequestDataType DORA_DEPLOYMENTS_LIST_REQUEST =
      new DORAListDeploymentsRequestDataType("dora_deployments_list_request");

  DORAListDeploymentsRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class DORAListDeploymentsRequestDataTypeSerializer
      extends StdSerializer<DORAListDeploymentsRequestDataType> {
    public DORAListDeploymentsRequestDataTypeSerializer(
        Class<DORAListDeploymentsRequestDataType> t) {
      super(t);
    }

    public DORAListDeploymentsRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DORAListDeploymentsRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DORAListDeploymentsRequestDataType fromValue(String value) {
    return new DORAListDeploymentsRequestDataType(value);
  }
}
