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

/** Type of account filters. */
@JsonSerialize(using = AccountFiltersType.AccountFiltersTypeSerializer.class)
public class AccountFiltersType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("account_filters"));

  public static final AccountFiltersType ACCOUNT_FILTERS =
      new AccountFiltersType("account_filters");

  AccountFiltersType(String value) {
    super(value, allowedValues);
  }

  public static class AccountFiltersTypeSerializer extends StdSerializer<AccountFiltersType> {
    public AccountFiltersTypeSerializer(Class<AccountFiltersType> t) {
      super(t);
    }

    public AccountFiltersTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AccountFiltersType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccountFiltersType fromValue(String value) {
    return new AccountFiltersType(value);
  }
}
