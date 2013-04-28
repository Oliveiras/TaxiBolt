package com.rhcloud.oliveirasapps.taxibolt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@XmlRootElement
@SuppressWarnings("serial")
@Entity
public class TaxiDriver implements Serializable
{

   @Id
   private @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   Long id = null;

   @Version
   private @Column(name = "version")
   int version = 0;

   @Column
   private @NotNull(message = "Name cannot be null")
   String name;

   @Column
   private @NotNull(message = "Mobile number cannot be null")
   String mobileNumber;

   @Column
   private String taxiCompany;

   @Column
   private @NotNull(message = "License plate cannot be null")
   String licensePlate;

   @Column
   private @NotNull(message = "Password cannot be null")
   @Size(message = "Invalid password size", min = 4)
   String password;

   @Column
   private Double latitude;

   @Column
   private Double longitude;

   @Column
   private boolean available;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object that)
   {
      if (this == that)
      {
         return true;
      }
      if (that == null)
      {
         return false;
      }
      if (getClass() != that.getClass())
      {
         return false;
      }
      if (id != null)
      {
         return id.equals(((TaxiDriver) that).id);
      }
      return super.equals(that);
   }

   @Override
   public int hashCode()
   {
      if (id != null)
      {
         return id.hashCode();
      }
      return super.hashCode();
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(final String name)
   {
      this.name = name;
   }

   public String getMobileNumber()
   {
      return this.mobileNumber;
   }

   public void setMobileNumber(final String mobileNumber)
   {
      this.mobileNumber = mobileNumber;
   }

   public String getTaxiCompany()
   {
      return this.taxiCompany;
   }

   public void setTaxiCompany(final String taxiCompany)
   {
      this.taxiCompany = taxiCompany;
   }

   public String getLicensePlate()
   {
      return this.licensePlate;
   }

   public void setLicensePlate(final String licensePlate)
   {
      this.licensePlate = licensePlate;
   }

   public String getPassword()
   {
      return this.password;
   }

   public void setPassword(final String password)
   {
      this.password = password;
   }

   public Double getLatitude()
   {
      return this.latitude;
   }

   public void setLatitude(final Double latitude)
   {
      this.latitude = latitude;
   }

   public Double getLongitude()
   {
      return this.longitude;
   }

   public void setLongitude(final Double longitude)
   {
      this.longitude = longitude;
   }

   public boolean getAvailable()
   {
      return this.available;
   }

   public void setAvailable(final boolean available)
   {
      this.available = available;
   }

   public String toString()
   {
      String result = "";
      if (name != null && !name.trim().isEmpty())
         result += name;
      if (mobileNumber != null && !mobileNumber.trim().isEmpty())
         result += " " + mobileNumber;
      if (taxiCompany != null && !taxiCompany.trim().isEmpty())
         result += " " + taxiCompany;
      if (licensePlate != null && !licensePlate.trim().isEmpty())
         result += " " + licensePlate;
      if (password != null && !password.trim().isEmpty())
         result += " " + password;
      if (latitude != null)
         result += " " + latitude;
      if (longitude != null)
         result += " " + longitude;
      result += " " + available;
      return result;
   }
}