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

/** Type of account filters patch request. */
@JsonSerialize(
    using = AccountFiltersPatchRequestType.AccountFiltersPatchRequestTypeSerializer.class)
public class AccountFiltersPatchRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("account_filters_patch_request"));

  public static final AccountFiltersPatchRequestType ACCOUNT_FILTERS_PATCH_REQUEST =
      new AccountFiltersPatchRequestType("account_filters_patch_request");

  AccountFiltersPatchRequestType(String value) {
    super(value, allowedValues);
  }

  public static class AccountFiltersPatchRequestTypeSerializer
      extends StdSerializer<AccountFiltersPatchRequestType> {
    public AccountFiltersPatchRequestTypeSerializer(Class<AccountFiltersPatchRequestType> t) {
      super(t);
    }

    public AccountFiltersPatchRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AccountFiltersPatchRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccountFiltersPatchRequestType fromValue(String value) {
    return new AccountFiltersPatchRequestType(value);
  }
}
