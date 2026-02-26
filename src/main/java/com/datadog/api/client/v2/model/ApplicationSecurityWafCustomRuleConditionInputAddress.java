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

/** Input from the request on which the condition should apply. */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleConditionInputAddress
            .ApplicationSecurityWafCustomRuleConditionInputAddressSerializer.class)
public class ApplicationSecurityWafCustomRuleConditionInputAddress extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "server.db.statement",
              "server.io.fs.file",
              "server.io.net.url",
              "server.sys.shell.cmd",
              "server.request.method",
              "server.request.uri.raw",
              "server.request.path_params",
              "server.request.query",
              "server.request.headers.no_cookies",
              "server.request.cookies",
              "server.request.trailers",
              "server.request.body",
              "server.response.status",
              "server.response.headers.no_cookies",
              "server.response.trailers",
              "grpc.server.request.metadata",
              "grpc.server.request.message",
              "grpc.server.method",
              "graphql.server.all_resolvers",
              "usr.id",
              "http.client_ip"));

  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_DB_STATEMENT =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.db.statement");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_IO_FS_FILE =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.io.fs.file");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_IO_NET_URL =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.io.net.url");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_SYS_SHELL_CMD =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.sys.shell.cmd");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_REQUEST_METHOD =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.method");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_REQUEST_URI_RAW =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.uri.raw");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      SERVER_REQUEST_PATH_PARAMS =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.path_params");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_REQUEST_QUERY =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.query");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      SERVER_REQUEST_HEADERS_NO_COOKIES =
          new ApplicationSecurityWafCustomRuleConditionInputAddress(
              "server.request.headers.no_cookies");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_REQUEST_COOKIES =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.cookies");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      SERVER_REQUEST_TRAILERS =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.trailers");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_REQUEST_BODY =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.request.body");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress SERVER_RESPONSE_STATUS =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("server.response.status");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      SERVER_RESPONSE_HEADERS_NO_COOKIES =
          new ApplicationSecurityWafCustomRuleConditionInputAddress(
              "server.response.headers.no_cookies");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      SERVER_RESPONSE_TRAILERS =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("server.response.trailers");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      GRPC_SERVER_REQUEST_METADATA =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("grpc.server.request.metadata");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      GRPC_SERVER_REQUEST_MESSAGE =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("grpc.server.request.message");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress GRPC_SERVER_METHOD =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("grpc.server.method");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress
      GRAPHQL_SERVER_ALL_RESOLVERS =
          new ApplicationSecurityWafCustomRuleConditionInputAddress("graphql.server.all_resolvers");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress USR_ID =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("usr.id");
  public static final ApplicationSecurityWafCustomRuleConditionInputAddress HTTP_CLIENT_IP =
      new ApplicationSecurityWafCustomRuleConditionInputAddress("http.client_ip");

  ApplicationSecurityWafCustomRuleConditionInputAddress(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleConditionInputAddressSerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleConditionInputAddress> {
    public ApplicationSecurityWafCustomRuleConditionInputAddressSerializer(
        Class<ApplicationSecurityWafCustomRuleConditionInputAddress> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleConditionInputAddressSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleConditionInputAddress value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleConditionInputAddress fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleConditionInputAddress(value);
  }
}
