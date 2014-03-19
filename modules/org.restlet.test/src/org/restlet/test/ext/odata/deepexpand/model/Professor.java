/**
 * Copyright 2005-2014 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.test.ext.odata.deepexpand.model;


import java.util.Date;
import java.util.List;

import org.restlet.test.ext.odata.deepexpand.model.Address;
import org.restlet.test.ext.odata.deepexpand.model.CoOp;
import org.restlet.test.ext.odata.deepexpand.model.Department;
import org.restlet.test.ext.odata.deepexpand.model.Division;
import org.restlet.test.ext.odata.deepexpand.model.Group;
import org.restlet.test.ext.odata.deepexpand.model.Job;
import org.restlet.test.ext.odata.deepexpand.model.JobPosting;
import org.restlet.test.ext.odata.deepexpand.model.Language;
import org.restlet.test.ext.odata.deepexpand.model.Report;
import org.restlet.test.ext.odata.deepexpand.model.Role;
import org.restlet.test.ext.odata.deepexpand.model.Telephone;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class Professor {

    private Date dateOfBirth;
    private String email;
    private String fatherName;
    private String gender;
    private int id;
    private String motherName;
    private String name;
    private String notes;
    private String rank;
    private String surname;
    private String userName;
    private Tracking tracking;
    private List<CoOp> academicallyDirectedCoOps;
    private List<Address> addresses;
    private CoOp defaultCoOp;
    private Department department;
    private Division division;
    private List<CoOp> institutionallyDirectedCoOps;
    private Language preferredLanguage;
    private List<Report> reports;
    private List<Role> roles;
    private List<CoOp> scientificallyDirectedCoOps;
    private List<CoOp> supervisedCoOps;
    private List<Group> supervisedGroups;
    private List<JobPosting> supervisedJobPostings;
    private List<Job> supervisedJobs;
    private List<Telephone> telephones;

    /**
     * Constructor without parameter.
     * 
     */
    public Professor() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Professor(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "dateOfBirth" attribute.
    *
    * @return The value of the "dateOfBirth" attribute.
    */
   public Date getDateOfBirth() {
      return dateOfBirth;
   }
   /**
    * Returns the value of the "email" attribute.
    *
    * @return The value of the "email" attribute.
    */
   public String getEmail() {
      return email;
   }
   /**
    * Returns the value of the "fatherName" attribute.
    *
    * @return The value of the "fatherName" attribute.
    */
   public String getFatherName() {
      return fatherName;
   }
   /**
    * Returns the value of the "gender" attribute.
    *
    * @return The value of the "gender" attribute.
    */
   public String getGender() {
      return gender;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public int getId() {
      return id;
   }
   /**
    * Returns the value of the "motherName" attribute.
    *
    * @return The value of the "motherName" attribute.
    */
   public String getMotherName() {
      return motherName;
   }
   /**
    * Returns the value of the "name" attribute.
    *
    * @return The value of the "name" attribute.
    */
   public String getName() {
      return name;
   }
   /**
    * Returns the value of the "notes" attribute.
    *
    * @return The value of the "notes" attribute.
    */
   public String getNotes() {
      return notes;
   }
   /**
    * Returns the value of the "rank" attribute.
    *
    * @return The value of the "rank" attribute.
    */
   public String getRank() {
      return rank;
   }
   /**
    * Returns the value of the "surname" attribute.
    *
    * @return The value of the "surname" attribute.
    */
   public String getSurname() {
      return surname;
   }
   /**
    * Returns the value of the "userName" attribute.
    *
    * @return The value of the "userName" attribute.
    */
   public String getUserName() {
      return userName;
   }
   /**
    * Returns the value of the "tracking" attribute.
    *
    * @return The value of the "tracking" attribute.
    */
   public Tracking getTracking() {
      return tracking;
   }
   /**
    * Returns the value of the "academicallyDirectedCoOps" attribute.
    *
    * @return The value of the "academicallyDirectedCoOps" attribute.
    */
   public List<CoOp> getAcademicallyDirectedCoOps() {
      return academicallyDirectedCoOps;
   }
   
   /**
    * Returns the value of the "addresses" attribute.
    *
    * @return The value of the "addresses" attribute.
    */
   public List<Address> getAddresses() {
      return addresses;
   }
   
   /**
    * Returns the value of the "defaultCoOp" attribute.
    *
    * @return The value of the "defaultCoOp" attribute.
    */
   public CoOp getDefaultCoOp() {
      return defaultCoOp;
   }
   
   /**
    * Returns the value of the "department" attribute.
    *
    * @return The value of the "department" attribute.
    */
   public Department getDepartment() {
      return department;
   }
   
   /**
    * Returns the value of the "division" attribute.
    *
    * @return The value of the "division" attribute.
    */
   public Division getDivision() {
      return division;
   }
   
   /**
    * Returns the value of the "institutionallyDirectedCoOps" attribute.
    *
    * @return The value of the "institutionallyDirectedCoOps" attribute.
    */
   public List<CoOp> getInstitutionallyDirectedCoOps() {
      return institutionallyDirectedCoOps;
   }
   
   /**
    * Returns the value of the "preferredLanguage" attribute.
    *
    * @return The value of the "preferredLanguage" attribute.
    */
   public Language getPreferredLanguage() {
      return preferredLanguage;
   }
   
   /**
    * Returns the value of the "reports" attribute.
    *
    * @return The value of the "reports" attribute.
    */
   public List<Report> getReports() {
      return reports;
   }
   
   /**
    * Returns the value of the "roles" attribute.
    *
    * @return The value of the "roles" attribute.
    */
   public List<Role> getRoles() {
      return roles;
   }
   
   /**
    * Returns the value of the "scientificallyDirectedCoOps" attribute.
    *
    * @return The value of the "scientificallyDirectedCoOps" attribute.
    */
   public List<CoOp> getScientificallyDirectedCoOps() {
      return scientificallyDirectedCoOps;
   }
   
   /**
    * Returns the value of the "supervisedCoOps" attribute.
    *
    * @return The value of the "supervisedCoOps" attribute.
    */
   public List<CoOp> getSupervisedCoOps() {
      return supervisedCoOps;
   }
   
   /**
    * Returns the value of the "supervisedGroups" attribute.
    *
    * @return The value of the "supervisedGroups" attribute.
    */
   public List<Group> getSupervisedGroups() {
      return supervisedGroups;
   }
   
   /**
    * Returns the value of the "supervisedJobPostings" attribute.
    *
    * @return The value of the "supervisedJobPostings" attribute.
    */
   public List<JobPosting> getSupervisedJobPostings() {
      return supervisedJobPostings;
   }
   
   /**
    * Returns the value of the "supervisedJobs" attribute.
    *
    * @return The value of the "supervisedJobs" attribute.
    */
   public List<Job> getSupervisedJobs() {
      return supervisedJobs;
   }
   
   /**
    * Returns the value of the "telephones" attribute.
    *
    * @return The value of the "telephones" attribute.
    */
   public List<Telephone> getTelephones() {
      return telephones;
   }
   
   /**
    * Sets the value of the "dateOfBirth" attribute.
    *
    * @param dateOfBirth
    *     The value of the "dateOfBirth" attribute.
    */
   public void setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }
   /**
    * Sets the value of the "email" attribute.
    *
    * @param email
    *     The value of the "email" attribute.
    */
   public void setEmail(String email) {
      this.email = email;
   }
   /**
    * Sets the value of the "fatherName" attribute.
    *
    * @param fatherName
    *     The value of the "fatherName" attribute.
    */
   public void setFatherName(String fatherName) {
      this.fatherName = fatherName;
   }
   /**
    * Sets the value of the "gender" attribute.
    *
    * @param gender
    *     The value of the "gender" attribute.
    */
   public void setGender(String gender) {
      this.gender = gender;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(int id) {
      this.id = id;
   }
   /**
    * Sets the value of the "motherName" attribute.
    *
    * @param motherName
    *     The value of the "motherName" attribute.
    */
   public void setMotherName(String motherName) {
      this.motherName = motherName;
   }
   /**
    * Sets the value of the "name" attribute.
    *
    * @param name
    *     The value of the "name" attribute.
    */
   public void setName(String name) {
      this.name = name;
   }
   /**
    * Sets the value of the "notes" attribute.
    *
    * @param notes
    *     The value of the "notes" attribute.
    */
   public void setNotes(String notes) {
      this.notes = notes;
   }
   /**
    * Sets the value of the "rank" attribute.
    *
    * @param rank
    *     The value of the "rank" attribute.
    */
   public void setRank(String rank) {
      this.rank = rank;
   }
   /**
    * Sets the value of the "surname" attribute.
    *
    * @param surname
    *     The value of the "surname" attribute.
    */
   public void setSurname(String surname) {
      this.surname = surname;
   }
   /**
    * Sets the value of the "userName" attribute.
    *
    * @param userName
    *     The value of the "userName" attribute.
    */
   public void setUserName(String userName) {
      this.userName = userName;
   }
   /**
    * Sets the value of the "tracking" attribute.
    *
    * @param tracking
    *     The value of the "tracking" attribute.
    */
   public void setTracking(Tracking tracking) {
      this.tracking = tracking;
   }
   
   /**
    * Sets the value of the "academicallyDirectedCoOps" attribute.
    *
    * @param academicallyDirectedCoOps"
    *     The value of the "academicallyDirectedCoOps" attribute.
    */
   public void setAcademicallyDirectedCoOps(List<CoOp> academicallyDirectedCoOps) {
      this.academicallyDirectedCoOps = academicallyDirectedCoOps;
   }

   /**
    * Sets the value of the "addresses" attribute.
    *
    * @param addresses"
    *     The value of the "addresses" attribute.
    */
   public void setAddresses(List<Address> addresses) {
      this.addresses = addresses;
   }

   /**
    * Sets the value of the "defaultCoOp" attribute.
    *
    * @param defaultCoOp"
    *     The value of the "defaultCoOp" attribute.
    */
   public void setDefaultCoOp(CoOp defaultCoOp) {
      this.defaultCoOp = defaultCoOp;
   }

   /**
    * Sets the value of the "department" attribute.
    *
    * @param department"
    *     The value of the "department" attribute.
    */
   public void setDepartment(Department department) {
      this.department = department;
   }

   /**
    * Sets the value of the "division" attribute.
    *
    * @param division"
    *     The value of the "division" attribute.
    */
   public void setDivision(Division division) {
      this.division = division;
   }

   /**
    * Sets the value of the "institutionallyDirectedCoOps" attribute.
    *
    * @param institutionallyDirectedCoOps"
    *     The value of the "institutionallyDirectedCoOps" attribute.
    */
   public void setInstitutionallyDirectedCoOps(List<CoOp> institutionallyDirectedCoOps) {
      this.institutionallyDirectedCoOps = institutionallyDirectedCoOps;
   }

   /**
    * Sets the value of the "preferredLanguage" attribute.
    *
    * @param preferredLanguage"
    *     The value of the "preferredLanguage" attribute.
    */
   public void setPreferredLanguage(Language preferredLanguage) {
      this.preferredLanguage = preferredLanguage;
   }

   /**
    * Sets the value of the "reports" attribute.
    *
    * @param reports"
    *     The value of the "reports" attribute.
    */
   public void setReports(List<Report> reports) {
      this.reports = reports;
   }

   /**
    * Sets the value of the "roles" attribute.
    *
    * @param roles"
    *     The value of the "roles" attribute.
    */
   public void setRoles(List<Role> roles) {
      this.roles = roles;
   }

   /**
    * Sets the value of the "scientificallyDirectedCoOps" attribute.
    *
    * @param scientificallyDirectedCoOps"
    *     The value of the "scientificallyDirectedCoOps" attribute.
    */
   public void setScientificallyDirectedCoOps(List<CoOp> scientificallyDirectedCoOps) {
      this.scientificallyDirectedCoOps = scientificallyDirectedCoOps;
   }

   /**
    * Sets the value of the "supervisedCoOps" attribute.
    *
    * @param supervisedCoOps"
    *     The value of the "supervisedCoOps" attribute.
    */
   public void setSupervisedCoOps(List<CoOp> supervisedCoOps) {
      this.supervisedCoOps = supervisedCoOps;
   }

   /**
    * Sets the value of the "supervisedGroups" attribute.
    *
    * @param supervisedGroups"
    *     The value of the "supervisedGroups" attribute.
    */
   public void setSupervisedGroups(List<Group> supervisedGroups) {
      this.supervisedGroups = supervisedGroups;
   }

   /**
    * Sets the value of the "supervisedJobPostings" attribute.
    *
    * @param supervisedJobPostings"
    *     The value of the "supervisedJobPostings" attribute.
    */
   public void setSupervisedJobPostings(List<JobPosting> supervisedJobPostings) {
      this.supervisedJobPostings = supervisedJobPostings;
   }

   /**
    * Sets the value of the "supervisedJobs" attribute.
    *
    * @param supervisedJobs"
    *     The value of the "supervisedJobs" attribute.
    */
   public void setSupervisedJobs(List<Job> supervisedJobs) {
      this.supervisedJobs = supervisedJobs;
   }

   /**
    * Sets the value of the "telephones" attribute.
    *
    * @param telephones"
    *     The value of the "telephones" attribute.
    */
   public void setTelephones(List<Telephone> telephones) {
      this.telephones = telephones;
   }

}