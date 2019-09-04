package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingTransactionDetailAllOfExtendedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-03T05:52:01.596Z[GMT]")

public class BankingTransactionDetailAllOfExtendedData   {
  @JsonProperty("payer")
  private String payer;

  @JsonProperty("payee")
  private String payee;

  /**
   * Optional extended data provided specific to transaction originated via NPP
   */
  public enum ExtensionUTypeEnum {
    EXTENDEDDESCRIPTION("extendedDescription");

    private String value;

    ExtensionUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExtensionUTypeEnum fromValue(String value) {
      for (ExtensionUTypeEnum b : ExtensionUTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("extensionUType")
  private ExtensionUTypeEnum extensionUType;

  @JsonProperty("extendedDescription")
  private String extendedDescription;

  /**
   * Identifier of the applicable overlay service. Valid values are: X2P1.01
   */
  public enum ServiceEnum {
    X2P1_01("X2P1.01");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("service")
  private ServiceEnum service;

  public BankingTransactionDetailAllOfExtendedData payer(String payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Label of the originating payer. Mandatory for inbound payment
   * @return payer
  */
  @ApiModelProperty(value = "Label of the originating payer. Mandatory for inbound payment")


  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public BankingTransactionDetailAllOfExtendedData payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)
   * @return payee
  */
  @ApiModelProperty(value = "Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)")


  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public BankingTransactionDetailAllOfExtendedData extensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
    return this;
  }

  /**
   * Optional extended data provided specific to transaction originated via NPP
   * @return extensionUType
  */
  @ApiModelProperty(value = "Optional extended data provided specific to transaction originated via NPP")


  public ExtensionUTypeEnum getExtensionUType() {
    return extensionUType;
  }

  public void setExtensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
  }

  public BankingTransactionDetailAllOfExtendedData extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

  /**
   * An extended string description. Only present if specified by the extensionUType field
   * @return extendedDescription
  */
  @ApiModelProperty(value = "An extended string description. Only present if specified by the extensionUType field")


  public String getExtendedDescription() {
    return extendedDescription;
  }

  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }

  public BankingTransactionDetailAllOfExtendedData service(ServiceEnum service) {
    this.service = service;
    return this;
  }

  /**
   * Identifier of the applicable overlay service. Valid values are: X2P1.01
   * @return service
  */
  @ApiModelProperty(required = true, value = "Identifier of the applicable overlay service. Valid values are: X2P1.01")
  @NotNull


  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingTransactionDetailAllOfExtendedData bankingTransactionDetailAllOfExtendedData = (BankingTransactionDetailAllOfExtendedData) o;
    return Objects.equals(this.payer, bankingTransactionDetailAllOfExtendedData.payer) &&
        Objects.equals(this.payee, bankingTransactionDetailAllOfExtendedData.payee) &&
        Objects.equals(this.extensionUType, bankingTransactionDetailAllOfExtendedData.extensionUType) &&
        Objects.equals(this.extendedDescription, bankingTransactionDetailAllOfExtendedData.extendedDescription) &&
        Objects.equals(this.service, bankingTransactionDetailAllOfExtendedData.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payer, payee, extensionUType, extendedDescription, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingTransactionDetailAllOfExtendedData {\n");
    
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    extensionUType: ").append(toIndentedString(extensionUType)).append("\n");
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

