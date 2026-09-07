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

/** Resulting lifecycle status of the organization after the disable action. */
@JsonSerialize(using = CustomerOrgDisableStatus.CustomerOrgDisableStatusSerializer.class)
public class CustomerOrgDisableStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("disabled", "pending_disable"));

  public static final CustomerOrgDisableStatus DISABLED = new CustomerOrgDisableStatus("disabled");
  public static final CustomerOrgDisableStatus PENDING_DISABLE =
      new CustomerOrgDisableStatus("pending_disable");

  CustomerOrgDisableStatus(String value) {
    super(value, allowedValues);
  }

  public static class CustomerOrgDisableStatusSerializer
      extends StdSerializer<CustomerOrgDisableStatus> {
    public CustomerOrgDisableStatusSerializer(Class<CustomerOrgDisableStatus> t) {
      super(t);
    }

    public CustomerOrgDisableStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomerOrgDisableStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomerOrgDisableStatus fromValue(String value) {
    return new CustomerOrgDisableStatus(value);
  }
}
