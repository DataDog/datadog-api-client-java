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

/**
 * JSON:API type for the GitHub account resource. The value must always be <code>ci_github_account
 * </code>.
 */
@JsonSerialize(using = CIAppGitHubAccountType.CIAppGitHubAccountTypeSerializer.class)
public class CIAppGitHubAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ci_github_account"));

  public static final CIAppGitHubAccountType CI_GITHUB_ACCOUNT =
      new CIAppGitHubAccountType("ci_github_account");

  CIAppGitHubAccountType(String value) {
    super(value, allowedValues);
  }

  public static class CIAppGitHubAccountTypeSerializer
      extends StdSerializer<CIAppGitHubAccountType> {
    public CIAppGitHubAccountTypeSerializer(Class<CIAppGitHubAccountType> t) {
      super(t);
    }

    public CIAppGitHubAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppGitHubAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppGitHubAccountType fromValue(String value) {
    return new CIAppGitHubAccountType(value);
  }
}
