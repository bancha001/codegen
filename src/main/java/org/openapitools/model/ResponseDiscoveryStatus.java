package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Links;
import org.openapitools.model.ResponseDiscoveryStatusData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDiscoveryStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-03T05:52:01.596Z[GMT]")

public class ResponseDiscoveryStatus   {
  @JsonProperty("data")
  private ResponseDiscoveryStatusData data;

  @JsonProperty("links")
  private Links links;

  @JsonProperty("meta")
  private Object meta;

  public ResponseDiscoveryStatus data(ResponseDiscoveryStatusData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponseDiscoveryStatusData getData() {
    return data;
  }

  public void setData(ResponseDiscoveryStatusData data) {
    this.data = data;
  }

  public ResponseDiscoveryStatus links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ResponseDiscoveryStatus meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDiscoveryStatus responseDiscoveryStatus = (ResponseDiscoveryStatus) o;
    return Objects.equals(this.data, responseDiscoveryStatus.data) &&
        Objects.equals(this.links, responseDiscoveryStatus.links) &&
        Objects.equals(this.meta, responseDiscoveryStatus.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDiscoveryStatus {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

