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

/** JSON:API resource type for a customer org disable response. */
@JsonSerialize(
    using = CustomerOrgDisableResponseType.CustomerOrgDisableResponseTypeSerializer.class)
public class CustomerOrgDisableResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("org_disable"));

  public static final CustomerOrgDisableResponseType ORG_DISABLE =
      new CustomerOrgDisableResponseType("org_disable");

  CustomerOrgDisableResponseType(String value) {
    super(value, allowedValues);
  }

  public static class CustomerOrgDisableResponseTypeSerializer
      extends StdSerializer<CustomerOrgDisableResponseType> {
    public CustomerOrgDisableResponseTypeSerializer(Class<CustomerOrgDisableResponseType> t) {
      super(t);
    }

    public CustomerOrgDisableResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomerOrgDisableResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomerOrgDisableResponseType fromValue(String value) {
    return new CustomerOrgDisableResponseType(value);
  }
}
