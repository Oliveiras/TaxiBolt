package com.rhcloud.oliveirasapps.taxibolt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
@Entity
public class Passenger implements Serializable
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

   private @Temporal(TemporalType.DATE)
   @NotNull(message = "Birthdate cannot be null")
   @Past(message = "Invalid birthdate")
   Date birthdate;

   @Column
   private @NotNull(message = "Email cannot be null")
   @Email(message = "Invalid email")
   String email;

   @Column
   private @NotNull(message = "Password cannot be null")
   @Size(message = "Invalid password size", min = 4)
   String password;

   @Column
   private Double latitude;

   @Column
   private Double longitude;

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
         return id.equals(((Passenger) that).id);
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

   public Date getBirthdate()
   {
      return this.birthdate;
   }

   public void setBirthdate(final Date birthdate)
   {
      this.birthdate = birthdate;
   }

   public String getEmail()
   {
      return this.email;
   }

   public void setEmail(final String email)
   {
      this.email = email;
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

   public String toString()
   {
      String result = "";
      if (name != null && !name.trim().isEmpty())
         result += name;
      if (mobileNumber != null && !mobileNumber.trim().isEmpty())
         result += " " + mobileNumber;
      if (email != null && !email.trim().isEmpty())
         result += " " + email;
      if (password != null && !password.trim().isEmpty())
         result += " " + password;
      if (latitude != null)
         result += " " + latitude;
      if (longitude != null)
         result += " " + longitude;
      return result;
   }
}