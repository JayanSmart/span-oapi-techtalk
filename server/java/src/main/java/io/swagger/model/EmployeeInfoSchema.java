package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeeInfoSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-25T15:44:43.284425+02:00[Africa/Johannesburg]")


public class EmployeeInfoSchema   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = "Not Available";

  @JsonProperty("tenure")
  private Integer tenure = null;

  public EmployeeInfoSchema id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the employee
   * @return id
   **/
  @Schema(example = "1", description = "The id of the employee")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EmployeeInfoSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The employee name
   * @return name
   **/
  @Schema(example = "Joe Soap", description = "The employee name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeeInfoSchema tenure(Integer tenure) {
    this.tenure = tenure;
    return this;
  }

  /**
   * The tenure of an employee in days
   * @return tenure
   **/
  @Schema(example = "371", description = "The tenure of an employee in days")
  
    public Integer getTenure() {
    return tenure;
  }

  public void setTenure(Integer tenure) {
    this.tenure = tenure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeInfoSchema employeeInfoSchema = (EmployeeInfoSchema) o;
    return Objects.equals(this.id, employeeInfoSchema.id) &&
        Objects.equals(this.name, employeeInfoSchema.name) &&
        Objects.equals(this.tenure, employeeInfoSchema.tenure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tenure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeInfoSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenure: ").append(toIndentedString(tenure)).append("\n");
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
