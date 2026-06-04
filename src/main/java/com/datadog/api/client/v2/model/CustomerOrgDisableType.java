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

/** JSON:API resource type for a customer org disable request. */
@JsonSerialize(using = CustomerOrgDisableType.CustomerOrgDisableTypeSerializer.class)
public class CustomerOrgDisableType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("customer_org_disable"));

  public static final CustomerOrgDisableType CUSTOMER_ORG_DISABLE =
      new CustomerOrgDisableType("customer_org_disable");

  CustomerOrgDisableType(String value) {
    super(value, allowedValues);
  }

  public static class CustomerOrgDisableTypeSerializer
      extends StdSerializer<CustomerOrgDisableType> {
    public CustomerOrgDisableTypeSerializer(Class<CustomerOrgDisableType> t) {
      super(t);
    }

    public CustomerOrgDisableTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomerOrgDisableType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomerOrgDisableType fromValue(String value) {
    return new CustomerOrgDisableType(value);
  }
}
