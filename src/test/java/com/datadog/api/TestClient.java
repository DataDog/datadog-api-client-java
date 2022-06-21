package com.datadog.api;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_EXTRA_FIELDS;
import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URLDecoder;
import java.util.*;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestClient implements Client {
  public class TestStatus implements Response.StatusType {
    int status;

    public TestStatus(int status) {
      this.status = status;
    }

    @Override
    public int getStatusCode() {
      return this.status;
    }

    @Override
    public Response.Status.Family getFamily() {
      return Response.Status.Family.CLIENT_ERROR;
    }

    @Override
    public String getReasonPhrase() {
      return "error";
    }
  }

  public class TestBuilder implements Invocation.Builder {

    private TestClient client;

    public TestBuilder(TestClient client) {
      this.client = client;
    }

    @Override
    public Invocation build(String s) {
      return null;
    }

    @Override
    public Invocation build(String s, Entity<?> entity) {
      return null;
    }

    @Override
    public Invocation buildGet() {
      return null;
    }

    @Override
    public Invocation buildDelete() {
      return null;
    }

    @Override
    public Invocation buildPost(Entity<?> entity) {
      return null;
    }

    @Override
    public Invocation buildPut(Entity<?> entity) {
      return null;
    }

    @Override
    public AsyncInvoker async() {
      return null;
    }

    @Override
    public Invocation.Builder accept(String... strings) {
      return this;
    }

    @Override
    public Invocation.Builder accept(MediaType... mediaTypes) {
      return null;
    }

    @Override
    public Invocation.Builder acceptLanguage(Locale... locales) {
      return null;
    }

    @Override
    public Invocation.Builder acceptLanguage(String... strings) {
      return null;
    }

    @Override
    public Invocation.Builder acceptEncoding(String... strings) {
      return null;
    }

    @Override
    public Invocation.Builder cookie(Cookie cookie) {
      return null;
    }

    @Override
    public Invocation.Builder cookie(String s, String s1) {
      return null;
    }

    @Override
    public Invocation.Builder cacheControl(CacheControl cacheControl) {
      return null;
    }

    @Override
    public Invocation.Builder header(String s, Object o) {
      return this;
    }

    @Override
    public Invocation.Builder headers(MultivaluedMap<String, Object> multivaluedMap) {
      return null;
    }

    @Override
    public Invocation.Builder property(String s, Object o) {
      return null;
    }

    @Override
    public CompletionStageRxInvoker rx() {
      return null;
    }

    @Override
    public <T extends RxInvoker> T rx(Class<T> aClass) {
      return null;
    }

    @Override
    public Response get() {
      return this.method("GET");
    }

    @Override
    public <T> T get(Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T get(GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response put(Entity<?> entity) {
      return this.method("PUT", entity);
    }

    @Override
    public <T> T put(Entity<?> entity, Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T put(Entity<?> entity, GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response post(Entity<?> entity) {
      return this.method("POST", entity);
    }

    @Override
    public <T> T post(Entity<?> entity, Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T post(Entity<?> entity, GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response delete() {
      return this.method("DELETE");
    }

    @Override
    public <T> T delete(Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T delete(GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response head() {
      return null;
    }

    @Override
    public Response options() {
      return null;
    }

    @Override
    public <T> T options(Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T options(GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response trace() {
      return null;
    }

    @Override
    public <T> T trace(Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T trace(GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response method(String s) {
      Map record = (Map) this.client.records.get(this.client.requestCount);
      this.client.updateRequestCount();
      Map request = (Map) record.get("httpRequest");
      String method = (String) request.get("method");
      assertEquals(method, s);
      Map response = (Map) record.get("httpResponse");
      int statusCode = (int) response.get("statusCode");
      Map<String, List<String>> originalHeaders =
          (Map<String, List<String>>) response.get("headers");
      MultivaluedMap<String, String> headers = new MultivaluedHashMap<String, String>();
      for (Map.Entry<String, List<String>> entry : originalHeaders.entrySet()) {
        headers.addAll(entry.getKey(), entry.getValue());
      }
      String body = (String) response.get("body");

      return new TestResponse(statusCode, headers, body, this.client.mapper);
    }

    @Override
    public <T> T method(String s, Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T method(String s, GenericType<T> genericType) {
      return null;
    }

    @Override
    public Response method(String s, Entity<?> entity) {
      Map record = (Map) this.client.records.get(this.client.requestCount);
      this.client.updateRequestCount();
      Map request = (Map) record.get("httpRequest");
      Map requestBody = (Map) request.get("body");
      if (requestBody == null) {
        assertEquals("", entity.getEntity());
      } else {
        String json = (String) requestBody.get("json");
        String inputJson = "";
        try {
          inputJson = this.client.mapper.writeValueAsString(entity.getEntity());
        } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
        }
        assertThatJson(inputJson).when(IGNORING_EXTRA_FIELDS).withTolerance(0).isEqualTo(json);
      }
      String method = (String) request.get("method");
      assertEquals(method, s);
      Map response = (Map) record.get("httpResponse");
      int statusCode = (int) response.get("statusCode");
      Map<String, List<String>> originalHeaders =
          (Map<String, List<String>>) response.get("headers");
      MultivaluedMap<String, String> headers = new MultivaluedHashMap<String, String>();
      for (Map.Entry<String, List<String>> entry : originalHeaders.entrySet()) {
        headers.addAll(entry.getKey(), entry.getValue());
      }
      String body = (String) response.get("body");

      return new TestResponse(statusCode, headers, body, this.client.mapper);
    }

    @Override
    public <T> T method(String s, Entity<?> entity, Class<T> aClass) {
      return null;
    }

    @Override
    public <T> T method(String s, Entity<?> entity, GenericType<T> genericType) {
      return null;
    }
  }

  public class TestWebTarget implements WebTarget {
    private TestClient client;
    private Map<String, String> queryParams;

    public TestWebTarget(TestClient client) {
      this.client = client;
      this.queryParams = new HashMap<String, String>();
    }

    @Override
    public URI getUri() {
      return null;
    }

    @Override
    public UriBuilder getUriBuilder() {
      return null;
    }

    @Override
    public WebTarget path(String s) {
      return null;
    }

    @Override
    public WebTarget resolveTemplate(String s, Object o) {
      return null;
    }

    @Override
    public WebTarget resolveTemplate(String s, Object o, boolean b) {
      return null;
    }

    @Override
    public WebTarget resolveTemplateFromEncoded(String s, Object o) {
      return null;
    }

    @Override
    public WebTarget resolveTemplates(Map<String, Object> map) {
      return null;
    }

    @Override
    public WebTarget resolveTemplates(Map<String, Object> map, boolean b) {
      return null;
    }

    @Override
    public WebTarget resolveTemplatesFromEncoded(Map<String, Object> map) {
      return null;
    }

    @Override
    public WebTarget matrixParam(String s, Object... objects) {
      return null;
    }

    @Override
    public WebTarget queryParam(String s, Object... objects) {
      try {
        this.queryParams.put(s, URLDecoder.decode((String) objects[0], "utf-8"));
      } catch (UnsupportedEncodingException e) {
      }
      return this;
    }

    @Override
    public Invocation.Builder request() {
      Map record = (Map) this.client.records.get(this.client.requestCount);
      Map request = (Map) record.get("httpRequest");
      Map<String, List<String>> params =
          (Map<String, List<String>>) request.get("queryStringParameters");
      if (params != null) {
        Map expectedQueryParams = new HashMap<String, String>();
        for (Map.Entry<String, List<String>> entry : params.entrySet()) {
          expectedQueryParams.put(entry.getKey(), entry.getValue().get(0));
        }
        assertEquals(this.queryParams, expectedQueryParams);
      }
      return new TestBuilder(this.client);
    }

    @Override
    public Invocation.Builder request(String... strings) {
      return null;
    }

    @Override
    public Invocation.Builder request(MediaType... mediaTypes) {
      return null;
    }

    @Override
    public Configuration getConfiguration() {
      return null;
    }

    @Override
    public WebTarget property(String s, Object o) {
      return null;
    }

    @Override
    public WebTarget register(Class<?> aClass) {
      return null;
    }

    @Override
    public WebTarget register(Class<?> aClass, int i) {
      return null;
    }

    @Override
    public WebTarget register(Class<?> aClass, Class<?>... classes) {
      return null;
    }

    @Override
    public WebTarget register(Class<?> aClass, Map<Class<?>, Integer> map) {
      return null;
    }

    @Override
    public WebTarget register(Object o) {
      return null;
    }

    @Override
    public WebTarget register(Object o, int i) {
      return null;
    }

    @Override
    public WebTarget register(Object o, Class<?>... classes) {
      return null;
    }

    @Override
    public WebTarget register(Object o, Map<Class<?>, Integer> map) {
      return null;
    }
  }

  class TestResponse extends Response {

    private int status;
    private MultivaluedMap<String, String> headers;
    private String body;
    private ObjectMapper mapper;

    public TestResponse(
        int status, MultivaluedMap<String, String> headers, String body, ObjectMapper mapper) {
      this.status = status;
      this.headers = headers;
      this.body = body;
      this.mapper = mapper;
    }

    @Override
    public int getStatus() {
      return this.status;
    }

    @Override
    public StatusType getStatusInfo() {
      StatusType statusType = Response.Status.fromStatusCode(this.status);
      if (statusType == null) {
        return new TestStatus(this.status);
      }
      return statusType;
    }

    @Override
    public Object getEntity() {
      return null;
    }

    @Override
    public <T> T readEntity(Class<T> aClass) {
      if (aClass.equals(String.class)) {
        return (T) this.body;
      }
      return null;
    }

    @Override
    public <T> T readEntity(GenericType<T> genericType) {
      if (genericType.getRawType().equals(String.class)) {
        return (T) this.body;
      }
      String contentType = "";
      for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
        if (entry.getKey().equalsIgnoreCase("Content-Type")) {
          contentType = entry.getValue().get(0).toLowerCase();
          break;
        }
      }
      if (contentType.contains("application/json") || contentType.contains("text/json")) {
        try {
          return this.mapper.readValue(this.body, this.mapper.constructType(genericType.getType()));
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      } else if (genericType.getRawType().equals(File.class)) {
        try {
          File tempFile = File.createTempFile("response", ".data");
          tempFile.deleteOnExit();
          FileWriter writer = new FileWriter(tempFile);
          writer.write(this.body);
          writer.close();
          return (T) tempFile;
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return null;
    }

    @Override
    public <T> T readEntity(Class<T> aClass, Annotation[] annotations) {
      return null;
    }

    @Override
    public <T> T readEntity(GenericType<T> genericType, Annotation[] annotations) {
      return null;
    }

    @Override
    public boolean hasEntity() {
      return this.body != "";
    }

    @Override
    public boolean bufferEntity() {
      return false;
    }

    @Override
    public void close() {}

    @Override
    public MediaType getMediaType() {
      return null;
    }

    @Override
    public Locale getLanguage() {
      return null;
    }

    @Override
    public int getLength() {
      return 0;
    }

    @Override
    public Set<String> getAllowedMethods() {
      return null;
    }

    @Override
    public Map<String, NewCookie> getCookies() {
      return null;
    }

    @Override
    public EntityTag getEntityTag() {
      return null;
    }

    @Override
    public Date getDate() {
      return null;
    }

    @Override
    public Date getLastModified() {
      return null;
    }

    @Override
    public URI getLocation() {
      return null;
    }

    @Override
    public Set<Link> getLinks() {
      return null;
    }

    @Override
    public boolean hasLink(String s) {
      return false;
    }

    @Override
    public Link getLink(String s) {
      return null;
    }

    @Override
    public Link.Builder getLinkBuilder(String s) {
      return null;
    }

    @Override
    public MultivaluedMap<String, Object> getMetadata() {
      return null;
    }

    @Override
    public MultivaluedMap<String, Object> getHeaders() {
      MultivaluedMap<String, Object> newHeaders = new MultivaluedHashMap<String, Object>();
      for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
        newHeaders.addAll(entry.getKey(), entry.getValue());
      }
      return newHeaders;
    }

    @Override
    public MultivaluedMap<String, String> getStringHeaders() {
      return this.headers;
    }

    @Override
    public String getHeaderString(String s) {
      return null;
    }
  }

  private String testName;
  public ObjectMapper mapper;
  public List records = null;
  public int requestCount = 0;
  protected static String cassettesDir = "src/test/resources/cassettes";

  public TestClient(String testName, String path, ObjectMapper mapper) {
    this.testName = testName;
    this.mapper = mapper;
    File cassette = new File(cassettesDir + path + "/" + testName + ".json");
    try {
      this.records = this.mapper.readValue(cassette, List.class);
    } catch (IOException e) {
    }
  }

  public void updateRequestCount() {
    this.requestCount += 1;
  }

  @Override
  public HostnameVerifier getHostnameVerifier() {
    return null;
  }

  @Override
  public SSLContext getSslContext() {
    return null;
  }

  @Override
  public WebTarget target(String uri) {
    return null;
  }

  @Override
  public WebTarget target(URI uri) {
    Map record = (Map) this.records.get(this.requestCount);
    Map request = (Map) record.get("httpRequest");
    String path = (String) request.get("path");
    try {
      assertEquals(uri.getPath(), URLDecoder.decode(path, "utf-8"));
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    return new TestWebTarget(this);
  }

  @Override
  public WebTarget target(Link link) {
    return null;
  }

  @Override
  public WebTarget target(UriBuilder uriBuilder) {
    return null;
  }

  @Override
  public Invocation.Builder invocation(Link link) {
    return null;
  }

  @Override
  public void close() {}

  @Override
  public Configuration getConfiguration() {
    return null;
  }

  @Override
  public Client property(String s, Object o) {
    return null;
  }

  @Override
  public Client register(Class<?> aClass) {
    return null;
  }

  @Override
  public Client register(Class<?> aClass, int i) {
    return null;
  }

  @Override
  public Client register(Class<?> aClass, Class<?>... classes) {
    return null;
  }

  @Override
  public Client register(Class<?> aClass, Map<Class<?>, Integer> map) {
    return null;
  }

  @Override
  public Client register(Object o) {
    return null;
  }

  @Override
  public Client register(Object o, int i) {
    return null;
  }

  @Override
  public Client register(Object o, Class<?>... classes) {
    return null;
  }

  @Override
  public Client register(Object o, Map<Class<?>, Integer> map) {
    return null;
  }
}
